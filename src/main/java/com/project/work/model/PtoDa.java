package com.project.work.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
public class PtoDa {
    private Integer associationId;
    private Integer patientId;
    private Integer deviceId;
    private String associationTime;
    private String disassociationTime;
}
