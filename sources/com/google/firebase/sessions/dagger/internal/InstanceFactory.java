package com.google.firebase.sessions.dagger.internal;

import com.google.firebase.sessions.dagger.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class InstanceFactory<T> implements Factory<T>, Lazy<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21148a;

    public InstanceFactory(Object obj) {
        this.f21148a = obj;
    }

    public static InstanceFactory a(Object obj) {
        if (obj != null) {
            return new InstanceFactory(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return this.f21148a;
    }
}
