package com.smile.controller;

import com.smile.mapper.PersonDatabaseMapper;
import com.smile.pojo.PersonDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by H1N1 on 2018/6/12.
 */
@Controller
public class PersonController {

    @Autowired
    private PersonDatabaseMapper personDatabaseMapper;

    public PersonDatabase getPersonDatabase(String tel){
        PersonDatabase personDatabase  = personDatabaseMapper.selectPersonDatabaseByTel("13926285065");
        System.out.println("personDatabase: "+personDatabase);
        return personDatabase;
    }

}
