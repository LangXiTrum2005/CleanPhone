package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcgt implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ int zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ zzcgx zzj;

    public zzcgt(zzcgx zzcgxVar, String str, String str2, int i2, int i3, long j, long j2, boolean z2, int i4, int i5) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = j;
        this.zzf = j2;
        this.zzg = z2;
        this.zzh = i4;
        this.zzi = i5;
        Objects.requireNonNull(zzcgxVar);
        this.zzj = zzcgxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapS = androidx.media3.extractor.text.ttml.a.s("event", "precacheProgress");
        mapS.put("src", this.zza);
        mapS.put("cachedSrc", this.zzb);
        mapS.put("bytesLoaded", Integer.toString(this.zzc));
        mapS.put("totalBytes", Integer.toString(this.zzd));
        mapS.put("bufferedDuration", Long.toString(this.zze));
        mapS.put("totalDuration", Long.toString(this.zzf));
        mapS.put("cacheReady", true != this.zzg ? "0" : "1");
        mapS.put("playerCount", Integer.toString(this.zzh));
        mapS.put("playerPreparedCount", Integer.toString(this.zzi));
        this.zzj.zzw("onPrecacheEvent", mapS);
    }
}
