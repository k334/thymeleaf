package com.magelala.thymeleaf.service;

import com.magelala.thymeleaf.entity.Footer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FooterService {

    Footer selectById(Integer id);

    List<Footer> selectAll();
}
