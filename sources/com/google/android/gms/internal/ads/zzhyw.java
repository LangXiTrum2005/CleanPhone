package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzhyw implements zzick {
    static {
        int i2 = zziab.zzb;
        int i3 = zzhyy.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzick
    public final /* synthetic */ Object zza(InputStream inputStream, zziab zziabVar) throws zzibg {
        zzide zzideVarZzaU;
        zzhzq zzhzqVarZzF = zzhzq.zzF(inputStream, 4096);
        zzicc zziccVar = (zzicc) zzb(zzhzqVarZzF, zziabVar);
        zzhzqVarZzF.zzb(0);
        if (zziccVar == null || zziccVar.zzbi()) {
            return zziccVar;
        }
        if (zziccVar instanceof zzhyu) {
            zzideVarZzaU = ((zzhyu) zziccVar).zzaU();
        } else {
            if (zziccVar instanceof zzhyv) {
                throw null;
            }
            zzideVarZzaU = new zzide(zziccVar);
        }
        throw zzideVarZzaU.zza();
    }
}
