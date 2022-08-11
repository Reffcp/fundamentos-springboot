package com.fundamentos.springboot.fundamentos.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{

    Log LOGGER = LogFactory.getLog(MyBeanWithDependencyImplement.class);

    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        LOGGER.info("Estamos dentro de mybeandependenci implement en el metodo print");
        int numero = 15;
        System.out.println("resultado suma: " + myOperation.sum(numero));
        LOGGER.debug("El numero enviado a la suma es: " + numero);
        System.out.println("Hoal desde un bean con dependecia");
    }
}
