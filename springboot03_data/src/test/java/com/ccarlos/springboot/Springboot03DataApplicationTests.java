package com.ccarlos.springboot;

import com.ccarlos.mapper.ArticleMapper;
import com.ccarlos.mapper.CommentMapper;
import com.ccarlos.pojo.Address;
import com.ccarlos.pojo.Article;
import com.ccarlos.pojo.Comment;
import com.ccarlos.pojo.Person;
import com.ccarlos.repository.CommentRepository;
import com.ccarlos.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class Springboot03DataApplicationTests {

    @Autowired
    private CommentMapper commentMapper;

    @Test
    void contextLoads() {
        Comment comment = commentMapper.findById(1);
        System.out.println(comment);
    }

    @Autowired
    private ArticleMapper articleMapper;


    @Test
    public void selectArticle() {
        Article article = articleMapper.selectArticle(1);
        System.out.println(article);
    }

    //测试整合JPA
    @Autowired
    private CommentRepository commentRepository;

    @Test
    public void selectComment() {
        Optional<Comment> byId = commentRepository.findById(1);
        if (byId.isPresent()) {
            System.out.println(byId.get());
        }
    }

    //测试整合redis
    @Autowired
    private PersonRepository personRepository;

    @Test
    public void savePerson() {
        Person person = new Person();
        person.setFirstname("张");
        person.setLastname("三");

        Address address = new Address();
        address.setCity("北京");
        address.setCountry("中国");
        person.setAddress(address);

        // 向redis数据库中添加了数据
        personRepository.save(person);

    }

    @Test
    public void selectPerson() {
        List<Person> list = personRepository.findByAddress_City("北京");
        for (Person person : list) {
            System.out.println(person);
        }


    }
}
