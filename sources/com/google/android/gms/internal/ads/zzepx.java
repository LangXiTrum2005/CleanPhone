package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzepx implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzepx(zzhfj zzhfjVar, zzhfj zzhfjVar2) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0030  */
    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfxs zzfxsVarZzn;
        zzeqv zzeqvVarZzb = ((zzeqx) this.zza).zzb();
        Context contextZza = ((zzche) this.zzb).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlk)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            if (com.google.android.gms.ads.internal.util.zzs.zzC(contextZza)) {
                zzfxsVarZzn = zzfxs.zzo(zzeqvVarZzb);
            } else {
                zzfxsVarZzn = zzfxs.zzn();
            }
        } else {
            zzfxsVarZzn = zzfxs.zzn();
        }
        zzhez.zzb(zzfxsVarZzn);
        return zzfxsVarZzn;
    }
}
