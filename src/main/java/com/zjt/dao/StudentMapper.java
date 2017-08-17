package com.zjt.dao;

import com.zjt.entity.Student;
import com.zjt.entity.StudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    /**
     *
     * @mbggenerated 2017-08-17
     */
    int countByExample(StudentExample example);

    /**
     *
     * @mbggenerated 2017-08-17
     */
    int deleteByExample(StudentExample example);

    /**
     *
     * @mbggenerated 2017-08-17
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-08-17
     */
    int insert(Student record);

    /**
     *
     * @mbggenerated 2017-08-17
     */
    int insertSelective(Student record);

    /**
     *
     * @mbggenerated 2017-08-17
     */
    List<Student> selectByExampleWithBLOBs(StudentExample example);

    /**
     *
     * @mbggenerated 2017-08-17
     */
    List<Student> selectByExample(StudentExample example);

    /**
     *
     * @mbggenerated 2017-08-17
     */
    Student selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-08-17
     */
    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    /**
     *
     * @mbggenerated 2017-08-17
     */
    int updateByExampleWithBLOBs(@Param("record") Student record, @Param("example") StudentExample example);

    /**
     *
     * @mbggenerated 2017-08-17
     */
    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    /**
     *
     * @mbggenerated 2017-08-17
     */
    int updateByPrimaryKeySelective(Student record);

    /**
     *
     * @mbggenerated 2017-08-17
     */
    int updateByPrimaryKeyWithBLOBs(Student record);

    /**
     *
     * @mbggenerated 2017-08-17
     */
    int updateByPrimaryKey(Student record);
}