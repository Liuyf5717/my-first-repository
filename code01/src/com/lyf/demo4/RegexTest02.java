package com.lyf.demo4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest02 {
    public static void main(String[] args) {
        String s = "male和female";

        String regex = "\"male|female\"";

        Pattern p = Pattern.compile(regex.substring(1, 1));
        Matcher m = p.matcher(s);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}

/*
@Override
public ObjResponseResult<RiskDetail> test() throws IOException {
    Path fileAbsolutePath = Paths.get("/Users/liuyufeng/JavaCode/test.xlsx");
    byte[] bytes = Files.readAllBytes(fileAbsolutePath);
    MultipartFile file = new MockMultipartFile("file", "test.xlsx", "text/plain", bytes);

    return importRiskProfile(file);
}*/
