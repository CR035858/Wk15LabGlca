package com.gl.labwk15d04dem01.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.labwk15d04dem01.model.CCRepDetails;


@Repository
public interface CCRepDetailRepository extends JpaRepository<CCRepDetails, Integer>{

}
