package com.v.novel.service.impl;

import com.v.novel.core.common.resp.RestResp;
import com.v.novel.dto.resp.HomeBookRespDto;
import com.v.novel.dto.resp.HomeFriendLinkRespDto;
import com.v.novel.manager.cache.FriendLinkCacheManager;
import com.v.novel.manager.cache.HomeBookCacheManager;
import com.v.novel.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 首页模块 服务实现类
 *
 * @author Admin
 * @date 2022/5/13
 */
@Service
@RequiredArgsConstructor
public class HomeServiceImpl implements HomeService {

    private final HomeBookCacheManager homeBookCacheManager;

    private final FriendLinkCacheManager friendLinkCacheManager;

    @Override
    public RestResp<List<HomeBookRespDto>> listHomeBooks() {
        return RestResp.ok(homeBookCacheManager.listHomeBooks());
    }

    @Override
    public RestResp<List<HomeFriendLinkRespDto>> listHomeFriendLinks() {
        return RestResp.ok(friendLinkCacheManager.listFriendLinks());
    }
}
