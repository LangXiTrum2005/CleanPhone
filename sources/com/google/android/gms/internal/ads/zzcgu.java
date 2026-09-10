package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcgu implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ zzcgx zzd;

    public zzcgu(zzcgx zzcgxVar, String str, String str2, int i2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i2;
        Objects.requireNonNull(zzcgxVar);
        this.zzd = zzcgxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapS = androidx.media3.extractor.text.ttml.a.s("event", "precacheComplete");
        mapS.put("src", this.zza);
        mapS.put("cachedSrc", this.zzb);
        mapS.put("totalBytes", Integer.toString(this.zzc));
        this.zzd.zzw("onPrecacheEvent", mapS);
    }
}
