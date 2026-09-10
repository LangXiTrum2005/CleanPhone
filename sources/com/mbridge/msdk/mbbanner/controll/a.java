package com.mbridge.msdk.mbbanner.controll;

import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.e1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbbanner.common.manager.c;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.setting.k;
import com.mbridge.msdk.setting.m;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static String f34544x = "BannerController";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MBridgeIds f34548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f34549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f34550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MBBannerView f34551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f34552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f34553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f34554j;
    private BannerAdListener l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private CampaignUnit f34556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c f34557n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private m f34558o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private k f34559p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f34560q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f34561r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f34562s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f34563t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f34564u;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f34555k = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.c f34565v = new C0142a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.b f34566w = new b();

    public a(MBBannerView mBBannerView, BannerSize bannerSize, String str, String str2) {
        this.f34551g = mBBannerView;
        if (bannerSize != null) {
            this.f34552h = bannerSize.getHeight();
            this.f34553i = bannerSize.getWidth();
        }
        this.f34545a = str2;
        str = TextUtils.isEmpty(str) ? "" : str;
        this.f34546b = str;
        this.f34548d = new MBridgeIds(str, this.f34545a);
        f();
    }

    private int a(int i10) {
        if (i10 > 0) {
            if (i10 < 10) {
                return 10;
            }
            if (i10 > 180) {
                return 180;
            }
        }
        return i10;
    }

    private void l() {
        m mVarE = i.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f34545a);
        this.f34558o = mVarE;
        if (mVarE == null) {
            this.f34558o = m.i(this.f34545a);
        }
        if (this.f34555k == -1) {
            this.f34554j = a(this.f34558o.D());
        }
        if (this.f34550f == 0) {
            boolean z10 = this.f34558o.g() == 1;
            this.f34549e = z10;
            c cVar = this.f34557n;
            if (cVar != null) {
                cVar.c(z10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements com.mbridge.msdk.mbbanner.common.listener.b {
        public b() {
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.b
        public void a(String str, CampaignUnit campaignUnit, boolean z10) {
            a.this.f34556m = campaignUnit;
            a.this.a(1, (com.mbridge.msdk.foundation.error.b) null);
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.b
        public void b(com.mbridge.msdk.foundation.error.b bVar) {
            a.this.a(bVar.k(), bVar);
            a.this.c();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.b
        public void a(com.mbridge.msdk.foundation.error.b bVar) {
            a.this.a(2, bVar);
            a.this.a(bVar.k(), bVar);
            a.this.c();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.b
        public void a(String str, int i10, boolean z10) {
            if (a.this.f34551g != null) {
                a.this.f34563t = true;
                a.this.j();
            }
        }
    }

    private boolean a(View view) {
        return true;
    }

    private void f() {
        b(com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c());
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f34562s || !this.f34563t) {
            return;
        }
        if (!a(this.f34551g)) {
            a(new com.mbridge.msdk.foundation.error.b(880044));
        } else if (this.f34556m != null) {
            if (this.f34557n == null) {
                this.f34557n = new c(this.f34551g, this.f34565v, this.f34546b, this.f34545a, this.f34549e, this.f34558o);
            }
            this.f34557n.a(this.f34547c);
            this.f34557n.b(this.f34560q);
            this.f34557n.d(this.f34561r);
            this.f34557n.a(this.f34549e, this.f34550f);
            this.f34557n.b(this.f34556m);
        } else {
            a(new com.mbridge.msdk.foundation.error.b(880043));
        }
        this.f34563t = false;
    }

    private void k() {
        MBBannerView mBBannerView = this.f34551g;
        if (mBBannerView != null) {
            if (!this.f34560q || !this.f34561r || this.f34564u || e1.a(mBBannerView, 1)) {
                com.mbridge.msdk.mbbanner.common.manager.a.b().a(2, this.f34546b, this.f34545a, null, null);
            } else {
                com.mbridge.msdk.mbbanner.common.manager.a.b().a(3, this.f34546b, this.f34545a, new com.mbridge.msdk.mbbanner.common.data.a(this.f34553i + "x" + this.f34552h, this.f34554j * 1000), this.f34566w);
            }
            if (this.f34560q) {
                return;
            }
            com.mbridge.msdk.mbbanner.common.manager.a.b().a(4, this.f34546b, this.f34545a, null, null);
            com.mbridge.msdk.mbbanner.common.manager.a.b().b(this.f34545a);
        }
    }

    public void c() {
        if (this.f34562s) {
            return;
        }
        k();
        l();
        com.mbridge.msdk.mbbanner.common.data.a aVar = new com.mbridge.msdk.mbbanner.common.data.a(this.f34553i + "x" + this.f34552h, this.f34554j * 1000);
        aVar.c(this.f34546b);
        aVar.a(true);
        aVar.b(com.mbridge.msdk.mbbanner.common.report.a.b(""));
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(this.f34546b, this.f34545a, aVar, this.f34566w);
    }

    public String d() {
        CampaignUnit campaignUnit = this.f34556m;
        return campaignUnit != null ? com.mbridge.msdk.foundation.same.c.b(campaignUnit.getAds()) : "";
    }

    public String e() {
        CampaignUnit campaignUnit = this.f34556m;
        return (campaignUnit == null || campaignUnit.getRequestId() == null) ? "" : this.f34556m.getRequestId();
    }

    public void g() {
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(4, this.f34546b, this.f34545a, new com.mbridge.msdk.mbbanner.common.data.a(this.f34553i + "x" + this.f34552h, this.f34554j * 1000), this.f34566w);
    }

    public void h() {
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(3, this.f34546b, this.f34545a, new com.mbridge.msdk.mbbanner.common.data.a(this.f34553i + "x" + this.f34552h, this.f34554j * 1000), this.f34566w);
    }

    public void i() {
        this.f34562s = true;
        if (this.l != null) {
            this.l = null;
        }
        if (this.f34566w != null) {
            this.f34566w = null;
        }
        if (this.f34565v != null) {
            this.f34565v = null;
        }
        if (this.f34551g != null) {
            this.f34551g = null;
        }
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(4, this.f34546b, this.f34545a, null, null);
        com.mbridge.msdk.mbbanner.common.manager.a.b().b(this.f34545a);
        com.mbridge.msdk.mbbanner.common.manager.a.b().c();
        c cVar = this.f34557n;
        if (cVar != null) {
            cVar.h();
        }
    }

    public void b(int i10) {
        int iA = a(i10);
        this.f34555k = iA;
        this.f34554j = iA;
    }

    private void b(String str, String str2) {
        if (this.f34559p == null) {
            this.f34559p = new k();
        }
        this.f34559p.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, str2, this.f34545a);
    }

    public void b(boolean z10) {
        this.f34560q = z10;
        b();
        j();
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.controll.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0142a implements com.mbridge.msdk.mbbanner.common.listener.c {
        public C0142a() {
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void a(List<CampaignEx> list) {
            q0.b(a.f34544x, "onShowSuccessed:");
            if (a.this.l != null) {
                a.this.l.onLoadSuccessed(a.this.f34548d);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(a.this.f34545a, list.get(0).getLocalRequestId());
                cVarA.b(list);
                cVarA.g(1);
                cVarA.d(TextUtils.isEmpty(list.get(0).getBannerUrl()) ? 2 : 1);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000048", cVarA, (e) null);
            } catch (Exception e10) {
                q0.b(a.f34544x, e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void b() {
            if (a.this.l != null) {
                a.this.l.onCloseBanner(a.this.f34548d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void c() {
            if (a.this.l != null) {
                a.this.l.onClick(a.this.f34548d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void d() {
            if (a.this.l != null) {
                a.this.l.closeFullScreen(a.this.f34548d);
                a.this.f34564u = false;
                com.mbridge.msdk.mbbanner.common.manager.a.b().a(3, a.this.f34546b, a.this.f34545a, new com.mbridge.msdk.mbbanner.common.data.a(a.this.f34553i + "x" + a.this.f34552h, a.this.f34554j * 1000), a.this.f34566w);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void onLeaveApp() {
            if (a.this.l != null) {
                a.this.l.onLeaveApp(a.this.f34548d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void a(CampaignEx campaignEx) {
            a.this.c();
            if (a.this.l != null) {
                a.this.l.onLogImpression(a.this.f34548d);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(a.this.f34545a, campaignEx.getLocalRequestId());
                cVarA.a(campaignEx);
                cVarA.h(campaignEx.isBidCampaign() ? "1" : "0");
                int i10 = 1;
                cVarA.g(a.this.f34557n != null ? a.this.f34557n.c() : 1);
                if (a.this.f34554j != 0) {
                    i10 = 2;
                }
                cVarA.b(i10);
                cVarA.c(a.this.f34554j);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000128", cVarA, (e) null);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000130", cVarA, (e) null);
            } catch (Exception e10) {
                q0.b(a.f34544x, e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void a(com.mbridge.msdk.foundation.error.b bVar) {
            a.this.a(bVar);
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void a() {
            if (a.this.l != null) {
                a.this.l.showFullScreen(a.this.f34548d);
                a.this.f34564u = true;
                com.mbridge.msdk.mbbanner.common.manager.a.b().a(2, a.this.f34546b, a.this.f34545a, null, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.mbridge.msdk.foundation.error.b bVar) {
        CampaignUnit campaignUnit;
        String strL = "";
        if (bVar != null) {
            try {
                strL = bVar.l();
                if (TextUtils.isEmpty(str)) {
                    str = bVar.k();
                }
            } catch (Throwable th2) {
                q0.b(f34544x, th2.getMessage());
            }
        }
        if (TextUtils.isEmpty(str) && (campaignUnit = this.f34556m) != null) {
            str = campaignUnit.getLocalRequestId();
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f34545a, str);
        CampaignUnit campaignUnit2 = this.f34556m;
        cVarA.b(campaignUnit2 != null ? campaignUnit2.getAds() : null);
        cVarA.a(bVar);
        CampaignUnit campaignUnit3 = this.f34556m;
        if (campaignUnit3 != null && !campaignUnit3.getAds().isEmpty()) {
            cVarA.d(TextUtils.isEmpty(this.f34556m.getAds().get(0).getBannerUrl()) ? 1 : 2);
        }
        cVarA.b(true);
        com.mbridge.msdk.mbbanner.common.report.a.a("2000047", cVarA, (e) null);
        BannerAdListener bannerAdListener = this.l;
        if (bannerAdListener != null) {
            bannerAdListener.onLoadFailed(this.f34548d, strL);
        }
    }

    public void b() {
        k();
        c cVar = this.f34557n;
        if (cVar != null) {
            cVar.b(this.f34560q);
            this.f34557n.d(this.f34561r);
        }
    }

    public void c(boolean z10) {
        this.f34561r = z10;
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, com.mbridge.msdk.foundation.error.b bVar) {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f34545a, bVar == null ? this.f34556m.getLocalRequestId() : bVar.k());
            e eVar = new e();
            eVar.a("result", Integer.valueOf(i10));
            CampaignUnit campaignUnit = this.f34556m;
            if (campaignUnit != null && !campaignUnit.getAds().isEmpty()) {
                CampaignEx campaignEx = this.f34556m.getAds().get(0);
                if (campaignEx != null) {
                    cVarA.d(TextUtils.isEmpty(campaignEx.getBannerUrl()) ? 2 : 1);
                }
                cVarA.b(this.f34556m.getAds());
            }
            if (bVar != null) {
                cVarA.a(bVar);
            }
            com.mbridge.msdk.mbbanner.common.report.a.a("2000126", cVarA, eVar);
        } catch (Exception e10) {
            q0.b(f34544x, e10.getMessage());
        }
    }

    public void a(BannerSize bannerSize) {
        if (bannerSize != null) {
            this.f34552h = bannerSize.getHeight();
            this.f34553i = bannerSize.getWidth();
        }
    }

    public void a(boolean z10) {
        this.f34549e = z10;
        this.f34550f = z10 ? 1 : 2;
    }

    public void a(String str, String str2) {
        boolean zB;
        if (this.f34552h >= 1 && this.f34553i >= 1) {
            try {
                zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.n().d());
            } catch (Exception e10) {
                q0.b(f34544x, e10.getMessage());
                zB = false;
            }
            if (!zB) {
                a(str2, new com.mbridge.msdk.foundation.error.b(880029));
                return;
            }
            this.f34547c = str2;
            com.mbridge.msdk.mbbanner.common.data.a aVar = new com.mbridge.msdk.mbbanner.common.data.a(this.f34553i + "x" + this.f34552h, this.f34554j * 1000);
            aVar.a(str);
            aVar.c(this.f34546b);
            aVar.b(str2);
            com.mbridge.msdk.mbbanner.common.manager.a.b().b(this.f34546b, this.f34545a, aVar, this.f34566w);
            com.mbridge.msdk.mbbanner.common.manager.a.b().a(1, this.f34546b, this.f34545a, aVar, this.f34566w);
            return;
        }
        a(str2, new com.mbridge.msdk.foundation.error.b(880037));
    }

    public void a(BannerAdListener bannerAdListener) {
        this.l = bannerAdListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar) {
        a(this.f34547c, bVar);
        if (bVar.g() != 880044) {
            c();
        }
    }

    public void a(int i10, int i11, int i12, int i13) {
        c cVar = this.f34557n;
        if (cVar != null) {
            cVar.a(i10, i11, i12, i13);
        }
    }
}
