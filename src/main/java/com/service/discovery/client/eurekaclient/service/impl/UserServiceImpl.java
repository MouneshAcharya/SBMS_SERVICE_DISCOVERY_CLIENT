package com.service.discovery.client.eurekaclient.service.impl;

import com.service.discovery.client.eurekaclient.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class UserServiceImpl implements UserService {
    @Override
    public String getUser() {
        log.info("getting user details");
        return "Mounesh Acharya";
    }
}
