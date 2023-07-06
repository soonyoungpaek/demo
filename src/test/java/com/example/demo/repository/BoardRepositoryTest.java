package com.example.demo.repository;

import com.example.demo.domain.Board;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Log4j2
public class BoardRepositoryTest {

    public static BoardRepository boardRepository;

    // save 메서드 테스트
    @Test
    public void saveTest() {
        Board board = Board.builder()
                .title("제목1")
                .contents("내용1")
                .writer("작성자1")
                .date("2023-06-29")
                .build();
        log.info(board);
    }

    // delete 메서드 테스트
    @Test
    public void deleteTest() {
        int id = 1;
        boardRepository.delete(id);
        log.info("삭제 ID : " + id);
    }

    // findAll 메서드 테스트
    @Test
    public void findAllTest() {
        int id = 1;
        List<Board> result = boardRepository.findAll();
        log.info(result);
    }

    // edit 메서드 테스트
    @Test
    public void editTest() {
        int id = 1;
        Board board = Board.builder()
                .title("제목2")
                .contents("내용2")
                .writer("작성자2")
                .date("2023-06-29")
                .build();
        log.info(board);
    }

    // findById 메서드 테스트
    @Test
    public void findByIdTest() {
        int id = 1;
        Board board = boardRepository.findById(id);
        log.info(board);
    }
}



