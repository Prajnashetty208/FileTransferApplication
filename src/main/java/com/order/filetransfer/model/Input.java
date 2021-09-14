package com.order.rest.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@Entity
public class Input {

    private String name;

    private String address;

}
