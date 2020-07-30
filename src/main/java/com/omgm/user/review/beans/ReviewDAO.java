package com.omgm.user.review.beans;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReviewDAO {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public List<ReviewVO> getReviewList(ReviewVO vo, PageNavigator navi) {
        System.out.println("---> MyBatis로 getReviewList() 기능 처리");
        RowBounds rb = new RowBounds(navi.getStartRecord(),navi.getCountPerPage());
        return sqlSessionTemplate.selectList("ReviewDAO.getReviewList", vo, rb);

    }

    public ReviewVO getReview(ReviewVO vo) {
        System.out.println("---> MyBatis로 getReview() 기능 처리");
        return sqlSessionTemplate.selectOne("ReviewDAO.getReview", vo);
    }

    public void addReviewReply(ReviewReplyVO rvo) {
        System.out.println("---> MyBatis로 addReviewReply() 기능 처리");
        sqlSessionTemplate.selectOne("ReviewDAO.addReviewReply", rvo);
    }

    public List<ReviewReplyVO> getReviewReply(ReviewReplyVO rvo) {
        System.out.println("---> MyBatis로 getReviewReply() 기능 처리");
        return sqlSessionTemplate.selectList("ReviewDAO.getReviewReply", rvo);
    }

    public int selectCount(){
        return sqlSessionTemplate.selectOne("ReviewDAO.selectCount");
    }

}