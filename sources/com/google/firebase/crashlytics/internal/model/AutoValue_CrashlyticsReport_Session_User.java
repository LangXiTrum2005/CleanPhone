package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_User extends CrashlyticsReport.Session.User {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20699a;

    public static final class Builder extends CrashlyticsReport.Session.User.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20700a;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder
        public final CrashlyticsReport.Session.User a() {
            String str = this.f20700a;
            if (str != null) {
                return new AutoValue_CrashlyticsReport_Session_User(str);
            }
            throw new IllegalStateException("Missing required properties: identifier");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder
        public final CrashlyticsReport.Session.User.Builder b(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f20700a = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_User(String str) {
        this.f20699a = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User
    public final String b() {
        return this.f20699a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.User) {
            return this.f20699a.equals(((CrashlyticsReport.Session.User) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f20699a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return android.support.v4.media.a.r(new StringBuilder("User{identifier="), this.f20699a, "}");
    }
}
