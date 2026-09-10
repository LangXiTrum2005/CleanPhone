package com.ironsource;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.ironsource.u9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0604u9 implements InterfaceC0309e0<InterstitialAd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0560s1 f30803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f30804b;

    public C0604u9(InterfaceC0560s1 analytics, Executor callbackExecutor) {
        kotlin.jvm.internal.n.f(analytics, "analytics");
        kotlin.jvm.internal.n.f(callbackExecutor, "callbackExecutor");
        this.f30803a = analytics;
        this.f30804b = callbackExecutor;
    }

    @Override // com.ironsource.InterfaceC0309e0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterstitialAd a(K9 adInstance, Y1 auctionDataReporter) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        kotlin.jvm.internal.n.f(auctionDataReporter, "auctionDataReporter");
        return new InterstitialAd(new C0640w9(adInstance, new C0291d0(new Bc()), auctionDataReporter, this.f30803a, null, null, null, null, C0622v9.f30846a, PsExtractor.VIDEO_STREAM_MASK, null));
    }
}
