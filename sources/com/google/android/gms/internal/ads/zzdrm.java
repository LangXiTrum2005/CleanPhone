package com.google.android.gms.internal.ads;

import android.content.Context;
import com.applovin.impl.Z;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdrm {
    private final zzfik zza;
    private final Executor zzb;
    private final zzdua zzc;
    private final zzdsv zzd;
    private final Context zze;
    private final zzdxe zzf;
    private final zzfpi zzg;
    private final zzehu zzh;
    private final zzdwy zzi;
    private final zzdyh zzj;

    public zzdrm(zzfik zzfikVar, Executor executor, zzdua zzduaVar, Context context, zzdxe zzdxeVar, zzfpi zzfpiVar, zzehu zzehuVar, zzdsv zzdsvVar, zzdwy zzdwyVar, zzdyh zzdyhVar) {
        this.zza = zzfikVar;
        this.zzb = executor;
        this.zzc = zzduaVar;
        this.zze = context;
        this.zzf = zzdxeVar;
        this.zzg = zzfpiVar;
        this.zzh = zzehuVar;
        this.zzd = zzdsvVar;
        this.zzi = zzdwyVar;
        this.zzj = zzdyhVar;
    }

    private final void zzh(zzcir zzcirVar, zzcds zzcdsVar) {
        com.google.android.gms.ads.internal.client.zzga zzgaVar = this.zza.zza;
        if (zzgaVar != null && zzcirVar.zzh() != null) {
            zzcirVar.zzh().zzc(zzgaVar);
        }
        zzcdsVar.zzb();
    }

    private final void zzi(zzcir zzcirVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcbk zzcbkVar) {
        zzdyh zzdyhVar;
        zzj(zzcirVar);
        zzcirVar.zzab("/video", zzbnm.zzl);
        zzcirVar.zzab("/videoMeta", zzbnm.zzm);
        zzcirVar.zzab("/precache", new zzcgy());
        zzcirVar.zzab("/delayPageLoaded", zzbnm.zzp);
        zzcirVar.zzab("/instrument", zzbnm.zzn);
        zzcirVar.zzab("/log", zzbnm.zzg);
        zzcirVar.zzab("/click", zzbnm.zzb(null, null));
        if (this.zza.zzb != null) {
            zzcirVar.zzP().zzT(true);
            zzcirVar.zzab("/open", new zzboa(true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpa)).booleanValue() ? null : zzbVar, null, null, null, null, null));
        } else {
            zzcirVar.zzP().zzT(false);
        }
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzcirVar.getContext())) {
            Map map = new HashMap();
            if (zzcirVar.zzC() != null) {
                map = zzcirVar.zzC().zzaw;
            }
            zzcirVar.zzab("/logScionEvent", new zzbnt(zzcirVar.getContext(), map));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpa)).booleanValue()) {
            zzcirVar.zzP().zzi(zzbVar);
            zzcirVar.zzP().zzj(zzcbkVar);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziK)).booleanValue() || (zzdyhVar = this.zzj) == null) {
            return;
        }
        zzcirVar.zzab("/onDeviceStorageEvent", new zzbnv(zzdyhVar));
    }

    private static final void zzj(zzcir zzcirVar) {
        zzcirVar.zzab("/videoClicked", zzbnm.zzh);
        zzcirVar.zzP().zzR(true);
        zzcirVar.zzab("/getNativeAdViewSignals", zzbnm.zzs);
        zzcirVar.zzab("/getNativeClickMeta", zzbnm.zzt);
    }

    public final ListenableFuture zza(final JSONObject jSONObject, final com.google.android.gms.ads.internal.zzb zzbVar, final zzcbk zzcbkVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcP)).booleanValue()) {
            Z.t(this.zzi.zze(), zzdwm.NATIVE_ASSETS_LOADING_VIDEO_START.zza());
        }
        ListenableFuture listenableFutureZza = zzgym.zza(null);
        zzgxu zzgxuVar = new zzgxu() { // from class: com.google.android.gms.internal.ads.zzdrh
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zze(zzbVar, zzcbkVar, obj);
            }
        };
        Executor executor = this.zzb;
        return zzgym.zzj(zzgym.zzj(listenableFutureZza, zzgxuVar, executor), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzdrl
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(jSONObject, (zzcir) obj);
            }
        }, executor);
    }

    public final ListenableFuture zzb(final String str, final String str2, final zzfhr zzfhrVar, final zzfhu zzfhuVar, final com.google.android.gms.ads.internal.client.zzr zzrVar, final com.google.android.gms.ads.internal.zzb zzbVar, final zzcbk zzcbkVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcP)).booleanValue()) {
            Z.t(this.zzi.zze(), zzdwm.NATIVE_ASSETS_LOADING_VIDEO_COMPOSITION_START.zza());
        }
        return zzgym.zzj(zzgym.zza(null), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzdrg
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzd(zzrVar, zzfhrVar, zzfhuVar, zzbVar, zzcbkVar, str, str2, obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ ListenableFuture zzc(JSONObject jSONObject, final zzcir zzcirVar) {
        zzbpy zzbpyVar = this.zza.zzb;
        final zzcds zzcdsVarZza = zzcds.zza(zzcirVar);
        if (zzbpyVar != null) {
            zzcirVar.zzaf(zzclb.zze());
        } else {
            zzcirVar.zzaf(zzclb.zzd());
        }
        zzcirVar.zzP().zzG(new zzckn() { // from class: com.google.android.gms.internal.ads.zzdrk
            @Override // com.google.android.gms.internal.ads.zzckn
            public final /* synthetic */ void zza(boolean z2, int i2, String str, String str2) {
                this.zza.zzg(zzcirVar, zzcdsVarZza, z2, i2, str, str2);
            }
        });
        zzcirVar.zzb("google.afma.nativeAds.renderVideo", jSONObject);
        return zzcdsVarZza;
    }

    public final /* synthetic */ ListenableFuture zzd(com.google.android.gms.ads.internal.client.zzr zzrVar, zzfhr zzfhrVar, zzfhu zzfhuVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcbk zzcbkVar, String str, String str2, Object obj) throws zzcjg {
        final zzcir zzcirVarZza = this.zzc.zza(zzrVar, zzfhrVar, zzfhuVar);
        final zzcds zzcdsVarZza = zzcds.zza(zzcirVarZza);
        if (this.zza.zzb != null) {
            zzi(zzcirVarZza, zzbVar, zzcbkVar);
            zzcirVarZza.zzaf(zzclb.zze());
        } else {
            zzdss zzdssVarZza = this.zzd.zza();
            zzckp zzckpVarZzP = zzcirVarZza.zzP();
            zzbgb zzbgbVar = zzbgk.zzpa;
            zzckpVarZzP.zzab(zzdssVarZza, zzdssVarZza, zzdssVarZza, zzdssVarZza, zzdssVarZza, false, null, !((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue() ? new com.google.android.gms.ads.internal.zzb(this.zze, null, null) : zzbVar, null, true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue() ? null : zzcbkVar, this.zzh, this.zzg, this.zzf, null, zzdssVarZza, null, null, null, null, this.zzj, null, null);
            zzj(zzcirVarZza);
        }
        zzcirVarZza.zzP().zzG(new zzckn() { // from class: com.google.android.gms.internal.ads.zzdrj
            @Override // com.google.android.gms.internal.ads.zzckn
            public final /* synthetic */ void zza(boolean z2, int i2, String str3, String str4) {
                this.zza.zzf(zzcirVarZza, zzcdsVarZza, z2, i2, str3, str4);
            }
        });
        zzcirVarZza.zzau(str, str2, null);
        return zzcdsVarZza;
    }

    public final /* synthetic */ ListenableFuture zze(com.google.android.gms.ads.internal.zzb zzbVar, zzcbk zzcbkVar, Object obj) throws zzcjg {
        zzcir zzcirVarZza = this.zzc.zza(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        final zzcds zzcdsVarZza = zzcds.zza(zzcirVarZza);
        zzi(zzcirVarZza, zzbVar, zzcbkVar);
        zzcirVarZza.zzP().zzH(new zzcko() { // from class: com.google.android.gms.internal.ads.zzdri
            @Override // com.google.android.gms.internal.ads.zzcko
            public final /* synthetic */ void zza() {
                zzcdsVarZza.zzb();
            }
        });
        zzcirVarZza.loadUrl((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeD));
        return zzcdsVarZza;
    }

    public final /* synthetic */ void zzf(zzcir zzcirVar, zzcds zzcdsVar, boolean z2, int i2, String str, String str2) {
        if (z2) {
            com.google.android.gms.ads.internal.client.zzga zzgaVar = this.zza.zza;
            if (zzgaVar != null && zzcirVar.zzh() != null) {
                zzcirVar.zzh().zzc(zzgaVar);
            }
            zzcdsVar.zzb();
            return;
        }
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Html video Web View failed to load. Error code: ");
        sb.append(i2);
        sb.append(", Description: ");
        sb.append(str);
        zzcdsVar.zzd(new zzemv(1, android.support.v4.media.a.r(sb, ", Failing URL: ", str2)));
    }

    public final /* synthetic */ void zzg(zzcir zzcirVar, zzcds zzcdsVar, boolean z2, int i2, String str, String str2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeL)).booleanValue()) {
            zzh(zzcirVar, zzcdsVar);
            return;
        }
        if (z2) {
            zzh(zzcirVar, zzcdsVar);
            return;
        }
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(length + 64 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Native Video WebView failed to load. Error code: ");
        sb.append(i2);
        sb.append(", Description: ");
        sb.append(str);
        zzcdsVar.zzd(new zzemv(1, android.support.v4.media.a.r(sb, ", Failing URL: ", str2)));
    }
}
