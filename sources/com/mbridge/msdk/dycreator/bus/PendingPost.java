package com.mbridge.msdk.dycreator.bus;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class PendingPost {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List<PendingPost> f33199d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f33200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Subscription f33201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    PendingPost f33202c;

    private PendingPost(Object obj, Subscription subscription) {
        this.f33200a = obj;
        this.f33201b = subscription;
    }

    public static PendingPost a(Subscription subscription, Object obj) {
        List<PendingPost> list = f33199d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size <= 0) {
                    return new PendingPost(obj, subscription);
                }
                PendingPost pendingPostRemove = list.remove(size - 1);
                pendingPostRemove.f33200a = obj;
                pendingPostRemove.f33201b = subscription;
                pendingPostRemove.f33202c = null;
                return pendingPostRemove;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void a(PendingPost pendingPost) {
        pendingPost.f33200a = null;
        pendingPost.f33201b = null;
        pendingPost.f33202c = null;
        List<PendingPost> list = f33199d;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(pendingPost);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
