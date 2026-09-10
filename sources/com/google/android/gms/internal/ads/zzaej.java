package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
final class zzaej {
    private final zzaei zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    public zzaej(zzaei zzaeiVar) {
        this.zza = zzaeiVar;
    }

    public final zzaeo zza(Object... objArr) {
        Constructor constructorZza;
        AtomicBoolean atomicBoolean = this.zzb;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                try {
                    constructorZza = this.zza.zza();
                } catch (ClassNotFoundException unused) {
                    this.zzb.set(true);
                    constructorZza = null;
                } catch (Exception e2) {
                    throw new RuntimeException("Error instantiating extension", e2);
                }
            }
            constructorZza = null;
        }
        if (constructorZza == null) {
            return null;
        }
        try {
            return (zzaeo) constructorZza.newInstance(objArr);
        } catch (Exception e3) {
            throw new IllegalStateException("Unexpected error creating extractor", e3);
        }
    }
}
