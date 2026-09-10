package com.google.android.datatransport.cct.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_BatchedLogRequest extends BatchedLogRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16741a;

    public AutoValue_BatchedLogRequest(ArrayList arrayList) {
        this.f16741a = arrayList;
    }

    @Override // com.google.android.datatransport.cct.internal.BatchedLogRequest
    public final List b() {
        return this.f16741a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BatchedLogRequest) {
            return this.f16741a.equals(((BatchedLogRequest) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f16741a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f16741a + "}";
    }
}
