package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import com.google.common.util.concurrent.ListenableFuture;
import com.smartdigimkt.f3.b;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcra {
    zzbxx zza;
    zzbxx zzb;
    private final Context zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzejc zze;
    private final zzduf zzf;
    private final zzgyw zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    public zzcra(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzejc zzejcVar, zzduf zzdufVar, zzgyw zzgywVar, zzgyw zzgywVar2, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = zzgVar;
        this.zze = zzejcVar;
        this.zzf = zzdufVar;
        this.zzg = zzgywVar;
        this.zzh = zzgywVar2;
        this.zzi = scheduledExecutorService;
    }

    public static boolean zzc(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlA));
    }

    private final ListenableFuture zzk(final String str, final InputEvent inputEvent, Random random) {
        try {
            if (!str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlA)) || this.zzd.zzx()) {
                return zzgym.zza(str);
            }
            final Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlB), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (inputEvent != null) {
                return (zzgye) zzgym.zzh((zzgye) zzgym.zzj(zzgye.zzw(this.zze.zza()), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzcqu
                    @Override // com.google.android.gms.internal.ads.zzgxu
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        return this.zza.zze(builderBuildUpon, str, inputEvent, (Integer) obj);
                    }
                }, this.zzh), Throwable.class, new zzgxu() { // from class: com.google.android.gms.internal.ads.zzcqv
                    @Override // com.google.android.gms.internal.ads.zzgxu
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        return this.zza.zzf(builderBuildUpon, (Throwable) obj);
                    }
                }, this.zzg);
            }
            builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlC), "11");
            return zzgym.zza(builderBuildUpon.toString());
        } catch (Exception e2) {
            return zzgym.zzc(e2);
        }
    }

    public final void zza(String str, zzfpi zzfpiVar, Random random, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzgym.zzr(zzgym.zzi(zzk(str, this.zzf.zzb(), random), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlG)).intValue(), TimeUnit.MILLISECONDS, this.zzi), new zzcqt(this, zzfpiVar, str, zzvVar), this.zzg);
    }

    public final ListenableFuture zzb(final String str, Random random) {
        return TextUtils.isEmpty(str) ? zzgym.zza(str) : zzgym.zzh(zzk(str, this.zzf.zzb(), random), Throwable.class, new zzgxu() { // from class: com.google.android.gms.internal.ads.zzcqz
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzd(str, (Throwable) obj);
            }
        }, this.zzg);
    }

    public final /* synthetic */ ListenableFuture zzd(String str, final Throwable th) {
        this.zzg.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzh(th);
            }
        });
        return zzgym.zza(str);
    }

    public final /* synthetic */ ListenableFuture zze(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlC), "10");
            return zzgym.zza(builder.toString());
        }
        Uri.Builder builderBuildUpon = builder.build().buildUpon();
        builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlD), "1");
        builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlC), "12");
        if (str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlE))) {
            builderBuildUpon.authority((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlF));
        }
        return (zzgye) zzgym.zzj(zzgye.zzw(this.zze.zzb(builderBuildUpon.build(), inputEvent)), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzcqw
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlC);
                Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, "12");
                return zzgym.zza(builder2.toString());
            }
        }, this.zzh);
    }

    public final /* synthetic */ ListenableFuture zzf(Uri.Builder builder, final Throwable th) {
        this.zzg.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg(th);
            }
        });
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlC), b.j);
        return zzgym.zza(builder.toString());
    }

    public final /* synthetic */ void zzg(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlH)).booleanValue()) {
            zzbxx zzbxxVarZzc = zzbxv.zzc(this.zzc);
            this.zzb = zzbxxVarZzc;
            zzbxxVarZzc.zzh(th, "AttributionReporting");
        } else {
            zzbxx zzbxxVarZza = zzbxv.zza(this.zzc);
            this.zza = zzbxxVarZza;
            zzbxxVarZza.zzh(th, "AttributionReportingSampled");
        }
    }

    public final /* synthetic */ void zzh(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlH)).booleanValue()) {
            zzbxx zzbxxVarZzc = zzbxv.zzc(this.zzc);
            this.zzb = zzbxxVarZzc;
            zzbxxVarZzc.zzh(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
        } else {
            zzbxx zzbxxVarZza = zzbxv.zza(this.zzc);
            this.zza = zzbxxVarZza;
            zzbxxVarZza.zzh(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
        }
    }

    public final /* synthetic */ Context zzi() {
        return this.zzc;
    }

    public final /* synthetic */ zzgyw zzj() {
        return this.zzg;
    }
}
