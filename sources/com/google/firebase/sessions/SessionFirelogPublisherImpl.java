package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.settings.SessionsSettings;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: classes4.dex */
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/sessions/SessionFirelogPublisherImpl;", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SessionFirelogPublisherImpl implements SessionFirelogPublisher {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseApp f21103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseInstallationsApi f21104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SessionsSettings f21105c;
    public final EventGDTLoggerInterface d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CoroutineContext f21106e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/google/firebase/sessions/SessionFirelogPublisherImpl$Companion;", "", "", "randomValueForSampling", "D", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public SessionFirelogPublisherImpl(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallations, SessionsSettings sessionSettings, EventGDTLoggerInterface eventGDTLogger, CoroutineContext backgroundDispatcher) {
        Intrinsics.f(firebaseApp, "firebaseApp");
        Intrinsics.f(firebaseInstallations, "firebaseInstallations");
        Intrinsics.f(sessionSettings, "sessionSettings");
        Intrinsics.f(eventGDTLogger, "eventGDTLogger");
        Intrinsics.f(backgroundDispatcher, "backgroundDispatcher");
        this.f21103a = firebaseApp;
        this.f21104b = firebaseInstallations;
        this.f21105c = sessionSettings;
        this.d = eventGDTLogger;
        this.f21106e = backgroundDispatcher;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        if (r7.b(r0) == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.google.firebase.sessions.SessionFirelogPublisherImpl r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionFirelogPublisherImpl.b(com.google.firebase.sessions.SessionFirelogPublisherImpl, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.google.firebase.sessions.SessionFirelogPublisher
    public final void a(SessionDetails sessionDetails) {
        BuildersKt.c(CoroutineScopeKt.a(this.f21106e), null, null, new SessionFirelogPublisherImpl$mayLogSession$1(this, sessionDetails, null), 3);
    }
}
