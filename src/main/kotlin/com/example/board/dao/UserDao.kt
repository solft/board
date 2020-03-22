package com.example.board.dao

import com.example.board.model.User
import org.mybatis.spring.SqlSessionTemplate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class UserDao {

    @Autowired
    private lateinit var sqlSessionTemplate: SqlSessionTemplate

    private final val NAMESPACE = "board"

    fun insertUser(user: User) {
        sqlSessionTemplate.insert("$NAMESPACE.insertUser", user)
    }

    fun selectUser(): List<User> = sqlSessionTemplate.selectList("$NAMESPACE.selectUser")
}