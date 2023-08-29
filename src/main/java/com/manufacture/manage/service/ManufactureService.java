package com.manufacture.manage.service;


import com.manufacture.manage.entity.ManufactureEntity;


public interface ManufactureService {
	
	public void createManufacture(ManufactureEntity manufactureEntity);
	public void upadteManufacture(ManufactureEntity manufactureEntity);
	public void delateManufacture(int manufactureId);
	public ManufactureEntity findByManufactureId(int manufactureId);



}
