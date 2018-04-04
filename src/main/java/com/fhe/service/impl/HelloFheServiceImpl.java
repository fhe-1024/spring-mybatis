package com.fhe.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fhe.dao.HelloFheDao;
import com.fhe.domain.FheHello;
import com.fhe.model.FheHelloView;
import com.fhe.service.IHelloFheService;

@Transactional
@Service
public class HelloFheServiceImpl implements IHelloFheService {
	@Autowired
	private HelloFheDao helloFheDao;

	public Map<String, Object> selectHello(int id) {
		// TODO Auto-generated method stub
		return helloFheDao.selectHello(id);
	}

	public int insertHello(FheHello fheHello) {
		// TODO Auto-generated method stub
		return helloFheDao.insertHello(fheHello);
	}

	public FheHelloView selectHelloMap(int id) {
		// TODO Auto-generated method stub
		return helloFheDao.selectHelloMap(id);
	}

}
