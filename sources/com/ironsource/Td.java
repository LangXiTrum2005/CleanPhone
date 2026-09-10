package com.ironsource;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Td implements InterfaceC0309e0<RewardedAd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0560s1 f27246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f27247b;

    public Td(InterfaceC0560s1 analytics, Executor callbackExecutor) {
        kotlin.jvm.internal.n.f(analytics, "analytics");
        kotlin.jvm.internal.n.f(callbackExecutor, "callbackExecutor");
        this.f27246a = analytics;
        this.f27247b = callbackExecutor;
    }

    @Override // com.ironsource.InterfaceC0309e0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RewardedAd a(K9 adInstance, Y1 auctionDataReporter) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        kotlin.jvm.internal.n.f(auctionDataReporter, "auctionDataReporter");
        return new RewardedAd(new Wd(adInstance, new C0291d0(new Bc()), auctionDataReporter, this.f27246a, null, null, null, null, Ud.f27318a, PsExtractor.VIDEO_STREAM_MASK, null));
    }
}
