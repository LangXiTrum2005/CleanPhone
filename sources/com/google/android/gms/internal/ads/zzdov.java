package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdov {
    private final zzcvr zza;
    private final zzddq zzb;
    private final zzcxa zzc;
    private final zzcxn zzd;
    private final zzcxz zze;
    private final zzdap zzf;
    private final Executor zzg;
    private final zzddm zzh;
    private final zzcnh zzi;
    private final com.google.android.gms.ads.internal.zzb zzj;
    private final zzbxu zzk;
    private final zzava zzl;
    private final zzdag zzm;
    private final zzebk zzn;
    private final zzfja zzo;
    private final zzdrw zzp;
    private final zzcmk zzq;
    private final zzdpb zzr;

    public zzdov(zzcvr zzcvrVar, zzcxa zzcxaVar, zzcxn zzcxnVar, zzcxz zzcxzVar, zzdap zzdapVar, Executor executor, zzddm zzddmVar, zzcnh zzcnhVar, com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzbxu zzbxuVar, zzava zzavaVar, zzdag zzdagVar, zzebk zzebkVar, zzfja zzfjaVar, zzdrw zzdrwVar, zzddq zzddqVar, zzcmk zzcmkVar, zzdpb zzdpbVar) {
        this.zza = zzcvrVar;
        this.zzc = zzcxaVar;
        this.zzd = zzcxnVar;
        this.zze = zzcxzVar;
        this.zzf = zzdapVar;
        this.zzg = executor;
        this.zzh = zzddmVar;
        this.zzi = zzcnhVar;
        this.zzj = zzbVar;
        this.zzk = zzbxuVar;
        this.zzl = zzavaVar;
        this.zzm = zzdagVar;
        this.zzn = zzebkVar;
        this.zzo = zzfjaVar;
        this.zzp = zzdrwVar;
        this.zzb = zzddqVar;
        this.zzq = zzcmkVar;
        this.zzr = zzdpbVar;
    }

    public static final AI zzj(zzcex zzcexVar, String str, String str2, final Bundle bundle) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcm)).booleanValue()) {
            AbstractC3888ke0.o(bundle, zzdre.RENDERING_WEBVIEW_LOAD_HTML_START.zza());
        }
        final zzcab zzcabVar = new zzcab();
        zzcexVar.zzN().zzC(new zzcgn() { // from class: com.google.android.gms.internal.ads.zzdom
            @Override // com.google.android.gms.internal.ads.zzcgn
            public final void zza(boolean z, int i, String str3, String str4) {
                zzcab zzcabVar2 = zzcabVar;
                if (z) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcm)).booleanValue()) {
                        AbstractC3888ke0.o(bundle, zzdre.RENDERING_WEBVIEW_LOAD_HTML_END.zza());
                    }
                    zzcabVar2.zzc(null);
                    return;
                }
                zzcabVar2.zzd(new Exception("Ad Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zzcexVar.zzae(str, str2, null);
        return zzcabVar;
    }

    public final /* synthetic */ void zzc() {
        this.zza.onAdClicked();
    }

    public final /* synthetic */ void zzd(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    public final /* synthetic */ void zze() {
        this.zzc.zzb();
    }

    public final /* synthetic */ void zzf(View view) {
        this.zzj.zza();
    }

    public final /* synthetic */ void zzg(zzcex zzcexVar, zzcex zzcexVar2, Map map) {
        this.zzi.zzh(zzcexVar);
    }

    public final /* synthetic */ boolean zzh(View view, MotionEvent motionEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjT)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.zzr.zzb(motionEvent);
        }
        this.zzj.zza();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    public final void zzi(final zzcex zzcexVar, boolean z, zzbjs zzbjsVar, Bundle bundle) {
        zzauv zzauvVarZzc;
        zzbcc zzbccVar = zzbcl.zzcm;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).booleanValue()) {
            AbstractC3888ke0.o(bundle, zzdre.RENDERING_CONFIGURE_WEBVIEW_START.zza());
        }
        zzcexVar.zzN().zzV(new com.google.android.gms.ads.internal.client.zza() { // from class: com.google.android.gms.internal.ads.zzdon
            @Override // com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                this.zza.zzc();
            }
        }, this.zzd, this.zze, new zzbih() { // from class: com.google.android.gms.internal.ads.zzdoo
            @Override // com.google.android.gms.internal.ads.zzbih
            public final void zzb(String str, String str2) {
                this.zza.zzd(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzac() { // from class: com.google.android.gms.internal.ads.zzdop
            @Override // com.google.android.gms.ads.internal.overlay.zzac
            public final void zzg() {
                this.zza.zze();
            }
        }, z, zzbjsVar, this.zzj, new zzdou(this), this.zzk, this.zzn, this.zzo, this.zzp, null, this.zzb, null, null, null, this.zzq);
        zzcexVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdoq
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.zza.zzh(view, motionEvent);
                return false;
            }
        });
        zzcexVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdor
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.zza.zzf(view);
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcK)).booleanValue() && (zzauvVarZzc = this.zzl.zzc()) != null) {
            zzauvVarZzc.zzo(zzcexVar.zzF());
        }
        this.zzh.zzo(zzcexVar, this.zzg);
        this.zzh.zzo(new zzayk() { // from class: com.google.android.gms.internal.ads.zzdos
            @Override // com.google.android.gms.internal.ads.zzayk
            public final void zzdn(zzayj zzayjVar) {
                zzcgp zzcgpVarZzN = zzcexVar.zzN();
                Rect rect = zzayjVar.zzd;
                zzcgpVarZzN.zzr(rect.left, rect.top, false);
            }
        }, this.zzg);
        this.zzh.zza(zzcexVar.zzF());
        zzcexVar.zzag("/trackActiveViewUnit", new zzbjp() { // from class: com.google.android.gms.internal.ads.zzdot
            @Override // com.google.android.gms.internal.ads.zzbjp
            public final void zza(Object obj, Map map) {
                this.zza.zzg(zzcexVar, (zzcex) obj, map);
            }
        });
        this.zzi.zzi(zzcexVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).booleanValue()) {
            AbstractC3888ke0.o(bundle, zzdre.RENDERING_CONFIGURE_WEBVIEW_END.zza());
        }
    }
}
