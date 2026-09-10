package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class zzepd {
    private final zzdkz zza;

    public zzepd(zzdkz zzdkzVar) {
        this.zza = zzdkzVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfic zzficVar, zzfhr zzfhrVar, View view, zzeoz zzeozVar) {
        zzepb zzepbVar = new zzepb(this, new zzepa(this, zzfhrVar));
        zzdjt zzdjtVarZzd = this.zza.zzd(new zzcwa(zzficVar, zzfhrVar, null), zzepbVar);
        zzeozVar.zzd(new zzepc(this, zzdjtVarZzd));
        return zzdjtVarZzd.zzh();
    }
}
