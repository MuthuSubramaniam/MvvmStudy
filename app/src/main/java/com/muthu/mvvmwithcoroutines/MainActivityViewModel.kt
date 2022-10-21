package com.muthu.mvvmwithcoroutines

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.*

class MainActivityViewModel : ViewModel() {
    private val repository = UserRepository()
    val userMutableLiveData = MutableLiveData<List<User>>()

    fun getUserData() {
        viewModelScope.launch {
            var result: List<User>? = null
            withContext(Dispatchers.IO) {
                result = repository.getUsers()
            }
            userMutableLiveData.value = (result!!)
        }
    }

}