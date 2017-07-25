package com.settingsun.code.demo.web.javase.tutorial.essential.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScanXan {
    public static void main(String[] args) throws IOException {
        Scanner s = null;
        try {
            s = new Scanner(new BufferedReader(new FileReader(FileConsts.xanadu)));
            s.useDelimiter(",\\s*");
            while (s.hasNext()) {
                System.out.println(s.next());
                System.out.println("--------------");
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}
