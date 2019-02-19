package com.codeclan.filemanagersystem.filemanager.repositories;

import com.codeclan.filemanagersystem.filemanager.Projections.EmbedFolders;
import com.codeclan.filemanagersystem.filemanager.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedFolders.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
