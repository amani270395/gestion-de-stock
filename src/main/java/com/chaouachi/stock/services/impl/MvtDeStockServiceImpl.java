package com.chaouachi.stock.services.impl;

import java.util.List;

import com.chaouachi.stock.dao.IMvtDeStockDao;
import com.chaouachi.stock.entities.MvtDeStock;
import com.chaouachi.stock.services.IMvtDeStockService;

public class MvtDeStockServiceImpl implements IMvtDeStockService {

	private IMvtDeStockDao dao;
	public void setDao(IMvtDeStockDao dao) {
		this.dao = dao;
	}
	@Override
	public MvtDeStock save(MvtDeStock entity) {
		return dao.save(entity);
	}

	@Override
	public MvtDeStock update(MvtDeStock entity) {
		return dao.update(entity);
	}

	@Override
	public List<MvtDeStock> selectAll() {
		return dao.selectAll();
	}

	@Override
	public MvtDeStock getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public List<MvtDeStock> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public MvtDeStock findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public MvtDeStock findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
