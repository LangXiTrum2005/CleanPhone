package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbai extends zzbbh {
    public zzbai(zzazt zzaztVar, String str, String str2, zzavs zzavsVar, int i2, int i3) {
        super(zzaztVar, "0k0HoJtCvAtrnTz0UbiSqrs0BGKzSTMoo+ZxCfyJrLcMn8tbsvf/NG2/ui2bKbWP", "z6GzXqyR8kvBYJKVLhMc9mqmsbq6ZkNeWqgTkONnpqg=", zzavsVar, i2, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzavs zzavsVar = this.zzd;
        zzavsVar.zzd(-1L);
        zzavsVar.zze(-1L);
        int[] iArr = (int[]) this.zze.invoke(null, this.zza.zzb());
        synchronized (zzavsVar) {
            try {
                zzavsVar.zzd(iArr[0]);
                zzavsVar.zze(iArr[1]);
                int i2 = iArr[2];
                if (i2 != Integer.MIN_VALUE) {
                    zzavsVar.zzO(i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
