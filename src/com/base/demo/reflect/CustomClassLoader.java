package com.base.demo.reflect;

import java.io.*;

/**
 * @ClassName 自定义实现classloader
 * @Author leiming
 * @Date 2020/2/18 21:08
 * @Version 1.0
 **/
public class CustomClassLoader extends ClassLoader {

    private String path;

    private String customClassLoaderName;

    public CustomClassLoader(String path,String customClassLoaderName){
     this.path=path;
     this.customClassLoaderName=customClassLoaderName;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[]  bytes=loadClassBinaryData(name);
        return defineClass(name,bytes,0,bytes.length);
    }

    private byte[] loadClassBinaryData(String name) {
        String classPath=path+name+".class";
        InputStream in=null;
        ByteArrayOutputStream out=null;
        try {
            in=new FileInputStream(new File(classPath));
            out=new ByteArrayOutputStream();
            int i=0;
            while ((i = in.read()) != -1) {
                out.write(i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return out.toByteArray();


    }
}
