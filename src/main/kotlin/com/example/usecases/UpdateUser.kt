package com.example.usecases

import com.example.dto.UserData
import com.example.repositories.UserRepository

object UpdateUser {
    fun execute(id: String, name: String): UserData? = UserRepository.updateUser(id, name)
}
