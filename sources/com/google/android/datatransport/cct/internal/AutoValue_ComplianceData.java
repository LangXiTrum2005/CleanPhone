package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_ComplianceData extends ComplianceData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalPrivacyContext f16746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComplianceData.ProductIdOrigin f16747b;

    public static final class Builder extends ComplianceData.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ExternalPrivacyContext f16748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ComplianceData.ProductIdOrigin f16749b;

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.Builder
        public final ComplianceData a() {
            return new AutoValue_ComplianceData(this.f16748a, this.f16749b);
        }

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.Builder
        public final ComplianceData.Builder b(ExternalPrivacyContext externalPrivacyContext) {
            this.f16748a = externalPrivacyContext;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.Builder
        public final ComplianceData.Builder c() {
            this.f16749b = ComplianceData.ProductIdOrigin.X;
            return this;
        }
    }

    public AutoValue_ComplianceData(ExternalPrivacyContext externalPrivacyContext, ComplianceData.ProductIdOrigin productIdOrigin) {
        this.f16746a = externalPrivacyContext;
        this.f16747b = productIdOrigin;
    }

    @Override // com.google.android.datatransport.cct.internal.ComplianceData
    public final ExternalPrivacyContext b() {
        return this.f16746a;
    }

    @Override // com.google.android.datatransport.cct.internal.ComplianceData
    public final ComplianceData.ProductIdOrigin c() {
        return this.f16747b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ComplianceData)) {
            return false;
        }
        ComplianceData complianceData = (ComplianceData) obj;
        ExternalPrivacyContext externalPrivacyContext = this.f16746a;
        if (externalPrivacyContext == null) {
            if (complianceData.b() != null) {
                return false;
            }
        } else if (!externalPrivacyContext.equals(complianceData.b())) {
            return false;
        }
        ComplianceData.ProductIdOrigin productIdOrigin = this.f16747b;
        if (productIdOrigin == null) {
            return complianceData.c() == null;
        }
        return productIdOrigin.equals(complianceData.c());
    }

    public final int hashCode() {
        ExternalPrivacyContext externalPrivacyContext = this.f16746a;
        int iHashCode = ((externalPrivacyContext == null ? 0 : externalPrivacyContext.hashCode()) ^ 1000003) * 1000003;
        ComplianceData.ProductIdOrigin productIdOrigin = this.f16747b;
        return (productIdOrigin != null ? productIdOrigin.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f16746a + ", productIdOrigin=" + this.f16747b + "}";
    }
}
