package com.project.skyuniversity.ash.model;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

//=== #32. DAO 선언 ===
@Repository 
public class AnsehyeongDAO implements InterAnsehyeongDAO {

	@Resource
	private SqlSessionTemplate sqlsession; // 로컬DB에 연결
	// Type 에 따라 Spring 컨테이너가 알아서 root-context.xml 에 생성된 org.mybatis.spring.SqlSessionTemplate 의 bean 을  sqlsession 에 주입시켜준다. 
    // 그러므로 sqlsession 는 null 이 아니다.

	@Override
	public List<BannerVO> getBannerList() {
		List<BannerVO> bannerList = sqlsession.selectList("ansehyeong.getBannerList");
		return bannerList;
	}

	
	
	
}