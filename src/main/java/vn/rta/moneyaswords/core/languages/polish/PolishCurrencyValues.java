package vn.rta.moneyaswords.core.languages.polish;

import vn.rta.moneyaswords.core.languages.CurrencyBaseValues;
import vn.rta.moneyaswords.core.languages.GenderForms;
import vn.rta.moneyaswords.core.languages.shared.SlavonicPluralForms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static vn.rta.moneyaswords.core.support.BaseNumbersBuilder.baseNumbersBuilder;

public class PolishCurrencyValues implements CurrencyBaseValues {
    private String currencySign = "PLN";

    public PolishCurrencyValues() {

    }

    public PolishCurrencyValues(String currencySign) {
        this.currencySign = currencySign;
    }

    @Override
    public Map<Integer, GenderForms> baseNumbers() {
        return baseNumbersBuilder()
                .put(0, "zero")
                .put(1, "jeden")
                .put(2, "dwa")
                .put(3, "trzy")
                .put(4, "cztery")
                .put(5, "pięć")
                .put(6, "sześć")
                .put(7, "siedem")
                .put(8, "osiem")
                .put(9, "dziewięć")
                .put(10, "dziesięć")
                .put(11, "jedenaście")
                .put(12, "dwanaście")
                .put(13, "trzynaście")
                .put(14, "czternaście")
                .put(15, "piętnaście")
                .put(16, "szesnaście")
                .put(17, "siedemnaście")
                .put(18, "osiemnaście")
                .put(19, "dziewiętnaście")
                .put(20, "dwadzieścia")
                .put(30, "trzydzieści")
                .put(40, "czterdzieści")
                .put(50, "pięćdziesiąt")
                .put(60, "sześćdziesiąt")
                .put(70, "siedemdziesiąt")
                .put(80, "osiemdziesiąt")
                .put(90, "dziewięćdziesiąt")
                .put(100, "sto")
                .put(200, "dwieście")
                .put(300, "trzysta")
                .put(400, "czterysta")
                .put(500, "pięćset")
                .put(600, "sześćset")
                .put(700, "siedemset")
                .put(800, "osiemset")
                .put(900, "dziewięćset")
                .build();
    }

    @Override
    public List<SlavonicPluralForms> pluralForms() {
        return Arrays.asList(
                new SlavonicPluralForms(),
                new SlavonicPluralForms("tysiąc", "tysiące", "tysięcy"),
                new SlavonicPluralForms("milion", "miliony", "milionów"),
                new SlavonicPluralForms("miliard", "miliardy", "miliardów"));
    }

    @Override
    public String getCurrencySign() {
        return currencySign;
    }

    @Override
    public char twoDigitsNumberSeparator() {
        return ' ';
    }
}
