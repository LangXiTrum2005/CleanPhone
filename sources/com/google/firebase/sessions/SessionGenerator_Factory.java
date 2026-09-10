package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class SessionGenerator_Factory implements Factory<SessionGenerator> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f21115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f21116b;

    public SessionGenerator_Factory(Provider provider, Provider provider2) {
        this.f21115a = provider;
        this.f21116b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new SessionGenerator((TimeProvider) this.f21115a.get(), (UuidGenerator) this.f21116b.get());
    }
}
