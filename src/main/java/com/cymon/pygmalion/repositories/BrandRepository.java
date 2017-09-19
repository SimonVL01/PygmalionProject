package com.cymon.pygmalion.repositories;

import com.cymon.pygmalion.domain.Brand;
import com.cymon.pygmalion.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vdabcursist on 19/09/2017.
 */
public interface BrandRepository extends JpaRepository<Brand, Integer> {

    //User findById(Integer id);

    User findByFullname(String fullname);

    User findByCompanyname(String companyname);

}
