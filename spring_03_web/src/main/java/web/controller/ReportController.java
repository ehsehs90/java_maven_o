package web.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ReportController {
	
	@RequestMapping(value = "/report.do", method = RequestMethod.GET)
	public String form() {
		return "reportForm";
	}
	
	@RequestMapping(value = "/report.do", method = RequestMethod.POST)
	public String upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
		
		String fileName = file.getOriginalFilename();
		String path = request.getRealPath("/upload/");
		request.setAttribute("imgName", fileName);
		if(!file.isEmpty()) {
			File f = new File(path+fileName);
			try {
				file.transferTo(f);
				System.out.println(f);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return "reportResult";
	}
	
}
