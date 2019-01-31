package com.zmu.service;

import com.zmu.dto.MachineDto;
import com.zmu.model.Machine;

import java.util.List;

public interface MachineService {
    Machine save(MachineDto machineDto);

    void delete(MachineDto machineDto);

    List<Machine> findAll();
}
