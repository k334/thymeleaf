package com.magelala.thymeleaf.service.impl;

import com.magelala.thymeleaf.dao.FooterMapper;
import com.magelala.thymeleaf.entity.Footer;
import com.magelala.thymeleaf.service.FooterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FooterServiceImpl implements FooterService {

    @Resource
    private FooterMapper footerMapper;

    @Override
    public Footer selectById(Integer id) {
        return footerMapper.selectById(id);
    }

    @Override
    public List<Footer> selectAll() {
        return footerMapper.selectList(null);
    }
}
