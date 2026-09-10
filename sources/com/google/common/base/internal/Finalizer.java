package com.google.common.base.internal;

import java.lang.reflect.Constructor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public class Finalizer implements Runnable {
    public static final Logger X = Logger.getLogger(Finalizer.class.getName());

    static {
        Constructor constructor;
        try {
            constructor = Thread.class.getConstructor(ThreadGroup.class, Runnable.class, String.class, Long.TYPE, Boolean.TYPE);
        } catch (Throwable unused) {
            constructor = null;
        }
        if (constructor == null) {
            try {
                Thread.class.getDeclaredField("inheritableThreadLocals").setAccessible(true);
            } catch (Throwable unused2) {
                X.log(Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        throw null;
    }
}
