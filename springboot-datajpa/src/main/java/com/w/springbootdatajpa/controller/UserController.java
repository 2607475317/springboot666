package com.w.springbootdatajpa.controller;

import com.w.springbootdatajpa.entity.User;
import com.w.springbootdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/user")
    @ResponseBody
    public Optional<User> getuser(Integer id){
        Optional<User> byId = userRepository.findById(1);
        return byId;
    }

    @RequestMapping("/user1")
    @ResponseBody
    public List<User> testPageable() {
        //Pageable:用于封装分页参数，当前页码和记录总数
        Pageable pageable = new PageRequest(0, 2);
        //封装排序条件的对象
        //Page:用于封装分页查询后的结果
        Page<User> pageData = userRepository.findAll(pageable);
        //总记录数
        System.out.println(pageData.getTotalElements());
        //当前页的数据
        List<User> content = pageData.getContent();
        //总页数
        System.out.println(pageData.getTotalPages());
           return content;

    }




      //使用JpaSpecificationExecutor接口的方法完成组合查询(一个条件)
       @RequestMapping("/user2")
       @ResponseBody
       public List<User> JpaSpecificationExecutor (){
        //Specification:是用于封装条件数据的对象
           Specification<User> spec=new Specification<User>() {
               //Predicate:该对象用于封装条件数据
               /**
                *
                * @param root  根对象，用于查询对象的属性
                * @param criteriaQuery  执行普通的查询
                * @param criteriaBuilder  查询条件构造器，用于完成不同条件的查询
                * @return
                */
               @Override
               public Predicate toPredicate(Root<User> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {

                   Predicate pre=criteriaBuilder.equal(root.get("lastName"),"王");
                //返回查询条件
                   return pre;
               }
           };

           List<User> list = userRepository.findAll(spec);
            return list;
       }

    //使用JpaSpecificationExecutor接口的方法完成组合查询(多个条件)
    @RequestMapping("/user3")
    @ResponseBody
    public List<User> JpaSpecificationExecutor3 (){
        //Specification:是用于封装条件数据的对象
        Specification<User> spec=new Specification<User>() {
            //Predicate:该对象用于封装条件数据
            @Override
            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {

            List<Predicate> pre=new ArrayList<Predicate>();
            pre.add(criteriaBuilder.equal(root.get("lastName"),"王"));
            pre.add(criteriaBuilder.equal(root.get("id"),"1"));

            Predicate [] preArray=new Predicate[pre.size()];
            //返回多个查询条件
            return criteriaBuilder.and(pre.toArray(preArray));//将集合转换为数组，
            }
        };

        List<User> list = userRepository.findAll(spec);
        return list;
    }
}
