/**
 * 严肃声明：
 * 开源版本请务必保留此注释头信息，若删除我方将保留所有法律责任追究！
 * 本软件已申请软件著作权，受国家版权局知识产权以及国家计算机软件著作权保护！
 * 可正常分享和学习源码，不得用于违法犯罪活动，违者必究！
 * Copyright (c) 2020 楼楼商城 all rights reserved.
 * 版权所有，侵权必究！
 */
package com.Lmall.api.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import springfox.documentation.annotations.ApiIgnore;

import java.io.Serializable;

/**
 * 添加购物项param
 */
@Data
public class SaveCartItemParam implements Serializable {

    @ApiModelProperty("商品数量")
    private Integer goodsCount;

    @ApiModelProperty("商品id")
    private Long goodsId;
}
