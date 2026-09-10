package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdoz {
    private final zzdua zza;
    private final zzdsp zzb;
    private final zzcsh zzc;
    private final zzdnu zzd;

    public zzdoz(zzdua zzduaVar, zzdsp zzdspVar, zzcsh zzcshVar, zzdnu zzdnuVar) {
        this.zza = zzduaVar;
        this.zzb = zzdspVar;
        this.zzc = zzcshVar;
        this.zzd = zzdnuVar;
    }

    public final View zza() throws zzcjg {
        zzcir zzcirVarZza = this.zza.zza(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        zzcirVarZza.zzE().setVisibility(8);
        zzcirVarZza.zzab("/sendMessageToSdk", new zzbnn() { // from class: com.google.android.gms.internal.ads.zzdoy
            @Override // com.google.android.gms.internal.ads.zzbnn
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzb((zzcir) obj, map);
            }
        });
        zzcirVarZza.zzab("/adMuted", new zzbnn() { // from class: com.google.android.gms.internal.ads.zzdot
            @Override // com.google.android.gms.internal.ads.zzbnn
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzc((zzcir) obj, map);
            }
        });
        WeakReference weakReference = new WeakReference(zzcirVarZza);
        zzbnn zzbnnVar = new zzbnn() { // from class: com.google.android.gms.internal.ads.zzdou
            @Override // com.google.android.gms.internal.ads.zzbnn
            public final /* synthetic */ void zza(Object obj, final Map map) {
                zzcir zzcirVar = (zzcir) obj;
                zzckp zzckpVarZzP = zzcirVar.zzP();
                final zzdoz zzdozVar = this.zza;
                zzckpVarZzP.zzG(new zzckn() { // from class: com.google.android.gms.internal.ads.zzdox
                    @Override // com.google.android.gms.internal.ads.zzckn
                    public final /* synthetic */ void zza(boolean z2, int i2, String str, String str2) {
                        zzdozVar.zzf(map, z2, i2, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcirVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzcirVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        };
        zzdsp zzdspVar = this.zzb;
        zzdspVar.zzh(weakReference, "/loadHtml", zzbnnVar);
        zzdspVar.zzh(new WeakReference(zzcirVarZza), "/showOverlay", new zzbnn() { // from class: com.google.android.gms.internal.ads.zzdov
            @Override // com.google.android.gms.internal.ads.zzbnn
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzd((zzcir) obj, map);
            }
        });
        zzdspVar.zzh(new WeakReference(zzcirVarZza), "/hideOverlay", new zzbnn() { // from class: com.google.android.gms.internal.ads.zzdow
            @Override // com.google.android.gms.internal.ads.zzbnn
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zze((zzcir) obj, map);
            }
        });
        return zzcirVarZza.zzE();
    }

    public final /* synthetic */ void zzb(zzcir zzcirVar, Map map) {
        this.zzb.zzf("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(zzcir zzcirVar, Map map) {
        this.zzd.zzt();
    }

    public final /* synthetic */ void zzd(zzcir zzcirVar, Map map) {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Showing native ads overlay.");
        zzcirVar.zzE().setVisibility(0);
        this.zzc.zze(true);
    }

    public final /* synthetic */ void zze(zzcir zzcirVar, Map map) {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Hiding native ads overlay.");
        zzcirVar.zzE().setVisibility(8);
        this.zzc.zze(false);
    }

    public final /* synthetic */ void zzf(Map map, boolean z2, int i2, String str, String str2) {
        HashMap mapS = androidx.media3.extractor.text.ttml.a.s("messageType", "htmlLoaded");
        mapS.put("id", (String) map.get("id"));
        this.zzb.zzf("sendMessageToNativeJs", mapS);
    }
}
