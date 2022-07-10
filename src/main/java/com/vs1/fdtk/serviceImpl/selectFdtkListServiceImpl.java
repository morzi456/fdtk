package com.vs1.fdtk.serviceImpl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vs1.fdtk.dao.selectFdtkListDAO;
import com.vs1.fdtk.dto.Fdtk;
import com.vs1.fdtk.service.selectFdtkListService;

@Service
public class selectFdtkListServiceImpl implements selectFdtkListService{
	@Autowired
	private selectFdtkListDAO dao;

	@Override
	public List<Fdtk> selectFdtkList() {
		List<Fdtk> fdtk = new ArrayList<Fdtk>();
		fdtk = dao.selectFdtkList();;
		for(int i = 0 ; i < fdtk.size() ; i++) {
			//fdtk.getTrukNm(i);
			Fdtk fdtkrow = fdtk.get(i);
			//System.out.println("fdtkrow = " + fdtkrow.getTrukNm());
		}
		return fdtk;
	}
}