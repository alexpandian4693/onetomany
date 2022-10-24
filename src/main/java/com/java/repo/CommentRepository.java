package com.java.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{

}
