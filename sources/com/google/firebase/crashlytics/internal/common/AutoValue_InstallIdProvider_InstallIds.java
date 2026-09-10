package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_InstallIdProvider_InstallIds extends InstallIdProvider.InstallIds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20303c;

    public AutoValue_InstallIdProvider_InstallIds(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f20301a = str;
        this.f20302b = str2;
        this.f20303c = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    public final String a() {
        return this.f20301a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    public final String b() {
        return this.f20303c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    public final String c() {
        return this.f20302b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallIdProvider.InstallIds)) {
            return false;
        }
        InstallIdProvider.InstallIds installIds = (InstallIdProvider.InstallIds) obj;
        if (!this.f20301a.equals(installIds.a())) {
            return false;
        }
        String str = this.f20302b;
        if (str == null) {
            if (installIds.c() != null) {
                return false;
            }
        } else if (!str.equals(installIds.c())) {
            return false;
        }
        String str2 = this.f20303c;
        if (str2 == null) {
            return installIds.b() == null;
        }
        return str2.equals(installIds.b());
    }

    public final int hashCode() {
        int iHashCode = (this.f20301a.hashCode() ^ 1000003) * 1000003;
        String str = this.f20302b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f20303c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.f20301a);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f20302b);
        sb.append(", firebaseAuthenticationToken=");
        return android.support.v4.media.a.r(sb, this.f20303c, "}");
    }
}
