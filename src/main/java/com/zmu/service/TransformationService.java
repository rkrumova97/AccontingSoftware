package com.zmu.service;

import com.zmu.dto.*;
import com.zmu.model.*;

public interface TransformationService {
    Material DtoToEntity(MaterialDto dto);

    Car DtoToEntity(CarDto carDto);

    Clothes DtoToEntity(ClothesDto clothesDto);

    Machine DtoToEntity(MachineDto machineDto);

    Project DtoToEntity(ProjectDto project);
}
