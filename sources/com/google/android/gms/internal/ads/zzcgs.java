package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcgs implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ long zzg;
    final /* synthetic */ boolean zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ int zzj;
    final /* synthetic */ zzcgx zzk;

    public zzcgs(zzcgx zzcgxVar, String str, String str2, long j, long j2, long j3, long j4, long j5, boolean z2, int i2, int i3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = j3;
        this.zzf = j4;
        this.zzg = j5;
        this.zzh = z2;
        this.zzi = i2;
        this.zzj = i3;
        Objects.requireNonNull(zzcgxVar);
        this.zzk = zzcgxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapS = androidx.media3.extractor.text.ttml.a.s("event", "precacheProgress");
        mapS.put("src", this.zza);
        mapS.put("cachedSrc", this.zzb);
        mapS.put("bufferedDuration", Long.toString(this.zzc));
        mapS.put("totalDuration", Long.toString(this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcu)).booleanValue()) {
            mapS.put("qoeLoadedBytes", Long.toString(this.zze));
            mapS.put("qoeCachedBytes", Long.toString(this.zzf));
            mapS.put("totalBytes", Long.toString(this.zzg));
            mapS.put("reportTime", Long.toString(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
        }
        mapS.put("cacheReady", true != this.zzh ? "0" : "1");
        mapS.put("playerCount", Integer.toString(this.zzi));
        mapS.put("playerPreparedCount", Integer.toString(this.zzj));
        this.zzk.zzw("onPrecacheEvent", mapS);
    }
}
