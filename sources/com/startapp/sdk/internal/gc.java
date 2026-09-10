package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class gc {
    public static final AtomicInteger g = new AtomicInteger();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f41006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f41007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Thread f41008c;
    public volatile boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f41009e;
    public int f;

    public gc(Looper looper) {
        this.f41006a = new Handler(looper, new ec(this));
        this.f41007b = new Handler(looper);
    }

    public final void a(Runnable runnable) {
        boolean z2;
        while (!Thread.currentThread().isInterrupted()) {
            try {
                long j = -SystemClock.elapsedRealtime();
                synchronized (this) {
                    this.d = false;
                    this.f41006a.sendEmptyMessage(0);
                    wait(2000L);
                    z2 = this.d;
                }
                long jElapsedRealtime = j + SystemClock.elapsedRealtime();
                int i2 = this.f;
                if (i2 < 8) {
                    this.f = i2 + 1;
                    this.f41009e += jElapsedRealtime;
                } else {
                    long j2 = this.f41009e;
                    this.f41009e = (jElapsedRealtime - (j2 / ((long) i2))) + j2;
                }
                if (!z2) {
                    this.f41009e = 0L;
                    this.f = 0;
                    synchronized (this) {
                        wait(5000L);
                    }
                } else {
                    if (this.f41009e < 160) {
                        this.f41007b.post(runnable);
                        this.f41009e = 0L;
                        this.f = 0;
                        return;
                    }
                    synchronized (this) {
                        wait(200L);
                    }
                }
            } catch (InterruptedException unused) {
                return;
            } catch (Throwable th) {
                g9.a(th);
                return;
            }
        }
    }
}
