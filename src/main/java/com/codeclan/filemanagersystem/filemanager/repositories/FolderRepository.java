package com.codeclan.filemanagersystem.filemanager.repositories;

import com.codeclan.filemanagersystem.filemanager.Projections.EmbedFiles;
import com.codeclan.filemanagersystem.filemanager.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedFiles.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
