package com.omgm.user.mall.beans;

import com.omgm.admin.mall.beans.MemberOrderVO;
import com.omgm.admin.mall.beans.OrderVO;
import com.omgm.member.beans.MemberVO;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserMallDAO {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    ///////////// 사료 관련 메서드 //////////////////
    // 사료 상품 샀을시 수량 감소
    public void feedStockDecrease(UserMallFeedVO vo) {
        sqlSessionTemplate.update("MallDAO.feedStockDecrease", vo);
    }
    // 사료 상품 나열(페이징 처리 추가)
    public List<UserMallFeedVO> getMallFeedList(UserMallFeedVO vo, PageNavigatorMall navi) {
        RowBounds rb = new RowBounds(navi.getStartRecord(), navi.getCountPerPage());
        return sqlSessionTemplate.selectList("UserMallDAO.getMallFeedList", vo, rb);
    }

    // feed의 사료 상품 갯수
    public int selectCountMall() {
        return sqlSessionTemplate.selectOne("UserMallDAO.selectCountMall");
    }

    // 클라이언트 부분에서 사료 정보 가져오기
    public UserMallFeedVO getMallFeedOneInfo(UserMallFeedVO vo) {
        return sqlSessionTemplate.selectOne("UserMallDAO.getMallFeedOneInfo", vo);
    }

    ///////////// 장난감 관련 메서드 //////////////////
    // 장난감 상품 샀을시 수량 감소
    public void toyStockDecrease(UserMallToyVO vo) {
        sqlSessionTemplate.update("MallDAO.toyStockDecrease", vo);
    }
    // 장난감 상품 나열(페이징 처리 추가)
    public List<UserMallToyVO> getMallToyList(UserMallToyVO vo, PageNavigatorMall navi) {
        RowBounds rb = new RowBounds(navi.getStartRecord(), navi.getCountPerPage());
        return sqlSessionTemplate.selectList("UserMallDAO.getMallToyList", vo, rb);
    }


    //////////////// 장바구니 /////////////////////////////
    // 배송현왕 확인시 값 불러오기
    public OrderVO selectCartListWayBill(OrderVO vo) {
        return sqlSessionTemplate.selectOne("MallOrderDAO.selectCartListWayBill", vo);
    }

    //장바구니 출력
    public List<CartListVO> selectCartList(CartListVO vo) {
        return sqlSessionTemplate.selectList("MallOrderDAO.selectCartList", vo);
    }

    // 장난감 상품 갯수
    public int selectCountToyMall() {
        return sqlSessionTemplate.selectOne("UserMallDAO.selectCountToyMall");
    }

    // 클라이언트 부분에서 장난감 정보 가져오기
    public UserMallToyVO getMallToyOneInfo(UserMallToyVO vo) {
        return sqlSessionTemplate.selectOne("UserMallDAO.getMallToyOneInfo", vo);
    }

    // 장바구니에서 정한 수량 디비에서 변경
    public void updateCartListCount(CartListVO vo) {
        sqlSessionTemplate.update("MallOrderDAO.updateCartListCount", vo);
    }

    public void updateMemberPoint(MemberOrderVO vo) {
        sqlSessionTemplate.update("MallOrderDAO.updateMemberPoint", vo);
    }

    // 장바구니 입력 시 디비추가
    public void insertCartList(CartListVO vo) {
        sqlSessionTemplate.insert("MallOrderDAO.insertCartList", vo);
    }

    // 장바구니 결제시 디비에 정보 입력
    public void insertOrderCartList(OrderVO vo) {
        sqlSessionTemplate.insert("MallOrderDAO.insertOrderCartList", vo);
    }

    // 장바구니에서 물품 한개 삭제
    public void deleteCartListOne(CartListVO vo) {
        sqlSessionTemplate.delete("MallOrderDAO.deleteCartListOne", vo);
    }

    // 장바구니에서 물품 전부 삭제
    public void deleteCartListAll(CartListVO vo) {
        sqlSessionTemplate.delete("MallOrderDAO.deleteCartListAll", vo);
    }


    //마이페이지 주문내역 출력
    public List<OrderVO> myOrder(OrderVO vo) {
        return sqlSessionTemplate.selectList("MallOrderDAO.myOrder",vo);
    }
    public void updateOrder(OrderVO vo) {
        sqlSessionTemplate.update("MallOrderDAO.updateOrder", vo);
    }
    public void exchangeOrder(OrderVO vo) {
        sqlSessionTemplate.update("MallOrderDAO.exchangeOrder", vo);
    }

}