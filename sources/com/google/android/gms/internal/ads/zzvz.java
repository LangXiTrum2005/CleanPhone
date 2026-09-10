package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzvz extends zzvu {
    public static final Object zzc = new Object();
    private final Object zzd;
    private final Object zze;

    private zzvz(zzbf zzbfVar, Object obj, Object obj2) {
        super(zzbfVar);
        this.zzd = obj;
        this.zze = obj2;
    }

    public static zzvz zzp(zzak zzakVar) {
        return new zzvz(new zzwa(zzakVar), zzbe.zza, zzc);
    }

    public static zzvz zzq(zzbf zzbfVar, Object obj, Object obj2) {
        return new zzvz(zzbfVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzvu, com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i2, zzbe zzbeVar, long j) {
        this.zzb.zzb(i2, zzbeVar, j);
        if (Objects.equals(zzbeVar.zzb, this.zzd)) {
            zzbeVar.zzb = zzbe.zza;
        }
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvu, com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i2, zzbd zzbdVar, boolean z2) {
        this.zzb.zzd(i2, zzbdVar, z2);
        if (Objects.equals(zzbdVar.zzb, this.zze) && z2) {
            zzbdVar.zzb = zzc;
        }
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvu, com.google.android.gms.internal.ads.zzbf
    public final int zze(Object obj) {
        Object obj2;
        if (zzc.equals(obj) && (obj2 = this.zze) != null) {
            obj = obj2;
        }
        return this.zzb.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzvu, com.google.android.gms.internal.ads.zzbf
    public final Object zzf(int i2) {
        Object objZzf = this.zzb.zzf(i2);
        return Objects.equals(objZzf, this.zze) ? zzc : objZzf;
    }

    public final zzvz zzr(zzbf zzbfVar) {
        return new zzvz(zzbfVar, this.zzd, this.zze);
    }

    public final /* synthetic */ Object zzs() {
        return this.zze;
    }
}
