package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzclu implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzclu(zzcli zzcliVar, zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzclu zza(zzcli zzcliVar, zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzclu(zzcliVar, zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdB)).booleanValue() ? new zzayq((zzayl) this.zzb.zzb()) : new zzayq((zzayl) this.zza.zzb());
    }
}
