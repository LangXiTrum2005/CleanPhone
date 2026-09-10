package com.thinkup.core.common.on;

import com.thinkup.core.api.TUAdInfo;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class o000 {
    private Map<String, Object> m;
    private Map<String, String> m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private on f42224n;
    private Map<String, String> o0;
    private boolean om;
    private String on = "";
    final Object o = new Object();
    private JSONObject mo = null;
    private mmn mm = null;
    private Map<String, com.thinkup.core.common.om> oo = new ConcurrentHashMap(1);

    public final Map<String, Object> m() {
        return this.m;
    }

    public final on n() {
        return this.f42224n;
    }

    public final Object o() {
        return this.o;
    }

    public final boolean o0() {
        return this.om;
    }

    public final JSONObject om() {
        return this.mo;
    }

    public final String oo() {
        return this.on;
    }

    public final String m(String str) {
        Map<String, String> map = this.o0;
        return map == null ? "" : map.remove(str);
    }

    public final String n(String str) {
        Map<String, String> map = this.m0;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public final com.thinkup.core.common.om o(String str) {
        return this.oo.get(str);
    }

    public final void o(String str, com.thinkup.core.common.om omVar) {
        this.oo.put(str, omVar);
    }

    public final void o(Map<String, Object> map) {
        this.m = map;
    }

    public final void m(String str, String str2) {
        if (this.m0 == null) {
            this.m0 = new ConcurrentHashMap(2);
        }
        this.m0.put(str, str2);
    }

    public final void o(String str, Object obj) {
        if (this.m == null) {
            this.m = new ConcurrentHashMap(2);
        }
        this.m.put(str, obj);
    }

    public final void o(TUAdInfo tUAdInfo) {
        if (tUAdInfo != null) {
            this.f42224n = new on(tUAdInfo.getAdsourceId(), tUAdInfo.getShowId(), tUAdInfo.getNetworkFirmId());
        } else {
            this.f42224n = null;
        }
    }

    public final void o(String str, String str2) {
        synchronized (this) {
            try {
                if (this.o0 == null) {
                    this.o0 = new ConcurrentHashMap(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.o0.put(str, str2);
    }

    public final void o(boolean z2) {
        this.om = z2;
    }

    public final void o(Object[] objArr) {
        this.on = com.thinkup.core.common.ooo.o00.o(objArr);
    }

    public final void o(JSONObject jSONObject) {
        this.mo = jSONObject;
    }

    public final void o(String str, List<o> list) {
        if (this.mm == null) {
            this.mm = new mmn();
        }
        this.mm.o(str, list);
    }

    public final void o(String str, String str2, String str3) {
        mmn mmnVar = this.mm;
        if (mmnVar != null) {
            mmnVar.o(str, str2, str3);
        }
    }
}
