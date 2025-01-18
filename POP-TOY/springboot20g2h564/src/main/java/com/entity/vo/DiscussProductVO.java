package com.entity.vo;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.entity.ShoubanshangpinEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * 手办商品评论表
 * @author jamesaks
 * @since 2024/12/15
 */
@Data
public class DiscussProductVO implements Serializable {
    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 关联表id
     */

    private Long refid;

    /**
     * 用户id
     */

    private Long userid;

    /**
     * 头像
     */

    private String avatarurl;

    /**
     * 用户名
     */

    private String nickname;

    /**
     * 评论内容
     */

    private String content;

    /**
     * 回复内容
     */

    private String reply;

    /**
     * 产品信息
     */
    private ShoubanshangpinEntity productInfo;

}
