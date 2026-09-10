package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Priority;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_TransportContext extends TransportContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f16825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Priority f16826c;

    public static final class Builder extends TransportContext.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f16827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f16828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Priority f16829c;

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public final TransportContext a() {
            String strConcat = this.f16827a == null ? " backendName" : "";
            if (this.f16829c == null) {
                strConcat = strConcat.concat(" priority");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_TransportContext(this.f16827a, this.f16828b, this.f16829c);
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public final TransportContext.Builder b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f16827a = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public final TransportContext.Builder c(byte[] bArr) {
            this.f16828b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public final TransportContext.Builder d(Priority priority) {
            if (priority == null) {
                throw new NullPointerException("Null priority");
            }
            this.f16829c = priority;
            return this;
        }
    }

    public AutoValue_TransportContext(String str, byte[] bArr, Priority priority) {
        this.f16824a = str;
        this.f16825b = bArr;
        this.f16826c = priority;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public final String b() {
        return this.f16824a;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public final byte[] c() {
        return this.f16825b;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public final Priority d() {
        return this.f16826c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TransportContext)) {
            return false;
        }
        TransportContext transportContext = (TransportContext) obj;
        if (this.f16824a.equals(transportContext.b())) {
            return Arrays.equals(this.f16825b, transportContext instanceof AutoValue_TransportContext ? ((AutoValue_TransportContext) transportContext).f16825b : transportContext.c()) && this.f16826c.equals(transportContext.d());
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f16824a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f16825b)) * 1000003) ^ this.f16826c.hashCode();
    }
}
