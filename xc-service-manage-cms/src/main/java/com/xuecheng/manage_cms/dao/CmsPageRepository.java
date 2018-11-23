package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;



/**
 * @author Shiryon
 * @version 1.0
 * @create ${data} ${time}
 **/
public interface CmsPageRepository extends MongoRepository<CmsPage,String> {

    @Override
    Page<CmsPage> findAll(Pageable pageable);
}
