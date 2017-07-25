package com.settingsun.code.demo.web.javase.tutorial.essential.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        String path = "/Users/liuyi03/github/code-demo/src/main/java/com/settingsun/code/demo/web/javase/tutorial" +
                "/essential/io/";
        try {
            in = new FileReader(path + "xanadu.txt");
            out = new FileWriter(path + "characteroutout.txt");
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
