package peaksoft.dto.request;

import jakarta.persistence.Lob;
import peaksoft.enums.Category;

import java.time.LocalDate;
import java.util.List;

public record NewsRequest(


        String name,
        @Lob
        List<String> images,
        String description,
        Category category,
        LocalDate createDate,
        LocalDate updateDate
) {
}
