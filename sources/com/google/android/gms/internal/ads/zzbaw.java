package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbaw extends zzbbh {
    public zzbaw(zzazt zzaztVar, String str, String str2, zzavs zzavsVar, int i2, int i3) {
        super(zzaztVar, "ExKA4wjDRRYdztAsabUEoV5NOADo4vSkAwQNa4IGw0yLC0NQlDOhDdBTfDT5YHOb", "1Gz3ZRhjJNvXJ0g284S9b/dpVAajMMfg8CE3pBcFNFA=", zzavsVar, i2, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            boolean zBooleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
            zzavs zzavsVar = this.zzd;
            int i2 = 1;
            if (true == zBooleanValue) {
                i2 = 2;
            }
            zzavsVar.zzah(i2);
        } catch (InvocationTargetException unused) {
            this.zzd.zzah(3);
        }
    }
}
