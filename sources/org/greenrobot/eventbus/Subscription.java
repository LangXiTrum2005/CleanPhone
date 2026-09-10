package org.greenrobot.eventbus;

/* JADX INFO: loaded from: classes7.dex */
final class Subscription {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f45273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SubscriberMethod f45274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f45275c = true;

    public Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.f45273a = obj;
        this.f45274b = subscriberMethod;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Subscription) {
            Subscription subscription = (Subscription) obj;
            if (this.f45273a == subscription.f45273a && this.f45274b.equals(subscription.f45274b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f45274b.f.hashCode() + this.f45273a.hashCode();
    }
}
