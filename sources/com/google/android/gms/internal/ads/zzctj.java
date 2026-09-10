package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class zzctj {
    private final zzcvi zza;
    private final View zzb;
    private final zzfhs zzc;
    private final zzcir zzd;

    public zzctj(View view, zzcir zzcirVar, zzcvi zzcviVar, zzfhs zzfhsVar) {
        this.zzb = view;
        this.zzd = zzcirVar;
        this.zza = zzcviVar;
        this.zzc = zzfhsVar;
    }

    public final zzcir zza() {
        return this.zzd;
    }

    public final View zzb() {
        return this.zzb;
    }

    public final zzcvi zzc() {
        return this.zza;
    }

    public final zzfhs zzd() {
        return this.zzc;
    }

    public zzdbw zze(Set set) {
        return new zzdbw(set);
    }
}
