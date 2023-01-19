package com.example.repositories

import com.example.dto.AddressData
import com.example.dto.UserData

object UserRepository {

    private val masterDataList =
        listOf(
            UserData("user-1", "Taro", AddressData("Tokyo", "Shibuya")),
            UserData("user-2", "Mayuka", AddressData("Osaka", "Sakai"))
        )

    fun listUsers(): List<UserData> {
        return masterDataList
    }

    fun getUserById(id: String): UserData? {
        return masterDataList.find { it.id == id }
    }

    fun updateUser(id: String, name: String): UserData? {
        val target = getUserById(id) ?: return null
        target.name = name
        return target
    }
}
