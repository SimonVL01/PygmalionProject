package com.cymon.pygmalion.repositories;

import com.cymon.pygmalion.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by vdabcursist on 19/09/2017.
 */

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByFirstname(String firstname);

    User findByLastname(String lastname);

    @Query(value = "SELECT u FROM User u WHERE u.gender = :m")
    List<User> selectMaleUsers(@Param("m") String gender);

    @Query(value = "SELECT u FROM User u WHERE u.gender = :f")
    List<User> selectFemaleUsers(@Param("f") String gender);

}
