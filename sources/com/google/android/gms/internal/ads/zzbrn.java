package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbrn implements zzcdv {
    final /* synthetic */ zzbrl zza;

    public zzbrn(zzbrq zzbrqVar, zzbrl zzbrlVar) {
        this.zza = zzbrlVar;
        Objects.requireNonNull(zzbrqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("Rejecting reference for JS Engine.");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziF)).booleanValue()) {
            this.zza.zzh(new IllegalStateException("Unable to create JS engine reference."), "SdkJavascriptFactory.createNewReference.FailureCallback");
        } else {
            this.zza.zzg();
        }
    }
}
