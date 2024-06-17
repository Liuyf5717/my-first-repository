package com.lyf.demo3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileTest2 {
    public static void main(String[] args) throws IOException {
        List<String> filePaths = new ArrayList<>();
        filePaths.add("a/b/testfile/1.pdf");
        filePaths.add("a/b/testfile/2.pdf");
        filePaths.add("a/b/testfile/3.pdf");
        filePaths.add("a/b/testfile/4.pdf");

        // 生成导出文件名
        File currentDir = new File("6");
        String absolutePath = currentDir.getAbsolutePath();
        long timestamp = System.currentTimeMillis();
        String outputFilePath = absolutePath + "个人信息出境备案材料-" + timestamp + ".zip";
        // 写入zip
        try{
            FileOutputStream fos = new FileOutputStream(outputFilePath);
            ZipOutputStream zos = new ZipOutputStream(fos);
            for (String filePath : filePaths) {
                File file = new File(filePath);
                //System.out.println(file.getAbsolutePath());
                String[] split = filePath.split("[/\\\\]");
                String fileName = split[split.length - 1];
                byte[] buf = new byte[1024];
                zos.putNextEntry(new ZipEntry(fileName));
                int len = 0;
                // 读取文件并写入到zip中
                FileInputStream fis = new FileInputStream(file);
                while ((len = fis.read(buf)) != -1) {
                    zos.write(buf, 0, len);
                    zos.flush();
                }
                fis.close();
            }
            zos.close();
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
