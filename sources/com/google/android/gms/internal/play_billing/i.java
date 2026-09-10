package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends r9.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24284c;

    @Override // r9.b
    public final long P() {
        switch (this.f24284c) {
            case 0:
                return SystemClock.elapsedRealtimeNanos();
            default:
                return SystemClock.elapsedRealtime() * 1000000;
        }
    }
}
