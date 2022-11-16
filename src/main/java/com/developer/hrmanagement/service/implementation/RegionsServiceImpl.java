package com.developer.hrmanagement.service.implementation;

import com.developer.hrmanagement.entity.RegionsEntity;
import com.developer.hrmanagement.repository.RegionsRepository;
import com.developer.hrmanagement.service.RegionsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegionsServiceImpl implements RegionsService {
  private final RegionsRepository regionsRepository;

  public RegionsServiceImpl(RegionsRepository regionsRepository) {
    this.regionsRepository = regionsRepository;
  }

  @Override
  public List<RegionsEntity> findAllRegions() {
    return regionsRepository.findAll();
  }

  @Override
  public Optional<RegionsEntity> findById(Integer id) {
    return regionsRepository.findById(id);
  }

  @Override
  public RegionsEntity saveRegion(RegionsEntity regionsEntity) {
    return regionsRepository.save(regionsEntity);
  }

  @Override
  public RegionsEntity updateRegion(RegionsEntity regionsEntity) {
    return regionsRepository.save(regionsEntity);
  }

  @Override
  public void deleteRegion(Integer id) {
    regionsRepository.deleteById(id);
  }
}
