package com.google.android.datatransport.cct.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_ExperimentIds extends ExperimentIds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f16750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f16751b;

    public static final class Builder extends ExperimentIds.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f16752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f16753b;

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public final ExperimentIds a() {
            return new AutoValue_ExperimentIds(this.f16752a, this.f16753b);
        }

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public final ExperimentIds.Builder b(byte[] bArr) {
            this.f16752a = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public final ExperimentIds.Builder c(byte[] bArr) {
            this.f16753b = bArr;
            return this;
        }
    }

    public AutoValue_ExperimentIds(byte[] bArr, byte[] bArr2) {
        this.f16750a = bArr;
        this.f16751b = bArr2;
    }

    @Override // com.google.android.datatransport.cct.internal.ExperimentIds
    public final byte[] b() {
        return this.f16750a;
    }

    @Override // com.google.android.datatransport.cct.internal.ExperimentIds
    public final byte[] c() {
        return this.f16751b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExperimentIds)) {
            return false;
        }
        ExperimentIds experimentIds = (ExperimentIds) obj;
        boolean z2 = experimentIds instanceof AutoValue_ExperimentIds;
        if (Arrays.equals(this.f16750a, z2 ? ((AutoValue_ExperimentIds) experimentIds).f16750a : experimentIds.b())) {
            return Arrays.equals(this.f16751b, z2 ? ((AutoValue_ExperimentIds) experimentIds).f16751b : experimentIds.c());
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f16750a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f16751b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f16750a) + ", encryptedBlob=" + Arrays.toString(this.f16751b) + "}";
    }
}
