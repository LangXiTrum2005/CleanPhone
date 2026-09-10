package com.google.firebase.sessions;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: compiled from: SessionLifecycleServiceBinderImpl_Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class yemenite implements lateral.saneness<oilcan> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Provider<Context> f23084attabal;

    public yemenite(Provider<Context> provider) {
        this.f23084attabal = provider;
    }

    public static yemenite attabal(Provider<Context> provider) {
        return new yemenite(provider);
    }

    public static oilcan dern(Context context) {
        return new oilcan(context);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public oilcan get() {
        return dern(this.f23084attabal.get());
    }
}
