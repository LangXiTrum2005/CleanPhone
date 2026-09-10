package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgfo extends zzgfz {
    private static volatile Long zza;
    private static final Object zzb = new Object();

    public zzgfo(zzavs zzavsVar, zzgev zzgevVar, zzgnc zzgncVar) {
        super("YQgeP5fuv5ofse0QgFoH1jczidaqU/jtx1ciH6/QwxlFmpEApWLYJ3HQGFOytIWd", "OPkzLWS3TjLmGVFqnLDKV5LemMhH5Tq8oEAXZUf2/Ss=", zzavsVar, zzgevVar, zzgncVar.zza(117));
    }

    @Override // com.google.android.gms.internal.ads.zzgfz
    public final void zza(Method method, zzavs zzavsVar) throws IllegalAccessException, InvocationTargetException {
        if (zza == null) {
            synchronized (zzb) {
                try {
                    if (zza == null) {
                        Long l2 = (Long) method.invoke("", new Object[0]);
                        if (l2 == null) {
                            throw null;
                        }
                        zza = l2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (zzavsVar) {
            try {
                if (zza != null) {
                    zzavsVar.zzm(zza.longValue());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
