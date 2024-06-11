package org.zerock.project_dame.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.zerock.project_dame.model.FileEntity;

@Repository
public interface FileRepository extends JpaRepository<FileEntity, Long> {
}

