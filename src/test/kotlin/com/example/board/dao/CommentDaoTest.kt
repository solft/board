package com.example.board.dao

import com.example.board.model.Comment
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.transaction.annotation.Transactional

@SpringBootTest
@Transactional
class CommentDaoTest {

    @Autowired
    private lateinit var commentDao: CommentDao

    @Test
    fun insertAndSelectCommentTest() {

        val expectedComment = Comment(userNo = 44, postNo = 1, content = "sample content")

        commentDao.insertComment(expectedComment)

        val actualComment = commentDao.selectComment(expectedComment.commentNo)

        println("selectCommentByPostNo = $actualComment")

        assertEquals(expectedComment.commentNo, actualComment.commentNo)
        assertEquals(expectedComment.userNo, actualComment.userNo)
        assertEquals(expectedComment.content, actualComment.content)
    }
}