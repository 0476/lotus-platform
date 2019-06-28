package com.ailikes.lotus.log.es.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.ailikes.lotus.log.es.entity.LogDocument;

/**
 * @author ailikes
 * @version 1.0.0
 */
@Repository
public interface EsLogDao extends ElasticsearchRepository<LogDocument, String> {

}