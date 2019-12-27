package com.chaouachi.stock.services;

import java.util.List;

import com.chaouachi.stock.entities.MvtDeStock;

public interface IMvtDeStockService {
	public MvtDeStock save(MvtDeStock entity);
	
	public MvtDeStock update(MvtDeStock entity);
	
	public List<MvtDeStock> selectAll();
	
	public MvtDeStock getById(Long id);
	
	public void remove(Long id);
	
	public List<MvtDeStock> selectAll(String sortField,String sort);
	
	public MvtDeStock findOne(String paramName,Object paramValue);
	
	public MvtDeStock findOne(String[] paramNames,Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);
}
