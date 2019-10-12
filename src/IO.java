/*
import javax.annotation.processing.Filer;
import javax.imageio.stream.FileImageInputStream;
import java.io.*;
import java.util.Date;

public class IO {
    public static void main(String[] args){
        File f10=new File("d:/字符流/加密.txt");
       */
/* File f9=new File("d:/字符流/字符流.txt");*//*

        File f8=new File("d:/abc/def/2.txt");
        File f7=new File("d:/sjj/1.txt");
        File file=new File("d:/sjj");
        System.out.println("file的绝对路径："+file.getAbsolutePath());
        File f2=new File("LOL.exe");
        System.out.println("f2绝对路径"+f2.getAbsolutePath());
        File f3=new File(file,"LOL.exe");
        System.out.println("f3的绝对路径"+f3.getAbsolutePath());
        System.out.println("f3的文件是："+f3);
        System.out.println("f3是否存在"+f3.exists());
        System.out.println("f3是否为文件夹"+f3.isDirectory());
        System.out.println("f3是否为文件"+f3.isFile());
        System.out.println("文件长度"+f3.length());
        Long time=f3.lastModified();
        Date date=new Date(time);
        System.out.println("最后修改时间为"+date);
        f3.setLastModified(0);
        System.out.println("最后修改时间为"+date);

        File f4=new File("d:/sjj/l.txt");
        f3.renameTo(f4);
        System.out.println(f3.getAbsolutePath());
        File f5=new File("d:/s1");
        f5.mkdir();
        f5.delete();
        f3.delete();
        f4.delete();



        File f6=new File("C:/Windows");

        File[] files=f6.listFiles();
        double maxfile=0;
        double minfile=Integer.MAX_VALUE;
        String maxpath=null;
        String minpath=null;
        for (File x:files) {
            if(f6.exists()&&x.length()>0){
                if(x.length()>maxfile){
                    maxfile=x.length();
                    maxpath=x.getAbsolutePath();

                }
                if(x.length()<minfile){
                    minfile=x.length();
                    minpath=x.getAbsolutePath();
                }

            }
        }
        System.out.println("最小文件夹"+minpath+"大小："+minfile);
        System.out.println("最大文件夹"+maxpath+"大小"+maxfile);


try{
   FileOutputStream fos=new FileOutputStream(f7,true);
   byte[] add={65,66};
   fos.write(add);
   fos.close();
} catch (Exception e) {
    e.printStackTrace();
}
        try{

            FileInputStream fis=new FileInputStream(f7);

            byte[] all=new byte[(int)f7.length()];
            fis.read(all);
            for (byte x:all
            ) {
                System.out.println(x);
            }
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        try{
       */
/*     File file2=f8.getParentFile();*//*

            if(!f8.exists()){
                f8.getParentFile().mkdirs();            }
            FileOutputStream fos=new FileOutputStream(f8);
            byte w[]={78,79};
            fos.write(w);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


   */
/*   try{
          if(!f9.exists()){
              f9.getParentFile().mkdirs();}
              FileWriter fw=new FileWriter(f9,true);
                String a="1234567sjj";
              char[] ch=a.toCharArray();
          fw.write(ch);
              fw.close();
          } catch (IOException ex) {
          ex.printStackTrace();
      }


      try{
          FileReader fr=new FileReader(f9);
          char[] ch=new char[(int)f9.length()];
          fr.read(ch);
          for (char a:ch
               ) {
              System.out.print(a);

          }
          fr.close();
      } catch (Exception e) {
          e.printStackTrace();
      }*//*



      try{
          if(!f10.exists()){
              f10.getParentFile().mkdirs();
          }
          FileWriter fas=new FileWriter(f10);
          String m="ab";
          char[] cn=m.toCharArray();
          fas.write(cn);
          fas.close();

      } catch (Exception e) {
          e.printStackTrace();
      }



      try{
          FileReader fr=new FileReader(f10);
          char[] a=new char[(int)f10.length()];
          fr.read(a);
          for (char n:a
               ) {
              System.out.print(a);

          }
      } catch (Exception e) {
          e.printStackTrace();
      }

    }
    }

*/
