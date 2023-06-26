package peaksoft.dto.response;

import jakarta.persistence.Lob;
import peaksoft.enums.Category;

import java.time.LocalDate;
import java.util.List;

public record NewsResponse(
        Long id,
        String name,
        @Lob
        List<String> images,
        String description,
        Category category,
        LocalDate createDate,
        LocalDate updateDate


) {
}
