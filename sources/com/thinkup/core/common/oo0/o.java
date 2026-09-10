package com.thinkup.core.common.oo0;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class o {
    private static volatile o o;
    private final Map<String, InterfaceC0685o> m = new ConcurrentHashMap(2);

    /* JADX INFO: renamed from: com.thinkup.core.common.oo0.o$o, reason: collision with other inner class name */
    public interface InterfaceC0685o {
        void o(String str);
    }

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

    public final void o(String str, InterfaceC0685o interfaceC0685o) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.m.put(str, interfaceC0685o);
    }

    public final void o(String str) {
        InterfaceC0685o interfaceC0685oRemove;
        if (TextUtils.isEmpty(str) || (interfaceC0685oRemove = this.m.remove(str)) == null) {
            return;
        }
        interfaceC0685oRemove.o(str);
    }
}
