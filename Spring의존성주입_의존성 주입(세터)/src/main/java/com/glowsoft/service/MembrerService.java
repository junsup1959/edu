package com.glowsoft.service;

import com.glowsoft.mapper.MemberMapper;
import com.glowsoft.model.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembrerService implements GeneralService {

    private MemberMapper memberMapper;

    @Autowired
    //  private final MemberMapper memberMapper;
    // memberMapper 를 final로 선언해도 돌아가기는 하나 , 보안 정책상 올바르지 않음. 상위버전에서는 막혀있을 가능성이 큼.
    public void setMemberMapper(MemberMapper memberMapper){
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
