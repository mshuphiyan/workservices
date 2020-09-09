package com.project.work.device;

import com.project.work.repository.BaseRepositoryImpl;

public class DeviceServiceImpl extends BaseRepositoryImpl<DeviceEntity, Long> implements DeviceService {
    private DeviceRepository  deviceRepository;

    DeviceServiceImpl(DeviceRepository  deviceRepository){
        super(deviceRepository);
    }
}
