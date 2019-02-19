package com.codeclan.filemanagersystem.filemanager;

import com.codeclan.filemanagersystem.filemanager.models.File;
import com.codeclan.filemanagersystem.filemanager.models.Folder;
import com.codeclan.filemanagersystem.filemanager.models.User;
import com.codeclan.filemanagersystem.filemanager.repositories.FileRepository;
import com.codeclan.filemanagersystem.filemanager.repositories.FolderRepository;
import com.codeclan.filemanagersystem.filemanager.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilemanagerApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canAddFilesFoldersAndUsers() {
		User user = new User("Steven");
		userRepository.save(user);

		Folder folder = new Folder("Documents", user);
		folderRepository.save(folder);

		File file = new File("CV", ".txt", 10, folder);
		fileRepository.save(file);
	}
}
