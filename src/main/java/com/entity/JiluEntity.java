package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 领用记录
 *
 * @author 
 * @email
 * @date 2021-03-23
 */
@TableName("jilu")
public class JiluEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiluEntity() {

	}

	public JiluEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @TableField(value = "lingyong_time",fill = FieldFill.UPDATE)

    private Date lingyongTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "Jilu{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", goodsId=" + goodsId +
            ", num=" + num +
            ", lingyongTime=" + lingyongTime +
            ", createTime=" + createTime +
        "}";
    }
}
