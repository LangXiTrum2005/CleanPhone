package com.ironsource;

import android.app.Activity;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F0 f26670a;

    public O(F0 f10) {
        this.f26670a = f10;
    }

    public void a(Activity activity, String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        if (activity != null) {
            map.put(IronSourceConstants.EVENTS_EXT1, IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW);
        }
        this.f26670a.a(C0.SHOW_AD, map);
    }

    public void b(String str) {
        a(str, (String) null);
    }

    public void c(String str) {
        this.f26670a.a(C0.AD_DISMISS_SCREEN, com.applovin.impl.ca.n("placement", str));
    }

    public void d(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f26670a.a(C0.AD_ENDED, map);
    }

    public void e(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f26670a.a(C0.AD_INFO_CHANGED, map);
    }

    public void f(String str) {
        this.f26670a.a(C0.AD_LEFT_APPLICATION, com.applovin.impl.ca.n("placement", str));
    }

    public void g(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f26670a.a(C0.AD_OPENED, map);
    }

    public void h(String str) {
        this.f26670a.a(C0.AD_PRESENT_SCREEN, com.applovin.impl.ca.n("placement", str));
    }

    public void i(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f26670a.a(C0.AD_STARTED, map);
    }

    public void j(String str) {
        this.f26670a.a(C0.AD_VIEW_BOUND, com.applovin.impl.ca.n("placement", str));
    }

    public void k(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f26670a.a(C0.AD_VISIBLE, map);
    }

    public void b(String str, String str2) {
        HashMap mapN = com.applovin.impl.ca.n("placement", str);
        if (!TextUtils.isEmpty(str2)) {
            mapN.put("reason", str2);
        }
        this.f26670a.a(C0.PLACEMENT_CAPPED, mapN);
    }

    public void a(boolean z10) {
        HashMap map = new HashMap();
        map.put("status", z10 ? com.ironsource.mediationsdk.metadata.a.f29610g : "false");
        this.f26670a.a(C0.SHOW_AD_CHANCE, map);
    }

    public void a(String str, int i10, String str2, Nd nd2) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        map.put("reason", str2);
        String strA = a(nd2);
        if (strA != null) {
            map.put(IronSourceConstants.EVENTS_EXT1, strA);
        }
        this.f26670a.a(C0.SHOW_AD_FAILED, map);
    }

    public void a(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f26670a.a(C0.AD_CLICKED, map);
    }

    public void a(String str, String str2) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            map.put(IronSourceConstants.EVENTS_EXT1, str2);
        }
        this.f26670a.a(C0.AD_CLOSED, map);
    }

    public void a(String str, String str2, int i10, long j10, String str3, long j11, Map<String, Object> map, String str4) {
        HashMap map2 = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map2.put("placement", str);
        }
        map2.put(IronSourceConstants.EVENTS_REWARD_NAME, str2);
        map2.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(i10));
        map2.put(IronSourceConstants.EVENTS_TRANS_ID, str3);
        if (j11 != 0) {
            map2.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j11));
        }
        if (map != null) {
            map2.putAll(map);
        }
        if (!TextUtils.isEmpty(str4)) {
            map2.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, str4);
        }
        this.f26670a.a(C0.AD_REWARDED, map2, j10);
    }

    public void a(String str, String str2, boolean z10) {
        HashMap map = new HashMap();
        map.put("isMultipleAdUnits", 1);
        map.put("placement", str);
        if (!TextUtils.isEmpty(str2)) {
            map.put("reason", str2);
        }
        map.put(IronSourceConstants.EVENTS_EXT1, z10 ? com.ironsource.mediationsdk.metadata.a.f29610g : "false");
        map.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        this.f26670a.a(C0.CHECK_PLACEMENT_CAPPED, map);
    }

    public void a() {
        this.f26670a.a(C0.SESSION_CAPPED, null);
    }

    private static String a(Nd nd2) {
        if (nd2 != Nd.NO_LOADED_ADS && nd2 != Nd.MAX_ATTEMPTS_REACHED) {
            return null;
        }
        return "recover show failed: " + nd2.b();
    }
}
