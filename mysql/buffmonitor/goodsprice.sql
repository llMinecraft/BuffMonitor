create table goodsprice
(
    id                      bigint auto_increment comment '商品汇总统计'
        primary key,
    name                    varchar(30) null comment '商品名称',
    weapon_code             varchar(30) null comment '商品code',
    weaponinfo_id           bigint      null comment '商品信息id',
    allow_bargain           tinyint(1)  not null comment '是否开通还价(true：开通  false：未开通)',
    recent_price_max        double      null comment '近期最高价',
    recent_price_min        double      null comment '近期最低价',
    history_price_max       double      null comment '历史最高价',
    history_price_min       double      null comment '历史最低价',
    merchant_createtime     datetime    null comment '商家创建时间',
    merchant_lastupdatetime datetime    null comment '商家最后修改时间',
    create_time             datetime    null comment '创建时间',
    create_user             varchar(30) null comment '创建人',
    lastupdate_time         datetime    null comment '最后修改时间',
    lastupdate_user         varchar(30) null comment '最后修改人'
)
    comment '商品价格统计' collate = utf8_bin;

