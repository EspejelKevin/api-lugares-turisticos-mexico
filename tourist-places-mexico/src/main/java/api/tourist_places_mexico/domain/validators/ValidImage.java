package api.tourist_places_mexico.domain.validators;

import java.lang.annotation.*;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Constraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.Payload;


@Documented
@Constraint(validatedBy = ImageValidator.class)
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidImage {
    String message() default "";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    long maxSizeInMB() default 5;
    String[] allowedMimeTypes() default {"image/jpeg", "image/png"};
}


class ImageValidator implements ConstraintValidator<ValidImage, MultipartFile> {
    private List<String> allowedTypes;
    private long maxSize;

    @Override
    public void initialize(ValidImage constraintAnnotation) {
        this.allowedTypes = Arrays.asList(constraintAnnotation.allowedMimeTypes());
        this.maxSize = constraintAnnotation.maxSizeInMB() * 1024 * 1024;
    }

    @Override
    public boolean isValid(MultipartFile file, ConstraintValidatorContext context) {
        if (file.isEmpty()) return false;

        String contentType = file.getContentType();
        if (contentType == null || !this.allowedTypes.contains(contentType)) return false;

        return file.getSize() <= this.maxSize;
    }
}
