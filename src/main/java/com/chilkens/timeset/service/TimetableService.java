package com.chilkens.timeset.service;

import com.chilkens.timeset.dao.TimetableRepository;
import com.chilkens.timeset.domain.Timetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ByeongChan on 2017. 7. 23..
 */
@Service
public class TimetableService {
    @Autowired
    TimetableRepository timetableRepository;

    public Timetable findByKeyUrl(String keyUrl) { return timetableRepository.findByKeyUrl(keyUrl); }

    public void save(Timetable timetable){
        timetableRepository.save(timetable);
    }

    public Timetable findByCreatedBy(String createdBy) {
        return timetableRepository.findByCreatedBy(createdBy);
    }

    public List<Timetable> findAll() {
        return timetableRepository.findAll();
    }
}
