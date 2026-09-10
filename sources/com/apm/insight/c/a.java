package com.apm.insight.c;

import com.apm.insight.e;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AtomicBoolean f10057a = new AtomicBoolean(false);

    public static boolean a() {
        synchronized (f10057a) {
            try {
                if (f10057a.get()) {
                    return false;
                }
                f10057a.set(true);
                return b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean b() {
        if (!com.apm.insight.runtime.a.g()) {
            return false;
        }
        try {
            File file = new File(e.h().getFilesDir(), "apminsight/crashCommand");
            file.mkdirs();
            new File(file, "0_" + System.currentTimeMillis()).createNewFile();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
