package com.vti.controller;

import com.vti.dto.GroupDTO;
import com.vti.dto.filter.GroupFilter;
import com.vti.entity.Group;
import com.vti.form.GroupFormForCreating;
import com.vti.form.GroupFormForUpdating;
import com.vti.service.IGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.function.Function;

@RestController
@RequestMapping("api/v1/groups")
@CrossOrigin("*")
public class GroupsController {

    @Autowired
    private IGroupService groupService;

    @GetMapping()
    public ResponseEntity<?> getAllDepartments(
            Pageable pageable,
            @RequestParam(name = "search", required = false) String search,GroupFilter filter) {
        Page<Group> pageEntity = groupService.getAllGroup(pageable, search,filter);

        Page<GroupDTO> pageDto = pageEntity.map(new Function<Group, GroupDTO>() {
            @Override
            public GroupDTO apply(Group group) {
                GroupDTO groupDTO = new GroupDTO(
                        group.getId(),
                        group.getName(),
                        group.getTotalmember(),
                        group.getAuthor().getFullName(),
                        group.getCreateDate());
                return groupDTO;
            }
        });

        return new ResponseEntity<>(pageDto, HttpStatus.OK);


    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getDepartmentByID(@PathVariable(name = "id") short id) {

        return new ResponseEntity<>(groupService.getGroupByID(id), HttpStatus.OK);
    }

    @GetMapping(value = "/name/{name}/exists")
    public ResponseEntity<?> existsByName(@PathVariable(name = "name") String name) {
        return new ResponseEntity<>(groupService.isGroupExistsByName(name), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<?> createGroup(@RequestBody GroupFormForCreating form) {
        if(form.getName().length()>6&&form.getName().length()<50&&!groupService.isGroupExistsByName(form.getName())){
        groupService.createGroup(form);
        return new ResponseEntity<String>("Create successfully!", HttpStatus.CREATED);}
        else if(form.getName().length()<6||form.getName().length()>50)
            return new ResponseEntity<String>("Group name must be from 6 to 50 characters and no special characters!", HttpStatus.BAD_REQUEST);
        return new ResponseEntity<String>("Group name is exists!", HttpStatus.BAD_REQUEST);
    }



    @PutMapping(value = "/{id}")
    public ResponseEntity<?> updateGroup(@PathVariable(name = "id") short id,@RequestBody GroupFormForUpdating form) {
        if(form.getName().length()>6&&form.getName().length()<50&&!groupService.isGroupExistsByName(form.getName())){
        groupService.updateGroup(id,form);
        return new ResponseEntity<String>("Update successfully!", HttpStatus.OK);}
        else if(form.getName().length()<6||form.getName().length()>50)
            return new ResponseEntity<String>("Group name must be from 6 to 50 characters!", HttpStatus.BAD_REQUEST);
        return new ResponseEntity<String>("Group name is exists!", HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteGroup(@PathVariable(name = "id") short id) {
        groupService.deleteGroup(id);
        return new ResponseEntity<String>("Delete successfully!", HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteGroups(@RequestParam(name = "ids") List<Short> ids) {
        groupService.deleteGroups(ids);
        return new ResponseEntity<String>("Delete successfully!", HttpStatus.OK);
    }
}
