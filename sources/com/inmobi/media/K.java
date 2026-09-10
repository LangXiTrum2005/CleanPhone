package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class K extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiAdRequestStatus f22911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final short f22912b;

    public K(InMobiAdRequestStatus status, short s) {
        Intrinsics.f(status, "status");
        this.f22911a = status;
        this.f22912b = s;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f22911a.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String();
    }
}
