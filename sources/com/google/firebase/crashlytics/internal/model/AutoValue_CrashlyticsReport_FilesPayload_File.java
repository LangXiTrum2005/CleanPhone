package com.google.firebase.crashlytics.internal.model;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_FilesPayload_File extends CrashlyticsReport.FilesPayload.File {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f20565b;

    public static final class Builder extends CrashlyticsReport.FilesPayload.File.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f20567b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public final CrashlyticsReport.FilesPayload.File a() {
            byte[] bArr;
            String str = this.f20566a;
            if (str != null && (bArr = this.f20567b) != null) {
                return new AutoValue_CrashlyticsReport_FilesPayload_File(str, bArr);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f20566a == null) {
                sb.append(" filename");
            }
            if (this.f20567b == null) {
                sb.append(" contents");
            }
            throw new IllegalStateException(a.m(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public final CrashlyticsReport.FilesPayload.File.Builder b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.f20567b = bArr;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public final CrashlyticsReport.FilesPayload.File.Builder c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f20566a = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_FilesPayload_File(String str, byte[] bArr) {
        this.f20564a = str;
        this.f20565b = bArr;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File
    public final byte[] b() {
        return this.f20565b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File
    public final String c() {
        return this.f20564a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.FilesPayload.File)) {
            return false;
        }
        CrashlyticsReport.FilesPayload.File file = (CrashlyticsReport.FilesPayload.File) obj;
        if (this.f20564a.equals(file.c())) {
            return Arrays.equals(this.f20565b, file instanceof AutoValue_CrashlyticsReport_FilesPayload_File ? ((AutoValue_CrashlyticsReport_FilesPayload_File) file).f20565b : file.b());
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f20564a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f20565b);
    }

    public final String toString() {
        return "File{filename=" + this.f20564a + ", contents=" + Arrays.toString(this.f20565b) + "}";
    }
}
