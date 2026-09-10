package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_ExternalPRequestContext extends ExternalPRequestContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f16754a;

    public static final class Builder extends ExternalPRequestContext.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f16755a;

        @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder
        public final ExternalPRequestContext a() {
            return new AutoValue_ExternalPRequestContext(this.f16755a);
        }

        @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder
        public final ExternalPRequestContext.Builder b(Integer num) {
            this.f16755a = num;
            return this;
        }
    }

    public AutoValue_ExternalPRequestContext(Integer num) {
        this.f16754a = num;
    }

    @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext
    public final Integer b() {
        return this.f16754a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalPRequestContext)) {
            return false;
        }
        Integer num = this.f16754a;
        Integer numB = ((ExternalPRequestContext) obj).b();
        if (num == null) {
            return numB == null;
        }
        return num.equals(numB);
    }

    public final int hashCode() {
        Integer num = this.f16754a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f16754a + "}";
    }
}
