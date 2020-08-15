package com.omgm.admin.management.review.service;

import com.omgm.admin.management.review.beans.beans.PageNavigator;
import com.omgm.admin.management.review.beans.beans.ReviewReplyVO;
import com.omgm.admin.management.review.beans.beans.ReviewVO;

import java.util.List;

public interface ReviewService {
    void insertReviewBoard(ReviewVO vo);
    ReviewVO getReview(ReviewVO vo);
    List<ReviewReplyVO> getReviewReply(ReviewReplyVO rvo);
    void addReview(ReviewReplyVO rvo);
    List<ReviewVO> getReviewList(ReviewVO vo, PageNavigator navi);
    int selectCount();
    void addCount(ReviewVO vo);

    void updateReview(ReviewVO vo);
    void deleteReview(ReviewVO vo);


    // RoomService_M
    List<ReviewVO> getListRoom(ReviewVO vo,PageNavigator navi);
}

