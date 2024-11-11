package com.github.binarywang.demo.wx.miniapp.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 medicine_info
 *
 * @author ruoyi
 * @date 2024-11-11
 */
public class MedicineInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;


    /** babe_id */
    private Long babeId;

    /** 剂量调整日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dosageChangeDate;

    /** 左甲状腺素钠（优甲乐）ug（微克） */
    private BigDecimal dosage;

    /** 单位换算分数（一片50ug） 1/N */
    private String dosageFraction;

    public void setBabeId(Long babeId)
    {
        this.babeId = babeId;
    }

    public Long getBabeId()
    {
        return babeId;
    }
    public void setDosageChangeDate(Date dosageChangeDate)
    {
        this.dosageChangeDate = dosageChangeDate;
    }

    public Date getDosageChangeDate()
    {
        return dosageChangeDate;
    }
    public void setDosage(BigDecimal dosage)
    {
        this.dosage = dosage;
    }

    public BigDecimal getDosage()
    {
        return dosage;
    }
    public void setDosageFraction(String dosageFraction)
    {
        this.dosageFraction = dosageFraction;
    }

    public String getDosageFraction()
    {
        return dosageFraction;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("babeId", getBabeId())
            .append("dosageChangeDate", getDosageChangeDate())
            .append("dosage", getDosage())
            .append("dosageFraction", getDosageFraction())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .append("createBy", getCreateBy())
            .toString();
    }
}
