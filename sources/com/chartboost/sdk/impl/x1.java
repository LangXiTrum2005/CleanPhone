package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.x1;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x1 implements w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k6 f15502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ng f15503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj f15504c;
    public y d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Mediation f15505e;

    public x1(k6 downloader, ng timeSource, dj videoRepository, y adType, Mediation mediation) {
        Intrinsics.f(downloader, "downloader");
        Intrinsics.f(timeSource, "timeSource");
        Intrinsics.f(videoRepository, "videoRepository");
        Intrinsics.f(adType, "adType");
        this.f15502a = downloader;
        this.f15503b = timeSource;
        this.f15504c = videoRepository;
        this.d = adType;
        this.f15505e = mediation;
    }

    @Override // com.chartboost.sdk.impl.w1
    public void a(final l1 appRequest, String adTypeTraitsName, final s1 assetDownloadedCallback, final e0 adUnitLoaderCallback) {
        Intrinsics.f(appRequest, "appRequest");
        Intrinsics.f(adTypeTraitsName, "adTypeTraitsName");
        Intrinsics.f(assetDownloadedCallback, "assetDownloadedCallback");
        Intrinsics.f(adUnitLoaderCallback, "adUnitLoaderCallback");
        final z zVarA = appRequest.a();
        if (zVarA == null) {
            return;
        }
        q1 q1Var = new q1() { // from class: p.k
            @Override // com.chartboost.sdk.impl.q1
            public final void a(boolean z2) {
                x1.a(this.f45290a, appRequest, zVarA, adUnitLoaderCallback, assetDownloadedCallback, z2);
            }
        };
        this.f15502a.c();
        this.f15502a.a(ae.NORMAL, zVarA.d(), new AtomicInteger(), (q1) y7.a().a(q1Var), adTypeTraitsName);
    }

    public static final void a(x1 this$0, l1 appRequest, z adUnit, e0 adUnitLoaderCallback, s1 assetDownloadedCallback, boolean z2) {
        t1 t1VarA;
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(appRequest, "$appRequest");
        Intrinsics.f(adUnit, "$adUnit");
        Intrinsics.f(adUnitLoaderCallback, "$adUnitLoaderCallback");
        Intrinsics.f(assetDownloadedCallback, "$assetDownloadedCallback");
        if (z2) {
            t1VarA = this$0.a(appRequest, adUnit, adUnitLoaderCallback);
        } else if (!z2) {
            t1VarA = t1.FAILURE;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        assetDownloadedCallback.a(appRequest, t1VarA);
    }

    public final t1 a(l1 l1Var, z zVar, e0 e0Var) {
        e0Var.a(l1Var, fh.a.FINISH_SUCCESS);
        if (zVar.D()) {
            if (!this.f15504c.a(zVar.B())) {
                this.f15504c.a(zVar.C(), zVar.B(), false, null);
            }
            return t1.SUCCESS;
        }
        return t1.READY_TO_SHOW;
    }
}
