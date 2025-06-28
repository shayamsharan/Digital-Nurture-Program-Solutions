package com.example.service;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void testGetUserNameById() {
        // Create mock of UserRepository
        UserRepository mockRepo = mock(UserRepository.class);
        // Stub behavior
        when(mockRepo.findNameById(42)).thenReturn("Shayam Sharan");

        // Inject mock into service
        UserService service = new UserService(mockRepo);

        // Verify behavior
        String result = service.getUserNameById(42);
        assertEquals("Shayam Sharan", result);
    }
}
