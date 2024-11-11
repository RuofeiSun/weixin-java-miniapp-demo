package com.github.binarywang.demo.wx.miniapp.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 rel_user_babe
 *
 * @author ruoyi
 * @date 2024-11-11
 */
public class RelUserBabe extends BaseEntity
{
    private static final long serialVersionUID = 1L;


    /** 用户id */
    private Long userId;

    /** babe_id */
    private Long babeId;

    /** 关联类型(0:创建者,1:可编辑,2:仅查看) */
    private Long type;

    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Long getUserId()
    {
        return userId;
    }
    public void setBabeId(Long babeId)
    {
        this.babeId = babeId;
    }

    public Long getBabeId()
    {
        return babeId;
    }
    public void setType(Long type)
    {
        this.type = type;
    }

    public Long getType()
    {
        return type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("babeId", getBabeId())
            .append("type", getType())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .append("createBy", getCreateBy())
            .toString();
    }
}
