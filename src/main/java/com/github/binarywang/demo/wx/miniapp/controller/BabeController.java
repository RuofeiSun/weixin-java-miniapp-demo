package com.github.binarywang.demo.wx.miniapp.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.github.binarywang.demo.wx.miniapp.domain.AjaxResult;
import com.github.binarywang.demo.wx.miniapp.domain.Babe;
import com.github.binarywang.demo.wx.miniapp.service.IBabeService;
import com.github.binarywang.demo.wx.miniapp.utils.page.TableDataInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2024-11-11
 */
@RestController
@RequestMapping("/system/babe")
public class BabeController extends BaseController
{
    @Autowired
    private IBabeService babeService;

    /**
     * 查询【请填写功能名称】列表
     */
    @GetMapping("/list")
    public TableDataInfo list(Babe babe)
    {
        startPage();
        List<Babe> list = babeService.selectBabeList(babe);
        return getDataTable(list);
    }



    /**
     * 获取【请填写功能名称】详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(babeService.selectBabeById(id));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PostMapping
    public AjaxResult add(@RequestBody Babe babe)
    {
        return toAjax(babeService.insertBabe(babe));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PutMapping
    public AjaxResult edit(@RequestBody Babe babe)
    {
        return toAjax(babeService.updateBabe(babe));
    }

    /**
     * 删除【请填写功能名称】
     */
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(babeService.deleteBabeByIds(ids));
    }
}
