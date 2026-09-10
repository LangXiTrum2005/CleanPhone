package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbap extends zzbbh {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzbap(zzazt zzaztVar, String str, String str2, zzavs zzavsVar, int i2, int i3) {
        super(zzaztVar, "b8WdxwEW5LYMXGC6g6q07uNIFUV3fs77AEo1YVb/4q/M8KyV69so1cxJ+MsKyWwh", "kazSW9iygMpHEkKh5zVqXBXYRU+noi3Tzu4hpFfxZG4=", zzavsVar, i2, 22);
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
            zzavsVar.zzm(zzh.longValue());
        }
    }
}
