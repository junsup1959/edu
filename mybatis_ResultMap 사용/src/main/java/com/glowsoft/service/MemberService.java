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
        List<MemberVO> list1 =(List<MemberVO>)generalDAO.selectList("member.selectList1",null);
        System.out.println("############################################");
        System.out.println("start BaseMap");
        try {
            for(MemberVO vo : list1){
                System.out.println(vo.getId());
                System.out.println(vo.getPasswd());
                //null point Exception
            System.out.println(vo.getMemberAdd().getDenyWay());
            System.out.println(vo.getMemberAdd().getSendYn());
            }
        }catch (NullPointerException e){
            System.out.println("-------- null ------------");
        }

        System.out.println("############################################");


        List<MemberVO>list2 = (List<MemberVO>)generalDAO.selectList("member.selectList2",null);
        System.out.println("############################################");
        System.out.println("start BaseMap2");
        for(MemberVO vo : list2){
            System.out.println(vo.getId());
            System.out.println(vo.getPasswd());
            System.out.println(vo.getMemberAdd().getDenyWay());
            System.out.println(vo.getMemberAdd().getSendYn());
        }
        System.out.println("############################################");


        List<MemberVO>list3 = (List<MemberVO>)generalDAO.selectList("member.selectList3",null);

        System.out.println("############################################");
        System.out.println("start BaseMap3");

        for(MemberVO vo : list3){
            System.out.println(vo.getId());
            System.out.println(vo.getPasswd());
            System.out.println(vo.getMemberAdd().getDenyWay());
            System.out.println(vo.getMemberAdd().getSendYn());
        }

        System.out.println("############################################");

        return list1;
    }

}
