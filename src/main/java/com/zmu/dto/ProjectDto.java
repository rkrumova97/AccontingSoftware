package com.zmu.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ProjectDto {
    public String name;
    public String company;
    public String city;
}
