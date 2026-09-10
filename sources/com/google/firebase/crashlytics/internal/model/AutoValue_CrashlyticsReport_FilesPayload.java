package com.google.firebase.crashlytics.internal.model;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_FilesPayload extends CrashlyticsReport.FilesPayload {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20561b;

    public static final class Builder extends CrashlyticsReport.FilesPayload.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f20562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20563b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public final CrashlyticsReport.FilesPayload a() {
            List list = this.f20562a;
            if (list != null) {
                return new AutoValue_CrashlyticsReport_FilesPayload(list, this.f20563b);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public final CrashlyticsReport.FilesPayload.Builder b(List list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.f20562a = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public final CrashlyticsReport.FilesPayload.Builder c(String str) {
            this.f20563b = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_FilesPayload(List list, String str) {
        this.f20560a = list;
        this.f20561b = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    public final List b() {
        return this.f20560a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    public final String c() {
        return this.f20561b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.FilesPayload)) {
            return false;
        }
        CrashlyticsReport.FilesPayload filesPayload = (CrashlyticsReport.FilesPayload) obj;
        if (!this.f20560a.equals(filesPayload.b())) {
            return false;
        }
        String str = this.f20561b;
        if (str == null) {
            return filesPayload.c() == null;
        }
        return str.equals(filesPayload.c());
    }

    public final int hashCode() {
        int iHashCode = (this.f20560a.hashCode() ^ 1000003) * 1000003;
        String str = this.f20561b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.f20560a);
        sb.append(", orgId=");
        return android.support.v4.media.a.r(sb, this.f20561b, "}");
    }
}
