//4. define role dao with role interface
package com.youtube.jwt.dao;

import com.youtube.jwt.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
//Spring @Repository annotation is used to indicate that the class provides the mechanism for storage,
// retrieval, search, update and delete operation on objects.
public interface RoleDao extends CrudRepository<Role,String> {
}
