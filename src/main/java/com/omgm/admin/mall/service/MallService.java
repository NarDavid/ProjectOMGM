package com.omgm.admin.mall.service;

import com.omgm.admin.mall.beans.MallFeedVO;
import com.omgm.admin.mall.beans.MallToyVO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MallService {
    void insertMallToy(MallToyVO vo) throws Exception;

    List<MallToyVO> getMallToyList() throws Exception;

    void insertMallFeed(MallFeedVO vo) throws Exception;

    List<MallFeedVO> getMallFeedList() throws Exception;
}