package com.customerapp.candidatecvservice.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Employee {

    Long id;

    @NotNull
    @NotBlank
    String firstName;

    @NotNull
    @NotBlank
    String lastName;

    @NotNull
    @NotBlank
    String displayName;

    @NotNull
    @NotBlank
    String location;

    @NotNull
    @NotBlank
    String department;

    @NotNull
    @NotBlank
    String jobTitle;

    @NotNull
    @NotBlank
    String workEmail;
}
