package com.ucasoft.orm.exceptions;

import com.ucasoft.orm.OrmEntity;

/**
 * Created with IntelliJ IDEA.
 * User: UCASoft
 * Date: 30.06.13
 * Time: 17:01
 */
public class WrongRightJoinReference extends Exception {

    public WrongRightJoinReference(Class<? extends OrmEntity> entityClass, Class<? extends OrmEntity> leftClass) {
        super(String.format("Need add %s class to rightJoin annotation class %s!", entityClass.getSimpleName(), leftClass.getSimpleName()));
    }
}
