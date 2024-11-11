package com.github.binarywang.demo.wx.miniapp.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 thyroid_info
 *
 * @author ruoyi
 * @date 2024-11-11
 */
public class ThyroidInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    private Long babeId;

    /** 检查日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date checkDate;

    /** TSH（促甲状腺素） */
    private BigDecimal tsh;

    /** FT3（游离三碘甲状腺原氨酸） */
    private BigDecimal ft3;

    /** FT4（游离四碘甲状腺原氨酸） */
    private BigDecimal ft4;

    /** TT3（三碘甲状腺原氨酸） */
    private BigDecimal tt3;

    /** TT4（总甲状腺素） */
    private BigDecimal tt4;

    /** TG-Ab(甲状腺球蛋白抗体) */
    private BigDecimal tgAb;

    /** TPO-Ab(甲状腺过氧化物酶抗体) */
    private BigDecimal tpoAb;

    public void setBabeId(Long babeId)
    {
        this.babeId = babeId;
    }

    public Long getBabeId()
    {
        return babeId;
    }
    public void setCheckDate(Date checkDate)
    {
        this.checkDate = checkDate;
    }

    public Date getCheckDate()
    {
        return checkDate;
    }
    public void setTsh(BigDecimal tsh)
    {
        this.tsh = tsh;
    }

    public BigDecimal getTsh()
    {
        return tsh;
    }
    public void setFt3(BigDecimal ft3)
    {
        this.ft3 = ft3;
    }

    public BigDecimal getFt3()
    {
        return ft3;
    }
    public void setFt4(BigDecimal ft4)
    {
        this.ft4 = ft4;
    }

    public BigDecimal getFt4()
    {
        return ft4;
    }
    public void setTt3(BigDecimal tt3)
    {
        this.tt3 = tt3;
    }

    public BigDecimal getTt3()
    {
        return tt3;
    }
    public void setTt4(BigDecimal tt4)
    {
        this.tt4 = tt4;
    }

    public BigDecimal getTt4()
    {
        return tt4;
    }
    public void setTgAb(BigDecimal tgAb)
    {
        this.tgAb = tgAb;
    }

    public BigDecimal getTgAb()
    {
        return tgAb;
    }
    public void setTpoAb(BigDecimal tpoAb)
    {
        this.tpoAb = tpoAb;
    }

    public BigDecimal getTpoAb()
    {
        return tpoAb;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("babeId", getBabeId())
            .append("checkDate", getCheckDate())
            .append("tsh", getTsh())
            .append("ft3", getFt3())
            .append("ft4", getFt4())
            .append("tt3", getTt3())
            .append("tt4", getTt4())
            .append("tgAb", getTgAb())
            .append("tpoAb", getTpoAb())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .append("createBy", getCreateBy())
            .toString();
    }
}
