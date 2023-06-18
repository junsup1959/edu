package com.glowsoft.service;

import com.glowsoft.mapper.MemberMapper;
import com.glowsoft.model.MemberVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService implements GeneralService {


    private final MemberMapper memberMapper;


//   @Autowired
//   생성자 주입방식은 스프링 4.3.x 이상부터 Autowired 생략 가능.
//    생성자 주입은 파이널 필드로 입력 가능.
    public MemberService(MemberMapper memberMapper){
        this.memberMapper = memberMapper;
    }


    public List<MemberVO> selectList(){
        List<MemberVO> list = memberMapper.selectList();
        for(MemberVO vo : list){
            System.out.println(vo.getUser_id());
            System.out.println(vo.getUser_pwd());
        }
        return list;
    }

}
