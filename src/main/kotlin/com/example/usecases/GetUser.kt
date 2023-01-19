package com.example.usecases

import com.example.dto.AddressData
import com.example.dto.UserData

object GetUser {
    fun execute(): UserData =
        UserData("Taro", AddressData("Tokyo", "Shibuya"))
}
