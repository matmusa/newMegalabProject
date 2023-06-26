package peaksoft.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import peaksoft.repository.UserRepository;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl {
    private final UserRepository userRepository;


}
