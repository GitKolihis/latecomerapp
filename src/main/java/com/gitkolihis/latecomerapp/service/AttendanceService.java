package com.gitkolihis.latecomerapp.service;

import com.gitkolihis.latecomerapp.entity.Attendance;
import com.gitkolihis.latecomerapp.repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;

    public Attendance addattendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    public Attendance updateattendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    public List<Attendance> findAllAttendance() {
        return (List<Attendance>) attendanceRepository.findAll();
    }

    public Attendance getAttendance(long id) {
        Optional<Attendance> optionalAttendance = attendanceRepository.findById(id);
        return optionalAttendance.orElseThrow(() -> new IllegalArgumentException("Invalid Attendance Id: " + id));
    }

    public Attendance findByEmail(String email) {
        return attendanceRepository.findByEmail(email);
    }
}
