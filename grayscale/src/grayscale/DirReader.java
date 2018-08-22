package grayscale;

import java.io.File;

import edu.duke.DirectoryResource;

public class DirReader {
	
	
	public void checker() 
	{
		DirectoryResource dr=new DirectoryResource();
		for(File f:dr.selectedFiles())
		{
			System.out.println(f);
	}
	}
public static void main(String args[])
{
	DirReader dr=new DirReader();
	
	dr.checker();
	
}

}