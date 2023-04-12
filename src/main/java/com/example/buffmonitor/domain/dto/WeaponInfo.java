package com.example.buffmonitor.domain.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zky
 * @ClassName weaponinfo
 * @Description 商品信息
 * @date 2023/4/12 22:59
 */
public class WeaponInfo implements Serializable {
    /**
     * 商品信息Id
     */
    private Long id;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品代号
     */
    private String code;
    /**
     * 系统id
     */
    private Long appId;
    /**
     * 游戏区名称
     */
    private String gameName;
    /**
     * 商品图片链接
     */
    private String iconUrl;
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
    private String creatUser;
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

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
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

    public String getCreatUser() {
        return creatUser;
    }

    public void setCreatUser(String creatUser) {
        this.creatUser = creatUser;
    }

    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    @Override
    public String toString() {
        return "WeaponInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", appId=" + appId +
                ", gameName='" + gameName + '\'' +
                ", iconUrl='" + iconUrl + '\'' +
                ", createTime=" + createTime +
                ", lastUpdateTime=" + lastUpdateTime +
                ", creatUser='" + creatUser + '\'' +
                ", lastUpdateUser='" + lastUpdateUser + '\'' +
                '}';
    }
}
