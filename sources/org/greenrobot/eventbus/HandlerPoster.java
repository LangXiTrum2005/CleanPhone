package org.greenrobot.eventbus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes7.dex */
public class HandlerPoster extends Handler implements Poster {
    public final PendingPostQueue X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f45253Y;
    public final EventBus Z;
    public boolean e0;

    public HandlerPoster(EventBus eventBus, Looper looper) {
        super(looper);
        this.Z = eventBus;
        this.f45253Y = 10;
        this.X = new PendingPostQueue();
    }

    @Override // org.greenrobot.eventbus.Poster
    public final void a(Subscription subscription, Object obj) {
        PendingPost pendingPostA = PendingPost.a(subscription, obj);
        synchronized (this) {
            try {
                this.X.a(pendingPostA);
                if (!this.e0) {
                    this.e0 = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new EventBusException("Could not send handler message");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                PendingPost pendingPostB = this.X.b();
                if (pendingPostB == null) {
                    synchronized (this) {
                        pendingPostB = this.X.b();
                        if (pendingPostB == null) {
                            this.e0 = false;
                            return;
                        }
                    }
                }
                this.Z.c(pendingPostB);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f45253Y);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.e0 = true;
        } catch (Throwable th) {
            this.e0 = false;
            throw th;
        }
    }
}
