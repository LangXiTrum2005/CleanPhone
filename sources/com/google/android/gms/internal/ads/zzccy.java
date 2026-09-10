package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
final class zzccy implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ zzcde zze;

    public zzccy(zzcde zzcdeVar, String str, String str2, int i, int i2, boolean z) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = zzcdeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapV = AbstractC3950lJ.v(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        mapV.put("src", this.zza);
        mapV.put("cachedSrc", this.zzb);
        mapV.put("bytesLoaded", Integer.toString(this.zzc));
        mapV.put("totalBytes", Integer.toString(this.zzd));
        mapV.put("cacheReady", "0");
        zzcde.zze(this.zze, "onPrecacheEvent", mapV);
    }
}
