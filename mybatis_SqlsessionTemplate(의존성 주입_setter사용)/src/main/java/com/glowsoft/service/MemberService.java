package com.glowsoft.service;

import com.glowsoft.DAO.GeneralDAO;
import com.glowsoft.model.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService implements GeneralService {


    @Autowired
    private GeneralDAO generalDAO;


    public List<MemberVO> selectList(){
        List<MemberVO> list =(List<MemberVO>)generalDAO.selectList("member.selectList",null);
        for(MemberVO vo : list){
            System.out.println(vo.getUser_id());
            System.out.println(vo.getUser_passwd());

        }
        return list;
    }

}
