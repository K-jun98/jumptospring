package com.example.board.question;

import com.example.board.DataNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public Page<Question> getList(int page) {
        Sort sorts = Sort.by("createDate").descending();
        Pageable pageable = PageRequest.of(page, 10, sorts);
        return this.questionRepository.findAll(pageable);
//return this.questionRepository.findAllByCreateDate(page,pageable);
    }

    public Question getQuestion(Integer id) {
        Optional<Question> question = this.questionRepository.findById(id);
        if (question.isPresent())
            return question.get();
        else
            throw new DataNotFoundException("question not fount");
    }


    public void create(String subject, String content) {
        Question q = new Question();
        q.setSubject(subject);
        q.setContent(content);
        q.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q);
    }
}
