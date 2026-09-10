package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbaf extends zzbbh {
    public zzbaf(zzazt zzaztVar, String str, String str2, zzavs zzavsVar, int i2, int i3) {
        super(zzaztVar, "Ps5Xy95qN5Bq7sgqC6/M4zZXLDS2M1Isx7H/g2/CV37zoy2ILxNb7iAARKvnhAcR", "UDDHIUrqun7cz3t6d4j2iVVfWcHKtBQnSOoDChOFM5Y=", zzavsVar, i2, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzavs zzavsVar = this.zzd;
        zzavsVar.zzaf(3);
        try {
            int i2 = 1;
            if (true == ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue()) {
                i2 = 2;
            }
            zzavsVar.zzaf(i2);
        } catch (InvocationTargetException e2) {
            if (!(e2.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e2;
            }
        }
    }
}
