package com.haigao.haigao.Utils;

import java.io.File;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public class FileUtils {
    public static void upLoadFile(MultipartFile image) throws IllegalStateException, IOException {
        String path = System.getProperty("user.dir");
        path = path.replaceAll("\\\\", "/");
        path += "/src/main/resources/static/Img/Uploads/";
        
        String imagePath = image.getOriginalFilename().replaceAll("\\\\", "/");
        path += imagePath;
        image.transferTo(new File(path));
    }

    public static String getRootPath(MultipartFile image) {
        String result = "/img/uploads/";
        String imagePath = image.getOriginalFilename().replaceAll("\\\\", "/");
        result += imagePath;
        return result;
    }
}
