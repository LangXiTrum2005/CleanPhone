package com.google.android.datatransport.cct.internal;

import android.support.v4.media.a;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_LogResponse extends LogResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16778a;

    public AutoValue_LogResponse(long j) {
        this.f16778a = j;
    }

    @Override // com.google.android.datatransport.cct.internal.LogResponse
    public final long b() {
        return this.f16778a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof LogResponse) && this.f16778a == ((LogResponse) obj).b();
    }

    public final int hashCode() {
        long j = this.f16778a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return a.j(this.f16778a, "}", new StringBuilder("LogResponse{nextRequestWaitMillis="));
    }
}
