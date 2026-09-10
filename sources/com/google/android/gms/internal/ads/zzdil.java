package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdil extends zzdgi implements zzbck {
    private final Map zzb;
    private final Context zzc;
    private final zzfhr zzd;

    public zzdil(Context context, Set set, zzfhr zzfhrVar) {
        super(set);
        this.zzb = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzfhrVar;
    }

    public final synchronized void zza(View view) {
        try {
            Map map = this.zzb;
            zzbcm zzbcmVar = (zzbcm) map.get(view);
            if (zzbcmVar == null) {
                zzbcm zzbcmVar2 = new zzbcm(this.zzc, view);
                zzbcmVar2.zza(this);
                map.put(view, zzbcmVar2);
                zzbcmVar = zzbcmVar2;
            }
            if (this.zzd.zzX) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbT)).booleanValue()) {
                    zzbcmVar.zzd(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbS)).longValue());
                    return;
                }
            }
            zzbcmVar.zze();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(View view) {
        Map map = this.zzb;
        if (map.containsKey(view)) {
            ((zzbcm) map.get(view)).zzb(this);
            map.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbck
    public final synchronized void zzdj(final zzbcj zzbcjVar) {
        zzs(new zzdgh() { // from class: com.google.android.gms.internal.ads.zzdik
            @Override // com.google.android.gms.internal.ads.zzdgh
            public final /* synthetic */ void zza(Object obj) {
                ((zzbck) obj).zzdj(zzbcjVar);
            }
        });
    }
}
