package io.file;

import java.io.File;
import java.util.*;

public class Look_for_new_big_image {

	/**
	 * Модифицируйте/допишите его, что бы он 
	 * 1) Собирал только имена файлов,
	 * которые представляют собой большие (File.length() > 1024*1024) картинки
	 * (имя файла заканчивается (String.endsWith(String)) на
	 * ".jpg"/".png"/".bmp"/".gif". 
	 * 2) Собирал массив файлов, а не выводил в
	 * консоль. 
	 */

	public static void main(String[] args) {
		File file = new File("C://Users//z//Downloads");
		print(file);
		

	}

	public static void print(File root) {
		if (root.isFile()) {
			System.out.println(root);
		} else {

			ArrayList<String> list  = new ArrayList<String>();
			List<String> pattern = Arrays.asList(".jpg", ".png", ".bmp",
					".gif", ".jpeg");

			for (File f : root.listFiles()) {
				for (String l : pattern) {
					if (f.toString().endsWith(l) && f.length() > 1024 * 1024) {
						System.out.println(f);
						list.add(f.getName());
					}
				}

			}

		}

	}

}
