package com.project.work.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Builder
public class PtoDa {
    private Integer associationid;
    private Integer patientid;
    private Integer deviceid;
    private String associationtime;
    private String disassociationtime;
}
