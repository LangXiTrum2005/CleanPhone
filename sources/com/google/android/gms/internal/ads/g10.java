package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.util.zzs;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f14653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f14654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14655c;

    public void a(SurfaceTexture surfaceTexture, d10 d10Var) {
        if (d10Var == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.f14655c) {
            long j10 = timestamp - this.f14654b;
            if (Math.abs(j10) < this.f14653a) {
                return;
            }
        }
        this.f14655c = false;
        this.f14654b = timestamp;
        zzs.zza.post(new d(d10Var, 20));
    }
}
