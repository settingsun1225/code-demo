package com.settingsun.code.demo.web.javase.tutorial.essential.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        String path = "/Users/liuyi03/github/code-demo/src/main/java/com/settingsun/code/demo/web/javase/tutorial" +
                "/essential/io/";
        try {
            in = new FileInputStream(path + "xanadu.txt");
            out = new FileOutputStream(path + "outagin.txt");
            int c;
            while ((c = in.read()) != -1) {
                System.out.print(c);
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
