package exceptionHandling;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		//need to create file class instance to access in java
		File f=new File("./resume.txt");//creation of file
		//absolute path(Full path) and relative path(by using . we use)
		
		//seprrators- /  \\
		//only file instance s created.
//		

		
		
		//System.out.println(f.delete());// for delete
		//System.out.println(f.createNewFile());//for creaton
		//System.out.println(f.exists());
		
//		if(f.exists())
//		f.delete();
//		System.out.println(f.createNewFile());
		//the above are for frst t delete and create new fle
		
		//to chec whetehtr fle hdden or not   
	//System.out.println(f.isHidden());
	
	//to set fle as readonly mode
//		System.out.println(f.canWrite());
//		f.setWritable(true);
//		
//		//to change permsson
//		System.out.println(f.canWrite());
		
		//abve all are absolute path
			
	}

}
