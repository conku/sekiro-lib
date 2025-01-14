package com.virjar.sekiro.api.databind;


import com.virjar.sekiro.api.SekiroRequest;
import com.virjar.sekiro.api.SekiroRequestHandler;

import java.lang.reflect.Constructor;

/**
 * Todo
 * 匿名内部类的helper
 */
public class InnerClassCreateHelper implements ActionRequestHandlerGenerator {
    private Constructor<? extends SekiroRequestHandler> theConstructor;
    private Object outClassObject;

    public InnerClassCreateHelper(Constructor<? extends SekiroRequestHandler> theConstructor, Object outClassObject) {
        this.theConstructor = theConstructor;
        this.outClassObject = outClassObject;
    }

    @Override
    public SekiroRequestHandler gen(SekiroRequest invokeRequest) {
        try {
            return theConstructor.newInstance(outClassObject);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
