package com.mySwagger.www.service;


import java.util.List;

import com.mySwagger.www.common.PageHelper;
import com.mySwagger.www.entity.Comment;
import com.mySwagger.www.entity.UserContent;


public interface UserContentService {
    /**
     * 查询所有Content并分页
     * @param content
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageHelper.Page<UserContent> findAll(UserContent content, Integer pageNum, Integer pageSize);
    PageHelper.Page<UserContent> findAll(UserContent content, Comment comment, Integer pageNum, Integer pageSize);
    PageHelper.Page<UserContent> findAllByUpvote(UserContent content, Integer pageNum, Integer pageSize);

    /**
     * 添加文章
     * @param content
     */
    int addContent(UserContent content);

    /**
     * 根据用户id查询文章集合
     * @param uid
     * @return
     */
    List<UserContent> findByUserId(Long uid);

    /**
     * 查询所有文章
     * @return
     */
    List<UserContent> findAll();

    /**
     * 根据文章id查找文章
     * @param id
     * @return
     */
    UserContent findById(long id);
    /**
     * 根据文章id更新文章
     * @param content
     * @return
     */
    void updateById(UserContent content);

    /**
     * 根据用户id查询出分类
     * @param uid
     * @return
     */
    List<UserContent> findCategoryByUid(Long uid);

    /**
     * 根据文章分类查询所有文章
     * @param category
     *  @param pageNum
     * @param pageSize
     * @return
     */
    PageHelper.Page<UserContent> findByCategory(String category, Long uid, Integer pageNum, Integer pageSize);
    PageHelper.Page<UserContent> findByCategory(String category, Integer pageNum, Integer pageSize);
    /**
     * 根据用户id查询所有私密文章并分页
     * @param uid
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageHelper.Page<UserContent> findPersonal(Long uid, Integer pageNum, Integer pageSize);

    /**
     * 根据文章id删除文章
     * @param cid
     */
    void deleteById(Long cid);

    /**
     * 根据发布时间倒排序并分页
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageHelper.Page<UserContent> findAll(Integer pageNum, Integer pageSize);

    UserContent findByUpvote();

    List<UserContent> findByCateFour();
}
