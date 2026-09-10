package com.google.firebase.sessions.dagger.internal;

import com.google.firebase.sessions.dagger.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class DoubleCheck<T> implements Provider<T>, Lazy<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f21145c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Factory f21146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f21147b;

    public static Provider a(Factory factory) {
        if (factory instanceof DoubleCheck) {
            return factory;
        }
        DoubleCheck doubleCheck = new DoubleCheck();
        doubleCheck.f21147b = f21145c;
        doubleCheck.f21146a = factory;
        return doubleCheck;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Object obj;
        Object obj2 = this.f21147b;
        Object obj3 = f21145c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f21147b;
                if (obj == obj3) {
                    obj = this.f21146a.get();
                    Object obj4 = this.f21147b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f21147b = obj;
                    this.f21146a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
