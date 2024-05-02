package com.entity.model;

import com.entity.JiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 领用记录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-03-23
 */
public class JiluModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 领用人
     */
    private Integer yonghuId;


    /**
     * 领用用品
     */
    private Integer goodsId;


    /**
     * 领用数量
     */
    private Integer num;


    /**
     * 领用时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date lingyongTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：领用人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：领用人
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：领用用品
	 */
    public Integer getGoodsId() {
        return goodsId;
    }


    /**
	 * 设置：领用用品
	 */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
    /**
	 * 获取：领用数量
	 */
    public Integer getNum() {
        return num;
    }


    /**
	 * 设置：领用数量
	 */
    public void setNum(Integer num) {
        this.num = num;
    }
    /**
	 * 获取：领用时间
	 */
    public Date getLingyongTime() {
        return lingyongTime;
    }


    /**
	 * 设置：领用时间
	 */
    public void setLingyongTime(Date lingyongTime) {
        this.lingyongTime = lingyongTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
