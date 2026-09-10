package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdor implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdsp zzd;
    private final Clock zze;
    private zzblp zzf;
    private zzbnn zzg;

    public zzdor(zzdsp zzdspVar, Clock clock) {
        this.zzd = zzdspVar;
        this.zze = clock;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzc = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zza != null && this.zzb != null) {
            HashMap map = new HashMap();
            map.put("id", this.zza);
            map.put("time_interval", String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.zzd.zzf("sendMessageToNativeJs", map);
        }
        zzd();
    }

    public final void zza(final zzblp zzblpVar) {
        this.zzf = zzblpVar;
        zzbnn zzbnnVar = this.zzg;
        if (zzbnnVar != null) {
            this.zzd.zze("/unconfirmedClick", zzbnnVar);
        }
        zzbnn zzbnnVar2 = new zzbnn() { // from class: com.google.android.gms.internal.ads.zzdoq
            @Override // com.google.android.gms.internal.ads.zzbnn
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdor zzdorVar = this.zza;
                try {
                    zzdorVar.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzblp zzblpVar2 = zzblpVar;
                zzdorVar.zza = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (zzblpVar2 == null) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Received unconfirmed click but UnconfirmedClickListener is null.");
                } else {
                    try {
                        zzblpVar2.zze(str);
                    } catch (RemoteException e2) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
                    }
                }
            }
        };
        this.zzg = zzbnnVar2;
        this.zzd.zzd("/unconfirmedClick", zzbnnVar2);
    }

    public final zzblp zzb() {
        return this.zzf;
    }

    public final void zzc() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zzf();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
        }
    }
}
