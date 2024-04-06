package com.nva.DemoMongoDB;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

@Data
@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {
    @Id
    String id;
    String firstName;
    String lastName;
    String email;
    Gender gender;
    Address address;
    List<String> favouriteSubject;
    BigDecimal totalSpentInBooks;
    ZonedDateTime created;

}
