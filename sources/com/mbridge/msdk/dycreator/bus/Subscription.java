package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class Subscription {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f33211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final SubscriberMethod f33212b;

    public Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.f33211a = obj;
        this.f33212b = subscriberMethod;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Subscription) {
            Subscription subscription = (Subscription) obj;
            if (this.f33211a == subscription.f33211a && this.f33212b.equals(subscription.f33212b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f33212b.f33208d.hashCode() + this.f33211a.hashCode();
    }
}
