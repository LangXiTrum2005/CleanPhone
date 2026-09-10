package com.google.android.gms.ads.internal.util.client;

/* JADX INFO: loaded from: classes2.dex */
final class zzd extends Thread {
    final /* synthetic */ String zza;

    public zzd(zzf zzfVar, String str) {
        this.zza = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzu(null).zza(this.zza);
    }
}
