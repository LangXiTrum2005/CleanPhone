package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_ExternalPrivacyContext extends ExternalPrivacyContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalPRequestContext f16756a;

    public static final class Builder extends ExternalPrivacyContext.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ExternalPRequestContext f16757a;

        @Override // com.google.android.datatransport.cct.internal.ExternalPrivacyContext.Builder
        public final ExternalPrivacyContext a() {
            return new AutoValue_ExternalPrivacyContext(this.f16757a);
        }

        @Override // com.google.android.datatransport.cct.internal.ExternalPrivacyContext.Builder
        public final ExternalPrivacyContext.Builder b(ExternalPRequestContext externalPRequestContext) {
            this.f16757a = externalPRequestContext;
            return this;
        }
    }

    public AutoValue_ExternalPrivacyContext(ExternalPRequestContext externalPRequestContext) {
        this.f16756a = externalPRequestContext;
    }

    @Override // com.google.android.datatransport.cct.internal.ExternalPrivacyContext
    public final ExternalPRequestContext b() {
        return this.f16756a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalPrivacyContext)) {
            return false;
        }
        ExternalPRequestContext externalPRequestContext = this.f16756a;
        ExternalPRequestContext externalPRequestContextB = ((ExternalPrivacyContext) obj).b();
        if (externalPRequestContext == null) {
            return externalPRequestContextB == null;
        }
        return externalPRequestContext.equals(externalPRequestContextB);
    }

    public final int hashCode() {
        ExternalPRequestContext externalPRequestContext = this.f16756a;
        return (externalPRequestContext == null ? 0 : externalPRequestContext.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f16756a + "}";
    }
}
