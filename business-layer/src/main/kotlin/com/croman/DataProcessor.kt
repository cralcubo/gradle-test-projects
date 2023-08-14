package com.croman

class DataProcessor(private val dao: DaoImpl) {


    fun processData() : String {
        return dao.getData().toUpperCase()
    }

}