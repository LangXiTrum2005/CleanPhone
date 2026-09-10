package com.google.firebase.sessions;

import android.util.Base64;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: SessionDataStoreConfigs.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0007\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/google/firebase/sessions/molybdenite;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "saneness", "Ljava/lang/String;", "PROCESS_NAME", "dern", "attabal", "()Ljava/lang/String;", "SESSIONS_CONFIG_NAME", "wireman", "SETTINGS_CONFIG_NAME", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class molybdenite {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final molybdenite f23003attabal = new molybdenite();

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final String SESSIONS_CONFIG_NAME;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final String PROCESS_NAME;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static final String SETTINGS_CONFIG_NAME;

    static {
        String strEncodeToString = Base64.encodeToString(p002kotlin.text.dovishness.preprohormone(polloi.f23013attabal.marial()), 10);
        PROCESS_NAME = strEncodeToString;
        SESSIONS_CONFIG_NAME = "firebase_session_" + strEncodeToString + "_data";
        SETTINGS_CONFIG_NAME = "firebase_session_" + strEncodeToString + "_settings";
    }

    public final String attabal() {
        return SESSIONS_CONFIG_NAME;
    }

    public final String saneness() {
        return SETTINGS_CONFIG_NAME;
    }
}
