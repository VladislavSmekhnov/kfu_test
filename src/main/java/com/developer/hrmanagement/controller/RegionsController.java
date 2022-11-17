package com.developer.hrmanagement.controller;

import com.developer.hrmanagement.entity.RegionsEntity;
import com.developer.hrmanagement.exception.RegionNotFoundException;
import com.developer.hrmanagement.service.RegionsService;
import java.util.List;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for regions table.
 */

@RestController
@RequestMapping("/regions")
public class RegionsController {
  private final RegionsService regionsService;

  public RegionsController(RegionsService regionsService) {
    this.regionsService = regionsService;
  }

  @GetMapping
  public List<RegionsEntity> findAllRegions() {
    return regionsService.findAllRegions();
  }

  @GetMapping("/{id}")
  public RegionsEntity findRegionById(@PathVariable("id") Integer id)
          throws RegionNotFoundException {
    return regionsService.findById(id);
  }

  @PostMapping
  public RegionsEntity saveRegion(@RequestBody RegionsEntity regionEntity) {
    return regionsService.saveRegion(regionEntity);
  }

  @PutMapping
  public RegionsEntity updateRegion(@RequestBody RegionsEntity regionEntity) {
    return regionsService.updateRegion(regionEntity);
  }

  @DeleteMapping("/{id}")
  public void deleteRegion(@PathVariable("id") Integer id) {
    regionsService.deleteRegion(id);
  }
}
