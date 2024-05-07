

import java.io.File;
import java.io.IOException;

public class jun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    File dir=new File("dir");
    dir.mkdir();
    File fl=new File(dir,"fl.txt");
    try {
    	fl.createNewFile();}
    catch(IOException e) {
    	;
    }
    File newDir =new File("newDir");
    dir.renameTo(newDir);
    }

}
