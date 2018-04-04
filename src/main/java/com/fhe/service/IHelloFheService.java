package com.fhe.service;

import java.util.Map;

import com.fhe.domain.FheHello;
import com.fhe.model.FheHelloView;

public interface IHelloFheService {
	public Map<String, Object> selectHello(int id);

	public int insertHello(FheHello fheHello);
	
	public FheHelloView selectHelloMap(int id);

}
