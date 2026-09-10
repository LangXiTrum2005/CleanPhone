package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: compiled from: SchemaManager_Factory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class overspeculate implements delouse.saneness<splinterproof> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Provider<Context> f19361attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Provider<Integer> f19362dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Provider<String> f19363saneness;

    public overspeculate(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        this.f19361attabal = provider;
        this.f19363saneness = provider2;
        this.f19362dern = provider3;
    }

    public static overspeculate attabal(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        return new overspeculate(provider, provider2, provider3);
    }

    public static splinterproof dern(Context context, String str, int i) {
        return new splinterproof(context, str, i);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public splinterproof get() {
        return dern(this.f19361attabal.get(), this.f19363saneness.get(), this.f19362dern.get().intValue());
    }
}
