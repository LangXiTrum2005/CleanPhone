package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgwg implements Closeable {
    private static final zzgwf zzc = zzgwf.zza;
    private final Deque zza = new ArrayDeque(4);
    private Throwable zzb;

    public zzgwg(zzgwf zzgwfVar) {
    }

    public static zzgwg zza() {
        return new zzgwg(zzc);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Throwable th = this.zzb;
        while (true) {
            Deque deque = this.zza;
            if (deque.isEmpty()) {
                break;
            }
            Closeable closeable = (Closeable) deque.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else if (th != th2) {
                    try {
                        th.addSuppressed(th2);
                    } catch (Throwable unused) {
                        zzgwe.zza.logp(Level.WARNING, "com.google.common.io.Closer", "<init>", "Suppressing exception thrown when closing ".concat(String.valueOf(closeable)), th2);
                    }
                }
            }
        }
        if (this.zzb != null || th == null) {
            return;
        }
        zzgqx.zza(th, IOException.class);
        zzgqx.zzb(th);
        throw new AssertionError(th);
    }

    public final Closeable zzb(Closeable closeable) {
        this.zza.addFirst(closeable);
        return closeable;
    }

    public final RuntimeException zzc(Throwable th) throws Throwable {
        this.zzb = th;
        zzgqx.zza(th, IOException.class);
        zzgqx.zzb(th);
        throw new RuntimeException(th);
    }
}
