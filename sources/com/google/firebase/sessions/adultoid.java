package com.google.firebase.sessions;

import android.content.Context;
import javax.inject.Provider;
import p002kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: SessionDatastoreImpl_Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class adultoid implements lateral.saneness<SessionDatastoreImpl> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Provider<Context> f22918attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Provider<CoroutineContext> f22919saneness;

    public adultoid(Provider<Context> provider, Provider<CoroutineContext> provider2) {
        this.f22918attabal = provider;
        this.f22919saneness = provider2;
    }

    public static adultoid attabal(Provider<Context> provider, Provider<CoroutineContext> provider2) {
        return new adultoid(provider, provider2);
    }

    public static SessionDatastoreImpl dern(Context context, CoroutineContext coroutineContext) {
        return new SessionDatastoreImpl(context, coroutineContext);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public SessionDatastoreImpl get() {
        return dern(this.f22918attabal.get(), this.f22919saneness.get());
    }
}
