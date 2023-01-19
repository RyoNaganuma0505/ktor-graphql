package com.example.usecases

import com.example.dto.AddressData
import com.example.dto.UserData
import com.example.repositories.UserRepository

object GetUser {
    fun execute(): List<UserData> = UserRepository.listUsers()

    fun execute(id: String): UserData? = UserRepository.getUserById(id)
}
