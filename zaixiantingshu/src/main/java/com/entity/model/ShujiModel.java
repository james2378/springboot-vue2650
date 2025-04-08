package com.entity.model;

import com.entity.ShujiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 书籍
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShujiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 书籍名称
     */
    private String shujiName;


    /**
     * 书籍照片
     */
    private String shujiPhoto;


    /**
     * 书籍分类
     */
    private Integer shujiTypes;


    /**
     * 书籍文件
     */
    private String shujiFile;


    /**
     * 音频
     */
    private String shujiMusic;


    /**
     * 点击次数
     */
    private Integer shujiClicknum;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer shujiDelete;


    /**
     * 书籍介绍
     */
    private String shujiContent;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：书籍名称
	 */
    public String getShujiName() {
        return shujiName;
    }


    /**
	 * 设置：书籍名称
	 */
    public void setShujiName(String shujiName) {
        this.shujiName = shujiName;
    }
    /**
	 * 获取：书籍照片
	 */
    public String getShujiPhoto() {
        return shujiPhoto;
    }


    /**
	 * 设置：书籍照片
	 */
    public void setShujiPhoto(String shujiPhoto) {
        this.shujiPhoto = shujiPhoto;
    }
    /**
	 * 获取：书籍分类
	 */
    public Integer getShujiTypes() {
        return shujiTypes;
    }


    /**
	 * 设置：书籍分类
	 */
    public void setShujiTypes(Integer shujiTypes) {
        this.shujiTypes = shujiTypes;
    }
    /**
	 * 获取：书籍文件
	 */
    public String getShujiFile() {
        return shujiFile;
    }


    /**
	 * 设置：书籍文件
	 */
    public void setShujiFile(String shujiFile) {
        this.shujiFile = shujiFile;
    }
    /**
	 * 获取：音频
	 */
    public String getShujiMusic() {
        return shujiMusic;
    }


    /**
	 * 设置：音频
	 */
    public void setShujiMusic(String shujiMusic) {
        this.shujiMusic = shujiMusic;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getShujiClicknum() {
        return shujiClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setShujiClicknum(Integer shujiClicknum) {
        this.shujiClicknum = shujiClicknum;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getShujiDelete() {
        return shujiDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setShujiDelete(Integer shujiDelete) {
        this.shujiDelete = shujiDelete;
    }
    /**
	 * 获取：书籍介绍
	 */
    public String getShujiContent() {
        return shujiContent;
    }


    /**
	 * 设置：书籍介绍
	 */
    public void setShujiContent(String shujiContent) {
        this.shujiContent = shujiContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
