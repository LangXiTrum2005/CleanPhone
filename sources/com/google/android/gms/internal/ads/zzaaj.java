package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
final class zzaaj {
    private final Handler zza;
    private final zzaal zzb;
    private boolean zzc;

    public zzaaj(Handler handler, zzaal zzaalVar) {
        this.zza = handler;
        this.zzb = zzaalVar;
    }

    public final void zza() {
        this.zzc = true;
    }

    public final /* synthetic */ Handler zzb() {
        return this.zza;
    }

    public final /* synthetic */ zzaal zzc() {
        return this.zzb;
    }

    public final /* synthetic */ boolean zzd() {
        return this.zzc;
    }
}
