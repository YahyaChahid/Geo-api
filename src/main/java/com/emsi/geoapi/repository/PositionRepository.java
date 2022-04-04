package com.emsi.geoapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emsi.geoapi.models.Position;

@Repository
public interface PositionRepository extends JpaRepository<Position, Integer> {
    public List<Position> findTop10ByOrderByIdDesc();

}
