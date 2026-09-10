package com.mbridge.msdk.dycreator.bus;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class BackgroundPoster implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f33173a = new PendingPostQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f33174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EventBus f33175c;

    public BackgroundPoster(EventBus eventBus) {
        this.f33175c = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        PendingPost pendingPostA = PendingPost.a(subscription, obj);
        synchronized (this) {
            try {
                this.f33173a.a(pendingPostA);
                if (!this.f33174b) {
                    this.f33174b = true;
                    EventBus.f33176n.execute(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                try {
                    PendingPost pendingPostA = this.f33173a.a(1000);
                    if (pendingPostA == null) {
                        synchronized (this) {
                            pendingPostA = this.f33173a.a();
                            if (pendingPostA == null) {
                                this.f33174b = false;
                                this.f33174b = false;
                                return;
                            }
                        }
                    }
                    this.f33175c.a(pendingPostA);
                } catch (InterruptedException e10) {
                    Log.w("Event", Thread.currentThread().getName() + " was interruppted", e10);
                    this.f33174b = false;
                    return;
                }
            } catch (Throwable th2) {
                this.f33174b = false;
                throw th2;
            }
        }
    }
}
