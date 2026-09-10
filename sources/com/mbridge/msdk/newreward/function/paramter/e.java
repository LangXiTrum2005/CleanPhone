package com.mbridge.msdk.newreward.function.paramter;

import android.content.Context;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.wrapper.f;
import com.mbridge.msdk.foundation.tools.t;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.CustomInfoManager;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.l;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class e extends a {
    private final int d;
    private final String e;
    private final String f;
    private final boolean g;
    private final String h;
    private int i;
    private final Map<String, String> b = new HashMap();
    private boolean j = false;
    private final Context c = com.mbridge.msdk.foundation.controller.c.n().d();

    public e(int i, String str, String str2, boolean z, String str3) {
        this.d = i;
        this.e = str;
        this.f = str2;
        this.g = z;
        this.h = str3;
    }

    public void a(boolean z) {
        this.j = z;
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b.put(com.mbridge.msdk.foundation.same.net.wrapper.e.h, str);
    }

    public int c() {
        return this.d;
    }

    public String d() {
        return this.h;
    }

    public String e() {
        return this.e;
    }

    public Map<String, String> f() {
        int iE;
        int iB;
        Map<String, String> mapA = a();
        if (mapA != null) {
            this.b.putAll(mapA);
        }
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e(this.b);
        if (com.mbridge.msdk.util.b.a()) {
            eVar.a("gp_version", t.d(this.c));
        }
        eVar.a("version_flag", "1");
        if (com.mbridge.msdk.util.b.a()) {
            com.mbridge.msdk.foundation.controller.authoritycontroller.c.c(true);
        }
        eVar.a("misk_spt", String.valueOf(t0.a()));
        String strC = t0.c();
        if (!TextUtils.isEmpty(strC)) {
            eVar.a("misk_spt_det", strC);
        }
        String strG = g();
        if (strG != null) {
            String customInfoByUnitId = CustomInfoManager.getInstance().getCustomInfoByUnitId(strG, h() ? 7 : 8);
            if (!TextUtils.isEmpty(customInfoByUnitId)) {
                eVar.a("ch_info", customInfoByUnitId);
            }
            l lVarE = h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), strG);
            if (lVarE != null && !TextUtils.isEmpty(lVarE.a())) {
                eVar.a("u_stid", lVarE.a());
            }
        }
        String strA = com.mbridge.msdk.foundation.same.buffer.b.a(g(), "reward");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, MBridgeConstans.PROPERTIES_UNIT_ID, g());
        if (!TextUtils.isEmpty(e())) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, MBridgeConstans.PLACEMENT_ID, e());
        }
        com.mbridge.msdk.videocommon.setting.c cVarD = com.mbridge.msdk.videocommon.setting.b.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), g());
        if (cVarD != null) {
            iE = cVarD.e();
            iB = cVarD.b();
        } else {
            iE = 0;
            iB = 0;
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ad_num", String.valueOf(iE));
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "tnum", String.valueOf(c() != 287 ? iB : 1));
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "only_impression", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ping_mode", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, com.mbridge.msdk.foundation.same.net.wrapper.e.g, strA);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, CampaignEx.JSON_KEY_AD_SOURCE_ID, "1");
        String str = com.mbridge.msdk.foundation.same.net.wrapper.e.i;
        String str2 = MBridgeGlobalCommon.SESSION_ID;
        if (str2 == null) {
            str2 = "";
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, str, str2);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ad_type", String.valueOf(c()));
        if (!TextUtils.isEmpty(d())) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, BidResponsed.KEY_TOKEN, d());
        }
        if (c() == 287) {
            int i = this.i;
            if (i == com.mbridge.msdk.foundation.same.a.I || i == com.mbridge.msdk.foundation.same.a.H) {
                com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ivrwd", "1");
            } else {
                com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ivrwd", "0");
            }
        }
        if (cVarD != null && !TextUtils.isEmpty(cVarD.a())) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "u_stid", cVarD.a());
        }
        com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
        if (aVarC != null && !TextUtils.isEmpty(aVarC.a())) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "r_stid", aVarC.a());
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "rw_plus", this.j ? "1" : "0");
        String strD = t0.d(g());
        if (!TextUtils.isEmpty(strD)) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "j", strD);
        }
        f.a(eVar, this.c);
        f.b(eVar);
        f.d(eVar);
        f.j(eVar);
        f.k(eVar);
        return eVar.a();
    }

    public String g() {
        return this.f;
    }

    public boolean h() {
        return this.g;
    }

    public void a(int i) {
        this.i = i;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b.put(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, str);
    }

    public void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b.put(com.mbridge.msdk.foundation.same.net.wrapper.e.i, str);
    }

    public void e(String str) {
        if (!TextUtils.isEmpty(str) && com.mbridge.msdk.util.b.a() && com.mbridge.msdk.util.b.a()) {
            this.b.put("ttc_ids", str);
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str) || !com.mbridge.msdk.util.b.a()) {
            return;
        }
        this.b.put("install_ids", str);
    }

    public void b(int i) {
        this.b.put(TypedValues.CycleType.S_WAVE_OFFSET, String.valueOf(i));
    }

    public void b(Map<String, String> map) {
        if (this.b == null || map == null || map.isEmpty()) {
            return;
        }
        this.b.putAll(map);
    }

    public void c(int i) {
        this.b.put("req_type", String.valueOf(i));
    }
}
