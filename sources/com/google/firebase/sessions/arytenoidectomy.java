package com.google.firebase.sessions;

import com.google.firebase.sessions.settings.SessionsSettings;
import javax.inject.Provider;
import p002kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: FirebaseSessions_Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class arytenoidectomy implements lateral.saneness<FirebaseSessions> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Provider<iiion.beachfront> f22928attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Provider<CoroutineContext> f22929dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Provider<SessionsSettings> f22930saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Provider<trm> f22931wireman;

    public arytenoidectomy(Provider<iiion.beachfront> provider, Provider<SessionsSettings> provider2, Provider<CoroutineContext> provider3, Provider<trm> provider4) {
        this.f22928attabal = provider;
        this.f22930saneness = provider2;
        this.f22929dern = provider3;
        this.f22931wireman = provider4;
    }

    public static arytenoidectomy attabal(Provider<iiion.beachfront> provider, Provider<SessionsSettings> provider2, Provider<CoroutineContext> provider3, Provider<trm> provider4) {
        return new arytenoidectomy(provider, provider2, provider3, provider4);
    }

    public static FirebaseSessions dern(iiion.beachfront beachfrontVar, SessionsSettings sessionsSettings, CoroutineContext coroutineContext, trm trmVar) {
        return new FirebaseSessions(beachfrontVar, sessionsSettings, coroutineContext, trmVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public FirebaseSessions get() {
        return dern(this.f22928attabal.get(), this.f22930saneness.get(), this.f22929dern.get(), this.f22931wireman.get());
    }
}
