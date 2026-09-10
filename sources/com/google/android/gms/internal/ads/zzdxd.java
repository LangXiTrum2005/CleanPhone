package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdxd {
    final /* synthetic */ zzdxe zza;
    private final Map zzb;

    public zzdxd(zzdxe zzdxeVar) {
        Objects.requireNonNull(zzdxeVar);
        this.zza = zzdxeVar;
        this.zzb = new ConcurrentHashMap();
    }

    public final zzdxd zza(zzfhu zzfhuVar) {
        zzc("gqi", zzfhuVar.zzb);
        return this;
    }

    public final zzdxd zzb(zzfhr zzfhrVar) {
        zzc("aai", zzfhrVar.zzw);
        zzc("request_id", zzfhrVar.zzan);
        zzc("ad_format", zzfhr.zza(zzfhrVar.zzb));
        return this;
    }

    public final zzdxd zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final void zzd() {
        this.zza.zzd().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzi();
            }
        });
    }

    public final com.google.android.gms.ads.internal.util.client.zzt zze() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpD)).booleanValue()) {
            zzd();
            return com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
        }
        zzdxe zzdxeVar = this.zza;
        return zzdxeVar.zzc().zzf(this.zzb);
    }

    public final void zzf() {
        this.zza.zzd().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxa
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzj();
            }
        });
    }

    public final String zzg() {
        return this.zza.zzc().zzc(this.zzb);
    }

    public final void zzh() {
        this.zza.zzd().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzk();
            }
        });
    }

    public final /* synthetic */ void zzi() {
        this.zza.zzc().zzb(this.zzb);
    }

    public final /* synthetic */ void zzj() {
        this.zza.zzc().zzg(this.zzb);
    }

    public final /* synthetic */ void zzk() {
        this.zza.zzc().zze(this.zzb);
    }

    public final /* synthetic */ zzdxd zzl() {
        this.zzb.putAll(this.zza.zze());
        return this;
    }
}
