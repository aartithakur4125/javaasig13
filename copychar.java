import java.io.*;
public class CopyCharacters {

	public static void main(String[] args)throws IOException {
		FileReader fr=null;
		FileWriter fw=null;
		try
		{
			fr=new FileReader("chitkara.txt");
			fw=new FileWriter("acadview.txt");
			int c;
			while((c=fr.read())!=-1)
			{
				fw.write(c);
			}
		}
		finally
		{
			if(fr !=null)
			{
				fr.close();
			}
			if(fw!=null)
			{
				fw.close();
			}
		}

	}

}