package com.mbridge.msdk.video.bt.module.orglistener;

import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class c extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.listener.b f37290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f37291d;

    public c(com.mbridge.msdk.video.bt.module.listener.b bVar, String str) {
        this.f37290c = bVar;
        this.f37291d = str;
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f37290c != null) {
            q0.a("H5ShowRewardListener", "onAdShow");
            this.f37290c.a(this.f37291d);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void b(String str, String str2) {
        if (this.f37290c != null) {
            q0.a("H5ShowRewardListener", "onVideoComplete");
            this.f37290c.a(this.f37291d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, boolean z10, com.mbridge.msdk.videocommon.entity.c cVar2) {
        if (this.f37290c != null) {
            q0.a("H5ShowRewardListener", "onAdClose");
            this.f37290c.a(this.f37291d, z10, cVar2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str) {
        if (this.f37290c != null) {
            q0.a("H5ShowRewardListener", "onShowFail");
            this.f37290c.a(this.f37291d, str);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z10, String str, String str2) {
        if (this.f37290c != null) {
            q0.a("H5ShowRewardListener", "onVideoAdClicked");
            this.f37290c.b(this.f37291d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(String str, String str2) {
        if (this.f37290c != null) {
            q0.a("H5ShowRewardListener", "onEndcardShow");
            this.f37290c.c(this.f37291d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(int i10, String str, String str2) {
        if (this.f37290c != null) {
            q0.a("H5ShowRewardListener", "onAutoLoad");
            this.f37290c.a(this.f37291d, i10, str, str2);
        }
    }
}
