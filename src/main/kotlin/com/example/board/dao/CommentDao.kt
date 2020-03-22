package com.example.board.dao

import com.example.board.model.Comment
import org.mybatis.spring.SqlSessionTemplate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class CommentDao {

    @Autowired
    private lateinit var sqlSessionTemplate: SqlSessionTemplate

    private final val NAMESPACE = "board"

    fun insertComment(comment: Comment) {
        sqlSessionTemplate.insert("$NAMESPACE.insertComment", comment)
    }

    fun selectComment(): List<Comment> = sqlSessionTemplate.selectList("$NAMESPACE.selectComment")

    fun selectComment(postNo: Int): Comment = sqlSessionTemplate.selectOne("$NAMESPACE.selectCommentByCommentNo", postNo)
}