package aaa.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aaa.model.BoardDTO;

@Mapper
public interface BoardMapper {

	List<BoardDTO> list();
	
	BoardDTO detail(int id);
	
	int insert(BoardDTO dto);
	
	int delete(BoardDTO dto);
	
	int update(BoardDTO dto);
	
	void addcnt(int id);

	int totalCnt();
}
