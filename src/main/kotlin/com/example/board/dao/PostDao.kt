package com.example.board.dao

import com.example.board.model.Post
import org.mybatis.spring.SqlSessionTemplate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class PostDao {

    @Autowired
    private lateinit var sqlSessionTemplate: SqlSessionTemplate

    private final val NAMESPACE = "board"

    fun insertPost(post: Post): Int = sqlSessionTemplate.insert("$NAMESPACE.insertPost", post)

    fun selectPost(): List<Post> = sqlSessionTemplate.selectList("$NAMESPACE.selectPost")

    fun selectPost(postNo: Int): Post = sqlSessionTemplate.selectOne("$NAMESPACE.selectPostByPostNo", postNo)
}