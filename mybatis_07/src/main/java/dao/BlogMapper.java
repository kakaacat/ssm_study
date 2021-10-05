package dao;

import pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    void addBook(Blog blog);

    List<Blog> queryBlogIF(Map map);

    List<Blog> queryBlogChoose(Map map);

    int updateBlog(Map map);

    List<Blog> queryBlogForeach(Map map);
}
