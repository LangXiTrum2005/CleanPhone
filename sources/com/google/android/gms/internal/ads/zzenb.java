package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes4.dex */
public final class zzenb implements zzijg {
    private final zzena zza;
    private final zzijp zzb;
    private final zzijp zzc;
    private final zzijp zzd;
    private final zzijp zze;

    private zzenb(zzena zzenaVar, zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        this.zza = zzenaVar;
        this.zzb = zzijpVar;
        this.zzc = zzijpVar2;
        this.zzd = zzijpVar3;
        this.zze = zzijpVar4;
    }

    public static zzenb zza(zzena zzenaVar, zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        return new zzenb(zzenaVar, zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        return this.zza.zzb((Clock) this.zzb.zzb(), ((zzemu) this.zzc).zzb(), (zzejl) this.zzd.zzb(), (zzfpi) this.zze.zzb());
    }
}
