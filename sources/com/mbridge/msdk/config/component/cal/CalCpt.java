package com.mbridge.msdk.config.component.cal;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.C0375hc;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.config.component.nori.NoriCpt;
import com.mbridge.msdk.config.manager.callback.b;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class CalCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.cal.model.a f31834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MBridgeIds f31835i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f31836j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f31837k;
    private String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f31838m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f31839n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f31840o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f31841p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Object f31842q;

    private void a(boolean z10, String str, String str2) {
        HashMap map = new HashMap();
        map.put(c.c("500"), z10 ? "1" : "0");
        if (!z10) {
            map.put(c.c("code"), str);
            map.put(c.c("reason"), str2);
        }
        a(a("910002", (Map<String, Object>) map));
    }

    private String h() {
        Map<String, Object> mapF = this.f31834h.f();
        this.f31836j = f2.l("107", mapF);
        this.f31837k = f2.l("cbType", mapF);
        this.l = f2.l("110", mapF);
        this.f31838m = f2.l("111", mapF);
        this.f31839n = f2.l("106", mapF);
        this.f31840o = f2.l("108", mapF);
        this.f31841p = f2.l("109", mapF);
        Object objB = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) this.f31826d.b((Object) "adModel")).b((Object) "host");
        StringBuilder sb2 = new StringBuilder();
        if (objB instanceof String) {
            sb2.append(objB);
            sb2.append("/addReward?user_id=");
            sb2.append(this.f31836j);
            sb2.append("&cb_type=");
            sb2.append(this.f31837k);
            sb2.append("&reward_name=");
            sb2.append(this.l);
            sb2.append("&reward_amount=");
            sb2.append(this.f31838m);
            sb2.append("&unit_id=");
            sb2.append(this.f31839n);
            sb2.append("&click_id=");
            sb2.append(this.f31840o);
            sb2.append("&extra=");
            sb2.append(this.f31841p);
        }
        return sb2.toString();
    }

    private void i() {
        Map<String, Object> mapF = this.f31834h.f();
        this.l = f2.l("110", mapF);
        this.f31838m = f2.l("111", mapF);
        RewardInfo rewardInfo = new RewardInfo(mapF.get(c.c("112")).equals("1"), 1);
        rewardInfo.setRewardName(this.l);
        rewardInfo.setRewardAmount(this.f31838m);
        Object obj = this.f31842q;
        if (obj instanceof b) {
            ((b) obj).onAdClose(this.f31835i, rewardInfo);
        }
    }

    private void j() {
        if (this.f31842q instanceof com.mbridge.msdk.config.manager.callback.a) {
            HashMap map = new HashMap();
            map.put(c.c("buyer_id"), this.f31834h.a());
            ((com.mbridge.msdk.config.manager.callback.a) this.f31842q).a(map);
        }
    }

    private void k() {
        Object obj = this.f31842q;
        if (obj instanceof b) {
            ((b) obj).onEndCardShow(this.f31835i);
        }
    }

    private void l() {
        if (this.f31842q instanceof com.mbridge.msdk.config.manager.callback.a) {
            HashMap map = new HashMap();
            map.put(c.c(MBridgeConstans.PROPERTIES_UNIT_ID), this.f31834h.g());
            map.put(c.c("ready_state"), Boolean.valueOf(this.f31834h.e() == 1));
            ((com.mbridge.msdk.config.manager.callback.a) this.f31842q).a(map);
        }
    }

    private void m() {
        Object obj = this.f31842q;
        if (obj instanceof b) {
            ((b) obj).onVideoLoadFail(this.f31835i, this.f31834h.c() == null ? "" : this.f31834h.c());
        }
    }

    private void n() {
        Object obj = this.f31842q;
        if (obj instanceof b) {
            ((b) obj).onLoadSuccess(this.f31835i);
        }
    }

    private void o() {
        Object obj = this.f31842q;
        if (obj instanceof b) {
            ((b) obj).onVideoLoadSuccess(this.f31835i);
        }
    }

    private void p() {
        if (this.f31842q instanceof com.mbridge.msdk.config.manager.callback.a) {
            HashMap map = new HashMap();
            map.put(c.c("init_status"), Integer.valueOf(this.f31834h.d()));
            map.put(c.c("reason"), this.f31834h.c());
            ((com.mbridge.msdk.config.manager.callback.a) this.f31842q).a(map);
        }
    }

    private void q() {
        String strH = h();
        NoriCpt noriCpt = new NoriCpt();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("URLs", strH);
        map2.put("scheme", "HTTP");
        map2.put("method", C0375hc.f28788a);
        map.put("componentConfig", map2);
        noriCpt.a(map, this.f31826d, "");
        noriCpt.d();
    }

    private void r() {
        Object obj = this.f31842q;
        if (obj instanceof b) {
            ((b) obj).onShowFail(this.f31835i, this.f31834h.c() == null ? "" : this.f31834h.c());
        }
    }

    private void s() {
        Object obj = this.f31842q;
        if (obj instanceof b) {
            ((b) obj).onAdShow(this.f31835i);
        }
    }

    private void t() {
        Object obj = this.f31842q;
        if (obj instanceof b) {
            ((b) obj).onVideoAdClicked(this.f31835i);
        }
    }

    private void u() {
        Object obj = this.f31842q;
        if (obj instanceof b) {
            ((b) obj).onVideoComplete(this.f31835i);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f31828f = "910001";
        this.f31834h = new com.mbridge.msdk.config.component.cal.model.a(map);
        MBridgeIds mBridgeIds = new MBridgeIds();
        this.f31835i = mBridgeIds;
        mBridgeIds.setUnitId(this.f31834h.g());
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        try {
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.f31826d;
            if (aVar != null && aVar.a((Object) c.c("sdk_context"))) {
                Object objB = this.f31826d.b((Object) c.c("sdk_context"));
                if (objB instanceof Map) {
                    this.f31842q = ((Map) objB).get(c.c("callback"));
                }
            }
            if (this.f31842q == null) {
                a(false, "", "Callback Listener is NULL");
            }
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar2 = this.f31826d;
            if (aVar2 != null && aVar2.a((Object) c.c("51"))) {
                Object objB2 = this.f31826d.b((Object) c.c("51"));
                if (objB2 instanceof Map) {
                    String strValueOf = String.valueOf(((Map) objB2).get("id"));
                    if (!TextUtils.isEmpty(strValueOf) && strValueOf.contains("-")) {
                        this.f31835i.setContextId(strValueOf);
                    }
                }
            }
        } catch (Throwable th2) {
            q0.b("CalCpt", th2.getMessage(), th2);
        }
        g();
    }

    public void g() {
        String strB = this.f31834h.b();
        if (strB == null) {
            a(false, "900001", "command is null");
            return;
        }
        try {
            if (c.c("loadV3Success").equals(strB)) {
                n();
            } else if (c.c("loadSuccess").equals(strB)) {
                o();
            } else if (c.c("loadFailed").equals(strB)) {
                m();
            } else if (c.c("301").equals(strB)) {
                s();
            } else if (c.c("302").equals(strB)) {
                r();
            } else if (c.c("304").equals(strB)) {
                k();
            } else if (c.c("305").equals(strB)) {
                t();
            } else if (c.c("306").equals(strB)) {
                i();
            } else if (c.c("303").equals(strB)) {
                u();
            } else if (c.c("308").equals(strB)) {
                q();
            } else if (c.c("300").equals(strB)) {
                l();
            } else if (c.c("sdkInit").equals(strB)) {
                p();
            } else if (c.c("309").equals(strB)) {
                j();
            }
        } catch (Exception e10) {
            q0.b("CalCpt", e10.getMessage(), e10);
            a(false, "900002", "callback type failed");
        }
        a(true, "", "");
    }
}
