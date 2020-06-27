package com.sda.javapoz24.solid.interfacesegregation;

import java.util.List;

public interface IStudentManager  extends ISaveManager{
    Object odczytaj();
    List<Object> wylistuj();
}
