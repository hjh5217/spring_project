package aaa.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aaa.model.BoardDTO;
import aaa.model.BoardDTOs;
import aaa.model.PageData;

@Mapper
public interface MybatisMapper {

	List<BoardDTO> list();
	
	List<BoardDTO> listSch(BoardDTO dto);
	
	List<BoardDTO> cntSch(BoardDTO dto);
	
	BoardDTO detail(int id);
	
	int insert(BoardDTO dto);
	
	int insertttList(List list);
	
	int inserttt(BoardDTO dto);
	
	int insertDTOs(BoardDTOs dtos);
	
	int delete(int id, String pw);
	
	int update(int id, String pw, String pname, String content, String title);
	
	void addcnt(int id);

	int totalCnt();
	
	int getMaxId();
	
	int idPwChk();
	
	void fileDelete(BoardDTO dto);
	
}