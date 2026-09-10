package org.greenrobot.eventbus;

/* JADX INFO: loaded from: classes7.dex */
public final class SubscriberExceptionEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f45260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f45261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f45262c;

    public SubscriberExceptionEvent(Throwable th, Object obj, Object obj2) {
        this.f45260a = th;
        this.f45261b = obj;
        this.f45262c = obj2;
    }
}
