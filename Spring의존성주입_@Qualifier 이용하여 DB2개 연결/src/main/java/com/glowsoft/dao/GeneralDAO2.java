package com.glowsoft.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

// ("testRepository2") xml의 beanId 설정과 같음. 설정하지 않으면 class의 카멜 표기법에 따라 beanId는 genlralDAO2로 됨.
@Repository("testRepository2")
public class GeneralDAO2 {


    //1번 CASE
    @Autowired
    @Qualifier("template")
    private SqlSessionTemplate sessionTemplate;

    //2번 CASE bean id와 같은 객체명을 사용할시 매핑됨.
//    @Autowired
//    private SqlSessionTemplate template;



    public List<?> selectList(String queryId, Object parameterObject) {

        //1번 CASE
        return this.sessionTemplate.selectList(queryId, parameterObject);


        //2번 CASE
//        return this.template.selectList(queryId, parameterObject);


    }

}
