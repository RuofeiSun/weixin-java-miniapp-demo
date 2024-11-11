package com.github.binarywang.demo.wx.miniapp.service.impl;

import java.util.List;

import com.github.binarywang.demo.wx.miniapp.domain.ThyroidInfo;
import com.github.binarywang.demo.wx.miniapp.mapper.ThyroidInfoMapper;
import com.github.binarywang.demo.wx.miniapp.service.IThyroidInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2024-11-11
 */
@Service
public class ThyroidInfoServiceImpl implements IThyroidInfoService
{
    @Autowired
    private ThyroidInfoMapper thyroidInfoMapper;
}
