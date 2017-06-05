package com.OrangeHRM.common;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

//Program to read and write in a file
public class PracticeFileReader {

	public static void main(String args[])
	{
		try{
			String line;
			BufferedReader br = new BufferedReader(new FileReader("G:\\test.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("G:\\test.txt",true));
			{
				while((line=br.readLine())!=null)
				{
					//bw.write(line);  To write in a file
					System.out.println(line);
					bw.append(line);
					bw.newLine();
				
				}
				System.out.println("File operation completed...");
				bw.close();
				
					
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Unable to read file"+e);
		}
	}
}
