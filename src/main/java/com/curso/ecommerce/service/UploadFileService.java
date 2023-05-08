package com.curso.ecommerce.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadFileService {
	private String folder ="images//";
	
	public String saveImage(MultipartFile file) throws IOException {
		if(!file.isEmpty()) {
			byte [] bytes = file.getBytes();
			Path path = Path.get(folder+file.getOriginalFilename());
			Files.write(path, bytes);
		}
		return "";
	}

}
