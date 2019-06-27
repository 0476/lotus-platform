package com.ailikes.lotus.auth.server.service;
import java.util.List;
import java.util.Map;
import com.ailikes.lotus.common.core.commons.PageResult;
import com.ailikes.lotus.common.core.commons.Result;
import com.ailikes.lotus.auth.server.dto.ClientDto;
import com.ailikes.lotus.auth.server.model.Client;

public interface ClientService {

	
	Client getById(Long id) ;
	 
    void saveClient(ClientDto clientDto);

    Result saveOrUpdate(ClientDto clientDto);

    void deleteClient(Long id);
    
    public PageResult<Client> listRoles(Map<String, Object> params);
    
    List<Client> findList(Map<String, Object> params) ;
    
    List<Client> listByUserId(Long userId) ;
    
}
