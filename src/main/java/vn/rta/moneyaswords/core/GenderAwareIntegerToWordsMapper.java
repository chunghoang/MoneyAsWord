package vn.rta.moneyaswords.core;

import vn.rta.moneyaswords.core.languages.GenderType;

/**
 * Mapper to match number to corresponding text representation
 */
public interface GenderAwareIntegerToWordsMapper {
    /**
     * Generate text base on given number and gender type
     * @param value
     * @param genderType male, female or normal form.
     * @return text representation of the number
     */
    String asWords(Integer value, GenderType genderType);
}
