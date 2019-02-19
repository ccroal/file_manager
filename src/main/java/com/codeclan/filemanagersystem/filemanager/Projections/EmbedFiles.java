package com.codeclan.filemanagersystem.filemanager.Projections;

import com.codeclan.filemanagersystem.filemanager.models.Folder;
import com.codeclan.filemanagersystem.filemanager.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFiles", types = Folder.class)
public interface EmbedFiles {

    String getTitle();
    User getUser();
    List getfiles();
}
