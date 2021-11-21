package com.dxc.dcmp.camunda.engine.model.handlers;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class StartWorkflow {
    @Id
    @SequenceGenerator(name = "startworkflow_sequence", sequenceName = "startworkflow_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "startworkflow_sequence")
    private Long id;
    private String type;


}
