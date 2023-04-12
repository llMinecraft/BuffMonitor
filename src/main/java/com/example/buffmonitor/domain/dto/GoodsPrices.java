package com.example.buffmonitor.domain.dto;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zky
 * @ClassName GoodsPrices
 * @Description 商品价格汇总
 * @date 2023/4/12 22:59
 */
public class GoodsPrices implements Serializable {
    /**
     * 商品id
     */
    private Long id;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品code
     */
    private String code;
    /**
     * 商品详情信息id
     */
    private Long weaponinfoId;
    /**
     * 允许还价 开启 true  未开启 false
     */
    private Boolean allowBargain;
    /**
     * 最近最高价
     */
    private BigDecimal recentPriceMax;
    /**
     * 最近最低价
     */
    private BigDecimal recentPriceMin;
    /**
     * 历史最高价
     */
    private BigDecimal historyPriceMax;
    /**
     * 历史最低价
     */
    private BigDecimal historyPriceMin;
    /**
     * 商家创建时间
     */
    private Date merchantCreateTime;
    /**
     * 商家最后修改时间
     */
    private Date merchantLastUpdateTime;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 最后修改时间
     */
    private Date lastUpdateTime;
    /**
     * 创建用户
     */
    private String createUser;
    /**
     * 最后修改用户
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getWeaponinfoId() {
        return weaponinfoId;
    }

    public void setWeaponinfoId(Long weaponinfoId) {
        this.weaponinfoId = weaponinfoId;
    }

    public Boolean getAllowBargain() {
        return allowBargain;
    }

    public void setAllowBargain(Boolean allowBargain) {
        this.allowBargain = allowBargain;
    }

    public BigDecimal getRecentPriceMax() {
        return recentPriceMax;
    }

    public void setRecentPriceMax(BigDecimal recentPriceMax) {
        this.recentPriceMax = recentPriceMax;
    }

    public BigDecimal getRecentPriceMin() {
        return recentPriceMin;
    }

    public void setRecentPriceMin(BigDecimal recentPriceMin) {
        this.recentPriceMin = recentPriceMin;
    }

    public BigDecimal getHistoryPriceMax() {
        return historyPriceMax;
    }

    public void setHistoryPriceMax(BigDecimal historyPriceMax) {
        this.historyPriceMax = historyPriceMax;
    }

    public BigDecimal getHistoryPriceMin() {
        return historyPriceMin;
    }

    public void setHistoryPriceMin(BigDecimal historyPriceMin) {
        this.historyPriceMin = historyPriceMin;
    }

    public Date getMerchantCreateTime() {
        return merchantCreateTime;
    }

    public void setMerchantCreateTime(Date merchantCreateTime) {
        this.merchantCreateTime = merchantCreateTime;
    }

    public Date getMerchantLastUpdateTime() {
        return merchantLastUpdateTime;
    }

    public void setMerchantLastUpdateTime(Date merchantLastUpdateTime) {
        this.merchantLastUpdateTime = merchantLastUpdateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    @Override
    public String toString() {
        return "GoodsPrices{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", weaponinfoId=" + weaponinfoId +
                ", allowBargain=" + allowBargain +
                ", recentPriceMax=" + recentPriceMax +
                ", recentPriceMin=" + recentPriceMin +
                ", historyPriceMax=" + historyPriceMax +
                ", historyPriceMin=" + historyPriceMin +
                ", merchantCreateTime=" + merchantCreateTime +
                ", merchantLastUpdateTime=" + merchantLastUpdateTime +
                ", createTime=" + createTime +
                ", lastUpdateTime=" + lastUpdateTime +
                ", createUser='" + createUser + '\'' +
                ", lastUpdateUser='" + lastUpdateUser + '\'' +
                '}';
    }
}
