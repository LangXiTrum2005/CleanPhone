package com.google.firebase.sessions;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: classes4.dex */
public final class FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory implements Factory<DataStore<SessionData>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f21072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f21073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f21074c;

    public FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory(Provider provider, Provider provider2, Provider provider3) {
        this.f21072a = provider;
        this.f21073b = provider2;
        this.f21074c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context appContext = (Context) this.f21072a.get();
        CoroutineContext blockingDispatcher = (CoroutineContext) this.f21073b.get();
        SessionDataSerializer sessionDataSerializer = (SessionDataSerializer) this.f21074c.get();
        Intrinsics.f(appContext, "appContext");
        Intrinsics.f(blockingDispatcher, "blockingDispatcher");
        Intrinsics.f(sessionDataSerializer, "sessionDataSerializer");
        return FirebaseSessionsComponent.MainModule.Companion.a(sessionDataSerializer, new ReplaceFileCorruptionHandler(new androidx.room.b(sessionDataSerializer, 9)), CoroutineScopeKt.a(blockingDispatcher), new a(appContext, 1));
    }
}
