package com.zjt.entity;

public class Student {
    /**
     * 主键
     */
    private String id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别1男2女
     */
    private Integer gender;

    /**
     * 大文本描述
     */
    private String disc;

    /**
     * 主键
     * @return id 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 姓名
     * @return name 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 姓名
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 性别1男2女
     * @return gender 性别1男2女
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 性别1男2女
     * @param gender 性别1男2女
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 大文本描述
     * @return disc 大文本描述
     */
    public String getDisc() {
        return disc;
    }

    /**
     * 大文本描述
     * @param disc 大文本描述
     */
    public void setDisc(String disc) {
        this.disc = disc == null ? null : disc.trim();
    }
}