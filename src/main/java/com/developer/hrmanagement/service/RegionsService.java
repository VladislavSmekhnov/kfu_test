package com.developer.hrmanagement.service;

import com.developer.hrmanagement.entity.RegionsEntity;
import com.developer.hrmanagement.exception.RegionNotFoundException;

import java.util.List;
import java.util.Optional;

public interface RegionsService {
  List<RegionsEntity> findAllRegions();
  RegionsEntity findById(Integer id) throws RegionNotFoundException;
  RegionsEntity saveRegion(RegionsEntity regionsEntity);
  RegionsEntity updateRegion(RegionsEntity regionsEntity);
  void deleteRegion(Integer id);
}
