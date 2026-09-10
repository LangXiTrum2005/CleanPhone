package com.google.firebase.sessions;

import com.google.firebase.sessions.settings.SessionsSettings;
import javax.inject.Provider;
import p002kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: SessionFirelogPublisherImpl_Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cord implements lateral.saneness<SessionFirelogPublisherImpl> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Provider<iiion.beachfront> f22941attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Provider<SessionsSettings> f22942dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Provider<CoroutineContext> f22943marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Provider<ingathering.competently> f22944saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Provider<impromptu> f22945wireman;

    public cord(Provider<iiion.beachfront> provider, Provider<ingathering.competently> provider2, Provider<SessionsSettings> provider3, Provider<impromptu> provider4, Provider<CoroutineContext> provider5) {
        this.f22941attabal = provider;
        this.f22944saneness = provider2;
        this.f22942dern = provider3;
        this.f22945wireman = provider4;
        this.f22943marial = provider5;
    }

    public static cord attabal(Provider<iiion.beachfront> provider, Provider<ingathering.competently> provider2, Provider<SessionsSettings> provider3, Provider<impromptu> provider4, Provider<CoroutineContext> provider5) {
        return new cord(provider, provider2, provider3, provider4, provider5);
    }

    public static SessionFirelogPublisherImpl dern(iiion.beachfront beachfrontVar, ingathering.competently competentlyVar, SessionsSettings sessionsSettings, impromptu impromptuVar, CoroutineContext coroutineContext) {
        return new SessionFirelogPublisherImpl(beachfrontVar, competentlyVar, sessionsSettings, impromptuVar, coroutineContext);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public SessionFirelogPublisherImpl get() {
        return dern(this.f22941attabal.get(), this.f22944saneness.get(), this.f22942dern.get(), this.f22945wireman.get(), this.f22943marial.get());
    }
}
