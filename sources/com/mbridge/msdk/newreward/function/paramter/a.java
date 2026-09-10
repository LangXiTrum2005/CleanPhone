package com.mbridge.msdk.newreward.function.paramter;

import android.content.Context;
import android.os.Build;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.f;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.out.MBConfiguration;
import com.umeng.analytics.pro.bc;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4304pL;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, String> f1715a;

    private static void b() {
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
        eVar.a("platform", "1");
        eVar.a(bc.y, Build.VERSION.RELEASE);
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        eVar.a("package_name", k0.t(contextD));
        eVar.a("app_version_name", k0.B(contextD));
        eVar.a("app_version_code", k0.A(contextD) + "");
        eVar.a(AdUnitActivity.EXTRA_ORIENTATION, k0.F(contextD) + "");
        eVar.a("model", k0.n());
        eVar.a("brand", k0.s());
        eVar.a("gaid2", f.c());
        eVar.a("gaid", "");
        int iS = k0.s(contextD);
        eVar.a(bc.T, iS + "");
        eVar.a("network_str", k0.a(contextD, iS));
        eVar.a(bc.N, k0.p(contextD));
        eVar.a(bc.M, k0.w());
        eVar.a("useragent", k0.i());
        eVar.a("sdk_version", MBConfiguration.SDK_VERSION);
        eVar.a("screen_size", k0.n(contextD) + "x" + k0.m(contextD));
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "app_id", com.mbridge.msdk.foundation.controller.c.n().b());
        eVar.a("band_width", com.mbridge.msdk.foundation.same.net.a.b().a() + "");
        eVar.a(C4304pL.OPEN, com.mbridge.msdk.foundation.same.a.S);
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            eVar.a("dev_source", "2");
        }
        if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
            eVar.a("re_domain", "1");
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strI = com.mbridge.msdk.foundation.controller.c.n().i();
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "sign", strI);
        eVar.a("ts", jCurrentTimeMillis + "");
        if (com.mbridge.msdk.util.b.a()) {
            eVar.a("st", SameMD5.getMD5(strI + jCurrentTimeMillis));
        } else {
            eVar.a("st", SameMD5.getMD5(jCurrentTimeMillis + strI));
        }
        f1715a = eVar.a();
    }

    public Map<String, String> a() {
        if (f1715a == null) {
            b();
        }
        a(f1715a);
        return f1715a;
    }

    private void a(Map<String, String> map) {
        if (map != null) {
            String strA = Aa.a();
            if (strA == null) {
                strA = "";
            }
            map.put("channel", strA);
        }
    }
}
