package com.iceteaviet.moneyasword;

import com.iceteaviet.moneyasword.internal.BigDecimalToStringConverter;

import java.math.BigDecimal;

import static com.google.common.base.Verify.verifyNotNull;
import static com.iceteaviet.moneyasword.internal.Container.*;

public enum MoneyConverters {

    BRAZILIAN_PORTUGUESE_BANKING_MONEY_VALUE(brazilianPortugueseContainer().getBankingMoneyConverter()),
    GERMAN_BANKING_MONEY_VALUE(germanContainer().getBankingMoneyConverter()),
    RUSSIAN_BANKING_MONEY_VALUE(russianContainer().getBankingMoneyConverter()),
    POLISH_BANKING_MONEY_VALUE(polishContainer().getBankingMoneyConverter()),
    CZECH_BANKING_MONEY_VALUE(czechContainer().getBankingMoneyConverter()),
    ENGLISH_BANKING_MONEY_VALUE(englishContainer().getBankingMoneyConverter());

    private final BigDecimalToStringConverter converter;

    MoneyConverters(BigDecimalToStringConverter converter) {
        this.converter = converter;
    }

    public String asWords(BigDecimal value) {
        verifyNotNull(value);

        return converter.asWords(value);
    }
}
