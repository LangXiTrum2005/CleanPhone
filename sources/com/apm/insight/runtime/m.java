package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile p f10351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Handler f10352b;

    public static p a() {
        if (f10351a == null) {
            b();
        }
        return f10351a;
    }

    private static HandlerThread b() {
        if (f10351a == null) {
            synchronized (m.class) {
                try {
                    if (f10351a == null) {
                        p pVar = new p("default_npth_thread");
                        f10351a = pVar;
                        pVar.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f10351a.c();
    }
}
