package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class In {
    public final int a;
    public final int b;
    public final C3392z5 c;

    public In(AdConfig.VideoPlayerViewabilityConfig viewableConfig) {
        Intrinsics.checkNotNullParameter(viewableConfig, "viewableConfig");
        this.a = viewableConfig.getMinPercentageVisible();
        this.b = viewableConfig.getPollingInterval();
        this.c = AbstractC2960hl.a(viewableConfig.getMinDimensions());
    }
}
