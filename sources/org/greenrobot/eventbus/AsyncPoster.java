package org.greenrobot.eventbus;

/* JADX INFO: loaded from: classes7.dex */
class AsyncPoster implements Runnable, Poster {
    public final PendingPostQueue X = new PendingPostQueue();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final EventBus f45236Y;

    public AsyncPoster(EventBus eventBus) {
        this.f45236Y = eventBus;
    }

    @Override // org.greenrobot.eventbus.Poster
    public final void a(Subscription subscription, Object obj) {
        this.X.a(PendingPost.a(subscription, obj));
        this.f45236Y.j.execute(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PendingPost pendingPostB = this.X.b();
        if (pendingPostB == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f45236Y.c(pendingPostB);
    }
}
