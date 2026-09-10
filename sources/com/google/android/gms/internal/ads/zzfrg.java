package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfrg {
    private boolean zza;

    public final boolean zza() {
        return this.zza;
    }

    public final void zzb(Context context) {
        zzftf.zzb(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzfsn.zza().zzb(context);
        zzfse.zza().zzd(context);
        zzfta.zza(context);
        zzftb.zza(context);
        zzfte.zza(context);
        zzfsk.zza().zzc(context);
        zzfsd.zza().zzc(context);
        zzfsp.zza().zzb(context);
    }
}
