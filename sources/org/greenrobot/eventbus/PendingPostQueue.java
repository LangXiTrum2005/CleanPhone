package org.greenrobot.eventbus;

/* JADX INFO: loaded from: classes7.dex */
final class PendingPostQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PendingPost f45258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PendingPost f45259b;

    public final synchronized void a(PendingPost pendingPost) {
        try {
            PendingPost pendingPost2 = this.f45259b;
            if (pendingPost2 != null) {
                pendingPost2.f45257c = pendingPost;
                this.f45259b = pendingPost;
            } else {
                if (this.f45258a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f45259b = pendingPost;
                this.f45258a = pendingPost;
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized PendingPost b() {
        PendingPost pendingPost;
        pendingPost = this.f45258a;
        if (pendingPost != null) {
            PendingPost pendingPost2 = pendingPost.f45257c;
            this.f45258a = pendingPost2;
            if (pendingPost2 == null) {
                this.f45259b = null;
            }
        }
        return pendingPost;
    }
}
