package com.project.db.mju.webserver.web.service;

import com.project.db.mju.webserver.web.domain.Employee;
import com.project.db.mju.webserver.web.dto.LoginRequestDto;
import com.project.db.mju.webserver.web.dto.LoginResponseDto;
import com.project.db.mju.webserver.web.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public LoginResponseDto loginAuth(LoginRequestDto requestDto) {

        Employee result = employeeRepository.findEmployeeByUserId(requestDto.getUserId());

        if (result.getUserPw().equals(requestDto.getUserPw())) {
            return new LoginResponseDto(result.getName());
        }
        else {
            return null;
        }
    }
}
