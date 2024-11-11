package com.github.binarywang.demo.wx.miniapp.service.impl;

import java.util.List;

import com.github.binarywang.demo.wx.miniapp.domain.MedicineInfo;
import com.github.binarywang.demo.wx.miniapp.mapper.MedicineInfoMapper;
import com.github.binarywang.demo.wx.miniapp.service.IMedicineInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2024-11-11
 */
@Service
public class MedicineInfoServiceImpl implements IMedicineInfoService
{
    @Autowired
    private MedicineInfoMapper medicineInfoMapper;
}
