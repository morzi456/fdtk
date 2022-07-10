package com.vs1.fdtk.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.vs1.fdtk.dto.Fdtk;


@Repository
public interface selectFdtkListDAO {
	List<Fdtk> selectFdtkList();
}