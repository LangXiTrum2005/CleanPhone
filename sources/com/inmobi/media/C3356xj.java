package com.inmobi.media;

import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.xj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3356xj extends AbstractC3368y6 {
    public final List a;
    public final Dj b;

    public C3356xj(List imageAssets, Dj staticTelemetryHelper) {
        Intrinsics.checkNotNullParameter(imageAssets, "imageAssets");
        Intrinsics.checkNotNullParameter(staticTelemetryHelper, "staticTelemetryHelper");
        this.a = imageAssets;
        this.b = staticTelemetryHelper;
    }
}
