package com.mbridge.msdk.video.bt.module.orglistener;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.setting.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class d extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f37292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f37293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f37294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f37295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f37296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f37297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f37298i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f37299j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f37300k = false;

    public d(Context context, boolean z10, com.mbridge.msdk.videocommon.setting.c cVar, CampaignEx campaignEx, h hVar, String str, String str2) {
        this.f37292c = hVar;
        this.f37293d = cVar;
        this.f37294e = str2;
        this.f37295f = str;
        this.f37296g = z10;
        this.f37297h = context;
        a(cVar, campaignEx);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    private void a(com.mbridge.msdk.videocommon.setting.c cVar, CampaignEx campaignEx) {
        long jD0;
        try {
            String strB = com.mbridge.msdk.foundation.controller.c.n().b();
            if (TextUtils.isEmpty(strB)) {
                jD0 = 0;
            } else {
                com.mbridge.msdk.setting.g gVarF = i.b().f(strB);
                if (gVarF == null) {
                    gVarF = i.b().a();
                }
                if (gVarF != null) {
                    jD0 = gVarF.d0() * 1000;
                } else {
                    jD0 = 0;
                }
            }
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            long jE = aVarC != null ? aVarC.e() : 0L;
            if (campaignEx != null) {
                if (!campaignEx.isSpareOffer(jE, jD0)) {
                    campaignEx.setSpareOfferFlag(0);
                    campaignEx.setCbt(0);
                    return;
                }
                campaignEx.setSpareOfferFlag(1);
                if (cVar.A() == 1) {
                    campaignEx.setCbt(1);
                } else {
                    campaignEx.setCbt(0);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void b(String str, String str2) {
        super.b(str, str2);
        h hVar = this.f37292c;
        if (hVar != null) {
            hVar.b(str, str2);
            this.f37292c.a(5, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        super.a(cVar);
        if (this.f37292c == null || this.f37298i) {
            return;
        }
        this.f37298i = true;
        b();
        this.f37292c.a(cVar);
        this.f37292c.a(2, this.f37295f, this.f37294e);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, boolean z10, com.mbridge.msdk.videocommon.entity.c cVar2) {
        super.a(cVar, z10, cVar2);
        h hVar = this.f37292c;
        if (hVar == null || this.f37300k) {
            return;
        }
        this.f37300k = true;
        hVar.a(7, this.f37295f, this.f37294e);
        this.f37292c.a(cVar, z10, cVar2);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z10, int i10) {
        super.a(z10, i10);
        h hVar = this.f37292c;
        if (hVar == null || this.f37300k) {
            return;
        }
        hVar.a(z10, i10);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str) {
        super.a(cVar, str);
        if (this.f37292c == null || this.f37299j) {
            return;
        }
        this.f37299j = true;
        a();
        this.f37292c.a(cVar, str);
        this.f37292c.a(4, this.f37295f, this.f37294e);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z10, String str, String str2) {
        super.a(z10, str, str2);
        h hVar = this.f37292c;
        if (hVar != null) {
            hVar.a(z10, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(String str, String str2) {
        super.a(str, str2);
        h hVar = this.f37292c;
        if (hVar != null) {
            hVar.a(str, str2);
            this.f37292c.a(6, str, str2);
        }
    }
}
