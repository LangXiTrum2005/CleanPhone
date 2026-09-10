package com.google.firebase.sessions;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.room.d;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;
import com.google.firebase.sessions.settings.SessionConfigs;
import com.google.firebase.sessions.settings.SessionConfigsSerializer;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: classes4.dex */
public final class FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory implements Factory<DataStore<SessionConfigs>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f21070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f21071b;

    public FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory(Provider provider, Provider provider2) {
        this.f21070a = provider;
        this.f21071b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context appContext = (Context) this.f21070a.get();
        CoroutineContext blockingDispatcher = (CoroutineContext) this.f21071b.get();
        Intrinsics.f(appContext, "appContext");
        Intrinsics.f(blockingDispatcher, "blockingDispatcher");
        return FirebaseSessionsComponent.MainModule.Companion.a(SessionConfigsSerializer.f21168a, new ReplaceFileCorruptionHandler(new d(7)), CoroutineScopeKt.a(blockingDispatcher), new a(appContext, 0));
    }
}
