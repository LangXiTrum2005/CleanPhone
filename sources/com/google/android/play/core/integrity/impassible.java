package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class impassible extends IntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public String f21460attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public Long f21461saneness;

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest build() {
        String str = this.f21460attabal;
        if (str == null) {
            throw new IllegalStateException("Missing required properties: nonce");
        }
        triweekly triweeklyVar = null;
        return new kowloon(str, this.f21461saneness, triweeklyVar, triweeklyVar);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j) {
        this.f21461saneness = Long.valueOf(j);
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str == null) {
            throw new NullPointerException("Null nonce");
        }
        this.f21460attabal = str;
        return this;
    }
}
