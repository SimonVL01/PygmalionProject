package com.cymon.pygmalion.repositories;

import com.cymon.pygmalion.domain.Interest;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by simon on 19/09/17.
 */
public interface InterestRepository extends JpaRepository<Interest, Integer> {

    Interest findByCategories();

}
