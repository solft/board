package com.example.board.model

import java.time.LocalDate

data class User(val userNo: Int = 0,
                val userId: String,
                val password: String,
                val username: String,
                val createdDate: LocalDate = LocalDate.now())