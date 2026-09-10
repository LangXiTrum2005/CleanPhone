package com.google.android.exoplayer2;

import android.os.Looper;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class PlayerMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Target f17189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Sender f17190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SystemClock f17191c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f17192e;
    public final Looper f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17194i;

    public interface Sender {
        void b(PlayerMessage playerMessage);
    }

    public interface Target {
        void handleMessage(int i2, Object obj);
    }

    public PlayerMessage(Sender sender, Target target, Timeline timeline, int i2, SystemClock systemClock, Looper looper) {
        this.f17190b = sender;
        this.f17189a = target;
        this.f = looper;
        this.f17191c = systemClock;
    }

    public final synchronized void a(long j) {
        boolean z2;
        Assertions.d(this.g);
        Assertions.d(this.f.getThread() != Thread.currentThread());
        this.f17191c.getClass();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() + j;
        while (true) {
            z2 = this.f17194i;
            if (z2 || j <= 0) {
                break;
            }
            this.f17191c.getClass();
            wait(j);
            this.f17191c.getClass();
            j = jElapsedRealtime - android.os.SystemClock.elapsedRealtime();
        }
        if (!z2) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z2) {
        this.f17193h = z2 | this.f17193h;
        this.f17194i = true;
        notifyAll();
    }

    public final void c() {
        Assertions.d(!this.g);
        this.g = true;
        this.f17190b.b(this);
    }
}
