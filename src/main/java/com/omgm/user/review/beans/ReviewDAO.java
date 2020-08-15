package com.omgm.user.review.beans;

import com.omgm.user.catcarelog.beans.CatCareLogVO;
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
    public void insertReviewBoard(ReviewVO vo) {
        System.out.println("---> MyBatis로 insertBoard() 기능 처리");
        sqlSessionTemplate.insert("ReviewDAO.insertBoard", vo);
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

    public void updateCatCareLog(CatCareLogVO vo) {
        sqlSessionTemplate.update("CatCareLogDAO.updateCatCareLog",vo);
    }

    //RoomDAO_M
    public List<ReviewVO> getListRoom(ReviewVO vo, PageNavigator navi) {
        RowBounds rb = new RowBounds(navi.getStartRecord(),navi.getCountPerPage());
        return sqlSessionTemplate.selectList("ReviewDAO.selectListROOM", vo, rb);
    }

    public void addCount(ReviewVO vo) {
        sqlSessionTemplate.update("ReviewDAO.addCount",vo);
    }

}
