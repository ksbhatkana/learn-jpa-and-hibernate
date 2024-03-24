package com.ksbhat.learnjpaandhibernate.course.jpa;

import com.ksbhat.learnjpaandhibernate.dto.Post;
import com.ksbhat.learnjpaandhibernate.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
