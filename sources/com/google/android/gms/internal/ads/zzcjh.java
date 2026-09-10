package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzcjh {
    public static final zzcir zza(final Context context, final zzclb zzclbVar, final String str, final boolean z2, final boolean z3, final zzayq zzayqVar, final zzbhr zzbhrVar, final VersionInfoParcel versionInfoParcel, zzbgz zzbgzVar, final com.google.android.gms.ads.internal.zzn zznVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzbfj zzbfjVar, final zzfhr zzfhrVar, final zzfhu zzfhuVar, final zzeif zzeifVar, final zzfio zzfioVar, final zzdxe zzdxeVar) throws zzcjg {
        zzbgk.zza(context);
        try {
            final zzbgz zzbgzVar2 = null;
            zzgqs zzgqsVar = new zzgqs(context, zzclbVar, str, z2, z3, zzayqVar, zzbhrVar, versionInfoParcel, zzbgzVar2, zznVar, zzaVar, zzbfjVar, zzfhrVar, zzfhuVar, zzfioVar, zzdxeVar, zzeifVar) { // from class: com.google.android.gms.internal.ads.zzcjd
                private final /* synthetic */ Context zza;
                private final /* synthetic */ zzclb zzb;
                private final /* synthetic */ String zzc;
                private final /* synthetic */ boolean zzd;
                private final /* synthetic */ boolean zze;
                private final /* synthetic */ zzayq zzf;
                private final /* synthetic */ zzbhr zzg;
                private final /* synthetic */ VersionInfoParcel zzh;
                private final /* synthetic */ com.google.android.gms.ads.internal.zzn zzi;
                private final /* synthetic */ com.google.android.gms.ads.internal.zza zzj;
                private final /* synthetic */ zzbfj zzk;
                private final /* synthetic */ zzfhr zzl;
                private final /* synthetic */ zzfhu zzm;
                private final /* synthetic */ zzfio zzn;
                private final /* synthetic */ zzdxe zzo;
                private final /* synthetic */ zzeif zzp;

                {
                    this.zzi = zznVar;
                    this.zzj = zzaVar;
                    this.zzk = zzbfjVar;
                    this.zzl = zzfhrVar;
                    this.zzm = zzfhuVar;
                    this.zzn = zzfioVar;
                    this.zzo = zzdxeVar;
                    this.zzp = zzeifVar;
                }

                @Override // com.google.android.gms.internal.ads.zzgqs
                public final /* synthetic */ Object zza() {
                    zzclb zzclbVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z4 = this.zzd;
                    boolean z5 = this.zze;
                    zzeif zzeifVar2 = this.zzp;
                    zzdxe zzdxeVar2 = this.zzo;
                    com.google.android.gms.ads.internal.zzn zznVar2 = this.zzi;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    zzbfj zzbfjVar2 = this.zzk;
                    zzfhr zzfhrVar2 = this.zzl;
                    zzfhu zzfhuVar2 = this.zzm;
                    zzfio zzfioVar2 = this.zzn;
                    zzayq zzayqVar2 = this.zzf;
                    zzbhr zzbhrVar2 = this.zzg;
                    VersionInfoParcel versionInfoParcel2 = this.zzh;
                    Context context2 = this.zza;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i2 = zzcju.zza;
                        zzcjn zzcjnVar = new zzcjn(new zzcju(new zzckt(context2), zzclbVar2, str2, z4, z5, zzayqVar2, zzbhrVar2, versionInfoParcel2, null, zznVar2, zzaVar2, zzbfjVar2, zzfhrVar2, zzfhuVar2, zzfioVar2), zzdxeVar2);
                        zzcjnVar.setWebViewClient(com.google.android.gms.ads.internal.zzt.zzf().zzb(zzcjnVar, zzbfjVar2, z5, zzeifVar2));
                        zzcjnVar.setWebChromeClient(new zzciq(zzcjnVar));
                        return zzcjnVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return (zzcir) zzgqsVar.zza();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            throw new zzcjg("Webview initialization failed.", th);
        }
    }

    public static final ListenableFuture zzb(final Context context, final VersionInfoParcel versionInfoParcel, final String str, final zzayq zzayqVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzeif zzeifVar, final zzfio zzfioVar, final zzdxe zzdxeVar) {
        return zzgym.zzf(new zzgxt() { // from class: com.google.android.gms.internal.ads.zzcjf
            @Override // com.google.android.gms.internal.ads.zzgxt
            public final /* synthetic */ ListenableFuture zza() throws zzcjg {
                com.google.android.gms.ads.internal.zzt.zzd();
                Context context2 = context;
                zzclb zzclbVarZzb = zzclb.zzb();
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                zzbfj zzbfjVarZza = zzbfj.zza();
                zzeif zzeifVar2 = zzeifVar;
                zzfio zzfioVar2 = zzfioVar;
                zzdxe zzdxeVar2 = zzdxeVar;
                zzcir zzcirVarZza = zzcjh.zza(context2, zzclbVarZzb, "", false, false, zzayqVar, null, versionInfoParcel, null, null, zzaVar2, zzbfjVarZza, null, null, zzeifVar2, zzfioVar2, zzdxeVar2);
                final zzcds zzcdsVarZza = zzcds.zza(zzcirVarZza);
                zzcirVarZza.zzP().zzG(new zzckn() { // from class: com.google.android.gms.internal.ads.zzcje
                    @Override // com.google.android.gms.internal.ads.zzckn
                    public final /* synthetic */ void zza(boolean z2, int i2, String str2, String str3) {
                        zzcdsVarZza.zzb();
                    }
                });
                zzcirVarZza.loadUrl(str);
                return zzcdsVarZza;
            }
        }, zzcdo.zzf);
    }
}
