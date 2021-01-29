package com.haotian.blog.dao;

import com.haotian.blog.po.Tag;
import com.haotian.blog.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag,Long> {
    Tag findByName(String name);
}
