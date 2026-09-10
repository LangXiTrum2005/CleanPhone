package com.google.firebase.sessions;

import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import com.thinkup.core.common.n.mo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$mayLogSession$1", f = "SessionFirelogPublisher.kt", l = {com.smartdigimkt.f3.b.B0, 71, mo.oom.ono}, m = "invokeSuspend")
final class SessionFirelogPublisherImpl$mayLogSession$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public InstallationId X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public SessionFirelogPublisherImpl f21107Y;
    public SessionEvents Z;
    public FirebaseApp e0;
    public SessionDetails f0;
    public SessionsSettings g0;
    public int h0;
    public final /* synthetic */ SessionFirelogPublisherImpl i0;
    public final /* synthetic */ SessionDetails j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionFirelogPublisherImpl$mayLogSession$1(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, SessionDetails sessionDetails, Continuation continuation) {
        super(2, continuation);
        this.i0 = sessionFirelogPublisherImpl;
        this.j0 = sessionDetails;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SessionFirelogPublisherImpl$mayLogSession$1(this.i0, this.j0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SessionFirelogPublisherImpl$mayLogSession$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0080  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:28:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object objA;
        InstallationId installationId;
        SessionEvents sessionEvents;
        FirebaseApp firebaseApp;
        SessionDetails sessionDetails;
        SessionsSettings sessionsSettings;
        Object registeredSubscribers$com_google_firebase_firebase_sessions;
        SessionFirelogPublisherImpl sessionFirelogPublisherImpl;
        SessionsSettings sessionsSettings2;
        InstallationId installationId2;
        SessionEvents sessionEvents2;
        FirebaseApp firebaseApp2;
        SessionDetails sessionDetails2;
        SessionSubscriber sessionSubscriber;
        DataCollectionState dataCollectionState;
        SessionSubscriber sessionSubscriber2;
        DataCollectionState dataCollectionState2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.h0;
        SessionFirelogPublisherImpl sessionFirelogPublisherImpl2 = this.i0;
        if (i2 == 0) {
            ResultKt.b(obj);
            this.h0 = 1;
            objB = SessionFirelogPublisherImpl.b(sessionFirelogPublisherImpl2, this);
            if (objB != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(obj);
            objB = obj;
        } else {
            if (i2 == 2) {
                ResultKt.b(obj);
                objA = obj;
                installationId = (InstallationId) objA;
                sessionEvents = SessionEvents.f21101a;
                firebaseApp = sessionFirelogPublisherImpl2.f21103a;
                FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
                this.X = installationId;
                this.f21107Y = sessionFirelogPublisherImpl2;
                this.Z = sessionEvents;
                this.e0 = firebaseApp;
                sessionDetails = this.j0;
                this.f0 = sessionDetails;
                sessionsSettings = sessionFirelogPublisherImpl2.f21105c;
                this.g0 = sessionsSettings;
                this.h0 = 3;
                registeredSubscribers$com_google_firebase_firebase_sessions = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                if (registeredSubscribers$com_google_firebase_firebase_sessions != coroutineSingletons) {
                    sessionFirelogPublisherImpl = sessionFirelogPublisherImpl2;
                    sessionsSettings2 = sessionsSettings;
                    installationId2 = installationId;
                    sessionEvents2 = sessionEvents;
                    firebaseApp2 = firebaseApp;
                    sessionDetails2 = sessionDetails;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sessionsSettings2 = this.g0;
            sessionDetails2 = this.f0;
            FirebaseApp firebaseApp3 = this.e0;
            SessionEvents sessionEvents3 = this.Z;
            SessionFirelogPublisherImpl sessionFirelogPublisherImpl3 = this.f21107Y;
            InstallationId installationId3 = this.X;
            ResultKt.b(obj);
            sessionFirelogPublisherImpl = sessionFirelogPublisherImpl3;
            installationId2 = installationId3;
            sessionEvents2 = sessionEvents3;
            firebaseApp2 = firebaseApp3;
            registeredSubscribers$com_google_firebase_firebase_sessions = obj;
        }
        Map subscribers = (Map) registeredSubscribers$com_google_firebase_firebase_sessions;
        String str = installationId2.f21081a;
        sessionEvents2.getClass();
        Intrinsics.f(firebaseApp2, "firebaseApp");
        Intrinsics.f(sessionDetails2, "sessionDetails");
        Intrinsics.f(sessionsSettings2, "sessionsSettings");
        Intrinsics.f(subscribers, "subscribers");
        String firebaseAuthenticationToken = installationId2.f21082b;
        Intrinsics.f(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        EventType eventType = EventType.SESSION_START;
        String sessionId = sessionDetails2.getSessionId();
        String firstSessionId = sessionDetails2.getFirstSessionId();
        int sessionIndex = sessionDetails2.getSessionIndex();
        long sessionStartTimestampUs = sessionDetails2.getSessionStartTimestampUs();
        sessionSubscriber = (SessionSubscriber) subscribers.get(SessionSubscriber.Name.PERFORMANCE);
        if (sessionSubscriber == null) {
            dataCollectionState = DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
        } else if (sessionSubscriber.isDataCollectionEnabled()) {
            dataCollectionState = DataCollectionState.COLLECTION_ENABLED;
        } else {
            dataCollectionState = DataCollectionState.COLLECTION_DISABLED;
        }
        SessionsSettings sessionsSettings3 = sessionsSettings2;
        sessionSubscriber2 = (SessionSubscriber) subscribers.get(SessionSubscriber.Name.CRASHLYTICS);
        if (sessionSubscriber2 == null) {
            dataCollectionState2 = DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
        } else if (sessionSubscriber2.isDataCollectionEnabled()) {
            dataCollectionState2 = DataCollectionState.COLLECTION_ENABLED;
        } else {
            dataCollectionState2 = DataCollectionState.COLLECTION_DISABLED;
        }
        SessionEvent sessionEvent = new SessionEvent(new SessionInfo(sessionId, firstSessionId, sessionIndex, sessionStartTimestampUs, new DataCollectionStatus(dataCollectionState, dataCollectionState2, sessionsSettings3.a()), str, firebaseAuthenticationToken), SessionEvents.a(firebaseApp2));
        int i3 = SessionFirelogPublisherImpl.g;
        sessionFirelogPublisherImpl.getClass();
        try {
            sessionFirelogPublisherImpl.d.a(sessionEvent);
            Log.d("FirebaseSessions", "Successfully logged Session Start event.");
        } catch (RuntimeException e2) {
            Log.e("FirebaseSessions", "Error logging Session Start event to DataTransport: ", e2);
        }
        return Unit.f43263a;
        if (((Boolean) objB).booleanValue()) {
            InstallationId.Companion companion = InstallationId.f21080c;
            FirebaseInstallationsApi firebaseInstallationsApi = sessionFirelogPublisherImpl2.f21104b;
            this.h0 = 2;
            objA = companion.a(firebaseInstallationsApi, this);
            if (objA != coroutineSingletons) {
                installationId = (InstallationId) objA;
                sessionEvents = SessionEvents.f21101a;
                firebaseApp = sessionFirelogPublisherImpl2.f21103a;
                FirebaseSessionsDependencies firebaseSessionsDependencies2 = FirebaseSessionsDependencies.INSTANCE;
                this.X = installationId;
                this.f21107Y = sessionFirelogPublisherImpl2;
                this.Z = sessionEvents;
                this.e0 = firebaseApp;
                sessionDetails = this.j0;
                this.f0 = sessionDetails;
                sessionsSettings = sessionFirelogPublisherImpl2.f21105c;
                this.g0 = sessionsSettings;
                this.h0 = 3;
                registeredSubscribers$com_google_firebase_firebase_sessions = firebaseSessionsDependencies2.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                if (registeredSubscribers$com_google_firebase_firebase_sessions != coroutineSingletons) {
                    sessionFirelogPublisherImpl = sessionFirelogPublisherImpl2;
                    sessionsSettings2 = sessionsSettings;
                    installationId2 = installationId;
                    sessionEvents2 = sessionEvents;
                    firebaseApp2 = firebaseApp;
                    sessionDetails2 = sessionDetails;
                    Map subscribers2 = (Map) registeredSubscribers$com_google_firebase_firebase_sessions;
                    String str2 = installationId2.f21081a;
                    sessionEvents2.getClass();
                    Intrinsics.f(firebaseApp2, "firebaseApp");
                    Intrinsics.f(sessionDetails2, "sessionDetails");
                    Intrinsics.f(sessionsSettings2, "sessionsSettings");
                    Intrinsics.f(subscribers2, "subscribers");
                    String firebaseAuthenticationToken2 = installationId2.f21082b;
                    Intrinsics.f(firebaseAuthenticationToken2, "firebaseAuthenticationToken");
                    EventType eventType2 = EventType.SESSION_START;
                    String sessionId2 = sessionDetails2.getSessionId();
                    String firstSessionId2 = sessionDetails2.getFirstSessionId();
                    int sessionIndex2 = sessionDetails2.getSessionIndex();
                    long sessionStartTimestampUs2 = sessionDetails2.getSessionStartTimestampUs();
                    sessionSubscriber = (SessionSubscriber) subscribers2.get(SessionSubscriber.Name.PERFORMANCE);
                    if (sessionSubscriber == null) {
                        dataCollectionState = DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
                    } else if (sessionSubscriber.isDataCollectionEnabled()) {
                        dataCollectionState = DataCollectionState.COLLECTION_ENABLED;
                    } else {
                        dataCollectionState = DataCollectionState.COLLECTION_DISABLED;
                    }
                    SessionsSettings sessionsSettings4 = sessionsSettings2;
                    sessionSubscriber2 = (SessionSubscriber) subscribers2.get(SessionSubscriber.Name.CRASHLYTICS);
                    if (sessionSubscriber2 == null) {
                        dataCollectionState2 = DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
                    } else if (sessionSubscriber2.isDataCollectionEnabled()) {
                        dataCollectionState2 = DataCollectionState.COLLECTION_ENABLED;
                    } else {
                        dataCollectionState2 = DataCollectionState.COLLECTION_DISABLED;
                    }
                    SessionEvent sessionEvent2 = new SessionEvent(new SessionInfo(sessionId2, firstSessionId2, sessionIndex2, sessionStartTimestampUs2, new DataCollectionStatus(dataCollectionState, dataCollectionState2, sessionsSettings4.a()), str2, firebaseAuthenticationToken2), SessionEvents.a(firebaseApp2));
                    int i4 = SessionFirelogPublisherImpl.g;
                    sessionFirelogPublisherImpl.getClass();
                    sessionFirelogPublisherImpl.d.a(sessionEvent2);
                    Log.d("FirebaseSessions", "Successfully logged Session Start event.");
                }
            }
            return coroutineSingletons;
        }
        return Unit.f43263a;
    }
}
