package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfjo implements zzijg {
    private zzfjo(zzfjn zzfjnVar) {
    }

    public static zzfjo zza(zzfjn zzfjnVar) {
        return new zzfjo(zzfjnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        Clock defaultClock = DefaultClock.getInstance();
        zzijo.zzb(defaultClock);
        return defaultClock;
    }
}
