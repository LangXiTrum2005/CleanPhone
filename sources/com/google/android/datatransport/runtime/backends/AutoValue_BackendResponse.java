package com.google.android.datatransport.runtime.backends;

import android.support.v4.media.a;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_BackendResponse extends BackendResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackendResponse.Status f16854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16855b;

    public AutoValue_BackendResponse(BackendResponse.Status status, long j) {
        this.f16854a = status;
        this.f16855b = j;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public final long b() {
        return this.f16855b;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public final BackendResponse.Status c() {
        return this.f16854a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        return this.f16854a.equals(backendResponse.c()) && this.f16855b == backendResponse.b();
    }

    public final int hashCode() {
        int iHashCode = (this.f16854a.hashCode() ^ 1000003) * 1000003;
        long j = this.f16855b;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(this.f16854a);
        sb.append(", nextRequestWaitMillis=");
        return a.j(this.f16855b, "}", sb);
    }
}
