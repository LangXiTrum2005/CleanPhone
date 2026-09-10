package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;
import com.google.firebase.sessions.settings.SessionsSettings;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class FirebaseSessions_Factory implements Factory<FirebaseSessions> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f21077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f21078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f21079c;
    public final Provider d;

    public FirebaseSessions_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f21077a = provider;
        this.f21078b = provider2;
        this.f21079c = provider3;
        this.d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new FirebaseSessions((FirebaseApp) this.f21077a.get(), (SessionsSettings) this.f21078b.get(), (CoroutineContext) this.f21079c.get(), (SessionsActivityLifecycleCallbacks) this.d.get());
    }
}
