package com.google.android.datatransport.runtime.backends;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_BackendRequest extends BackendRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f16851b;

    public static final class Builder extends BackendRequest.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList f16852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f16853b;

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public final BackendRequest a() {
            String str = this.f16852a == null ? " events" : "";
            if (str.isEmpty()) {
                return new AutoValue_BackendRequest(this.f16852a, this.f16853b);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public final BackendRequest.Builder b(ArrayList arrayList) {
            this.f16852a = arrayList;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public final BackendRequest.Builder c(byte[] bArr) {
            this.f16853b = bArr;
            return this;
        }
    }

    public AutoValue_BackendRequest(ArrayList arrayList, byte[] bArr) {
        this.f16850a = arrayList;
        this.f16851b = bArr;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    public final Iterable b() {
        return this.f16850a;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    public final byte[] c() {
        return this.f16851b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendRequest)) {
            return false;
        }
        BackendRequest backendRequest = (BackendRequest) obj;
        if (this.f16850a.equals(backendRequest.b())) {
            return Arrays.equals(this.f16851b, backendRequest instanceof AutoValue_BackendRequest ? ((AutoValue_BackendRequest) backendRequest).f16851b : backendRequest.c());
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f16850a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f16851b);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.f16850a + ", extras=" + Arrays.toString(this.f16851b) + "}";
    }
}
