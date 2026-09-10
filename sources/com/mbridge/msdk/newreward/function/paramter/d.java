package com.mbridge.msdk.newreward.function.paramter;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.same.net.wrapper.f;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.newreward.function.core.request.h;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.net.URLEncoder;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class d extends a {
    private String b;
    private int c;
    private String d;
    private int e;

    public void a(String str) {
        this.b = str;
    }

    public void b(String str) {
        this.d = str;
    }

    public String c() {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : d().entrySet()) {
                if (sb.length() > 0) {
                    sb.append('&');
                }
                sb.append(URLEncoder.encode(entry.getKey(), C.UTF8_NAME));
                sb.append("=");
                sb.append(URLEncoder.encode(entry.getValue(), C.UTF8_NAME));
            }
        } catch (Throwable th) {
            o0.b("RewardSettingReqParameters", th.getMessage());
        }
        return sb.toString();
    }

    public Map<String, String> d() {
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e(a());
        if (this.e == h.A && !TextUtils.isEmpty(this.b)) {
            eVar.a("unit_ids", "[" + this.b + "]");
        }
        eVar.a("vtag", TextUtils.isEmpty(this.d) ? "" : this.d);
        if (com.mbridge.msdk.util.b.a()) {
            String strB = Aa.b();
            if (!TextUtils.isEmpty(strB)) {
                eVar.a("keyword", strB);
            }
        }
        com.mbridge.msdk.setting.net.d.a(com.mbridge.msdk.foundation.controller.c.n().d(), eVar);
        f.h(eVar);
        f.k(eVar);
        return eVar.a();
    }

    public String e() {
        return this.b;
    }

    public void a(int i) {
        this.c = i;
    }

    public void b(int i) {
        this.e = i;
    }
}
