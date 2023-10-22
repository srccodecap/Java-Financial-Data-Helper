package com.greenback.kit.util;

import java.io.File;

public class Bytes {
 
    private File file;
    private byte[] bytes;
    private String name;

    public File getFile() {
        return this.file;
    }

    public byte[] getBytes() {
        return this.bytes;
    }
    
    public String getName() {
        return this.name;
    }
    
    static public Bytes of(File file) {
        Bytes bd = new Bytes();
        bd.file = file;
        bd.name = file.getName();
        return bd;
   