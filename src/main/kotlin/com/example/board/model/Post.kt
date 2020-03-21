package com.example.board.model

import java.time.LocalDate

data class Post(
        val postNo: Int = 0,
        val userNo: Int,
        val category: String,
        val title: String,
        val content: String,
        val createdDate: LocalDate = LocalDate.now(),
        val up: Int = 0,
        val down: Int = 0
)