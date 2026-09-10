package com.thinkup.core.common.inner.mixad;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class o {
    private static volatile o o;
    private final Map<String, com.thinkup.core.common.inner.mixad.n.o.o> m = new HashMap(2);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map<String, com.thinkup.core.common.mn.om.o.o.InterfaceC0665o> f41819n = new HashMap(2);
    private final Map<String, com.thinkup.core.common.mn.oo.o.o.InterfaceC0666o> o0 = new HashMap(2);

    private o() {
    }

    public static o o() {
        if (o == null) {
            synchronized (o.class) {
                try {
                    if (o == null) {
                        o = new o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o;
    }

    public final com.thinkup.core.common.mn.oo.o.o.InterfaceC0666o m(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.o0.remove(str);
    }

    public final com.thinkup.core.common.mn.om.o.o.InterfaceC0665o n(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f41819n.remove(str);
    }

    public final void o(String str, com.thinkup.core.common.inner.mixad.n.o.o oVar) {
        if (oVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.m.put(str, oVar);
    }

    public final com.thinkup.core.common.inner.mixad.n.o.o o(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.m.remove(str);
    }

    public final void o(String str, com.thinkup.core.common.mn.oo.o.o.InterfaceC0666o interfaceC0666o) {
        if (interfaceC0666o == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.o0.put(str, interfaceC0666o);
    }

    public final void o(String str, com.thinkup.core.common.mn.om.o.o.InterfaceC0665o interfaceC0665o) {
        if (interfaceC0665o == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f41819n.put(str, interfaceC0665o);
    }
}
