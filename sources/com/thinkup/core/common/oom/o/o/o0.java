package com.thinkup.core.common.oom.o.o;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class o0 {
    private static volatile Map<String, Map<Class<? extends com.thinkup.core.common.oom.o.m.m>, com.thinkup.core.common.oom.o.m.m>> m = null;
    private static final String o = "o0";

    private static Map<Class<? extends com.thinkup.core.common.oom.o.m.m>, com.thinkup.core.common.oom.o.m.m> m(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (m == null) {
            synchronized (o0.class) {
                try {
                    if (m == null) {
                        m = new ConcurrentHashMap();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Map<Class<? extends com.thinkup.core.common.oom.o.m.m>, com.thinkup.core.common.oom.o.m.m> map = m.get(str);
        if (map != null) {
            return map;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        o oVar = new o();
        m mVar = new m(str, oVar);
        concurrentHashMap.put(com.thinkup.core.common.oom.o.m.oo.class, new oo(str, oVar, mVar));
        concurrentHashMap.put(com.thinkup.core.common.oom.o.m.n.class, oVar);
        concurrentHashMap.put(com.thinkup.core.common.oom.o.m.o0.class, mVar);
        m.put(str, concurrentHashMap);
        return concurrentHashMap;
    }

    public static <M extends com.thinkup.core.common.oom.o.m.m> M o(String str, Class<M> cls) {
        Map<Class<? extends com.thinkup.core.common.oom.o.m.m>, com.thinkup.core.common.oom.o.m.m> mapM = m(str);
        if (mapM != null) {
            return (M) mapM.get(cls);
        }
        return null;
    }

    public static void o(String str) {
        Map<Class<? extends com.thinkup.core.common.oom.o.m.m>, com.thinkup.core.common.oom.o.m.m> map;
        com.thinkup.core.common.oom.o.m.m mVar;
        if (m == null || TextUtils.isEmpty(str) || (map = m.get(str)) == null || map.isEmpty()) {
            return;
        }
        for (Class<? extends com.thinkup.core.common.oom.o.m.m> cls : map.keySet()) {
            if (cls != null && (mVar = map.get(cls)) != null) {
                mVar.m();
            }
        }
    }
}
