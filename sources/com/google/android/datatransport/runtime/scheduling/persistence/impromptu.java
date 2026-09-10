package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: compiled from: EventStoreModule_PackageNameFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class impromptu implements delouse.saneness<String> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Provider<Context> f19352attabal;

    public impromptu(Provider<Context> provider) {
        this.f19352attabal = provider;
    }

    public static impromptu attabal(Provider<Context> provider) {
        return new impromptu(provider);
    }

    public static String dern(Context context) {
        return (String) delouse.wireman.wireman(beachfront.saneness(context));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public String get() {
        return dern(this.f19352attabal.get());
    }
}
