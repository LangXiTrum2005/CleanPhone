package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgmw implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzgmy zza;

    public zzgmw(zzgmy zzgmyVar) {
        Objects.requireNonNull(zzgmyVar);
        this.zza = zzgmyVar;
    }

    public final void onOpActiveChanged(String str, int i2, String str2, boolean z2) {
        zzgmy zzgmyVar = this.zza;
        synchronized (zzgmyVar) {
            try {
                if (z2) {
                    zzgmyVar.zzg(System.currentTimeMillis());
                    zzgmyVar.zzj(true);
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (zzgmyVar.zzh() > 0 && jCurrentTimeMillis >= zzgmyVar.zzh()) {
                        zzgmyVar.zzi(jCurrentTimeMillis - zzgmyVar.zzh());
                    }
                    zzgmyVar.zzj(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
