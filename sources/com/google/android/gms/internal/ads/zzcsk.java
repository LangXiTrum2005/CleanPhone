package com.google.android.gms.internal.ads;

import com.smartdigimkt.m3.h;
import com.smartdigimkt.o1.b;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcsk {
    private final zzdxe zza;
    private final zzfic zzb;

    public zzcsk(zzdxe zzdxeVar, zzfic zzficVar) {
        this.zza = zzdxeVar;
        this.zzb = zzficVar;
    }

    public final void zza(long j, int i2) {
        String str;
        zzdxd zzdxdVarZza = this.zza.zza();
        zzdxdVarZza.zza(this.zzb.zzb.zzb);
        zzdxdVarZza.zzc("action", "ad_closed");
        zzdxdVarZza.zzc("show_time", String.valueOf(j));
        zzdxdVarZza.zzc("ad_format", "app_open_ad");
        int i3 = i2 - 1;
        if (i3 == 0) {
            str = h.f36614b;
        } else if (i3 == 1) {
            str = "bb";
        } else if (i3 == 2) {
            str = b.f37320h;
        } else if (i3 != 3) {
            str = i3 != 4 ? "u" : "ac";
        } else {
            str = "cb";
        }
        zzdxdVarZza.zzc("acr", str);
        zzdxdVarZza.zzd();
    }
}
