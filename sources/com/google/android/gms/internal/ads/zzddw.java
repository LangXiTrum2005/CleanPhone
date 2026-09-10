package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzddw {
    private final List zza;
    private final zzfja zzb;

    @Nullable
    private final com.google.android.gms.ads.internal.util.client.zzv zzc;
    private boolean zzd;

    public zzddw(zzfbo zzfboVar, zzfja zzfjaVar) {
        this.zza = zzfboVar.zzp;
        this.zzb = zzfjaVar;
        this.zzc = zzfboVar.zzax;
    }

    public final void zza() {
        if (this.zzd) {
            return;
        }
        this.zzb.zze(this.zza, this.zzc);
        this.zzd = true;
    }
}
