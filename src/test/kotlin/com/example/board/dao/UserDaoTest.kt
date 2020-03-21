package com.example.board.dao

import com.example.board.model.User
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.transaction.annotation.Transactional

@SpringBootTest
@Transactional
internal class UserDaoTest {

    @Autowired
    private lateinit var userDao: UserDao

    @Test
    fun insertAndSelectUser() {
        val expectedUser = User(userId = "id", password = "password", username = "username")

        userDao.insertUser(expectedUser)

        val actualUsers = userDao.selectUser()

        actualUsers.forEach { println(it) }

        assertEquals(expectedUser.userId, actualUsers[0].userId)
        assertEquals(expectedUser.password, actualUsers[0].password)
        assertEquals(expectedUser.username, actualUsers[0].username)
    }
}