package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "favorites")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Favorite {
    @Id
    @GeneratedValue(
            generator = "favorites_gen",
            strategy = GenerationType.SEQUENCE
    )
    @SequenceGenerator(
            name = "favorites_gen",
            sequenceName = "favorites_seq",
            allocationSize = 1
    )
    private Long id;

    @ManyToOne(cascade = {
            CascadeType.DETACH,
            CascadeType.DETACH,
            CascadeType.REFRESH
    })
    private User user;
    @ManyToOne(cascade = {
            CascadeType.DETACH,
            CascadeType.DETACH,
            CascadeType.REFRESH})
    private News news;




















}
