package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzevz implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzevz(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzevz zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzevz(zzijpVar, zzijpVar2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0030  */
    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgtn zzgtnVarZzh;
        zzewx zzewxVarZzb = ((zzewz) this.zza).zzb();
        Context contextZza = ((zzclp) this.zzb).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmK)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            if (com.google.android.gms.ads.internal.util.zzs.zzG(contextZza)) {
                zzgtnVarZzh = zzgtn.zzi(zzewxVarZzb);
            } else {
                zzgtnVarZzh = zzgtn.zzh();
            }
        } else {
            zzgtnVarZzh = zzgtn.zzh();
        }
        zzijo.zzb(zzgtnVarZzh);
        return zzgtnVarZzh;
    }
}
