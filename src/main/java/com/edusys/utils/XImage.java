package com.edusys.utils;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author MinIT
 */
public class XImage {

    public static Image getAppIcon() {
        return new ImageIcon(getAbsolutePath("icon/fpt.png")).getImage();
    }

    public static void save(File src) {
        File dst = new File(getAbsolutePath("logos"), src.getName());
        // Tạo thư mục logos nếu chưa tồn tại
        if (!dst.exists()) {
            dst.mkdirs();
        }
        // Copy file vào thư mục logos
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ImageIcon read(String fileName) {
        File path = new File(getAbsolutePath("logos"), fileName);
        return new ImageIcon(path.getAbsolutePath());
    }

    public static String getAbsolutePath(String relativePath) {
        URL url = XImage.class.getResource("/com/edusys/");
        return url.getPath() + relativePath;
    }

}
