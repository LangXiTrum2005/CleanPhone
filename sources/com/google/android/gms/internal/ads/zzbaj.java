package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbaj extends zzbbh {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzbaj(zzazt zzaztVar, String str, String str2, zzavs zzavsVar, int i2, int i3) {
        super(zzaztVar, "N+SNt584k90MWn4aBLIhSutg85cYgcNyu+q+5WGRUo/oWkmPivq/1xlEIBG+GcFK", "VOVDFi9LxFQe2QWzKEnmStNUha/UwjqmQV12jeIMYds=", zzavsVar, i2, 44);
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (Long) this.zze.invoke(null, new Object[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        zzavs zzavsVar = this.zzd;
        synchronized (zzavsVar) {
            zzavsVar.zzB(zzh.longValue());
        }
    }
}
