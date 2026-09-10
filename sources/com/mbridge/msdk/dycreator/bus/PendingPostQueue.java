package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class PendingPostQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PendingPost f33203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PendingPost f33204b;

    public synchronized void a(PendingPost pendingPost) {
        try {
            if (pendingPost == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            PendingPost pendingPost2 = this.f33204b;
            if (pendingPost2 != null) {
                pendingPost2.f33202c = pendingPost;
                this.f33204b = pendingPost;
            } else {
                if (this.f33203a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f33204b = pendingPost;
                this.f33203a = pendingPost;
            }
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized PendingPost a() {
        PendingPost pendingPost;
        pendingPost = this.f33203a;
        if (pendingPost != null) {
            PendingPost pendingPost2 = pendingPost.f33202c;
            this.f33203a = pendingPost2;
            if (pendingPost2 == null) {
                this.f33204b = null;
            }
        }
        return pendingPost;
    }

    public synchronized PendingPost a(int i10) throws InterruptedException {
        try {
            if (this.f33203a == null) {
                wait(i10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return a();
    }
}
