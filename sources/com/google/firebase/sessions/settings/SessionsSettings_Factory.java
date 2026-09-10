package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class SessionsSettings_Factory implements Factory<SessionsSettings> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f21173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f21174b;

    public SessionsSettings_Factory(Provider provider, Provider provider2) {
        this.f21173a = provider;
        this.f21174b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new SessionsSettings((SettingsProvider) this.f21173a.get(), (SettingsProvider) this.f21174b.get());
    }
}
