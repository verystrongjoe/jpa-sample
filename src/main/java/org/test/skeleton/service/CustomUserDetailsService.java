//package org.test.skeleton.service;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.Set;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import org.test.skeleton.entity.User;
//import org.test.skeleton.repository.UserDao;
//
//@Service
//@Qualifier("customUserDetailsService")
//public class CustomUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    private UserDao userDao;
//
//    @Transactional(readOnly=true)
//    @Override
//    public UserDetails loadUserByUsername(final String email)
//            throws UsernameNotFoundException {
//    	
//        User user = userDao.findByEmail(email);
//        
//        Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();
//        setAuths.add(new SimpleGrantedAuthority("ROLE_CLIENT"));
//        
//        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), new ArrayList<GrantedAuthority>(setAuths));
//    }
//}