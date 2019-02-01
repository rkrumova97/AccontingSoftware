package com.zmu.service.impl;

import com.zmu.dto.MachineDto;
import com.zmu.model.Clothes;
import com.zmu.model.Machine;
import com.zmu.repository.MachineRepository;
import com.zmu.service.MachineService;
import com.zmu.service.TransformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MachineServiceImpl implements MachineService {
    @Autowired
    private MachineRepository machineRepository;

    @Autowired
    private TransformationService transformationService;

    @Override
    public Machine save(MachineDto machineDto){
        return machineRepository.save(transformationService.DtoToEntity(machineDto));
    }

    @Override
    public Machine save(Machine machineDto){
        return machineRepository.save(machineDto);
    }


    @Override
    public void delete(MachineDto machineDto){
        machineRepository.delete(transformationService.DtoToEntity(machineDto));
    }

    @Override
    public List<Machine> findAll(){
        return machineRepository.findAll();
    }

    @Override
    public Machine findOne(String name, Integer invoice){
        return machineRepository.findByNameAndNumberOfInvoice(name, invoice);
    }
}
