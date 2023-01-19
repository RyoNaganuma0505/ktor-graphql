package com.example.usecases

import com.example.dto.AddressData
import com.example.dto.UserData

object GetUser {
    fun execute(): UserData =
        UserData("Taro", AddressData("Tokyo", "Shibuya"))

    fun execute(id: String): UserData =
        UserData("Taro$id", AddressData(" Tokyo ", " Shibuya "))
}
