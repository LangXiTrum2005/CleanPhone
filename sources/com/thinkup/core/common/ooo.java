package com.thinkup.core.common;

import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.common.on.o000;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ooo {
    private static volatile ooo o;
    private ConcurrentHashMap<String, o000> m = new ConcurrentHashMap<>(4);

    private ooo() {
    }

    private synchronized o000 m0(String str) {
        o000 o000Var;
        o000Var = this.m.get(str);
        if (o000Var == null) {
            o000Var = new o000();
            this.m.put(str, o000Var);
        }
        return o000Var;
    }

    public static ooo o() {
        if (o == null) {
            synchronized (ooo.class) {
                try {
                    if (o == null) {
                        o = new ooo();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o;
    }

    public final synchronized Map<String, Object> m(String str) {
        HashMap map;
        map = new HashMap(2);
        Map<String, Object> mapM = m0(str).m();
        if (mapM != null) {
            map.putAll(mapM);
        }
        return map;
    }

    public final com.thinkup.core.common.on.on n(String str) {
        return m0(str).n();
    }

    public final void o0(String str) {
        m0(str).o((TUAdInfo) null);
    }

    public final String om(String str) {
        return m0(str).oo();
    }

    public final JSONObject on(String str) {
        return m0(str).om();
    }

    public final boolean oo(String str) {
        return m0(str).o0();
    }

    public final String m(String str, String str2) {
        return m0(str).m(str2);
    }

    public final Object o(String str) {
        return m0(str).o();
    }

    public final void m(String str, String str2, String str3) {
        m0(str).o(str, str2, str3);
    }

    public final om o(String str, String str2) {
        return m0(str).o(str2);
    }

    public final void o(String str, String str2, om omVar) {
        m0(str).o(str2, omVar);
    }

    public final synchronized void o(String str, Map<String, Object> map) {
        m0(str).o(com.thinkup.core.common.ooo.mo.o(map));
    }

    private synchronized void o(String str, String str2, Object obj) {
        m0(str).o(str2, obj);
    }

    public final void o(String str, TUAdInfo tUAdInfo) {
        m0(str).o(tUAdInfo);
    }

    public final void o(String str, String str2, String str3) {
        m0(str).o(str2, str3);
    }

    public final void o(String str, boolean z2) {
        m0(str).o(z2);
    }

    public final void o(String str, Object[] objArr) {
        m0(str).o(objArr);
    }

    public final void o(String str, int i2, String str2) {
        m0(str).m(String.valueOf(i2), str2);
    }

    public final String o(String str, int i2) {
        return m0(str).n(String.valueOf(i2));
    }

    public final void o(String str, JSONObject jSONObject) {
        m0(str).o(jSONObject);
    }

    public final void o(String str, String str2, List<com.thinkup.core.common.on.o> list) {
        m0(str).o(str2, list);
    }
}
