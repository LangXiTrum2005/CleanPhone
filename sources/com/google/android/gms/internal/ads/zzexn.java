package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class zzexn implements zzezv {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;

    public zzexn(String str, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.zza = str;
        this.zzb = z2;
        this.zzc = z3;
        this.zzd = z4;
        this.zze = z5;
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzczm) obj).zza;
        String str = this.zza;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z2 = this.zzb;
        bundle.putInt("test_mode", z2 ? 1 : 0);
        boolean z3 = this.zzc;
        bundle.putInt("linked_device", z3 ? 1 : 0);
        if (z2 || z3) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkB)).booleanValue()) {
                bundle.putInt("risd", !this.zzd ? 1 : 0);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkF)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.zze);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzczm) obj).zzb;
        String str = this.zza;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z2 = this.zzb;
        bundle.putInt("test_mode", z2 ? 1 : 0);
        boolean z3 = this.zzc;
        bundle.putInt("linked_device", z3 ? 1 : 0);
        if (z2 || z3) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkF)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.zze);
            }
        }
    }
}
