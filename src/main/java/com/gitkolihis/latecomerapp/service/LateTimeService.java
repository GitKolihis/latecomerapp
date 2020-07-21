package com.gitkolihis.latecomerapp.service;

import com.gitkolihis.latecomerapp.entity.Attendance;
import com.gitkolihis.latecomerapp.entity.LateTime;
import com.gitkolihis.latecomerapp.repository.LateTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class LateTimeService {

    @Autowired
    private LateTimeRepository lateTimeRepository;

    public LateTime addlatetime(LateTime lateTime) {
        return lateTimeRepository.save(lateTime);
    }

    public LateTime updatelateTime(LateTime lateTime) {
        return lateTimeRepository.save(lateTime);
    }

    public List<LateTime> findAlllateTime() {
        return (List<LateTime>) lateTimeRepository.findAll();
    }

    public LateTime getlateTime(long id) {
        Optional<LateTime> optionalAttendance = lateTimeRepository.findById(id);
        return optionalAttendance.orElseThrow(() -> new IllegalArgumentException("Invalid lateTime Id: " + id));
    }
}
