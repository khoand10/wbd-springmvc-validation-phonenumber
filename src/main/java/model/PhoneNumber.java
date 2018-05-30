package model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class PhoneNumber {
    @NotEmpty
    @Pattern(regexp="(^$|[0-9]{10,12})")
    private String number;

    public String getNumber() {
        return number;

    }

    public void setNumber(String number) {

        this.number = number;

    }


}
