package com.entity.vo;

import com.entity.JiluEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 领用记录
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-03-23
 */
@TableName("jilu")
public class JiluVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 领用人
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 领用用品
     */

    @TableField(value = "goods_id")
    private Integer goodsId;


    /**
     * 领用数量
     */

    @TableField(value = "num")
    private Integer num;


    /**
     * 领用时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "lingyong_time")
    private Date lingyongTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：领用人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：领用人
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：领用用品
	 */
    public Integer getGoodsId() {
        return goodsId;
    }


    /**
	 * 获取：领用用品
	 */

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
    /**
	 * 设置：领用数量
	 */
    public Integer getNum() {
        return num;
    }


    /**
	 * 获取：领用数量
	 */

    public void setNum(Integer num) {
        this.num = num;
    }
    /**
	 * 设置：领用时间
	 */
    public Date getLingyongTime() {
        return lingyongTime;
    }


    /**
	 * 获取：领用时间
	 */

    public void setLingyongTime(Date lingyongTime) {
        this.lingyongTime = lingyongTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
