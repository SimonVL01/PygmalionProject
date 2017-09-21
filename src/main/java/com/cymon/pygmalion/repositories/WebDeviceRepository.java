package com.cymon.pygmalion.repositories;

import com.cymon.pygmalion.domain.WebDevice;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vdabcursist on 20/09/2017.
 */

public interface WebDeviceRepository extends JpaRepository<WebDevice, Integer> {

    WebDevice findByDeviceType();

    WebDevice findByDeviceName();

    WebDevice findByDeviceUseRatio();
}
