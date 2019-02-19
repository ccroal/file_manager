package com.codeclan.filemanagersystem.filemanager.Projections;

import com.codeclan.filemanagersystem.filemanager.models.Folder;
import com.codeclan.filemanagersystem.filemanager.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFolders", types = User.class)
public interface EmbedFolders {
    String getName();
    List getFolders();
}
