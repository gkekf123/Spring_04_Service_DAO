package com.simple.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.simple.DAO.ScoreDAO;
import com.simple.command.ScoreVO;

@Service("scoreService") // 컴포넌트 스캔에 읽히면 자동으로 빈 등록
public class ScoreServiceImpl implements ScoreService{

	// DAO영역
	@Autowired
	@Qualifier("scoreDAO")
	ScoreDAO scoreDAO;
	
	@Override
	public void scoreRegist(ScoreVO vo) {

		scoreDAO.scoreRegist(vo);
		
	}

	@Override
	public ArrayList<ScoreVO> getScores() {
		return scoreDAO.getScores();
	}

	@Override
	public void scoreDelete(int index) {
		scoreDAO.scoreDelete(index);
	}

}
