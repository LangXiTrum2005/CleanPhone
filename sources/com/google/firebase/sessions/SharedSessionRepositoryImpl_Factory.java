package com.google.firebase.sessions;

import androidx.datastore.core.DataStore;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;
import com.google.firebase.sessions.settings.SessionsSettings;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class SharedSessionRepositoryImpl_Factory implements Factory<SharedSessionRepositoryImpl> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f21136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f21137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f21138c;
    public final Provider d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider f21139e;
    public final Provider f;
    public final Provider g;

    public SharedSessionRepositoryImpl_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f21136a = provider;
        this.f21137b = provider2;
        this.f21138c = provider3;
        this.d = provider4;
        this.f21139e = provider5;
        this.f = provider6;
        this.g = provider7;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new SharedSessionRepositoryImpl((SessionsSettings) this.f21136a.get(), (SessionGenerator) this.f21137b.get(), (SessionFirelogPublisher) this.f21138c.get(), (TimeProvider) this.d.get(), (DataStore) this.f21139e.get(), (ProcessDataManager) this.f.get(), (CoroutineContext) this.g.get());
    }
}
