package com.google.firebase.installations.remote;

import com.google.firebase.installations.Utils;
import com.google.firebase.installations.time.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
class RequestLimiter {
    public static final long d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f20892e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Utils f20893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f20894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20895c;

    public RequestLimiter() {
        if (SystemClock.f20897a == null) {
            Pattern pattern = Utils.f20854c;
            SystemClock.f20897a = new SystemClock();
        }
        SystemClock systemClock = SystemClock.f20897a;
        if (Utils.d == null) {
            Utils.d = new Utils(systemClock);
        }
        this.f20893a = Utils.d;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    public final synchronized boolean a() {
        boolean z2;
        if (this.f20895c != 0) {
            this.f20893a.f20855a.getClass();
            if (System.currentTimeMillis() > this.f20894b) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = true;
        }
        return z2;
    }

    public final synchronized void b(int i2) {
        long jMin;
        if ((i2 >= 200 && i2 < 300) || i2 == 401 || i2 == 404) {
            synchronized (this) {
                this.f20895c = 0;
            }
            return;
        }
        this.f20895c++;
        synchronized (this) {
            try {
                if (i2 == 429 || (i2 >= 500 && i2 < 600)) {
                    double dPow = Math.pow(2.0d, this.f20895c);
                    this.f20893a.getClass();
                    jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f20892e);
                } else {
                    jMin = d;
                }
                this.f20893a.f20855a.getClass();
                this.f20894b = System.currentTimeMillis() + jMin;
            } catch (Throwable th) {
                throw th;
            }
        }
        return;
        throw th;
    }
}
