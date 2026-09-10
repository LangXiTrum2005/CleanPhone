package com.smartdigimkt.p4;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f37539a;

    public synchronized void a() throws InterruptedException {
        while (!this.f37539a) {
            wait();
        }
    }

    public synchronized boolean b() {
        boolean z2;
        z2 = this.f37539a;
        this.f37539a = false;
        return z2;
    }

    public synchronized boolean c() {
        if (this.f37539a) {
            return false;
        }
        this.f37539a = true;
        notifyAll();
        return true;
    }

    public synchronized boolean a(long j) throws InterruptedException {
        boolean z2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = j + jElapsedRealtime;
        while (true) {
            z2 = this.f37539a;
            if (z2 || jElapsedRealtime >= j2) {
                break;
            }
            wait(j2 - jElapsedRealtime);
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        return z2;
    }
}
