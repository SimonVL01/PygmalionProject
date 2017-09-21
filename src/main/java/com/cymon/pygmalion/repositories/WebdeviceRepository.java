package com.cymon.pygmalion.repositories;

import com.cymon.pygmalion.domain.Webdevice;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vdabcursist on 20/09/2017.
 */

public interface WebdeviceRepository extends JpaRepository<Webdevice, Integer> {

    //WebDevice findByDeviceType();

    //WebDevice findByDeviceName();

    //WebDevice findByDeviceUseRatio();
}
