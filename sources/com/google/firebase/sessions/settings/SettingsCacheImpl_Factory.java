package com.google.firebase.sessions.settings;

import androidx.datastore.core.DataStore;
import com.google.firebase.sessions.TimeProvider;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class SettingsCacheImpl_Factory implements Factory<SettingsCacheImpl> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f21182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f21183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f21184c;

    public SettingsCacheImpl_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.f21182a = provider;
        this.f21183b = provider2;
        this.f21184c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new SettingsCacheImpl((CoroutineContext) this.f21182a.get(), (TimeProvider) this.f21183b.get(), (DataStore) this.f21184c.get());
    }
}
