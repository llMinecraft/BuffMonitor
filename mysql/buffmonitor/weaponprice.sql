create table weaponprice
(
    id              bigint auto_increment comment '商品价格表id'
        primary key,
    name            varchar(30) null comment '商品名称',
    steamprice      double      not null comment 'steam价格',
    steamprice_cn   double      not null comment '国区价格',
    buff_price      double      not null comment 'buff市场价',
    weaponinfo_id   bigint      not null comment '商品信息表id',
    weapon_code     varchar(30) not null comment '商品code',
    create_time     datetime    null comment '创建时间',
    create_user     varchar(30) null comment '创建人',
    lastupdate_time datetime    null comment '最后修改人',
    lastupdate_user varchar(30) null comment '最后修改人'
)
    comment '商品价格信息' collate = utf8_bin;

