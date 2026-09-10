package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.MuteThisAdListener;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdd extends zzdb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MuteThisAdListener f10791a;

    public zzdd(MuteThisAdListener muteThisAdListener) {
        this.f10791a = muteThisAdListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdc
    public final void zze() {
        this.f10791a.onAdMuted();
    }
}
