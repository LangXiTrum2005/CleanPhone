package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfae implements zzezv {
    private final int zza;
    private final int zzb;

    public zzfae(int i2, int i3) {
        this.zza = i2;
        this.zzb = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i2;
        Bundle bundle = ((zzczm) obj).zza;
        int i3 = this.zza;
        if (i3 == -1 || (i2 = this.zzb) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i3);
        bundle.putInt("crashes_without_flags", i2);
        int i4 = com.google.android.gms.ads.internal.client.zzbb.zza;
        if (com.google.android.gms.ads.internal.client.zzbd.zzc().zzc()) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
