package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;
import peaksoft.enums.Category;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;

@Entity
@Table(name = "news")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class News {
    @Id
    @GeneratedValue(
            generator = "news_gen",
            strategy = GenerationType.SEQUENCE
    )
    @SequenceGenerator(
            name = "news_gen",
            sequenceName = "news_seq",
            allocationSize = 1
    )
    private Long id;
    private String name;
    @Lob
    private List<String> images;
    private String description;
    private Category category;
    private LocalDate createDate;
    private LocalDate updateDate;
    @ManyToOne(cascade = {
            CascadeType.DETACH,
            CascadeType.DETACH,
            CascadeType.REFRESH})
    private User user;
}
