package com.omgm.admin.kinderGarden.service;

import com.omgm.admin.kinderGarden.beans.KinderGardenVO;

import java.util.List;

public interface KinderGardenService {
    KinderGardenVO getSchedule(KinderGardenVO vo);
    List<KinderGardenVO> getScheduleRow(KinderGardenVO vo);
}
