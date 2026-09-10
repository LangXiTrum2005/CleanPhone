package com.google.firebase.sessions;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SessionEvents.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/google/firebase/sessions/rotuma;", "", "<init>", "()V", "Liiion/beachfront;", "firebaseApp", "Lcom/google/firebase/sessions/dovishness;", "sessionDetails", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "sessionsSettings", "", "Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "subscribers", "", "firebaseInstallationId", "firebaseAuthenticationToken", "Lcom/google/firebase/sessions/gintrap;", "attabal", "(Liiion/beachfront;Lcom/google/firebase/sessions/dovishness;Lcom/google/firebase/sessions/settings/SessionsSettings;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/sessions/gintrap;", "Lcom/google/firebase/sessions/saneness;", "saneness", "(Liiion/beachfront;)Lcom/google/firebase/sessions/saneness;", "subscriber", "Lcom/google/firebase/sessions/DataCollectionState;", "wireman", "(Lcom/google/firebase/sessions/api/SessionSubscriber;)Lcom/google/firebase/sessions/DataCollectionState;", "Lderbyshire/attabal;", "Lderbyshire/attabal;", "dern", "()Lderbyshire/attabal;", "SESSION_EVENT_ENCODER", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class rotuma {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final rotuma f23016attabal = new rotuma();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final derbyshire.attabal SESSION_EVENT_ENCODER;

    static {
        derbyshire.attabal attabalVarTaiyuan = new groundwood.wireman().cutely(dern.f22953attabal).apical(true).taiyuan();
        Intrinsics.checkNotNullExpressionValue(attabalVarTaiyuan, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        SESSION_EVENT_ENCODER = attabalVarTaiyuan;
    }

    public final SessionEvent attabal(iiion.beachfront firebaseApp, SessionDetails sessionDetails, SessionsSettings sessionsSettings, Map<SessionSubscriber.Name, ? extends SessionSubscriber> subscribers, String firebaseInstallationId, String firebaseAuthenticationToken) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        Intrinsics.checkNotNullParameter(sessionsSettings, "sessionsSettings");
        Intrinsics.checkNotNullParameter(subscribers, "subscribers");
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        Intrinsics.checkNotNullParameter(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        return new SessionEvent(EventType.SESSION_START, new SessionInfo(sessionDetails.getSessionId(), sessionDetails.getFirstSessionId(), sessionDetails.getSessionIndex(), sessionDetails.getSessionStartTimestampUs(), new DataCollectionStatus(wireman(subscribers.get(SessionSubscriber.Name.PERFORMANCE)), wireman(subscribers.get(SessionSubscriber.Name.CRASHLYTICS)), sessionsSettings.saneness()), firebaseInstallationId, firebaseAuthenticationToken), saneness(firebaseApp));
    }

    public final derbyshire.attabal dern() {
        return SESSION_EVENT_ENCODER;
    }

    public final ApplicationInfo saneness(iiion.beachfront firebaseApp) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Context contextApical = firebaseApp.apical();
        Intrinsics.checkNotNullExpressionValue(contextApical, "firebaseApp.applicationContext");
        String packageName = contextApical.getPackageName();
        PackageInfo packageInfo = contextApical.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        String strDern = firebaseApp.kowloon().dern();
        Intrinsics.checkNotNullExpressionValue(strDern, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        LogEnvironment logEnvironment = LogEnvironment.LOG_ENVIRONMENT_PROD;
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        String str = packageInfo.versionName;
        String str2 = str == null ? strValueOf : str;
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        polloi polloiVar = polloi.f23013attabal;
        Context contextApical2 = firebaseApp.apical();
        Intrinsics.checkNotNullExpressionValue(contextApical2, "firebaseApp.applicationContext");
        ProcessDetails processDetailsWireman = polloiVar.wireman(contextApical2);
        Context contextApical3 = firebaseApp.apical();
        Intrinsics.checkNotNullExpressionValue(contextApical3, "firebaseApp.applicationContext");
        return new ApplicationInfo(strDern, MODEL, "2.1.0", RELEASE, logEnvironment, new AndroidApplicationInfo(packageName, str2, strValueOf, MANUFACTURER, processDetailsWireman, polloiVar.dern(contextApical3)));
    }

    public final DataCollectionState wireman(SessionSubscriber subscriber) {
        if (subscriber == null) {
            return DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
        }
        return subscriber.attabal() ? DataCollectionState.COLLECTION_ENABLED : DataCollectionState.COLLECTION_DISABLED;
    }
}
