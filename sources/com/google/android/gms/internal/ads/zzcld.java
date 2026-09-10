package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcld {
    private String zza;
    private zzief zzb;
    private zziic zzc;
    private final ScheduledExecutorService zzd;
    private final AtomicBoolean zze = new AtomicBoolean(false);

    public zzcld(zzckq zzckqVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzd = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final void zze() {
        try {
            String strD = WebViewFeature.a("GET_VARIATIONS_HEADER") ? WebViewCompat.d() : null;
            if (strD != null && !strD.isEmpty()) {
                this.zza = strD;
                byte[] bArrDecode = Base64.decode(strD, 10);
                this.zzb = zzief.zzc(bArrDecode, zziab.zzb());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkf)).booleanValue()) {
                    this.zzc = zziic.zzc(bArrDecode, zziab.zzb());
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkd)).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkc)).booleanValue()) {
                        this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclc
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zze();
                            }
                        }, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzke)).intValue(), TimeUnit.MINUTES);
                    }
                }
            }
        } catch (zzibg e2) {
            e = e2;
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "ChromeVariations");
        } catch (IllegalArgumentException e3) {
            e = e3;
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "ChromeVariations");
        }
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkc)).booleanValue() && !this.zze.getAndSet(true)) {
            zze();
        }
    }

    public final String zzb() {
        zziic zziicVar = this.zzc;
        if (zziicVar != null) {
            return Base64.encodeToString(zziicVar.zzaN(), 10);
        }
        return null;
    }

    public final String zzc() {
        return this.zza;
    }

    public final zzief zzd() {
        return this.zzb;
    }
}
