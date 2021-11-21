package velo.ladealpha.fields.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import resources.ResourceLoader;
import velo.ladaalpha.fields.system_managment.FileBoss;
import velo.ladaalpha.misc.SystemCommand;

public class ResourceFileLoader {
	private String tmp = System.currentTimeMillis() + "-tmp";
	public  String loadFile(String name) {		
		FileBoss.createFile(tmp);
		try {
			FileWriter fw = new FileWriter(tmp);
			BufferedReader br = ResourceLoader.loadFile(name);			
			String line;
			while ((line = br.readLine()) != null) {
				fw.write(line+"\n");
			}			
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tmp;
		/*
		 * SystemCommand.run("node " + p);
		File r = new File(p);
		r.delete();
		 */
		
	}
	
	public void dispose() {
		FileBoss.deleteFile(tmp);
	}
}
