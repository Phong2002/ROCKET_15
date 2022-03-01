package com.vti.repository;

import com.vti.entity.ResetPasswordToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface ResetPasswordTokenRepository extends JpaRepository<ResetPasswordToken, Integer> {
	
	public ResetPasswordToken findByToken(String token);

	public boolean existsByToken(String token);

	@Transactional
	@Modifying
	@Query("	DELETE 						" 
			+ "	FROM 	ResetPasswordToken 	" 
			+ " WHERE 	user.id = :userId")
	public void deleteByUserId(int userId);

}
