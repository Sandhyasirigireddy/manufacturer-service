package com.manufacture.manage.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manufacture.manage.entity.ManufactureEntity;
import com.manufacture.manage.repository.ManufactureRepository;
import com.manufacture.manage.service.ManufactureService;

@Service
public class ManufactureServiceImpl implements ManufactureService {
	
	@Autowired
	private ManufactureRepository  manufactureRepository;

	@Override
	public void createManufacture(ManufactureEntity manufactureEntity) {
		manufactureRepository.save(manufactureEntity);
	}

	@Override
	public void upadteManufacture(ManufactureEntity manufactureEntity) {
		
		manufactureRepository.save(manufactureEntity);

	}

	@Override
	public void delateManufacture(int manufactureId) {
		manufactureRepository.deleteById(manufactureId);
	}

	
	@Override
	public ManufactureEntity findByManufactureId(int manufactureId) {
		ManufactureEntity manufactureEntity;
		Optional<ManufactureEntity> manufactureEntityOptional=manufactureRepository.findById(manufactureId);
		if(manufactureEntityOptional.isPresent()) {
			manufactureEntity=manufactureEntityOptional.get();
		}
		else {
			throw new RuntimeException( manufactureId+ "--->manufacture is not found");
		}
		return manufactureEntity;
	}

}
