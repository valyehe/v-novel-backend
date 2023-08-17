package com.v.novel.service;

import com.v.novel.core.common.resp.RestResp;
import com.v.novel.dto.req.UserInfoUptReqDto;
import com.v.novel.dto.req.UserLoginReqDto;
import com.v.novel.dto.req.UserRegisterReqDto;
import com.v.novel.dto.resp.UserInfoRespDto;
import com.v.novel.dto.resp.UserLoginRespDto;
import com.v.novel.dto.resp.UserRegisterRespDto;

/**
 * 会员模块 服务类
 *
 * @author Admin
 * @date 2022/5/17
 */
public interface UserService {

    /**
     * 用户注册
     *
     * @param dto 注册参数
     * @return JWT
     */
    RestResp<UserRegisterRespDto> register(UserRegisterReqDto dto);

    /**
     * 用户登录
     *
     * @param dto 登录参数
     * @return JWT + 昵称
     */
    RestResp<UserLoginRespDto> login(UserLoginReqDto dto);

    /**
     * 用户反馈
     *
     * @param userId  反馈用户ID
     * @param content 反馈内容
     * @return void
     */
    RestResp<Void> saveFeedback(Long userId, String content);

    /**
     * 用户信息修改
     *
     * @param dto 用户信息
     * @return void
     */
    RestResp<Void> updateUserInfo(UserInfoUptReqDto dto);

    /**
     * 用户反馈删除
     *
     * @param userId 用户ID
     * @param id     反馈ID
     * @return void
     */
    RestResp<Void> deleteFeedback(Long userId, Long id);

    /**
     * 查询书架状态接口
     *
     * @param userId 用户ID
     * @param bookId 小说ID
     * @return 0-不在书架 1-已在书架
     */
    RestResp<Integer> getBookshelfStatus(Long userId, String bookId);

    /**
     * 用户信息查询
     * @param userId 用户ID
     * @return 用户信息
     */
    RestResp<UserInfoRespDto> getUserInfo(Long userId);
}
