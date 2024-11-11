package com.github.binarywang.demo.wx.miniapp.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 user
 *
 * @author ruoyi
 * @date 2024-11-11
 */
public class User extends BaseEntity
{
    private static final long serialVersionUID = 1L;


    /** 在当前小程序唯一标识 */
    private String wxOpenId;

    /** 用户名 */
    private String wxUserName;

    /** 用户头像 */
    private String wxUserPicture;
    public void setWxOpenId(String wxOpenId)
    {
        this.wxOpenId = wxOpenId;
    }

    public String getWxOpenId()
    {
        return wxOpenId;
    }
    public void setWxUserName(String wxUserName)
    {
        this.wxUserName = wxUserName;
    }

    public String getWxUserName()
    {
        return wxUserName;
    }
    public void setWxUserPicture(String wxUserPicture)
    {
        this.wxUserPicture = wxUserPicture;
    }

    public String getWxUserPicture()
    {
        return wxUserPicture;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("wxOpenId", getWxOpenId())
            .append("wxUserName", getWxUserName())
            .append("wxUserPicture", getWxUserPicture())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .append("createBy", getCreateBy())
            .toString();
    }
}
