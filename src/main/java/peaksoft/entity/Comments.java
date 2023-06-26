package peaksoft.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "comments")
public class Comments {

    @Id
    @GeneratedValue(
            generator = "comments_gen",
            strategy = GenerationType.SEQUENCE
    )
    @SequenceGenerator(
            name = "comments_gen",
            sequenceName = "comments_seq",
            allocationSize = 1
    )
    private Long id;
    private String comment;
    private LocalDate createDate;
    private LocalDate updateDate;
    @ManyToOne(cascade = {
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.REFRESH})
    private User user;
    @ManyToOne(cascade = {
                    CascadeType.DETACH,
                    CascadeType.MERGE,
                    CascadeType.REFRESH}
    )
    private News news;
    @OneToMany(mappedBy = "parents",
            cascade = {CascadeType.ALL})
    private List<Comments>childComments;
    @ManyToOne
    private Comments parents;































}
