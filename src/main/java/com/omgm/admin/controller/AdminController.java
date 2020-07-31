package com.omgm.admin.controller;

import com.omgm.user.board.BoardVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

    // 관리자 메인 불러오기
    @RequestMapping("/adminMain.mdo")
    public ModelAndView main(BoardVO vo) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/main");
        return mav;
    }

    // 관리자 배송 현황 페이지
    @RequestMapping("/deliveryStatus.mdo")
    public ModelAndView deliveryStatus(BoardVO vo) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/delivery/deliveryStatus");
        return mav;
    }

    // 관리자 배송 현황 페이지
    @RequestMapping("/productInquiry.mdo")
    public ModelAndView productInquiry(BoardVO vo) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/productRegister/productInquiry");
        return mav;
    }
    // 상품등록 페이지
    @RequestMapping("/productRegister.mdo")
    public ModelAndView productRegister(BoardVO vo) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/productRegister/productRegister");
        return mav;
    }

    //픽업서비스 관리 페이지
    @RequestMapping("/pickupServiceManagement.mdo")
    public ModelAndView pickupServiceManagement(BoardVO vo) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/manageMent/pickupServiceManagement");
        return mav;
    }

    //주문조회 페이지 이동
    @RequestMapping("/orderInquiry.mdo")
    public ModelAndView orderInquiry(BoardVO vo) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/orderInquiry/orderInquiry");
        return mav;
    }
}
