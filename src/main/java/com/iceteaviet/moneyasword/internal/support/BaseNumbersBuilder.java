package com.iceteaviet.moneyasword.internal.support;

import com.iceteaviet.moneyasword.internal.languages.GenderForms;

import java.util.HashMap;
import java.util.Map;

import static com.iceteaviet.moneyasword.internal.languages.GenderForms.genderForm;

public class BaseNumbersBuilder {

    private final Map<Integer, GenderForms> result = new HashMap<>();

    public static BaseNumbersBuilder baseNumbersBuilder() {
        return new BaseNumbersBuilder();
    }

    public BaseNumbersBuilder put(Integer number, GenderForms forms) {
        result.put(number, forms);
        return this;
    }

    public BaseNumbersBuilder put(Integer number, String form) {
        result.put(number, genderForm(form));
        return this;
    }

    public Map<Integer, GenderForms> build() {
        return result;
    }
}