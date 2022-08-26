package com.example.board;

import com.example.board.answer.Answer;
import com.example.board.answer.AnswerRepository;
import com.example.board.question.Question;
import com.example.board.question.QuestionRepository;
import com.example.board.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SbbApplicationTests {
    @Autowired
    private QuestionService questionService;

    @Test
    void testJpa() {
        for (int i = 1; i <= 300; i++) {
            String subject = String.format("테스트 데이터입니다:%03d", i);
            String content = "내용무";
            this.questionService.create(subject, content);
        }

    }
}
