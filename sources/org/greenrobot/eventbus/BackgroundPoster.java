package org.greenrobot.eventbus;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes7.dex */
final class BackgroundPoster implements Runnable, Poster {
    public final PendingPostQueue X = new PendingPostQueue();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final EventBus f45237Y;
    public volatile boolean Z;

    public BackgroundPoster(EventBus eventBus) {
        this.f45237Y = eventBus;
    }

    @Override // org.greenrobot.eventbus.Poster
    public final void a(Subscription subscription, Object obj) {
        PendingPost pendingPostA = PendingPost.a(subscription, obj);
        synchronized (this) {
            try {
                this.X.a(pendingPostA);
                if (!this.Z) {
                    this.Z = true;
                    this.f45237Y.j.execute(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        PendingPost pendingPostB;
        while (true) {
            try {
                try {
                    PendingPostQueue pendingPostQueue = this.X;
                    synchronized (pendingPostQueue) {
                        try {
                            if (pendingPostQueue.f45258a == null) {
                                pendingPostQueue.wait(1000);
                            }
                            pendingPostB = pendingPostQueue.b();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (pendingPostB == null) {
                        synchronized (this) {
                            pendingPostB = this.X.b();
                            if (pendingPostB == null) {
                                this.Z = false;
                                this.Z = false;
                                return;
                            }
                        }
                    }
                    this.f45237Y.c(pendingPostB);
                } catch (InterruptedException e2) {
                    this.f45237Y.f45246p.a(Level.WARNING, Thread.currentThread().getName() + " was interruppted", e2);
                    this.Z = false;
                    return;
                }
            } catch (Throwable th2) {
                this.Z = false;
                throw th2;
            }
        }
    }
}
