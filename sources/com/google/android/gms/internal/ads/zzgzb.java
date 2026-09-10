package com.google.android.gms.internal.ads;

import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes4.dex */
final class zzgzb extends zzgxf.zzf implements Runnable {
    private final Runnable zza;

    public zzgzb(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zzb(th);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxf
    public final String zzd() {
        String string = this.zza.toString();
        return android.support.v4.media.a.s(new StringBuilder(string.length() + 7), "task=[", string, d9.i.f24752e);
    }
}
