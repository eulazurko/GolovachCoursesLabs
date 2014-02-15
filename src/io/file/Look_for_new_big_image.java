package io.file;

import java.io.File;
import java.util.*;

public class Look_for_new_big_image {

	/**
	 * �������������/�������� ���, ��� �� �� 
	 * 1) ������� ������ ����� ������,
	 * ������� ������������ ����� ������� (File.length() > 1024*1024) ��������
	 * (��� ����� ������������� (String.endsWith(String)) ��
	 * ".jpg"/".png"/".bmp"/".gif". 
	 * 2) ������� ������ ������, � �� ������� �
	 * �������. 
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
