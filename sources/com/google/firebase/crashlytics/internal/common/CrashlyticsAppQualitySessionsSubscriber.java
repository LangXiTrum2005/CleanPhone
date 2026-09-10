package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class CrashlyticsAppQualitySessionsSubscriber implements SessionSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataCollectionArbiter f20316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CrashlyticsAppQualitySessionsStore f20317b;

    public CrashlyticsAppQualitySessionsSubscriber(DataCollectionArbiter dataCollectionArbiter, FileStore fileStore) {
        this.f20316a = dataCollectionArbiter;
        this.f20317b = new CrashlyticsAppQualitySessionsStore(fileStore);
    }

    public final void a(String str) {
        CrashlyticsAppQualitySessionsStore crashlyticsAppQualitySessionsStore = this.f20317b;
        synchronized (crashlyticsAppQualitySessionsStore) {
            if (!Objects.equals(crashlyticsAppQualitySessionsStore.f20314b, str)) {
                CrashlyticsAppQualitySessionsStore.a(crashlyticsAppQualitySessionsStore.f20313a, str, crashlyticsAppQualitySessionsStore.f20315c);
                crashlyticsAppQualitySessionsStore.f20314b = str;
            }
        }
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public final SessionSubscriber.Name getSessionSubscriberName() {
        return SessionSubscriber.Name.CRASHLYTICS;
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public final boolean isDataCollectionEnabled() {
        return this.f20316a.a();
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public final void onSessionChanged(SessionSubscriber.SessionDetails sessionDetails) {
        Logger.f20289a.b("App Quality Sessions session changed: " + sessionDetails, null);
        CrashlyticsAppQualitySessionsStore crashlyticsAppQualitySessionsStore = this.f20317b;
        String sessionId = sessionDetails.getSessionId();
        synchronized (crashlyticsAppQualitySessionsStore) {
            if (!Objects.equals(crashlyticsAppQualitySessionsStore.f20315c, sessionId)) {
                CrashlyticsAppQualitySessionsStore.a(crashlyticsAppQualitySessionsStore.f20313a, crashlyticsAppQualitySessionsStore.f20314b, sessionId);
                crashlyticsAppQualitySessionsStore.f20315c = sessionId;
            }
        }
    }
}
