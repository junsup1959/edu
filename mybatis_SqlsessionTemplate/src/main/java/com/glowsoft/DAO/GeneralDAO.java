package com.glowsoft.DAO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GeneralDAO {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;


    //공통으로 사용하기 때문에 제너릭 타입
    public List<?> selectList(String queryId, Object parameterObject) {
        return this.sqlSessionTemplate.selectList(queryId, parameterObject);
    }


}
