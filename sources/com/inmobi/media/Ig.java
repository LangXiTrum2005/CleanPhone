package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Ig extends Y {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ig(InMobiAdRequestStatus status, Ni adFetchError) {
        super(status, adFetchError);
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(adFetchError, "adFetchError");
    }
}
