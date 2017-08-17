package com.zjt;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.zjt.dao.StudentMapper;
import com.zjt.entity.Student;
import com.zjt.entity.StudentExample;

public class testMybatis {

	private SqlSessionFactory sqlSessionFactory;
	private Reader reader;

	@Before
	public void init() {
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//@Test
	public void testQueryStudent() {
		SqlSession sqlSession = sqlSessionFactory.openSession(false);
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		try {
			List<Student> list1 = studentMapper.selectByExample(null);
			List<Student> list2 = studentMapper.selectByExampleWithBLOBs(null);
			System.out.println(list1.get(0).getDisc());
			System.out.println(list2.get(0).getDisc());
		} catch(Exception e){
			e.printStackTrace();
			sqlSession.rollback(); 
		}finally {
			sqlSession.close();
		}
	}
	
	
	@Test
	public void testQueryStudentExample() {
		SqlSession sqlSession = sqlSessionFactory.openSession(false);
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		try {
			//查询性别为男的，并且名称中包含z的
			StudentExample studentExample=new StudentExample();
			studentExample.or().andGenderEqualTo(1).andNameLike("%z%");
			studentExample.setOffset(0);
			studentExample.setLimit(3);
			studentExample.setOrderByClause("GENDER DESC");
			List<Student> list1 = studentMapper.selectByExample(studentExample);
			List<Student> list2 = studentMapper.selectByExampleWithBLOBs(studentExample);
			System.out.println(list1.get(0).getDisc());
			System.out.println(list2.get(0).getDisc());
		} catch(Exception e){
			e.printStackTrace();
			sqlSession.rollback(); 
		}finally {
			sqlSession.close();
		}
	}
	
	
	
	
	
	//@Test
	public void testInsertStudent() {
		SqlSession sqlSession = sqlSessionFactory.openSession(false);
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		try {
			
			Student s=new Student();
			s.setId(java.util.UUID.randomUUID().toString().replaceAll("\\-", ""));
			s.setName("zjt");
			s.setGender(1);
			s.setDisc("MyBatis Generator 真心好用");
			studentMapper.insert(s);
			sqlSession.commit(); 
			
			
		} catch(Exception e){
			e.printStackTrace();
			sqlSession.rollback();  
		}finally {
			sqlSession.close();
		}
	}
	
	
	
	
	
	
	
	
	//@Test
	public void testUpdateStudent() {
		SqlSession sqlSession = sqlSessionFactory.openSession(false);
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		try {
			
			Student s=new Student();
			s.setId("3cc4c961eea44aca8901def06e0cf805");
			s.setName("阿童木");
			s.setGender(2);
			s.setDisc("tokoy hot！！！tokoy hot！！！tokoy hot！！！tokoy hot！！！ ");
			studentMapper.updateByPrimaryKeyWithBLOBs(s);
			sqlSession.commit(); 
			
			
		} catch(Exception e){
			e.printStackTrace();
			sqlSession.rollback();  
		}finally {
			sqlSession.close();
		}
	}
	
	
	
	
	
	
	

}