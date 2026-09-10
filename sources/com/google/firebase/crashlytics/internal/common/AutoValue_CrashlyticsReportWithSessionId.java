package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CrashlyticsReportWithSessionId extends CrashlyticsReportWithSessionId {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrashlyticsReport f20298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f20300c;

    public AutoValue_CrashlyticsReportWithSessionId(CrashlyticsReport crashlyticsReport, String str, File file) {
        if (crashlyticsReport == null) {
            throw new NullPointerException("Null report");
        }
        this.f20298a = crashlyticsReport;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f20299b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f20300c = file;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public final CrashlyticsReport a() {
        return this.f20298a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public final File b() {
        return this.f20300c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public final String c() {
        return this.f20299b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReportWithSessionId)) {
            return false;
        }
        CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) obj;
        return this.f20298a.equals(crashlyticsReportWithSessionId.a()) && this.f20299b.equals(crashlyticsReportWithSessionId.c()) && this.f20300c.equals(crashlyticsReportWithSessionId.b());
    }

    public final int hashCode() {
        return ((((this.f20298a.hashCode() ^ 1000003) * 1000003) ^ this.f20299b.hashCode()) * 1000003) ^ this.f20300c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f20298a + ", sessionId=" + this.f20299b + ", reportFile=" + this.f20300c + "}";
    }
}
