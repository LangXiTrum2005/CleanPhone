package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class zzetb implements zzezv {
    private final com.google.android.gms.ads.internal.client.zzx zza;
    private final boolean zzb;

    public zzetb(com.google.android.gms.ads.internal.client.zzx zzxVar, boolean z2) {
        this.zza = zzxVar;
        this.zzb = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzczm) obj).zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgo)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzb);
        }
        com.google.android.gms.ads.internal.client.zzx zzxVar = this.zza;
        if (zzxVar != null) {
            int i2 = zzxVar.zza;
            if (i2 == 1) {
                bundle.putString("avo", "p");
            } else if (i2 == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
