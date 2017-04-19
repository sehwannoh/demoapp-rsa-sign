package demoapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class ResponseHeader {

    @NonNull
    @NotNull
    private String status;

    private List<Error> errors = new ArrayList<>();
}