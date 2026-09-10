package com.p004ironsource;

import android.app.Activity;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3369m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c2 f25659a;

    public C3369m0(c2 c2Var) {
        this.f25659a = c2Var;
    }

    public void a() {
        this.f25659a.a(z1.SESSION_CAPPED, null);
    }

    public void b(String str) {
        a(str, (String) null);
    }

    public void c(String str) {
        this.f25659a.a(z1.AD_DISMISS_SCREEN, a.s("placement", str));
    }

    public void d(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f25659a.a(z1.AD_ENDED, map);
    }

    public void e(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f25659a.a(z1.AD_INFO_CHANGED, map);
    }

    public void f(String str) {
        this.f25659a.a(z1.AD_LEFT_APPLICATION, a.s("placement", str));
    }

    public void g(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f25659a.a(z1.AD_OPENED, map);
    }

    public void h(String str) {
        this.f25659a.a(z1.AD_PRESENT_SCREEN, a.s("placement", str));
    }

    public void i(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f25659a.a(z1.AD_STARTED, map);
    }

    public void j(String str) {
        this.f25659a.a(z1.AD_VIEW_BOUND, a.s("placement", str));
    }

    public void k(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f25659a.a(z1.AD_VISIBLE, map);
    }

    public void l(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f25659a.a(z1.SHOW_AD_SUCCESS, map);
    }

    public void a(Activity activity, String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        if (activity != null) {
            map.put(IronSourceConstants.EVENTS_EXT1, IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW);
        }
        this.f25659a.a(z1.SHOW_AD, map);
    }

    public void b(String str, String str2) {
        HashMap mapS = a.s("placement", str);
        if (!TextUtils.isEmpty(str2)) {
            mapS.put("reason", str2);
        }
        this.f25659a.a(z1.PLACEMENT_CAPPED, mapS);
    }

    public void a(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f25659a.a(z1.AD_CLICKED, map);
    }

    public void a(String str, int i2, String str2, String str3) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        map.put("errorCode", Integer.valueOf(i2));
        map.put("reason", str2);
        if (!TextUtils.isEmpty(str3)) {
            map.put(IronSourceConstants.EVENTS_EXT1, str3);
        }
        this.f25659a.a(z1.SHOW_AD_FAILED, map);
    }

    public void a(String str, String str2) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            map.put(IronSourceConstants.EVENTS_EXT1, str2);
        }
        this.f25659a.a(z1.AD_CLOSED, map);
    }

    public void a(String str, String str2, int i2, long j, String str3, long j2, Map<String, Object> map, String str4) {
        HashMap map2 = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map2.put("placement", str);
        }
        map2.put(IronSourceConstants.EVENTS_REWARD_NAME, str2);
        map2.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(i2));
        map2.put(IronSourceConstants.EVENTS_TRANS_ID, str3);
        if (j2 != 0) {
            map2.put("duration", Long.valueOf(j2));
        }
        if (map != null) {
            map2.putAll(map);
        }
        if (!TextUtils.isEmpty(str4)) {
            map2.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, str4);
        }
        this.f25659a.a(z1.AD_REWARDED, map2, j);
    }

    public void a(String str, String str2, boolean z2) {
        HashMap map = new HashMap();
        map.put("isMultipleAdUnits", 1);
        map.put("placement", str);
        if (!TextUtils.isEmpty(str2)) {
            map.put("reason", str2);
        }
        map.put(IronSourceConstants.EVENTS_EXT1, z2 ? com.p004ironsource.mediationsdk.metadata.a.g : "false");
        map.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        this.f25659a.a(z1.CHECK_PLACEMENT_CAPPED, map);
    }

    public void a(boolean z2) {
        HashMap map = new HashMap();
        map.put("status", z2 ? com.p004ironsource.mediationsdk.metadata.a.g : "false");
        this.f25659a.a(z1.SHOW_AD_CHANCE, map);
    }
}
