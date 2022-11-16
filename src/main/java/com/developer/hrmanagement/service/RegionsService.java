package com.developer.hrmanagement.service;

import com.developer.hrmanagement.entity.RegionsEntity;

import java.util.List;
import java.util.Optional;

public interface RegionsService {
  List<RegionsEntity> findAllRegions();
  Optional<RegionsEntity> findById(Integer id);
  RegionsEntity saveRegion(RegionsEntity regionsEntity);
  RegionsEntity updateRegion(RegionsEntity regionsEntity);
  void deleteRegion(Integer id);
}
