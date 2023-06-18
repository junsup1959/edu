package com.glowsoft.mapper;

import com.glowsoft.model.MemberVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberMapper {

    List<MemberVO> selectList();
}
