package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcgr implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ zzcgx zze;

    public zzcgr(zzcgx zzcgxVar, String str, String str2, int i2, int i3, boolean z2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i2;
        this.zzd = i3;
        Objects.requireNonNull(zzcgxVar);
        this.zze = zzcgxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapS = androidx.media3.extractor.text.ttml.a.s("event", "precacheProgress");
        mapS.put("src", this.zza);
        mapS.put("cachedSrc", this.zzb);
        mapS.put("bytesLoaded", Integer.toString(this.zzc));
        mapS.put("totalBytes", Integer.toString(this.zzd));
        mapS.put("cacheReady", "0");
        this.zze.zzw("onPrecacheEvent", mapS);
    }
}
