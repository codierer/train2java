package com.example.util;


import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author: zac
 * @version 1.0
 * @date 2020-02-17
 * @description: to change the charset for the file
 */
public class Transcodutil {

    /**
     * @description change the file frome charset sorce to target
     * @param file File
     * @param target string
     *
     */
    public static void run(File file, String target){

    }

    public static void main(String[] args) throws FileNotFoundException {
        //File f = new File("");
        JFileChooser fileChooser = new JFileChooser();
        FileSystemView fileSystemView = FileSystemView.getFileSystemView();
        fileChooser.setCurrentDirectory(fileSystemView.getHomeDirectory());
        fileChooser.setDialogTitle("Please choose the file to Trans");
        fileChooser.setApproveButtonText("ok");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        File f = new File(new File("").getAbsolutePath()+"/io/test.txt");
        FileReader fr = new FileReader(f);
        String s = fr.getEncoding();
        System.out.println(s);
        //run();
    }
}
