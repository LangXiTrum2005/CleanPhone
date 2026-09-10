package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdmo implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzdmo(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzdmo zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzdmo(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdil((Context) this.zza.zzb(), new HashSet(), ((zzcwb) this.zzb).zza());
    }
}
