package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory implements Factory<ApplicationInfo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f21069a;

    public FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory(Provider provider) {
        this.f21069a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        FirebaseApp firebaseApp = (FirebaseApp) this.f21069a.get();
        Intrinsics.f(firebaseApp, "firebaseApp");
        SessionEvents sessionEvents = SessionEvents.f21101a;
        return SessionEvents.a(firebaseApp);
    }
}
