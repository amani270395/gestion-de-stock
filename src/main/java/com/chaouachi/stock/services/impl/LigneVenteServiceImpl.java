package com.chaouachi.stock.services.impl;

import java.util.List;

import com.chaouachi.stock.dao.ILigneVenteDao;
import com.chaouachi.stock.entities.LigneVente;
import com.chaouachi.stock.services.ILigneVenteService;

public class LigneVenteServiceImpl implements ILigneVenteService {

	private ILigneVenteDao dao;
	public void setDao(ILigneVenteDao dao) {
		this.dao = dao;
	}
	@Override
	public LigneVente save(LigneVente entity) {
		return dao.save(entity);
	}

	@Override
	public LigneVente update(LigneVente entity) {
		return dao.update(entity);
	}

	@Override
	public List<LigneVente> selectAll() {
		return dao.selectAll();
	}

	@Override
	public LigneVente getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public List<LigneVente> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public LigneVente findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public LigneVente findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
