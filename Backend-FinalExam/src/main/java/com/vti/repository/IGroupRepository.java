package com.vti.repository;

import com.vti.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IGroupRepository extends JpaRepository<Group,Short>, JpaSpecificationExecutor<Group> {

    public Group findByName(String groupName);
    public Boolean existsByName(String groupName);

    @Modifying
    @Transactional
    @Query("DELETE FROM Group WHERE id IN(:ids)")
    public void deleteByIds(@Param("ids") List<Short> ids);
}
