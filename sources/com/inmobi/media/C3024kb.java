package com.inmobi.media;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3024kb implements GoogleApiClient.ConnectionCallbacks {
    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Intrinsics.checkNotNullExpressionValue(C3074mb.e, "access$getTAG$p(...)");
        C3074mb.f = true;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        C3074mb.f = false;
        Intrinsics.checkNotNullExpressionValue(C3074mb.e, "access$getTAG$p(...)");
    }
}
