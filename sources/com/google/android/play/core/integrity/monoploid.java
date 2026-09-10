package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class monoploid extends IntegrityTokenResponse {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f21468attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final trm f21469saneness;

    public monoploid(String str, trm trmVar) {
        this.f21468attabal = str;
        this.f21469saneness = trmVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f21468attabal;
    }
}
