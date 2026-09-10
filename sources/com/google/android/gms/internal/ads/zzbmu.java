package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzbmu implements zzbnn {
    @Override // com.google.android.gms.internal.ads.zzbnn
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcir zzcirVar = (zzcir) obj;
        if (zzcirVar.zzaz() != null) {
            zzcirVar.zzaz().zza();
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = zzcirVar.zzL();
        if (zzmVarZzL != null) {
            zzmVarZzL.zzb();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzM = zzcirVar.zzM();
        if (zzmVarZzM != null) {
            zzmVarZzM.zzb();
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
