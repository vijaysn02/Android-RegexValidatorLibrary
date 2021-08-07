package com.core.regexvalidator

import java.util.regex.Matcher
import java.util.regex.Pattern

public  object RegexHandler{

    //region Regex Email Validation
    fun emailValidator(validatorString : String): Boolean {
        val pattern: Pattern
        val matcher: Matcher
        val EMAIL_PATTERN =
                "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"
        pattern = Pattern.compile(EMAIL_PATTERN)
        matcher = pattern.matcher(validatorString)
        return matcher.matches()
    } //endregion

    //region Regex Password Validation
    fun passwordValidator(validatorString : String,minLength : Int, maxLength: Int): Boolean {
        val pattern: Pattern
        val matcher: Matcher
        val PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{$minLength,$maxLength}$"
        pattern = Pattern.compile(PASSWORD_PATTERN)
        matcher = pattern.matcher(validatorString)
        return matcher.matches()
    }//endregion

    //region Regex Length Validation
    fun lengthValidator(validatorString : String, minLength : Int, maxLength: Int) : Boolean {
        val pattern: Pattern
        val matcher: Matcher
        val LENGTH_PATTERN = "^.{$minLength,$maxLength}$"
        pattern = Pattern.compile(LENGTH_PATTERN)
        matcher = pattern.matcher(validatorString)
        return matcher.matches()
    }//endregion

    //region Regex Special Character Validation
    fun specialCharacterValidator(validatorString : String) : Boolean {
        val pattern: Pattern
        val matcher: Matcher
        val SPECIAL_CHARACTER_PATTERN = "^[@#\$%^&+=]*$"
        pattern = Pattern.compile(SPECIAL_CHARACTER_PATTERN)
        matcher = pattern.matcher(validatorString)
        return matcher.matches()
    }//endregion

    //region Regex Number Validation
    fun numberValidator(validatorString : String) : Boolean {
        val pattern: Pattern
        val matcher: Matcher
        val NUMBER_PATTERN = "^[0-9]*$"
        pattern = Pattern.compile(NUMBER_PATTERN)
        matcher = pattern.matcher(validatorString)
        return matcher.matches()
    }//endregion

    //region Regex Number with white space Validation
    fun numberWithWhiteSpaceValidator(validatorString : String) : Boolean {
        val pattern: Pattern
        val matcher: Matcher
        val NUMBER_PATTERN = "^[0-9\\s]*$"
        pattern = Pattern.compile(NUMBER_PATTERN)
        matcher = pattern.matcher(validatorString)
        return matcher.matches()
    }//endregion

    //region Regex String Validation
    fun stringValidator(validatorString : String) : Boolean {
        val pattern: Pattern
        val matcher: Matcher
        val STRING_PATTERN = "^[A-Za-z]*$"
        pattern = Pattern.compile(STRING_PATTERN)
        matcher = pattern.matcher(validatorString)
        return matcher.matches()
    }//endregion

    //region Regex String with white space Validation
    fun stringWithWhiteSpaceValidator(validatorString : String) : Boolean {
        val pattern: Pattern
        val matcher: Matcher
        val STRING_PATTERN = "^[A-Za-z\\s]*$"
        pattern = Pattern.compile(STRING_PATTERN)
        matcher = pattern.matcher(validatorString)
        return matcher.matches()
    }//endregion

}
