package com.google.common.util.concurrent;

import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Platform.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cuirassed {
    public static boolean attabal(@CheckForNull Throwable th, Class<? extends Throwable> cls) {
        return cls.isInstance(th);
    }

    public static void saneness(Throwable th) {
        com.google.common.base.formularize.triweekly(th);
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
