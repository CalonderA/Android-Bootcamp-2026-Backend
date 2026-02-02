package ru.examle.edu.dto;

import lombok.Data;
import ru.examle.edu.entity.enums.UserRole;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
public class UserDTO {
    private Long id;
    private String email;
    private String passwordHash; // In a real app, we wouldn't return this, but for simple CRUD...
    private String fullName;
    private String position;
    private String department;
    private String avatarUrl;
    private UserRole role;
    private String notificationSettings;
    private LocalTime workHoursStart;
    private LocalTime workHoursEnd;
    private boolean isActive;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
