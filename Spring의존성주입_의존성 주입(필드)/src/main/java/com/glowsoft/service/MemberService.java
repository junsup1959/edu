package com.glowsoft.service;

import com.glowsoft.mapper.MemberMapper;
import com.glowsoft.model.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService implements GeneralService {


    @Autowired
    private MemberMapper memberMapper;


    public List<MemberVO> selectList(){
        List<MemberVO> list = memberMapper.selectList();
        for(MemberVO vo : list){
            System.out.println(vo.getUser_id());
            System.out.println(vo.getUser_pwd());
        }
        return list;
    }

}
