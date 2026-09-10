package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfiv {
    public static zzbnn zza(final zzehu zzehuVar, final zzfpi zzfpiVar, final zzcra zzcraVar, final zzdir zzdirVar) {
        return new zzbnn() { // from class: com.google.android.gms.internal.ads.zzfiu
            @Override // com.google.android.gms.internal.ads.zzbnn
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcir zzcirVar = (zzcir) obj;
                zzbnm.zzc(map, zzdirVar);
                String str = (String) map.get("u");
                if (str == null) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from click GMSG.");
                } else {
                    zzehu zzehuVar2 = zzehuVar;
                    zzfpi zzfpiVar2 = zzfpiVar;
                    zzgym.zzr(zzbnm.zza(zzcirVar, str), new zzfis(zzcirVar, zzcraVar, zzfpiVar2, zzehuVar2), zzcdo.zza);
                }
            }
        };
    }

    public static zzbnn zzb(final zzehu zzehuVar, final zzfpi zzfpiVar) {
        return new zzbnn() { // from class: com.google.android.gms.internal.ads.zzfit
            @Override // com.google.android.gms.internal.ads.zzbnn
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcii zzciiVar = (zzcii) obj;
                String str = (String) map.get("u");
                if (str == null) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from httpTrack GMSG.");
                    return;
                }
                zzfhr zzfhrVarZzC = zzciiVar.zzC();
                if (zzfhrVarZzC != null && !zzfhrVarZzC.zzai) {
                    zzfpiVar.zzb(str, zzfhrVarZzC.zzax, null, null);
                    return;
                }
                zzfhu zzfhuVarZzaC = ((zzcjy) zzciiVar).zzaC();
                if (zzfhuVarZzaC != null) {
                    zzehuVar.zze(new zzehw(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), zzfhuVarZzaC.zzb, str, 2));
                } else {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                }
            }
        };
    }
}
