package com.jarvis.leetcode.java8;

import java.io.File;
import java.io.FileFilter;

/**
 * @author YU.ZHU
 * @project_name: jarvis-leetcode
 * @package: com.jarvis.leetcode.java8
 * @create 2018-07-10 9:43
 */
public class Test {

    public static void main(String[] args) {
        Runnable noArguments = () -> System.out.println("Hello World");
        noArguments.run();

        File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isHidden();
            }
        });

        File[] hiddenFiles2 = new File(".").listFiles(file -> file.isHidden());
        File[] hiddenFiles3 = new File(".").listFiles(File::isHidden);
    }
}
