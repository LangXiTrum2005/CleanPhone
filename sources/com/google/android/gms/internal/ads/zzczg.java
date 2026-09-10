package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
final class zzczg implements zzdby, zzdbf {
    private final zzfhr zza;

    public zzczg(Context context, zzfhr zzfhrVar, zzbxd zzbxdVar) {
        this.zza = zzfhrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zza(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzb(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzc(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdby
    public final void zzg() {
        zzbxe zzbxeVar = this.zza.zzad;
        if (zzbxeVar == null || !zzbxeVar.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = zzbxeVar.zzb;
        if (str.isEmpty()) {
            return;
        }
        arrayList.add(str);
    }
}
