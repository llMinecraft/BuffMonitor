package com.example.buffmonitor.domain.dto;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.math.BigDecimal;
import java.text.Bidi;
import java.util.Date;

/**
 * @author zky
 * @ClassName WeaponPrice
 * @Description 商品价格
 * @date 2023/4/12 22:59
 */
public class WeaponPrice implements Serializable {
    /**
     * WeaponPrice id
     */
    private Long id;
    /**
     * 商品名称
     */
    private String name;
    /**
     * steam价格
     */
    private BigDecimal steamprice;
    /**
     * steam国区价格
     */
    private BigDecimal steampriceCN;
    /**
     * buff价格
     */
    private BigDecimal buffprice;
    /**
     * weaponInfoId
     */
    private Long weaponInfoId;
    /**
     * 商品code
     */
    private String weaponCode;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建用户
     */
    private String createUser;
    /**
     * 最后修改时间
     */
    private Date lastUpdateTime ;
    /**
     * 最后修改人
     */
    private String lastUpdateUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSteamprice() {
        return steamprice;
    }

    public void setSteamprice(BigDecimal steamprice) {
        this.steamprice = steamprice;
    }

    public BigDecimal getSteampriceCN() {
        return steampriceCN;
    }

    public void setSteampriceCN(BigDecimal steampriceCN) {
        this.steampriceCN = steampriceCN;
    }

    public BigDecimal getBuffprice() {
        return buffprice;
    }

    public void setBuffprice(BigDecimal buffprice) {
        this.buffprice = buffprice;
    }

    public Long getWeaponInfoId() {
        return weaponInfoId;
    }

    public void setWeaponInfoId(Long weaponInfoId) {
        this.weaponInfoId = weaponInfoId;
    }

    public String getWeaponCode() {
        return weaponCode;
    }

    public void setWeaponCode(String weaponCode) {
        this.weaponCode = weaponCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    @Override
    public String toString() {
        return "WeaponPrice{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", steamprice=" + steamprice +
                ", steampriceCN=" + steampriceCN +
                ", buffprice=" + buffprice +
                ", weaponInfoId=" + weaponInfoId +
                ", weaponCode='" + weaponCode + '\'' +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", lastUpdateTime=" + lastUpdateTime +
                ", lastUpdateUser='" + lastUpdateUser + '\'' +
                '}';
    }
}
