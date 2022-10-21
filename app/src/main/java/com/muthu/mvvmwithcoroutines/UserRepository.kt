package com.muthu.mvvmwithcoroutines

import kotlinx.coroutines.delay

class UserRepository {

    suspend fun getUsers(): List<User> {
        delay(8000)
        return listOf(
            User(1, "Muthu"),
            User(2, "Sugan"),
            User(3, "Rithu"),
            User(4, "Baby"),
        )
    }
}