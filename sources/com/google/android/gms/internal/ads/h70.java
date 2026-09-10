package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h70 implements ii {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f15194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p9.a f15195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ScheduledFuture f15196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f15197d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f15198e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ws0 f15199f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15200g = false;

    public h70(ScheduledExecutorService scheduledExecutorService, p9.a aVar) {
        this.f15194a = scheduledExecutorService;
        this.f15195b = aVar;
        zzt.zzg().b(this);
    }

    @Override // com.google.android.gms.internal.ads.ii
    public final void zza(boolean z10) {
        ScheduledFuture scheduledFuture;
        if (z10) {
            synchronized (this) {
                try {
                    if (this.f15200g) {
                        if (this.f15198e > 0 && (scheduledFuture = this.f15196c) != null && scheduledFuture.isCancelled()) {
                            this.f15196c = this.f15194a.schedule(this.f15199f, this.f15198e, TimeUnit.MILLISECONDS);
                        }
                        this.f15200g = false;
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        synchronized (this) {
            try {
                if (this.f15200g) {
                    return;
                }
                ScheduledFuture scheduledFuture2 = this.f15196c;
                if (scheduledFuture2 == null || scheduledFuture2.isDone()) {
                    this.f15198e = -1L;
                } else {
                    this.f15196c.cancel(true);
                    long j10 = this.f15197d;
                    ((p9.b) this.f15195b).getClass();
                    this.f15198e = j10 - SystemClock.elapsedRealtime();
                }
                this.f15200g = true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
