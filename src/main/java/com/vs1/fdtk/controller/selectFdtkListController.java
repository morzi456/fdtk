package com.vs1.fdtk.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vs1.fdtk.dto.Fdtk;
import com.vs1.fdtk.service.selectFdtkListService;

@RestController
public class selectFdtkListController {
	@Autowired
	private selectFdtkListService service;

	@GetMapping(path = "/getFdtkList")
	public List<Fdtk> selectFdtkList() {
		//System.out.println("selectFdtkListController");
		List<Fdtk> fdtk = new ArrayList<Fdtk>();
		fdtk = service.selectFdtkList();
		//System.out.println("selectFdtkListControllerEnd");
		return fdtk;
	}
	
}