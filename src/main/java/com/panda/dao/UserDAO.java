package com.panda.dao;

import com.panda.model.User;

/**
 * @author qiaoel
 *
 */

public interface UserDAO {
 
    /**
     * ������û�
     * @param user
     * @return
     */
    public int insertUser(User user);
    /**
     * 
     * @param nickname
     * @return
     */
    public User getUser(String nickname);
     
}
