package com.thinkup.core.common.om;

import android.support.v4.media.a;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.common.n.mo;

/* JADX INFO: loaded from: classes6.dex */
public final class o {
    public static final String m = "https://se.rfvtgbyhn.com/v2/open/ns";
    public static final String m0 = "https://tk.robin-flow.com/v1/open/tk";
    public static final String mm;
    public static final String mn;
    public static final String mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f42183n = "https://api.robin-flow.com/v2/open/app";
    public static final String n0;
    public static final String nm = "";
    public static final String nn;
    public static final String no;
    protected static final String o = "api.robin-flow.com";
    public static final String o0 = "https://api.robin-flow.com/v2/open/placement";
    public static final String o00;
    public static final String o0m;
    public static final String o0n = "https://img.robin-flow.com/gdpr/PrivacyPolicySetting.html";
    public static final String o0o;
    public static final String om = "https://api.robin-flow.com/v2/open/pl_wf";
    public static final String on = "https://da.robin-flow.com/v1/open/da";
    public static final String oo = "https://ssapi.robin-flow.com/sdk/realtime_waterfall";

    static {
        String strO0;
        StringBuilder sb = new StringBuilder("https://");
        if (TUSDK.isCnSDK()) {
            strO0 = "api.robin-flow.com";
        } else {
            n.o();
            strO0 = n.o0();
        }
        mo = a.r(sb, strO0, "/v2/open/eu");
        mm = "https://adx.robin-flow.com/bid";
        mn = "https://adx.robin-flow.com/request";
        n0 = "https://adxtk.robin-flow.com/v1";
        no = "https://adx.robin-flow.com/openapi/req";
        nn = "https://tk.robin-flow.com/ss/rrd";
        o00 = "https://api.robin-flow.com/v2/open/area";
        o0o = "https://api.robin-flow.com/v2/open/m_adapter";
        o0m = "https://api.robin-flow.com/v2/open/dna";
    }

    private static String m() {
        return mo.on.o.m;
    }

    private static String n() {
        return mo.on.o.f41908n;
    }

    public static String o() {
        return "api.robin-flow.com";
    }

    private static String o0() {
        return mo.on.o.o0;
    }

    private static String om() {
        return mo.on.o.oo;
    }

    private static String oo() {
        if (TUSDK.isCnSDK()) {
            return "api.robin-flow.com";
        }
        n.o();
        return n.o0();
    }
}
