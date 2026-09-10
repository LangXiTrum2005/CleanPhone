package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.Z;
import com.google.common.util.concurrent.ListenableFuture;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzemy implements zzgxu {
    private final zzfmu zza;
    private final zzdam zzb;
    private final zzfpe zzc;
    private final zzfpi zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcvn zzg;
    private final zzemr zzh;
    private final zzejl zzi;
    private final Context zzj;
    private final zzfno zzk;
    private final zzemb zzl;
    private final zzdwy zzm;

    public zzemy(Context context, zzfmu zzfmuVar, zzemr zzemrVar, zzdam zzdamVar, zzfpe zzfpeVar, zzfpi zzfpiVar, zzcvn zzcvnVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzejl zzejlVar, zzfno zzfnoVar, zzemb zzembVar, zzdwy zzdwyVar) {
        this.zzj = context;
        this.zza = zzfmuVar;
        this.zzh = zzemrVar;
        this.zzb = zzdamVar;
        this.zzc = zzfpeVar;
        this.zzd = zzfpiVar;
        this.zzg = zzcvnVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzejlVar;
        this.zzk = zzfnoVar;
        this.zzl = zzembVar;
        this.zzm = zzdwyVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    public static String zzb(zzfic zzficVar) {
        String strG = "No fill.";
        String str = true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgv)).booleanValue() ? "No ad config." : "No fill.";
        zzfhu zzfhuVar = zzficVar.zzb.zzb;
        int i2 = zzfhuVar.zzf;
        if (i2 == 0) {
            strG = str;
        } else if (i2 < 200 || i2 >= 300) {
            strG = (i2 < 300 || i2 >= 400) ? androidx.datastore.preferences.protobuf.a.g(i2, "Received error HTTP response code: ", new StringBuilder(String.valueOf(i2).length() + 35)) : "No location header to follow redirect or too many redirects.";
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgu)).booleanValue()) {
                strG = str;
            }
        }
        zzfht zzfhtVar = zzfhuVar.zzj;
        return zzfhtVar != null ? zzfhtVar.zza() : strG;
    }

    @Override // com.google.android.gms.internal.ads.zzgxu
    public final /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        int i2;
        Bundle bundle;
        final zzfic zzficVar = (zzfic) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcI)).booleanValue() && (bundle = zzficVar.zzb.zzd) != null) {
            this.zzm.zze().putAll(bundle);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcJ)).booleanValue()) {
            Z.t(this.zzm.zze(), zzdwm.RENDERING_START.zza());
        }
        String strZzb = zzb(zzficVar);
        zzejl zzejlVar = this.zzi;
        zzfib zzfibVar = zzficVar.zzb;
        zzfhu zzfhuVar = zzfibVar.zzb;
        zzejlVar.zza(zzfhuVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjz)).booleanValue() && (i2 = zzfhuVar.zzf) != 0 && (i2 < 200 || i2 >= 300)) {
            return zzgym.zzc(new zzemv(3, strZzb));
        }
        String str = zzfhuVar.zzq;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzet)).booleanValue() || TextUtils.isEmpty(str)) {
            for (zzfhr zzfhrVar : zzfibVar.zza) {
                zzejlVar.zzb(zzfhrVar);
                Iterator it = zzfhrVar.zza.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzejlVar.zze(zzfhrVar, 0L, zzfjm.zzd(1, null, null));
                        break;
                    }
                    zzejg zzejgVarZza = this.zzg.zza(zzfhrVar.zzb, (String) it.next());
                    if (zzejgVarZza != null && zzejgVarZza.zza(zzficVar, zzfhrVar)) {
                        break;
                    }
                }
            }
        } else {
            zzejlVar.zzc(str, zzfibVar.zza);
        }
        zzdam zzdamVar = this.zzb;
        zzcre zzcreVar = new zzcre(zzficVar, this.zzd, this.zzc);
        Executor executor = this.zze;
        zzdamVar.zzq(zzcreVar, executor);
        if (zzfhuVar.zzr > 1) {
            return this.zzl.zza(zzficVar);
        }
        String strZzb2 = zzb(zzficVar);
        zzfmu zzfmuVar = this.zza;
        zzfmo zzfmoVar = zzfmo.RENDER_CONFIG_INIT;
        Objects.requireNonNull(zzfmuVar);
        zzfmb zzfmbVarZzi = zzfmf.zza(zzgym.zzc(new zzemv(3, strZzb2)), zzfmoVar, zzfmuVar).zzi();
        final zzemr zzemrVar = this.zzh;
        zzemrVar.zza();
        int i3 = 0;
        for (final zzfhr zzfhrVar2 : zzfibVar.zza) {
            for (String str2 : zzfhrVar2.zza) {
                final zzejg zzejgVarZza2 = this.zzg.zza(zzfhrVar2.zzb, str2);
                if (zzejgVarZza2 != null && zzejgVarZza2.zza(zzficVar, zzfhrVar2)) {
                    zzfml zzfmlVarZza = zzfmuVar.zza(zzfmo.RENDER_CONFIG_WATERFALL, zzfmbVarZzi);
                    StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 15 + String.valueOf(str2).length());
                    sb.append("render-config-");
                    sb.append(i3);
                    sb.append(TokenBuilder.TOKEN_DELIMITER);
                    sb.append(str2);
                    zzfmbVarZzi = zzfmlVarZza.zza(sb.toString()).zzg(Throwable.class, new zzgxu() { // from class: com.google.android.gms.internal.ads.zzemx
                        @Override // com.google.android.gms.internal.ads.zzgxu
                        public final /* synthetic */ ListenableFuture zza(Object obj2) {
                            return this.zza.zzc(zzfhrVar2, zzficVar, zzejgVarZza2, (Throwable) obj2);
                        }
                    }).zzi();
                    break;
                }
            }
            i3++;
        }
        zzfmbVarZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzemrVar.zzb();
            }
        }, executor);
        return zzfmbVarZzi;
    }

    public final /* synthetic */ ListenableFuture zzc(zzfhr zzfhrVar, zzfic zzficVar, zzejg zzejgVar, Throwable th) {
        zzfne zzfneVarZzn = zzfne.zzn(this.zzj, 12);
        zzfneVarZzn.zzi(zzfhrVar.zzE);
        zzfneVarZzn.zza();
        ListenableFuture listenableFutureZzi = zzgym.zzi(zzejgVar.zzb(zzficVar, zzfhrVar), zzfhrVar.zzR, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zze(zzficVar, zzfhrVar, listenableFutureZzi, this.zzc);
        zzfnn.zzd(listenableFutureZzi, this.zzk, zzfneVarZzn);
        return listenableFutureZzi;
    }
}
