package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzexi implements zzezx {
    private final Context zza;
    private final Intent zzb;

    public zzexi(Context context, Intent intent) {
        this.zza = context;
        this.zzb = intent;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        com.google.android.gms.ads.internal.util.zze.zza("HsdpMigrationSignal.produce");
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzoh)).booleanValue()) {
            return zzgym.zza(new zzexj(null));
        }
        boolean z2 = false;
        try {
            if (this.zzb.resolveActivity(this.zza.getPackageManager()) != null) {
                com.google.android.gms.ads.internal.util.zze.zza("HSDP intent is supported");
                z2 = true;
            }
        } catch (Exception e2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "HsdpMigrationSignal.isHsdpMigrationSupported");
        }
        return zzgym.zza(new zzexj(Boolean.valueOf(z2)));
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 60;
    }
}
