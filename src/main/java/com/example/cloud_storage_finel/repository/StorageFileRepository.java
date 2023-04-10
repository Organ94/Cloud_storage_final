package com.example.cloud_storage_finel.repository;

import com.example.cloud_storage_finel.model.StorageFile;
import com.example.cloud_storage_finel.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StorageFileRepository extends JpaRepository<StorageFile, String> {

    void deleteByUserAndFilename(User user, String filename);

    StorageFile findByUserAndFilename(User user, String filename);

    @Modifying
    @Query("update StorageFile f set f.filename = :newName where f.filename = :filename and f.user = :user")
    void editFileNameByUser(@Param("user") User user, @Param("filename") String filename, @Param("newName") String newName);

    List<StorageFile> findAllByUser(User user);
}
