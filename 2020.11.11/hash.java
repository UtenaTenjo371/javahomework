import java.util.ArrayList;
import java.util.Arrays;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;

public class hash {

    public static byte[] SHA1Checksum(InputStream is) throws Exception {
        
        byte[] buffer = new byte[1024];
        
        
        MessageDigest complete = MessageDigest.getInstance("SHA-1");
        
        int numRead;
        do {
            
            numRead = is.read(buffer);

            if (numRead > 0) {
                
                complete.update(buffer, 0, numRead);
            }
            
            
        } while (numRead != -1);

        
        is.close();

        
        return complete.digest();
    }
    //重载sha1
    public static byte[] SHA1Checksum(byte[] buffer) throws Exception {
        
        MessageDigest complete = MessageDigest.getInstance("SHA-1");

        complete.update(buffer, 0,buffer.length);
        return complete.digest();
    }

    //对文件名进行排序
    public static File[] sortFile(File[] fs){
        Arrays.sort(fs);
        return fs;
    }

    public static String dfs(String path) {
        File dir = new File(path);
        File[] fs = dir.listFiles();
        String dirFile="";
        byte[] sha1=new byte[1024];
        String result="";
        fs=sortFile(fs);
        for(int i = 0; i < fs.length; i++) {
            if(fs[i].isFile()) {
                try{
                    FileInputStream is=new FileInputStream(fs[i]);
                    sha1= SHA1Checksum(is);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            if(fs[i].isDirectory()) {
                //System.out.println("directory " + fs[i].getName());
                try{
                    String dirContent=dfs(path + File.separator + fs[i].getName());
                    sha1=SHA1Checksum(dirContent.getBytes());
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            for(int j=0;j<sha1.length;j++){
                result+= Integer.toString(sha1[j],16);
            }
            dirFile+=fs[i].getName()+" " +result+"\n";
            System.out.println((fs[i].isFile()?"file ":"directory ")+fs[i].getName()+"    " + result);
        }
        return dirFile;
    }

    public static void main(String[] args) {
        try {
            dfs("..");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}