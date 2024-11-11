package com.github.binarywang.demo.wx.miniapp.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 babe
 *
 * @author ruoyi
 * @date 2024-11-11
 */
public class Babe extends BaseEntity
{
    private static final long serialVersionUID = 1L;


    /** babe唯一编码，用于分享关联 */
    private String babeNo;

    /** babe头像 */
    private String babePicture;

    /** 用户名 */
    private String babeName;

    /** 出生日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    /** 出生重量(公斤) */
    private BigDecimal birthWeight;

    public void setBabeNo(String babeNo)
    {
        this.babeNo = babeNo;
    }

    public String getBabeNo()
    {
        return babeNo;
    }
    public void setBabePicture(String babePicture)
    {
        this.babePicture = babePicture;
    }

    public String getBabePicture()
    {
        return babePicture;
    }
    public void setBabeName(String babeName)
    {
        this.babeName = babeName;
    }

    public String getBabeName()
    {
        return babeName;
    }
    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }

    public Date getBirthday()
    {
        return birthday;
    }
    public void setBirthWeight(BigDecimal birthWeight)
    {
        this.birthWeight = birthWeight;
    }

    public BigDecimal getBirthWeight()
    {
        return birthWeight;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("babeNo", getBabeNo())
            .append("babePicture", getBabePicture())
            .append("babeName", getBabeName())
            .append("birthday", getBirthday())
            .append("birthWeight", getBirthWeight())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .append("createBy", getCreateBy())
            .toString();
    }
}
