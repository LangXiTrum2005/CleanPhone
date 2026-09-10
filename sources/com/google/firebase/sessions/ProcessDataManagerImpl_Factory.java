package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class ProcessDataManagerImpl_Factory implements Factory<ProcessDataManagerImpl> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f21090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f21091b;

    public ProcessDataManagerImpl_Factory(Provider provider, Provider provider2) {
        this.f21090a = provider;
        this.f21091b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new ProcessDataManagerImpl((Context) this.f21090a.get(), (UuidGenerator) this.f21091b.get());
    }
}
