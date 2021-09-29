package com.example.countrydemo2.form;

public interface FormConvert<S,T> {
    T convert(S s);
}
