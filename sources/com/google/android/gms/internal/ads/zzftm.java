package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzftm implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (zzftp.zzc != null) {
            zzftp.zzc.post(zzftp.zzk);
            zzftp.zzc.postDelayed(zzftp.zzl, 200L);
        }
    }
}
