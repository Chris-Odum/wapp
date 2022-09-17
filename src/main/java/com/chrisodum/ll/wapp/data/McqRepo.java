package com.chrisodum.ll.wapp.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface McqRepo extends CrudRepository<MultipleChoiceQuestions, Long> {

}
