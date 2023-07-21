package com.simple.DAO;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.simple.command.ScoreVO;

@Repository("scoreDAO") // 이름 지정 - 컴포넌트 스캔에 읽히면 자동으로 빈 등록
public class ScoreDAOImpl implements ScoreDAO{
	
	// 데이터역할이라고 가정
	ArrayList<ScoreVO> list = new ArrayList<>();
	
	@Override
	public void scoreRegist(ScoreVO vo) {
		
		list.add(vo);
		
		System.out.println(list.toString());
		
	}

	@Override
	public ArrayList<ScoreVO> getScores() {
		
		return list;
	}

	@Override
	public void scoreDelete(int index) {
		
		list.remove(index); // 삭제
	}

}
