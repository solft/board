package com.example.board.dao

import com.example.board.model.Post
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.transaction.annotation.Transactional

@SpringBootTest
@Transactional
internal class PostDaoTest {

    @Autowired
    private lateinit var postDao: PostDao

    @Test
    fun insertAndSelectPost() {
        val expectedPost = Post(userNo = 44, category = "testCat", title = "testTitle", content = "this is content")

        postDao.insertPost(expectedPost)

        println("postNo = ${expectedPost.postNo}")

        val actualPost = postDao.selectPost(expectedPost.postNo)

        println("selectPostByPostNo = $actualPost")

        assertEquals(expectedPost.userNo, actualPost.userNo)
        assertEquals(expectedPost.category, actualPost.category)
        assertEquals(expectedPost.content, actualPost.content)
    }
}