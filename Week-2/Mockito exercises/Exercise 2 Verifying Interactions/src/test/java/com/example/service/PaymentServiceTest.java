package com.example.service;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class PaymentServiceTest {

    @Test
    void testProcessPayment_VerifiesInteraction() {
        // Arrange
        PaymentRepository mockRepo = mock(PaymentRepository.class);
        PaymentService service = new PaymentService(mockRepo);

        // Act
        service.processPayment(100);

        // Assert - Verify the repository method was called once with 100
        verify(mockRepo).saveTransaction(100);
    }
}
