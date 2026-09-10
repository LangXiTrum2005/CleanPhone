package com.mbridge.msdk.video.module.listener.impl;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C0594u;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class k extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f37790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected CampaignEx f37791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected List<CampaignEx> f37792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f37793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.download.a f37794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.entity.c f37795f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f37796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected String f37797h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected com.mbridge.msdk.video.module.listener.a f37798i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f37799j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f37800k = false;
    private boolean l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f37801m = false;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                k kVar = k.this;
                if (!kVar.f37790a || kVar.f37791b == null || !a1.b(kVar.f37796g) || com.mbridge.msdk.foundation.controller.c.n().d() == null) {
                    return;
                }
                com.mbridge.msdk.foundation.db.i iVarA = com.mbridge.msdk.foundation.db.i.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                com.mbridge.msdk.foundation.entity.f fVar = new com.mbridge.msdk.foundation.entity.f();
                fVar.a(System.currentTimeMillis());
                fVar.b(k.this.f37796g);
                fVar.a(k.this.f37791b.getId());
                iVarA.a(fVar);
            } catch (Throwable th2) {
                q0.b("NotifyListener", th2.getMessage(), th2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                k kVar = k.this;
                if (kVar.f37790a && kVar.f37791b != null && a1.b(kVar.f37796g)) {
                    com.mbridge.msdk.videocommon.cache.a aVarA = com.mbridge.msdk.videocommon.cache.a.a();
                    k kVar2 = k.this;
                    aVarA.a(kVar2.f37791b, kVar2.f37796g);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
            try {
                com.mbridge.msdk.videocommon.cache.a aVarA2 = com.mbridge.msdk.videocommon.cache.a.a();
                k kVar3 = k.this;
                aVarA2.b(kVar3.f37797h, kVar3.f37791b.getAdType());
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    e11.printStackTrace();
                }
            } catch (Throwable th2) {
                q0.a("NotifyListener", th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).b(k.this.f37791b.getId());
            } catch (Throwable th2) {
                q0.b("NotifyListener", th2.getMessage(), th2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.videocommon.download.a aVar;
            try {
                if (s0.a().a("c_r_v_f_w_s_e", false)) {
                    return;
                }
                k kVar = k.this;
                if (!kVar.f37790a || (aVar = kVar.f37794e) == null) {
                    return;
                }
                if (aVar.h() != null && !TextUtils.isEmpty(k.this.f37794e.h().getVideoUrlEncode())) {
                    com.mbridge.msdk.foundation.db.m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(k.this.f37794e.h().getVideoUrlEncode());
                }
                if (TextUtils.isEmpty(k.this.f37794e.p())) {
                    return;
                }
                File file = new File(k.this.f37794e.p());
                if (file.exists() && file.isFile() && file.delete()) {
                    q0.a("NotifyListener", "DEL File :" + file.getAbsolutePath());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public k(CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, com.mbridge.msdk.videocommon.entity.c cVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i10, boolean z10) {
        this.f37793d = false;
        this.f37798i = new f();
        this.f37799j = 1;
        if (!z10 && campaignEx != null && a1.b(str2) && aVar != null && aVar2 != null) {
            this.f37791b = campaignEx;
            this.f37797h = str;
            this.f37796g = str2;
            this.f37794e = aVar;
            this.f37795f = cVar;
            this.f37798i = aVar2;
            this.f37790a = true;
            this.f37799j = i10;
            this.f37793d = false;
            return;
        }
        if (!z10 || campaignEx == null || !a1.b(str2) || aVar2 == null) {
            return;
        }
        this.f37791b = campaignEx;
        this.f37797h = str;
        this.f37796g = str2;
        this.f37794e = aVar;
        this.f37795f = cVar;
        this.f37798i = aVar2;
        this.f37790a = true;
        this.f37799j = i10;
        this.f37793d = true;
    }

    private void d() {
        if (!this.f37790a || com.mbridge.msdk.foundation.same.buffer.b.f33755k == null || TextUtils.isEmpty(this.f37791b.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.same.buffer.b.a(this.f37796g, this.f37791b, C0594u.f30746j);
    }

    private void f() {
        if (this.f37791b != null) {
            try {
                HashMap map = new HashMap();
                List<com.mbridge.msdk.foundation.entity.d> listA = com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f37791b.getCampaignUnitId(), this.f37791b.getRequestId());
                if (listA == null || listA.size() <= 0 || listA.get(0) == null) {
                    return;
                }
                if (listA.get(0).c() == 1) {
                    map.put("encrypt_p=", "encrypt_p=" + listA.get(0).b());
                    map.put("irlfa=", "irlfa=1");
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        CampaignEx campaignEx = this.f37791b;
                        campaignEx.setImpressionURL(campaignEx.getImpressionURL().replaceAll(str, str2));
                        CampaignEx campaignEx2 = this.f37791b;
                        campaignEx2.setOnlyImpressionURL(campaignEx2.getOnlyImpressionURL().replaceAll(str, str2));
                    }
                }
                q0.a("BidReplaceCampignDao", "removeReplace count " + com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f37791b.getRequestId()));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private void m() {
        new Thread(new c()).start();
    }

    public void a(CampaignEx campaignEx) {
        this.f37791b = campaignEx;
    }

    public void b(int i10) {
        if (this.f37791b != null) {
            if (i10 == 1 || i10 == 2) {
                com.mbridge.msdk.video.module.report.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f37791b, i10, this.f37799j);
            }
        }
    }

    public void c() {
        a aVar = new a();
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
        } else {
            aVar.run();
        }
    }

    public void e() {
        d dVar = new d();
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(dVar);
        } else {
            dVar.run();
        }
    }

    public void g() {
        if (!this.f37790a || this.f37791b == null) {
            return;
        }
        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000061", this.f37791b.getId(), this.f37791b.getRequestId(), this.f37791b.getRequestIdNotice(), this.f37796g, m0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
        nVar.b(this.f37791b.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
        com.mbridge.msdk.foundation.same.report.g.b(nVar, com.mbridge.msdk.foundation.controller.c.n().d(), this.f37796g);
    }

    public void h() {
        String str;
        try {
            if (!this.f37790a || this.f37800k || TextUtils.isEmpty(this.f37791b.getImpressionURL())) {
                return;
            }
            this.f37800k = true;
            if (this.f37791b.isBidCampaign()) {
                f();
            }
            String impressionURL = this.f37791b.getImpressionURL();
            if (this.f37791b.getSpareOfferFlag() == 1) {
                str = impressionURL + "&to=1&cbt=" + this.f37791b.getCbt() + "&tmorl=" + this.f37799j;
            } else {
                str = impressionURL + "&to=0&cbt=" + this.f37791b.getCbt() + "&tmorl=" + this.f37799j;
            }
            com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f37791b, this.f37796g, str, false, true, com.mbridge.msdk.click.retry.a.f31752m);
            com.mbridge.msdk.video.module.report.b.d(com.mbridge.msdk.foundation.controller.c.n().d(), this.f37791b);
            m();
            d();
        } catch (Throwable th2) {
            q0.b("NotifyListener", th2.getMessage(), th2);
        }
    }

    public void i() {
        CampaignEx campaignEx;
        Map<String, Long> map;
        String str;
        try {
            CampaignEx campaignEx2 = this.f37791b;
            if (campaignEx2 != null && campaignEx2.isDynamicView() && this.f37793d && !this.f37791b.isCampaignIsFiltered()) {
                this.l = true;
                return;
            }
            if (!this.f37790a || (campaignEx = this.f37791b) == null || TextUtils.isEmpty(campaignEx.getOnlyImpressionURL()) || (map = com.mbridge.msdk.foundation.same.buffer.b.l) == null || map.containsKey(this.f37791b.getOnlyImpressionURL()) || this.l) {
                return;
            }
            com.mbridge.msdk.foundation.same.buffer.b.l.put(this.f37791b.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
            String onlyImpressionURL = this.f37791b.getOnlyImpressionURL();
            if (this.f37791b.getSpareOfferFlag() == 1) {
                str = onlyImpressionURL + "&to=1&cbt=" + this.f37791b.getCbt() + "&tmorl=" + this.f37799j;
            } else {
                str = onlyImpressionURL + "&to=0&cbt=" + this.f37791b.getCbt() + "&tmorl=" + this.f37799j;
            }
            String str2 = str;
            if (!this.f37793d || this.f37791b.isCampaignIsFiltered()) {
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f37791b, this.f37796g, str2, false, true, com.mbridge.msdk.click.retry.a.f31753n);
                b();
            }
            this.l = true;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void j() {
        CampaignEx campaignEx;
        List<String> pv_urls;
        try {
            if (!this.f37790a || this.f37801m || (campaignEx = this.f37791b) == null) {
                return;
            }
            this.f37801m = true;
            if ((campaignEx.isDynamicView() && this.f37793d && !this.f37791b.isCampaignIsFiltered()) || (pv_urls = this.f37791b.getPv_urls()) == null || pv_urls.size() <= 0) {
                return;
            }
            Iterator<String> it = pv_urls.iterator();
            while (it.hasNext()) {
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f37791b, this.f37796g, it.next(), false, true);
            }
        } catch (Throwable th2) {
            q0.b("NotifyListener", th2.getMessage());
        }
    }

    public void k() {
        CampaignEx campaignEx = this.f37791b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getCampaignUnitId()) || this.f37791b.getNativeVideoTracking() == null || this.f37791b.getNativeVideoTracking().n() == null) {
            return;
        }
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        CampaignEx campaignEx2 = this.f37791b;
        com.mbridge.msdk.click.a.a(contextD, campaignEx2, campaignEx2.getCampaignUnitId(), this.f37791b.getNativeVideoTracking().n(), false, false);
    }

    public void l() {
        com.mbridge.msdk.videocommon.download.a aVar = this.f37794e;
        if (aVar != null) {
            aVar.d(true);
        }
    }

    public void a(List<CampaignEx> list) {
        this.f37792c = list;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        super.a(i10, obj);
        this.f37798i.a(i10, obj);
    }

    public void b() {
        try {
            b bVar = new b();
            if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(bVar);
            } else {
                bVar.run();
            }
        } catch (Throwable th2) {
            q0.b("NotifyListener", th2.getMessage(), th2);
        }
    }

    public void a(int i10, String str) {
        if (this.f37791b != null) {
            com.mbridge.msdk.foundation.same.report.g.c(new com.mbridge.msdk.foundation.entity.n("2000062", this.f37791b.getId(), this.f37791b.getRequestId(), this.f37791b.getRequestIdNotice(), this.f37796g, m0.s(com.mbridge.msdk.foundation.controller.c.n().d()), i10, str), com.mbridge.msdk.foundation.controller.c.n().d(), this.f37796g);
        }
    }

    public void b(String str) {
        try {
            if (this.f37791b != null) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("url", this.f37791b.getVideoUrlEncode());
                eVar.a("reason", str);
                String noticeUrl = this.f37791b.getNoticeUrl();
                String clickURL = this.f37791b.getClickURL();
                if (TextUtils.isEmpty(noticeUrl)) {
                    if (!TextUtils.isEmpty(clickURL)) {
                        eVar.a("offer_url", clickURL);
                    }
                } else {
                    eVar.a("offer_url", noticeUrl);
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000021", this.f37791b, eVar);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(int i10) {
        CampaignEx campaignEx = this.f37791b;
        if (campaignEx != null) {
            String noticeUrl = campaignEx.getNoticeUrl();
            if (TextUtils.isEmpty(noticeUrl)) {
                return;
            }
            if (i10 == 1 || i10 == 2) {
                if (!noticeUrl.contains("endscreen_type")) {
                    StringBuilder sb2 = new StringBuilder(noticeUrl);
                    if (noticeUrl.contains("?")) {
                        sb2.append("&endscreen_type=");
                        sb2.append(i10);
                    } else {
                        sb2.append("?endscreen_type=");
                        sb2.append(i10);
                    }
                    noticeUrl = sb2.toString();
                } else if (i10 == 2) {
                    if (noticeUrl.contains("endscreen_type=1")) {
                        noticeUrl = noticeUrl.replace("endscreen_type=1", "endscreen_type=2");
                    }
                } else if (noticeUrl.contains("endscreen_type=2")) {
                    noticeUrl = noticeUrl.replace("endscreen_type=2", "endscreen_type=1");
                }
                this.f37791b.setNoticeUrl(noticeUrl);
            }
        }
    }

    public void a() {
        com.mbridge.msdk.videocommon.download.b.getInstance().a(false);
    }

    public void a(String str) {
        List<CampaignEx> list;
        if (this.f37791b == null || (list = this.f37792c) == null || list.size() == 0 || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("camp_position")) {
                this.f37791b = this.f37792c.get(jSONObject.getInt("camp_position"));
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("NotifyListener", e10.getMessage());
            }
        }
    }
}
