package io.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Copy_dir {

	/**
	 * Модифицируйте/допишите код, что бы он создавал не только копию папок, но
	 * и копии всех файлов.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		File what = new File("C:/Users/z/IdeaProjects");
		File where = new File("C:/copy");
		
		try {
			copy(what, where);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void copy(File what, File where) throws Exception {
		if (!what.exists()) {
			throw new FileNotExistsException();
		}
		if (what.isDirectory()) {
			if (!where.exists()) {
				where.mkdir();
			}

			for (File f : what.listFiles()) {
				if (f.isDirectory()) {
					copy(f, new File(where, f.getName()));
				} else {
					copyFiles(f, where.toString());
					System.out.println(f);
				}

			}
		}
	}

	public static void copyFiles(File f, String dest) {
		File destFile = new File(dest + "/" + f.getName());
		try (FileInputStream inFile = new FileInputStream(f);
				FileOutputStream newFile = new FileOutputStream(destFile)) {

			while (inFile.available() != 0) {
				newFile.write(inFile.read());
			}
		} catch (IOException e) {
			System.out.println(e.getStackTrace());

		}

	}
}

class FileNotExistsException extends RuntimeException {

}
