package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;
import com.google.firebase.sessions.settings.SessionsSettings;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class SessionFirelogPublisherImpl_Factory implements Factory<SessionFirelogPublisherImpl> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f21109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f21110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f21111c;
    public final Provider d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider f21112e;

    public SessionFirelogPublisherImpl_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f21109a = provider;
        this.f21110b = provider2;
        this.f21111c = provider3;
        this.d = provider4;
        this.f21112e = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new SessionFirelogPublisherImpl((FirebaseApp) this.f21109a.get(), (FirebaseInstallationsApi) this.f21110b.get(), (SessionsSettings) this.f21111c.get(), (EventGDTLoggerInterface) this.d.get(), (CoroutineContext) this.f21112e.get());
    }
}
