package com.vti.service;

import com.vti.dto.filter.GroupFilter;
import com.vti.entity.Group;
import com.vti.entity.User;
import com.vti.repository.IGroupRepository;
import com.vti.repository.IUserRepository;
import com.vti.specification.GroupSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.vti.form.*;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Transactional
@Service

public class GroupService implements IGroupService{

    @Autowired
    private IGroupRepository groupRepository ;

    @Autowired
    private IUserRepository userRepository;


    @Override
    @SuppressWarnings("deprecation")
    public Page<Group> getAllGroup(Pageable pageable , String search, GroupFilter filter) {

        GroupSpecification searchSpecification = new GroupSpecification("name", "LIKE", search);

        Specification<Group> where = null;

        if(filter != null && filter.getMinDate() != null) {
            GroupSpecification minDateSpecification = new GroupSpecification("createDate", ">=", filter.getMinDate());
            if(where == null) {
                where = Specification.where(minDateSpecification);
            } else {
                where  = where.and(minDateSpecification);
            }
        }

        if(filter != null && filter.getMaxDate() != null) {
            GroupSpecification maxDateSpecification = new GroupSpecification("createDate", "<=", filter.getMaxDate());
            if(where == null) {
                where = Specification.where(maxDateSpecification);
            } else {
                where  = where.and(maxDateSpecification);
            }
        }

        if(filter != null && filter.getMinTotalMember() != null) {
            GroupSpecification minTotalMemberSpecification = new GroupSpecification("totalmember", ">", filter.getMinTotalMember());
            if(where == null) {
                where = Specification.where(minTotalMemberSpecification);
            } else {
                where  = where.and(minTotalMemberSpecification);
            }
        }

        if(filter != null && filter.getMaxTotalMember() != null) {
            GroupSpecification maxTotalMemberSpecification = new GroupSpecification("totalmember", "<", filter.getMaxTotalMember());
            if(where == null) {
                where = Specification.where(maxTotalMemberSpecification);
            } else {
                where  = where.and(maxTotalMemberSpecification);
            }
        }




        if (!StringUtils.isEmpty(search)) {
            if (where == null) {
                where = searchSpecification;
            } else {
                where = where.and(searchSpecification);
            }
        }

        return groupRepository.findAll(where, pageable);
    }



    @Override
    public Group getGroupByID(short id) {
        return groupRepository.getById(id);
    }

    @Override
    public Group getGroupByName(String name) {
        return groupRepository.findByName(name);
    }

    @Override
    public void updateGroup(GroupFormForUpdating group) {

    }

    @Override
    public void updateGroup(short id, GroupFormForUpdating form) {
        Group group = getGroupByID(id);
        group.setName(form.getName());
        group.setModifiedDate(new Date());
        groupRepository.save(group);
    }

    @Override
    public void createGroup(GroupFormForCreating form) {
        User author = userRepository.findById(form.getAuthorId()).get();
        Group group = new Group(form.getName());
        group.setAuthor(author);
        groupRepository.save(group);
    }


    @Override
    public void deleteGroup(short id) {
        groupRepository.deleteById(id);
    }

    @Override
    public void deleteGroups(List<Short> ids) {
        groupRepository.deleteByIds(ids);
    }

    @Override
    public boolean isGroupExistsByID(short id) {
        return groupRepository.existsById(id);
    }

    @Override
    public boolean isGroupExistsByName(String name) {
        return groupRepository.existsByName(name);
    }
}
