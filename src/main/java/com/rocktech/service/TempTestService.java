package com.rocktech.service;

import java.util.List;
import java.util.Set;

public interface TempTestService <T>{
    List<T> getAll();

    T get (int id);
}
