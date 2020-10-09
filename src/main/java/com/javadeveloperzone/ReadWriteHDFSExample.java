package com.javadeveloperzone;

import org.apache.commons.io.IOUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReadWriteHDFSExample {

    public static void main(String[] args) throws IOException {
        ReadWriteHDFSExample.readFileFromHDFS();
    }

    public static void readFileFromHDFS() throws IOException {
        Configuration configuration = new Configuration();

        configuration.set("fs.defaultFS", "dtap://TenantStorage");
 
        FileSystem fileSystem = FileSystem.get(configuration);

        //Create a path
        String fileName = "read_write_hdfs_example.txt";

        Path hdfsReadPath = new Path("/read_write_hdfs_example.txt");

        //Init input stream
        FSDataInputStream inputStream = fileSystem.open(hdfsReadPath);

        //Classical input stream usage
        String out= IOUtils.toString(inputStream, "UTF-8");
        System.out.println(out);

        inputStream.close();
        fileSystem.close();
    }

}
