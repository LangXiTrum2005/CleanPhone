package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcmg implements zzijg {
    private final zzcli zza;

    private zzcmg(zzcli zzcliVar) {
        this.zza = zzcliVar;
    }

    public static zzcmg zzc(zzcli zzcliVar) {
        return new zzcmg(zzcliVar);
    }

    public static VersionInfoParcel zzd(zzcli zzcliVar) {
        VersionInfoParcel versionInfoParcelZzd = zzcliVar.zzd();
        zzijo.zzb(versionInfoParcelZzd);
        return versionInfoParcelZzd;
    }

    public final VersionInfoParcel zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
