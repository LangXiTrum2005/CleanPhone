package com.google.android.gms.ads.internal.overlay;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzq implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10954a;

    public zzq(long j10) {
        this.f10954a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (AdOverlayInfoParcel.f10902b.remove(Long.valueOf(this.f10954a)) == null) {
            return null;
        }
        com.google.android.gms.ads.internal.zzt.zzh().d("AdOverlayObjectsCleanupTask", new Exception("Key was non-null in AdOverlayObjectsCleanupTask"));
        return null;
    }
}
