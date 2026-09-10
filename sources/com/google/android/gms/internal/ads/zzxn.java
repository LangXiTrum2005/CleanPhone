package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzxn implements zzwf {
    private final zzha zza;
    private final zzwy zzb;
    private int zzc;
    private final zzaaq zzd;

    public zzxn(zzha zzhaVar, final zzaeu zzaeuVar) {
        zzwy zzwyVar = new zzwy() { // from class: com.google.android.gms.internal.ads.zzxm
            @Override // com.google.android.gms.internal.ads.zzwy
            public final /* synthetic */ zzwz zza(zzpn zzpnVar) {
                return new zzvi(zzaeuVar);
            }
        };
        zzaaq zzaaqVar = new zzaaq(-1);
        this.zza = zzhaVar;
        this.zzb = zzwyVar;
        this.zzd = zzaaqVar;
        this.zzc = 1048576;
    }

    public final zzxn zza(int i2) {
        this.zzc = i2;
        return this;
    }

    public final zzxo zzb(zzak zzakVar) {
        zzakVar.zzb.getClass();
        return new zzxo(zzakVar, this.zza, this.zzb, zztk.zza, this.zzd, this.zzc, 0, null, null, null);
    }
}
