package com.zmu.service;

import com.zmu.dto.MachineDto;
import com.zmu.model.Machine;

public interface MachineService {
    Machine save(MachineDto machineDto);

    void delete(MachineDto machineDto);
}
