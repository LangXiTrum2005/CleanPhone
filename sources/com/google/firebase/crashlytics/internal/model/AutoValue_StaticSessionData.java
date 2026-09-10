package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_StaticSessionData extends StaticSessionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StaticSessionData.AppData f20701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StaticSessionData.OsData f20702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StaticSessionData.DeviceData f20703c;

    public AutoValue_StaticSessionData(StaticSessionData.AppData appData, StaticSessionData.OsData osData, StaticSessionData.DeviceData deviceData) {
        this.f20701a = appData;
        this.f20702b = osData;
        this.f20703c = deviceData;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public final StaticSessionData.AppData a() {
        return this.f20701a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public final StaticSessionData.DeviceData c() {
        return this.f20703c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public final StaticSessionData.OsData d() {
        return this.f20702b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData)) {
            return false;
        }
        StaticSessionData staticSessionData = (StaticSessionData) obj;
        return this.f20701a.equals(staticSessionData.a()) && this.f20702b.equals(staticSessionData.d()) && this.f20703c.equals(staticSessionData.c());
    }

    public final int hashCode() {
        return ((((this.f20701a.hashCode() ^ 1000003) * 1000003) ^ this.f20702b.hashCode()) * 1000003) ^ this.f20703c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f20701a + ", osData=" + this.f20702b + ", deviceData=" + this.f20703c + "}";
    }
}
