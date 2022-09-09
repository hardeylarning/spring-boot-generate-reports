package com.rocktech.service;

import java.util.List;

public interface ReportService <T>{
    T insert(T t);
    List<T> getAll();
    T get (int id);
}
