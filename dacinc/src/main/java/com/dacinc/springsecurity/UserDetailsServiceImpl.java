package com.dacinc.springsecurity;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dacinc.repo.DealerRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final DealerRepository dealerRepository;

    public UserDetailsServiceImpl(DealerRepository dealerRepository) {
        this.dealerRepository = dealerRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return dealerRepository.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("Dealer not found with email: " + username));
    }
}