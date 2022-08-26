package com.example.board.question;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


import java.time.LocalDateTime;
import java.util.List;

public interface QuestionRepository extends JpaRepository<Question,Integer> {


    Question findBySubject(String subject);
    Question findBySubjectAndContent(String subject,String content);
    List<Question> findBySubjectLike(String subject);
    Page<Question> findAll(Pageable pageable);

//    List<Question> findAllByCreateDate(int page, Pageable pageable);
}
