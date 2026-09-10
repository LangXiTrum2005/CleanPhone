package com.google.android.datatransport.runtime.backends;

/* JADX INFO: compiled from: AutoValue_BackendResponse.java */
/* JADX INFO: loaded from: classes2.dex */
public final class attabal extends BackendResponse {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final BackendResponse.Status f19300attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long f19301saneness;

    public attabal(BackendResponse.Status status, long j) {
        if (status == null) {
            throw new NullPointerException("Null status");
        }
        this.f19300attabal = status;
        this.f19301saneness = j;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public BackendResponse.Status dern() {
        return this.f19300attabal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BackendResponse) {
            BackendResponse backendResponse = (BackendResponse) obj;
            if (this.f19300attabal.equals(backendResponse.dern()) && this.f19301saneness == backendResponse.saneness()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f19300attabal.hashCode() ^ 1000003) * 1000003;
        long j = this.f19301saneness;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public long saneness() {
        return this.f19301saneness;
    }

    public String toString() {
        return "BackendResponse{status=" + this.f19300attabal + ", nextRequestWaitMillis=" + this.f19301saneness + "}";
    }
}
