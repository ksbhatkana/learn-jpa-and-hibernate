//package com.ksbhat.learnjpaandhibernate.course.jpa;
//
//import com.ksbhat.learnjpaandhibernate.course.Course;
//import com.ksbhat.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import jakarta.transaction.Transactional;
//import org.springframework.hateoas.EntityModel;
//import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
//import org.springframework.stereotype.Repository;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
//
//@Repository
//@Transactional
//public class CourseJpaRepository {
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    public void insert(Course course) {
//        entityManager.merge(course);
//    }
//
//    public Course findById(long id) {
//        return entityManager.find(Course.class, id);
//    }
//
//    public void deleteById(long id) {
//        Course course = entityManager.find(Course.class, id);
//        entityManager.remove(course);
//    }
//
//    public EntityModel<User> retrieveUser(@PathVariable int id) {
//        User user = service.findOne(id);
//
//        if(user==null){
//            throw new UserNotFoundException("id:"+id);
//        }
//
//        EntityModel<User> entityModel = EntityModel.of(user);
//
//        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).retrieveAllUsers());
//        entityModel.add(link.withRel("all-users"));
//
//        return entityModel;
//    }
//}
