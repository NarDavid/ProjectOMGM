package com.omgm.user.mall.service;

import com.omgm.user.mall.beans.UserMallFeedDAO;
import com.omgm.user.mall.beans.UserMallFeedVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserMallService")
public class UserUserMallServiceImpl implements UserMallService {

    @Autowired
    UserMallFeedDAO UserMallFeedDAO;

    @Override
    public List<UserMallFeedVO> getMallFeedList() throws Exception {
        return UserMallFeedDAO.getMallFeedList();
    }
}