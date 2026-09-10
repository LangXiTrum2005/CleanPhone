package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class saneness implements IntegrityManager {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final cutely f21474attabal;

    public saneness(cutely cutelyVar) {
        this.f21474attabal = cutelyVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.f21474attabal.saneness(integrityTokenRequest);
    }
}
