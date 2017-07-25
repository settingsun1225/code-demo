package com.settingsun.code.demo.web.javase.tutorial.essential.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyLines {
    public static void main(String[] args) throws IOException {
        BufferedReader in = null;
        PrintWriter out = null;
        String path = "/Users/liuyi03/github/code-demo/src/main/java/com/settingsun/code/demo/web/javase/tutorial" +
                "/essential/io/";
        try {
            in = new BufferedReader(new FileReader(path + "xanadu.txt"));
            out = new PrintWriter(new FileWriter(path + "characteroutputline.txt"));
            String l;
            while ((l = in.readLine()) != null) {
                System.out.println(l);
                out.println(l);
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
