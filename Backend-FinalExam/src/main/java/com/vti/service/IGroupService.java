package com.vti.service;

import com.vti.dto.filter.GroupFilter;
import com.vti.entity.Group;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.vti.form.*;

import java.util.List;

public interface IGroupService {
    public Page<Group> getAllGroup(Pageable pageable , String search, GroupFilter filter);

    public Group getGroupByID(short id);

    public Group getGroupByName(String name);

    public void createGroup(GroupFormForCreating group);

    public void updateGroup(short id, GroupFormForUpdating newName);

    public void updateGroup(GroupFormForUpdating group);

    public void deleteGroup(short id);

    public void deleteGroups(List<Short> ids);

    public boolean isGroupExistsByID(short id);

    public boolean isGroupExistsByName(String name);

}
