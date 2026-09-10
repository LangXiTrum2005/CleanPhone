package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import androidx.media3.ui.i;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaxl implements PackageManager$OnChecksumsReadyListener {
    final zzgzf zza = zzgzf.zze();

    public final void onChecksumsReady(List list) {
        if (list == null) {
            this.zza.zza("");
            return;
        }
        try {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ApkChecksum apkChecksumE = i.e(list.get(i2));
                if (apkChecksumE.getType() == 8) {
                    zzgzf zzgzfVar = this.zza;
                    zzgvy zzgvyVarZzi = zzgvy.zzn().zzi();
                    byte[] value = apkChecksumE.getValue();
                    zzgzfVar.zza(zzgvyVarZzi.zzj(value, 0, value.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.zza.zza("");
    }
}
