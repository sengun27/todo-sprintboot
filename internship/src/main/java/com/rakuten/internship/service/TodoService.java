package com.rakuten.internship.service;

import java.util.List;

import com.rakuten.internship.entity.Todo;
import com.rakuten.internship.repository.TodoRepository;

import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * このクラスは、データベースとのトランザクションをサポートするサービスクラスです。。
 */
@Service
public class TodoService {
    
    @Autowired
    private TodoRepository todorepository;

    public List<Todo> findTodos(){
        return todorepository.findAll();
    }

    public Todo save(Todo todo) {
        return todorepository.save(todo);
    }
}