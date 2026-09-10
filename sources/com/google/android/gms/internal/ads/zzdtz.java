package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.Z;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdtz {
    private final zzdai zza;
    private final zzdip zzb;
    private final zzdbr zzc;
    private final zzdce zzd;
    private final zzdcv zze;
    private final zzdfo zzf;
    private final Executor zzg;
    private final zzdil zzh;
    private final zzcrx zzi;
    private final com.google.android.gms.ads.internal.zzb zzj;
    private final zzcbk zzk;
    private final zzayq zzl;
    private final zzdff zzm;
    private final zzehu zzn;
    private final zzfpi zzo;
    private final zzdxe zzp;
    private final zzcra zzq;
    private final zzduf zzr;
    private final zzdyh zzs;
    private final zzczj zzt;
    private final zzcze zzu;

    public zzdtz(zzdai zzdaiVar, zzdbr zzdbrVar, zzdce zzdceVar, zzdcv zzdcvVar, zzdfo zzdfoVar, Executor executor, zzdil zzdilVar, zzcrx zzcrxVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcbk zzcbkVar, zzayq zzayqVar, zzdff zzdffVar, zzehu zzehuVar, zzfpi zzfpiVar, zzdxe zzdxeVar, zzdip zzdipVar, zzcra zzcraVar, zzduf zzdufVar, zzdyh zzdyhVar, zzczj zzczjVar, zzcze zzczeVar) {
        this.zza = zzdaiVar;
        this.zzc = zzdbrVar;
        this.zzd = zzdceVar;
        this.zze = zzdcvVar;
        this.zzf = zzdfoVar;
        this.zzg = executor;
        this.zzh = zzdilVar;
        this.zzi = zzcrxVar;
        this.zzj = zzbVar;
        this.zzk = zzcbkVar;
        this.zzl = zzayqVar;
        this.zzm = zzdffVar;
        this.zzn = zzehuVar;
        this.zzo = zzfpiVar;
        this.zzp = zzdxeVar;
        this.zzb = zzdipVar;
        this.zzq = zzcraVar;
        this.zzr = zzdufVar;
        this.zzs = zzdyhVar;
        this.zzt = zzczjVar;
        this.zzu = zzczeVar;
    }

    public static final ListenableFuture zzj(zzcir zzcirVar, String str, String str2, final Bundle bundle, zzfno zzfnoVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcL)).booleanValue()) {
            Z.t(bundle, zzdwm.RENDERING_WEBVIEW_LOAD_HTML_START.zza());
        }
        final zzcdt zzcdtVar = new zzcdt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkh)).booleanValue()) {
            zzfne zzfneVarZzn = zzfne.zzn(zzcirVar.getContext(), 112);
            zzfneVarZzn.zza();
            zzfnn.zzd(zzcdtVar, zzfnoVar, zzfneVarZzn);
        }
        zzcirVar.zzP().zzG(new zzckn() { // from class: com.google.android.gms.internal.ads.zzdtx
            @Override // com.google.android.gms.internal.ads.zzckn
            public final /* synthetic */ void zza(boolean z2, int i2, String str3, String str4) {
                zzcdt zzcdtVar2 = zzcdtVar;
                if (z2) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcL)).booleanValue()) {
                        Z.t(bundle, zzdwm.RENDERING_WEBVIEW_LOAD_HTML_END.zza());
                    }
                    zzcdtVar2.zzc(null);
                    return;
                }
                int length = String.valueOf(i2).length();
                StringBuilder sb = new StringBuilder(length + 55 + String.valueOf(str3).length() + 15 + String.valueOf(str4).length());
                sb.append("Ad Web View failed to load. Error code: ");
                sb.append(i2);
                sb.append(", Description: ");
                sb.append(str3);
                zzcdtVar2.zzd(new Exception(android.support.v4.media.a.r(sb, ", Failing URL: ", str4)));
            }
        });
        zzcirVar.zzau(str, str2, null);
        return zzcdtVar;
    }

    public final /* synthetic */ void zza() {
        this.zza.onAdClicked();
    }

    public final /* synthetic */ void zzb(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    public final /* synthetic */ void zzc() {
        this.zzc.zzb();
    }

    public final /* synthetic */ boolean zzd(View view, MotionEvent motionEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlt)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.zzr.zza(motionEvent);
        }
        this.zzj.zza();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    public final /* synthetic */ void zze(View view) {
        this.zzj.zza();
    }

    public final /* synthetic */ void zzf(zzcir zzcirVar, zzcir zzcirVar2, Map map) {
        this.zzi.zzn(zzcirVar);
    }

    public final /* synthetic */ zzdbr zzg() {
        return this.zzc;
    }

    public final /* synthetic */ zzdff zzh() {
        return this.zzm;
    }

    public final void zzi(final zzcir zzcirVar, boolean z2, zzbnq zzbnqVar, Bundle bundle) {
        zzayl zzaylVarZzb;
        zzbgb zzbgbVar = zzbgk.zzcL;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue()) {
            Z.t(bundle, zzdwm.RENDERING_CONFIGURE_WEBVIEW_START.zza());
        }
        zzcirVar.zzP().zzab(new com.google.android.gms.ads.internal.client.zza() { // from class: com.google.android.gms.internal.ads.zzdty
            @Override // com.google.android.gms.ads.internal.client.zza
            public final /* synthetic */ void onAdClicked() {
                this.zza.zza();
            }
        }, this.zzd, this.zze, new zzbmf() { // from class: com.google.android.gms.internal.ads.zzdtr
            @Override // com.google.android.gms.internal.ads.zzbmf
            public final /* synthetic */ void zzb(String str, String str2) {
                this.zza.zzb(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdts
            @Override // com.google.android.gms.ads.internal.overlay.zzad
            public final /* synthetic */ void zzl() {
                this.zza.zzc();
            }
        }, z2, zzbnqVar, this.zzj, new zzdtq(this), this.zzk, this.zzn, this.zzo, this.zzp, null, this.zzb, null, null, null, this.zzq, this.zzs, this.zzt, this.zzu);
        zzcirVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdtt
            @Override // android.view.View.OnTouchListener
            public final /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
                this.zza.zzd(view, motionEvent);
                return false;
            }
        });
        zzcirVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdtu
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                this.zza.zze(view);
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdo)).booleanValue() && (zzaylVarZzb = this.zzl.zzb()) != null) {
            zzaylVarZzb.zzh(zzcirVar.zzE());
        }
        zzdil zzdilVar = this.zzh;
        Executor executor = this.zzg;
        zzdilVar.zzq(zzcirVar, executor);
        zzdilVar.zzq(new zzbck() { // from class: com.google.android.gms.internal.ads.zzdtv
            @Override // com.google.android.gms.internal.ads.zzbck
            public final /* synthetic */ void zzdj(zzbcj zzbcjVar) {
                Rect rect = zzbcjVar.zzd;
                zzcirVar.zzP().zza(rect.left, rect.top, false);
            }
        }, executor);
        zzdilVar.zza(zzcirVar.zzE());
        zzcirVar.zzab("/trackActiveViewUnit", new zzbnn() { // from class: com.google.android.gms.internal.ads.zzdtw
            @Override // com.google.android.gms.internal.ads.zzbnn
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzf(zzcirVar, (zzcir) obj, map);
            }
        });
        this.zzi.zzo(zzcirVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue()) {
            Z.t(bundle, zzdwm.RENDERING_CONFIGURE_WEBVIEW_END.zza());
        }
    }
}
