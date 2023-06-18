package com.glowsoft.service;

import com.glowsoft.dao.GeneralDAO;
import com.glowsoft.dao.GeneralDAO2;
import com.glowsoft.model.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

// ("memberS") xml의 beanId 설정과 같음.
@Service("memberS")
public class MemberService implements GeneralService {

    @Autowired
    @Qualifier("testRepository") //없어도됨 GeneralDAO와 GeneralDAO2는 타입이 다름. 왜? -> 다른 CLASS.
    private GeneralDAO generalDAO;

    @Autowired
    @Qualifier("testRepository2") //없어도됨 GeneralDAO2와 GeneralDAO는 타입이 다름. 왜? -> 다른 CLASS.
    private GeneralDAO2 generalDAO2;


    // == @Qualifier 어노테이션을 사용하는 이유는 스프링 bean중에 같은 CALSS 타입이 여러개 존재할때 구별하기 위해 사용
    // 예시 - org.mybatis.spring.SqlSessionTemplate class 의 bean이 여러개 존재할 경우
    // SqlSessionTemplate class 타입의 bean을 의존성 주입할 시 - 2개 이상이 spring bean이 존재하기 때문에
    // 어떠한 bean을 사용할지 명확하게 하기 위함.


    public List<MemberVO> selectList(){
        List<MemberVO> list =(List<MemberVO>)generalDAO.selectList("admin.selectList",null);
        for(MemberVO vo : list){
            System.out.println(vo.getId());
            System.out.println(vo.getPasswd());

        }

        List<MemberVO> list2 =(List<MemberVO>)generalDAO2.selectList("admin.selectList",null);
        for(MemberVO vo : list2){
            System.out.println(vo.getId());
            System.out.println(vo.getPasswd());

        }
        return list;
    }

}
