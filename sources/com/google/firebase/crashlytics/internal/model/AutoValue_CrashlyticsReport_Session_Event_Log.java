package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Log extends CrashlyticsReport.Session.Event.Log {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20677a;

    public static final class Builder extends CrashlyticsReport.Session.Event.Log.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20678a;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder
        public final CrashlyticsReport.Session.Event.Log a() {
            String str = this.f20678a;
            if (str != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Log(str);
            }
            throw new IllegalStateException("Missing required properties: content");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder
        public final CrashlyticsReport.Session.Event.Log.Builder b(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f20678a = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Log(String str) {
        this.f20677a = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log
    public final String b() {
        return this.f20677a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Log) {
            return this.f20677a.equals(((CrashlyticsReport.Session.Event.Log) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f20677a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return android.support.v4.media.a.r(new StringBuilder("Log{content="), this.f20677a, "}");
    }
}
