package com.mbridge.msdk.mbbid.common.net;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.O6;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.same.net.wrapper.f;
import com.mbridge.msdk.foundation.same.net.wrapper.h;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends h {
    public a(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.foundation.same.net.wrapper.h, com.mbridge.msdk.foundation.same.net.wrapper.c
    public void addExtraParams(String str, e eVar) {
        super.addExtraParams(str, eVar);
        g gVarI = f2.i(i.b());
        if (gVarI == null) {
            gVarI = i.b().a();
        }
        eVar.a(O6.H, "1");
        eVar.a("os_version", Build.VERSION.RELEASE);
        eVar.a("package_name", m0.t(this.mContext));
        eVar.a("app_version_name", m0.C(this.mContext));
        eVar.a("app_version_code", m0.B(this.mContext) + "");
        eVar.a(O6.B, m0.o());
        eVar.a("brand", m0.t());
        eVar.a(O6.X0, "");
        eVar.a("gaid2", com.mbridge.msdk.foundation.tools.g.c());
        int iS = m0.s(this.mContext);
        eVar.a("network_type", iS + "");
        eVar.a("network_str", m0.a(this.mContext, iS) + "");
        eVar.a("language", m0.p(this.mContext));
        eVar.a("timezone", m0.y());
        eVar.a("useragent", m0.i());
        eVar.a("sdk_version", MBConfiguration.SDK_VERSION);
        eVar.a("screen_size", m0.n(this.mContext) + "x" + m0.m(this.mContext));
        b.a(eVar, gVarI, this.mContext);
        f.a(eVar, this.mContext);
        f.b(eVar);
        f.d(eVar);
        f.j(eVar);
    }
}
