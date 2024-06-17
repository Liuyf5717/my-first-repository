package com.lyf.demo3;

import java.io.InputStream;

public class Study {
    public static void main(String[] args) {
        String path = "/template/批量新增用户模板.zip";
//        //String path = "/template/批量新增用户模板.xlsx";
        String fileName = path.substring(path.lastIndexOf("/") + 1);
//        try {
//            response.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
//            response.setContentType("application/zip");
//            //response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
       //     InputStream inputStream = this.getClass().getResourceAsStream("/template/" + fileName);
//            OutputStream outputStream = response.getOutputStream();
//            byte[] buffer = new byte[1024];
//            int len;
//            while ((len = inputStream.read(buffer)) != -1) {
//                outputStream.write(buffer, 0, len);
//            }
//            inputStream.close();
//            outputStream.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
