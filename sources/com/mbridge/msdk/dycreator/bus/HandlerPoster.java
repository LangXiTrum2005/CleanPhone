package com.mbridge.msdk.dycreator.bus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class HandlerPoster extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f33195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EventBus f33197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f33198d;

    public HandlerPoster(EventBus eventBus, Looper looper, int i10) {
        super(looper);
        this.f33197c = eventBus;
        this.f33196b = i10;
        this.f33195a = new PendingPostQueue();
    }

    public void a(Subscription subscription, Object obj) {
        PendingPost pendingPostA = PendingPost.a(subscription, obj);
        synchronized (this) {
            try {
                this.f33195a.a(pendingPostA);
                if (!this.f33198d) {
                    this.f33198d = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new EventBusException("Could not send handler message");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                PendingPost pendingPostA = this.f33195a.a();
                if (pendingPostA == null) {
                    synchronized (this) {
                        pendingPostA = this.f33195a.a();
                        if (pendingPostA == null) {
                            this.f33198d = false;
                            return;
                        }
                    }
                }
                this.f33197c.a(pendingPostA);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f33196b);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.f33198d = true;
        } catch (Throwable th2) {
            this.f33198d = false;
            throw th2;
        }
    }
}
