package com.haotian.blog.dao;

import com.haotian.blog.po.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BlogRepository extends JpaRepository <Blog, Long>, JpaSpecificationExecutor<Blog> {


}
