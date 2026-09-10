package com.mbridge.msdk.foundation.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.ironsource.Xa;
import com.mbridge.msdk.foundation.same.broadcast.NetWorkChangeReceiver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f34119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.setting.k f34120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f34121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BroadcastReceiver f34122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    IntentFilter f34123e;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g0 f34124a = new g0();
    }

    public static g0 a() {
        return b.f34124a;
    }

    public String b() {
        try {
            if (this.f34119a == null) {
                this.f34119a = new JSONObject();
            }
            if (this.f34119a.length() < 2) {
                try {
                    this.f34119a.put("KEY_INFO", (String) d.a(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_INFO", ""));
                } catch (Exception e10) {
                    q0.b("NetAddressManager", e10.getMessage());
                }
                try {
                    this.f34119a.put("KEY_TIME", ((Long) d.a(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_TIME", 0L)).longValue());
                } catch (Exception e11) {
                    q0.b("NetAddressManager", e11.getMessage());
                }
            }
            String strOptString = this.f34119a.optString("KEY_INFO");
            if (TextUtils.isEmpty(strOptString)) {
                return "";
            }
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            return System.currentTimeMillis() - this.f34119a.optLong("KEY_TIME") > (gVarD != null ? gVarD.T() : 3600L) * 1000 ? "" : strOptString;
        } catch (Exception e12) {
            q0.b("NetAddressManager", e12.getMessage());
            return "";
        }
    }

    public void c() {
        Context contextD;
        try {
            if (com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b()).U() != 1 || (contextD = com.mbridge.msdk.foundation.controller.c.n().d()) == null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            this.f34123e = intentFilter;
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            contextD.registerReceiver(this.f34122d, this.f34123e);
        } catch (Exception e10) {
            q0.b("NetAddressManager", e10.getMessage());
        }
    }

    public void d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f34121c > Xa.C) {
            if (this.f34120b == null) {
                this.f34120b = new com.mbridge.msdk.setting.k();
            }
            this.f34120b.c(com.mbridge.msdk.foundation.controller.c.n().d(), com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c());
            this.f34121c = jCurrentTimeMillis;
        }
    }

    public void e() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD != null) {
            try {
                contextD.unregisterReceiver(this.f34122d);
            } catch (Exception e10) {
                q0.b("NetAddressManager", e10.getMessage());
            }
        }
    }

    private g0() {
        this.f34119a = new JSONObject();
        this.f34122d = new NetWorkChangeReceiver();
        IntentFilter intentFilter = new IntentFilter();
        this.f34123e = intentFilter;
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    }

    public void a(String str) {
        if (this.f34119a == null) {
            this.f34119a = new JSONObject();
        }
        try {
            if (!this.f34119a.optString("KEY_INFO", "").equals(str)) {
                this.f34119a.put("KEY_INFO", str);
                d.b(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_INFO", str);
            }
        } catch (Exception e10) {
            q0.b("NetAddressManager", e10.getMessage());
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f34119a.put("KEY_TIME", jCurrentTimeMillis);
            d.b(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_TIME", Long.valueOf(jCurrentTimeMillis));
        } catch (Exception e11) {
            q0.b("NetAddressManager", e11.getMessage());
        }
    }
}
