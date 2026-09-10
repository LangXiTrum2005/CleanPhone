package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbab implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzbac zza;

    public zzbab(zzbac zzbacVar) {
        Objects.requireNonNull(zzbacVar);
        this.zza = zzbacVar;
    }

    public final void onOpActiveChanged(String str, int i2, String str2, boolean z2) {
        if (z2) {
            zzbac zzbacVar = this.zza;
            zzbacVar.zze(System.currentTimeMillis());
            zzbacVar.zzh(true);
            return;
        }
        zzbac zzbacVar2 = this.zza;
        long jZzf = zzbacVar2.zzf();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jZzf > 0 && jCurrentTimeMillis >= zzbacVar2.zzf()) {
            zzbacVar2.zzg(jCurrentTimeMillis - zzbacVar2.zzf());
        }
        zzbacVar2.zzh(false);
    }
}
