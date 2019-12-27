package com.chaouachi.stock.services.impl;

import java.util.List;

import com.chaouachi.stock.dao.ILingneCommandeClientDao;
import com.chaouachi.stock.entities.LigneCommandeClient;
import com.chaouachi.stock.services.ILigneCommandeClientService;

public class LigneCommandeClientServiceImpl implements ILigneCommandeClientService {

	private ILingneCommandeClientDao dao;
	public void setDao(ILingneCommandeClientDao dao) {
		this.dao = dao;
	}
	@Override
	public LigneCommandeClient save(LigneCommandeClient entity) {
		return dao.save(entity);
	}

	@Override
	public LigneCommandeClient update(LigneCommandeClient entity) {
		return dao.update(entity);
	}

	@Override
	public List<LigneCommandeClient> selectAll() {
		return dao.selectAll();
	}

	@Override
	public LigneCommandeClient getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public List<LigneCommandeClient> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public LigneCommandeClient findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public LigneCommandeClient findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
	

}
