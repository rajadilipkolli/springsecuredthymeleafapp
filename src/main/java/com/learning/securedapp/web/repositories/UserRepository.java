package com.learning.securedapp.web.repositories;

import com.learning.securedapp.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    /**
     * findByUserName.
     *
     * @param username a {@link java.lang.String} object.
     * @return a {@link com.learning.securedapp.domain.User} object.
     */
    User findByUserName(String username);

    /**
     * findByEmail.
     *
     * @param email a {@link java.lang.String} object.
     * @return a {@link com.learning.securedapp.domain.User} object.
     */
    User findByEmail(String email);
}
