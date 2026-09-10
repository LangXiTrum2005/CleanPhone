package com.google.firebase.sessions.settings;

import iiion.beachfront;
import ingathering.competently;
import javax.inject.Provider;
import p002kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: SessionsSettings_Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wireman implements lateral.saneness<SessionsSettings> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Provider<beachfront> f23058attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Provider<CoroutineContext> f23059dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Provider<CoroutineContext> f23060saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Provider<competently> f23061wireman;

    public wireman(Provider<beachfront> provider, Provider<CoroutineContext> provider2, Provider<CoroutineContext> provider3, Provider<competently> provider4) {
        this.f23058attabal = provider;
        this.f23060saneness = provider2;
        this.f23059dern = provider3;
        this.f23061wireman = provider4;
    }

    public static wireman attabal(Provider<beachfront> provider, Provider<CoroutineContext> provider2, Provider<CoroutineContext> provider3, Provider<competently> provider4) {
        return new wireman(provider, provider2, provider3, provider4);
    }

    public static SessionsSettings dern(beachfront beachfrontVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, competently competentlyVar) {
        return new SessionsSettings(beachfrontVar, coroutineContext, coroutineContext2, competentlyVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public SessionsSettings get() {
        return dern(this.f23058attabal.get(), this.f23060saneness.get(), this.f23059dern.get(), this.f23061wireman.get());
    }
}
