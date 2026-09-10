package org.greenrobot.eventbus;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
final class PendingPost {
    public static final ArrayList d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f45255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Subscription f45256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PendingPost f45257c;

    public static PendingPost a(Subscription subscription, Object obj) {
        ArrayList arrayList = d;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                if (size <= 0) {
                    PendingPost pendingPost = new PendingPost();
                    pendingPost.f45255a = obj;
                    pendingPost.f45256b = subscription;
                    return pendingPost;
                }
                PendingPost pendingPost2 = (PendingPost) arrayList.remove(size - 1);
                pendingPost2.f45255a = obj;
                pendingPost2.f45256b = subscription;
                pendingPost2.f45257c = null;
                return pendingPost2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
