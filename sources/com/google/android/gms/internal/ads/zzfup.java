package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfup {
    private final Context zza;
    private final Looper zzb;

    public zzfup(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfuz zzfuzVarZza = zzfvb.zza();
        Context context = this.zza;
        zzfuzVarZza.zza(context.getPackageName());
        zzfuzVarZza.zzc(2);
        zzfux zzfuxVarZza = zzfuy.zza();
        zzfuxVarZza.zza(str);
        zzfuxVarZza.zzb(2);
        zzfuzVarZza.zzb(zzfuxVarZza);
        new zzfuq(context, this.zzb, (zzfvb) zzfuzVarZza.zzbu()).zza();
    }
}
