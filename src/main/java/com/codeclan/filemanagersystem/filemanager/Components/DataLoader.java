package com.codeclan.filemanagersystem.filemanager.Components;

import com.codeclan.filemanagersystem.filemanager.models.File;
import com.codeclan.filemanagersystem.filemanager.models.Folder;
import com.codeclan.filemanagersystem.filemanager.models.User;
import com.codeclan.filemanagersystem.filemanager.repositories.FileRepository;
import com.codeclan.filemanagersystem.filemanager.repositories.FolderRepository;
import com.codeclan.filemanagersystem.filemanager.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;


    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {

        User user = new User("Steven");
        userRepository.save(user);

        User user2 = new User("David");
        userRepository.save(user2);

        Folder folder = new Folder("Documents", user);
        folderRepository.save(folder);

        Folder folder2 = new Folder("Accounts", user2);
        folderRepository.save(folder2);

        File file = new File("CV", ".txt", 10, folder);
        fileRepository.save(file);

        File file2 = new File("Steven Account", ".xlsx", 15, folder2);
        fileRepository.save(file2);
    }
}
