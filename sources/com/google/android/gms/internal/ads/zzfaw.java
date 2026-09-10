package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfaw implements zzezx {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzccs zzg;

    public zzfaw(zzccs zzccsVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i2, boolean z2, boolean z3) {
        this.zzg = zzccsVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i2;
        this.zze = z2;
        this.zzf = z3;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        zzgye zzgyeVarZzw = zzgye.zzw(this.zzg.zza(this.zza, this.zzd));
        zzgpr zzgprVar = new zzgpr() { // from class: com.google.android.gms.internal.ads.zzfav
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((AdvertisingIdClient.Info) obj);
            }
        };
        Executor executor = this.zzc;
        return (zzgye) zzgym.zzg((zzgye) zzgym.zzi((zzgye) zzgym.zzk(zzgyeVarZzw, zzgprVar, executor), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbA)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzgpr() { // from class: com.google.android.gms.internal.ads.zzfau
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzd((Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 40;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final /* synthetic */ zzfax zzc(AdvertisingIdClient.Info info) {
        zzfzf zzfzfVar = new zzfzf();
        if (this.zze) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdV)).booleanValue()) {
                Context context = this.zza;
                zzfzj zzfzjVarZzh = zzfzj.zzh(context);
                Objects.requireNonNull(info);
                String id = info.getId();
                Objects.requireNonNull(id);
                zzfzfVar = zzfzjVarZzh.zzj(id, context.getPackageName(), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzea)).longValue(), this.zzf);
            }
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdU)).booleanValue()) {
                try {
                    Context context2 = this.zza;
                    zzfzj zzfzjVarZzh2 = zzfzj.zzh(context2);
                    Objects.requireNonNull(info);
                    String id2 = info.getId();
                    Objects.requireNonNull(id2);
                    zzfzfVar = zzfzjVarZzh2.zzj(id2, context2.getPackageName(), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzea)).longValue(), this.zzf);
                } catch (IOException | IllegalArgumentException e2) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "AdIdInfoSignalSource.getPaidV1");
                    zzfzfVar = new zzfzf();
                }
            }
        }
        return new zzfax(info, null, zzfzfVar);
    }

    public final /* synthetic */ zzfax zzd(Throwable th) {
        com.google.android.gms.ads.internal.client.zzbb.zza();
        ContentResolver contentResolver = this.zza.getContentResolver();
        return new zzfax(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzfzf());
    }
}
