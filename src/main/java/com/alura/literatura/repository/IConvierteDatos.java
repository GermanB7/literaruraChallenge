package com.alura.literatura.repository;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}