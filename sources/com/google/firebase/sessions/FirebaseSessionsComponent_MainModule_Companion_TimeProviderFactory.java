package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.Factory;

/* JADX INFO: loaded from: classes4.dex */
public final class FirebaseSessionsComponent_MainModule_Companion_TimeProviderFactory implements Factory<TimeProvider> {

    public static final class InstanceHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FirebaseSessionsComponent_MainModule_Companion_TimeProviderFactory f21075a = new FirebaseSessionsComponent_MainModule_Companion_TimeProviderFactory();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return TimeProviderImpl.f21141a;
    }
}
