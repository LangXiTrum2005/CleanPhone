package com.ironsource;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import java.util.concurrent.Executor;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.r9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3723r9 implements InterfaceC3484e0<InterstitialAd> {
    private final InterfaceC3732s1 a;
    private final Executor b;

    public C3723r9(InterfaceC3732s1 analytics, Executor callbackExecutor) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(callbackExecutor, "callbackExecutor");
        this.a = analytics;
        this.b = callbackExecutor;
    }

    @Override // com.ironsource.InterfaceC3484e0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterstitialAd a(H9 adInstance, Y1 auctionDataReporter) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        return new InterstitialAd(new C3757t9(adInstance, new C3466d0(new C3811wc()), auctionDataReporter, this.a, null, null, null, null, C3740s9.a, PsExtractor.VIDEO_STREAM_MASK, null));
    }
}
