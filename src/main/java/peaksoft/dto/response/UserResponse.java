package peaksoft.dto.response;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import peaksoft.enums.Role;
import peaksoft.validation.EmailValid;
import peaksoft.validation.PasswordValid;
import peaksoft.validation.PhoneNumberValid;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public record UserResponse(
        Long id,
        String firstName,
        String lastName,
        LocalDate dateOfBirth,
        ZonedDateTime createdDate,
        @EmailValid
        @Column(unique = true)
        String email,
        @PasswordValid
        String password,
        @PhoneNumberValid
        String phoneNumber,
        @Enumerated(EnumType.STRING)
        Role role) {

}
