create table weaponinfo
(
    id              bigint auto_increment comment '商品id'
        primary key,
    name            varchar(30)  null comment '商品名称',
    code            varchar(30)  null comment '商品代号',
    appid           bigint       null comment 'appId',
    game_name       varchar(30)  null comment '商品区域名称',
    icon_url        varchar(255) null comment '图标链接',
    create_time     datetime     null comment '创建时间',
    create_user     varchar(30)  null comment '创建人',
    lastupdate_time datetime     null comment '最后修改时间',
    lastupdate_user varchar(30)  null comment '最后修改人'
)
    comment '商品信息' collate = utf8_bin;

