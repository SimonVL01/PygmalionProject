package com.cymon.pygmalion.repositories;

import com.cymon.pygmalion.domain.Brand;
import com.cymon.pygmalion.domain.User;
import com.cymon.pygmalion.repositories.dto.AgesByFrequency;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by vdabcursist on 19/09/2017.
 */
public interface BrandRepository extends JpaRepository<Brand, Integer> {

    //User findById(Integer id);

    Brand findById(Integer id);

    User findByFullname(String fullname);

    User findByCompanyname(String companyname);

    @Query("select new com.cymon.pygmalion.repositories.dto.AgesByFrequency(u.age, count(u.age)) from Brand b join b.targetAudience u where b.companyname = :brandname group by u.age order by count(u.age) desc")
    List<AgesByFrequency> findAgesByFrequency(@Param("brandname") String brandName, Pageable p);

    //@Query(value = "SELECT top 1 b.targetAudience.age FROM Brand b.targetAudience ORDER BY count(*) desc")
    //public int selectPopularAge();
}
