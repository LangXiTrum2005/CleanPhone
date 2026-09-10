package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbak extends zzbbh {
    private final long zzh;

    public zzbak(zzazt zzaztVar, String str, String str2, zzavs zzavsVar, long j, int i2, int i3) {
        super(zzaztVar, "6Tbgi6IQESKZikJOpZcClcVJxza1rhAf3nfasZu/vDcTd3loITpTNbH23xjyLA5L", "g107GCb4k6+PXON8scRHoxvRnyAK9ZOpFHjKTWKkbXc=", zzavsVar, i2, 25);
        this.zzh = j;
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.zze.invoke(null, new Object[0])).longValue();
        zzavs zzavsVar = this.zzd;
        synchronized (zzavsVar) {
            try {
                zzavsVar.zzac(jLongValue);
                long j = this.zzh;
                if (j != 0) {
                    zzavsVar.zzk(jLongValue - j);
                    zzavsVar.zzn(j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
