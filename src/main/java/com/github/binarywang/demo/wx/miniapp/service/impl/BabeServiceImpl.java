package com.github.binarywang.demo.wx.miniapp.service.impl;

import java.util.List;

import com.github.binarywang.demo.wx.miniapp.domain.Babe;
import com.github.binarywang.demo.wx.miniapp.mapper.BabeMapper;
import com.github.binarywang.demo.wx.miniapp.service.IBabeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2024-11-11
 */
@Service
public class BabeServiceImpl implements IBabeService
{
    @Autowired
    private BabeMapper babeMapper;
}
