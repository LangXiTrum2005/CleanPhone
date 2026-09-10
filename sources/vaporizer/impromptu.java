package vaporizer;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: compiled from: CreationContextFactory_Factory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class impromptu implements delouse.saneness<competently> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Provider<Context> f39286attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Provider<bramley.attabal> f39287dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Provider<bramley.attabal> f39288saneness;

    public impromptu(Provider<Context> provider, Provider<bramley.attabal> provider2, Provider<bramley.attabal> provider3) {
        this.f39286attabal = provider;
        this.f39288saneness = provider2;
        this.f39287dern = provider3;
    }

    public static impromptu attabal(Provider<Context> provider, Provider<bramley.attabal> provider2, Provider<bramley.attabal> provider3) {
        return new impromptu(provider, provider2, provider3);
    }

    public static competently dern(Context context, bramley.attabal attabalVar, bramley.attabal attabalVar2) {
        return new competently(context, attabalVar, attabalVar2);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public competently get() {
        return dern(this.f39286attabal.get(), this.f39288saneness.get(), this.f39287dern.get());
    }
}
