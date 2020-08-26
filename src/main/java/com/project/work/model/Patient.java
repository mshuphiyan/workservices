package com.project.work.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Builder
public class Patient {
    private Integer patientId;
    private String patientisissuer;
    private String patientname;
    private String dateofbirth;
    private String gender;
}
