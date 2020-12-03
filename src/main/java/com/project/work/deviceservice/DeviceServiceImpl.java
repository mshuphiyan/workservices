package com.project.work.deviceservice;

import com.project.work.dao.DeviceRepository;
import com.project.work.model.Device;
import com.project.work.repository.BaseRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceServiceImpl extends BaseRepositoryImpl<Device, Long> implements DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;

    public DeviceServiceImpl(DeviceRepository  deviceRepository){
        super(deviceRepository);
    }


    @Override
    public List<Device> getAllDevices() {
        return deviceRepository.findAll();
    }
}
