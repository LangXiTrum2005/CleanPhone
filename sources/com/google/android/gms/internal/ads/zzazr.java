package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzazr implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzazt zzb;

    public zzazr(zzazt zzaztVar, int i2, boolean z2) {
        this.zza = i2;
        Objects.requireNonNull(zzaztVar);
        this.zzb = zzaztVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzawp zzawpVarZza;
        int i2 = this.zza;
        zzazt zzaztVar = this.zzb;
        if (i2 > 0) {
            try {
                Thread.sleep(i2 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            Context context = zzaztVar.zza;
            zzawpVarZza = zzfum.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused2) {
            zzawpVarZza = null;
        }
        zzazt zzaztVar2 = this.zzb;
        zzaztVar2.zzs(zzawpVarZza);
        int i3 = this.zza;
        if (i3 < 4) {
            if (zzawpVarZza != null && zzawpVarZza.zza() && !zzawpVarZza.zzb().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzawpVarZza.zzg() && zzawpVarZza.zzh().zza() && zzawpVarZza.zzh().zzb() != -2) {
                return;
            }
            zzaztVar2.zzp(i3 + 1, true);
        }
    }
}
