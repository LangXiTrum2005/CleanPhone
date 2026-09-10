package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_StaticSessionData_AppData extends StaticSessionData.AppData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20706c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20707e;
    public final DevelopmentPlatformProvider f;

    public AutoValue_StaticSessionData_AppData(String str, String str2, String str3, String str4, int i2, DevelopmentPlatformProvider developmentPlatformProvider) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f20704a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f20705b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f20706c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.d = str4;
        this.f20707e = i2;
        this.f = developmentPlatformProvider;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public final String a() {
        return this.f20704a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public final int c() {
        return this.f20707e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public final DevelopmentPlatformProvider d() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData.AppData)) {
            return false;
        }
        StaticSessionData.AppData appData = (StaticSessionData.AppData) obj;
        return this.f20704a.equals(appData.a()) && this.f20705b.equals(appData.f()) && this.f20706c.equals(appData.g()) && this.d.equals(appData.e()) && this.f20707e == appData.c() && this.f.equals(appData.d());
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public final String f() {
        return this.f20705b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public final String g() {
        return this.f20706c;
    }

    public final int hashCode() {
        return ((((((((((this.f20704a.hashCode() ^ 1000003) * 1000003) ^ this.f20705b.hashCode()) * 1000003) ^ this.f20706c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f20707e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f20704a + ", versionCode=" + this.f20705b + ", versionName=" + this.f20706c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f20707e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
