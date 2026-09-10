package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import com.p004ironsource.ch;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdrf {
    private final Executor zza;
    private final zzcsh zzb;
    private final zzdil zzc;
    private final zzcra zzd;
    private final zzcze zze;

    public zzdrf(Executor executor, zzcsh zzcshVar, zzdil zzdilVar, zzcra zzcraVar, zzcze zzczeVar) {
        this.zza = executor;
        this.zzc = zzdilVar;
        this.zzb = zzcshVar;
        this.zzd = zzcraVar;
        this.zze = zzczeVar;
    }

    public final void zza(final zzcir zzcirVar) {
        if (zzcirVar == null) {
            return;
        }
        zzdil zzdilVar = this.zzc;
        zzdilVar.zza(zzcirVar.zzE());
        zzbck zzbckVar = new zzbck() { // from class: com.google.android.gms.internal.ads.zzdre
            @Override // com.google.android.gms.internal.ads.zzbck
            public final /* synthetic */ void zzdj(zzbcj zzbcjVar) {
                Rect rect = zzbcjVar.zzd;
                zzcirVar.zzP().zza(rect.left, rect.top, false);
            }
        };
        Executor executor = this.zza;
        zzdilVar.zzq(zzbckVar, executor);
        zzdilVar.zzq(new zzbck() { // from class: com.google.android.gms.internal.ads.zzdrb
            @Override // com.google.android.gms.internal.ads.zzbck
            public final /* synthetic */ void zzdj(zzbcj zzbcjVar) {
                HashMap map = new HashMap();
                map.put(ch.k, true != zzbcjVar.zzj ? "0" : "1");
                zzcirVar.zze("onAdVisibilityChanged", map);
            }
        }, executor);
        zzcsh zzcshVar = this.zzb;
        zzdilVar.zzq(zzcshVar, executor);
        zzcshVar.zza(zzcirVar);
        zzckp zzckpVarZzP = zzcirVar.zzP();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzly)).booleanValue() && zzckpVarZzP != null) {
            zzcra zzcraVar = this.zzd;
            zzckpVarZzP.zzc(zzcraVar);
            zzckpVarZzP.zze(zzcraVar, null, null);
        }
        zzcirVar.zzab("/trackActiveViewUnit", new zzbnn() { // from class: com.google.android.gms.internal.ads.zzdrc
            @Override // com.google.android.gms.internal.ads.zzbnn
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzb((zzcir) obj, map);
            }
        });
        zzcirVar.zzab("/untrackActiveViewUnit", new zzbnn() { // from class: com.google.android.gms.internal.ads.zzdrd
            @Override // com.google.android.gms.internal.ads.zzbnn
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzc((zzcir) obj, map);
            }
        });
        zzcirVar.zzP().zzJ(this.zze);
    }

    public final /* synthetic */ void zzb(zzcir zzcirVar, Map map) {
        this.zzb.zzd();
    }

    public final /* synthetic */ void zzc(zzcir zzcirVar, Map map) {
        this.zzb.zzb();
    }
}
