package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class AsyncPoster implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f33171a = new PendingPostQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EventBus f33172b;

    public AsyncPoster(EventBus eventBus) {
        this.f33172b = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        this.f33171a.a(PendingPost.a(subscription, obj));
        EventBus.f33176n.execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        PendingPost pendingPostA = this.f33171a.a();
        if (pendingPostA == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f33172b.a(pendingPostA);
    }
}
