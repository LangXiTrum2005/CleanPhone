package com.google.android.gms.internal.measurement;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gf implements se {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f23516a;

    static {
        new AtomicInteger();
    }

    @Override // com.google.android.gms.internal.measurement.se
    public final Object a(re reVar) throws IOException {
        if (this.f23516a) {
            if (reVar.f23936b.isEmpty()) {
                return reVar.f23935a.c(reVar.f23938d);
            }
            throw new b2.z("Short circuit would skip transforms.");
        }
        Closeable closeableD = e1.d(reVar);
        try {
            if (!(closeableD instanceof ze)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File fileZza = ((ze) closeableD).zza();
            if (closeableD != null) {
                closeableD.close();
            }
            return fileZza;
        } catch (Throwable th2) {
            if (closeableD != null) {
                try {
                    closeableD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
