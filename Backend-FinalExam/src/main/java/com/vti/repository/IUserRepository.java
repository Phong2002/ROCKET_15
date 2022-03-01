package com.vti.repository;

import com.vti.entity.User;
import com.vti.entity.UserStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface IUserRepository extends JpaRepository<User,Short> {
    public User findByUserName(String username);
    public User getUserByUserName(String username);

    public boolean existsByUserName(String userName);

    public boolean existsByEmail(String email);

    @Query("	SELECT 	status 		"
            + "	FROM 	User 		"
            + " WHERE 	email = :email")
    public UserStatus findStatusByEmail(String email);


    public User findByEmail(String email);

}
