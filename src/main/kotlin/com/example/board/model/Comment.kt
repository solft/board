package com.example.board.model

import java.time.LocalDate

data class Comment(
        val commentNo: Int = 0,
        val userNo: Int,
        val postNo: Int,
        val content: String,
        val createdDate: LocalDate = LocalDate.now(),
        val up: Int = 0,
        val down: Int = 0
)