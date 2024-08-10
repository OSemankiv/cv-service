package com.customerapp.candidatecvservice.service;

import com.customerapp.candidatecvservice.model.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import java.io.File;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> employees;
    @PostConstruct
    public void init() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            File file = new File("src/main/resources/employees.json");
            EmployeeDTO wrapper = objectMapper.readValue(file, EmployeeDTO.class);
            employees = wrapper.getEmployees();
        } catch (IOException e) {
            throw new RuntimeException("Failed to load employees from JSON", e);
        }
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Setter
    @Getter
    private static class EmployeeDTO {
        private List<Employee> employees;

    }
}
