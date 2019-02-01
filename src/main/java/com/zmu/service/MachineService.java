package com.zmu.service;

import com.zmu.dto.MachineDto;
import com.zmu.model.Machine;

import java.util.List;

public interface MachineService {
    Machine save(MachineDto machineDto);

    Machine save(Machine machineDto);

    void delete(MachineDto machineDto);

    List<Machine> findAll();

    Machine findOne(String name, Integer invoice);
}
