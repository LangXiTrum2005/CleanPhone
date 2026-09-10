package com.mbridge.msdk.video.bt.module.orglistener;

import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Boolean f37288a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f37289b = null;

    public void a() {
        this.f37289b = Boolean.TRUE;
    }

    public void b() {
        this.f37288a = Boolean.TRUE;
    }

    public Boolean c() {
        return this.f37289b;
    }

    public Boolean d() {
        return this.f37288a;
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        q0.a("ShowRewardListener", "onAdShow");
        this.f37288a = Boolean.TRUE;
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void b(String str, String str2) {
        f2.z("onVideoComplete: ", str2, "ShowRewardListener");
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, boolean z10, com.mbridge.msdk.videocommon.entity.c cVar2) {
        q0.a("ShowRewardListener", "onAdClose:isCompleteView:" + z10 + ",reward:" + cVar2);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str) {
        f2.z("onShowFail:", str, "ShowRewardListener");
        this.f37289b = Boolean.TRUE;
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z10, String str, String str2) {
        f2.z("onVideoAdClicked:", str2, "ShowRewardListener");
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z10, int i10) {
        q0.a("ShowRewardListener", "onAdCloseWithIVReward: " + z10 + "  " + i10);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(String str, String str2) {
        f2.z("onEndcardShow: ", str2, "ShowRewardListener");
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(int i10, String str, String str2) {
        f2.z("onAutoLoad: ", str2, "ShowRewardListener");
    }
}
