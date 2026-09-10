package com.thinkup.core.common.o0m.o;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class no {
    private final Map<String, o> o = new HashMap();
    private final ReferenceQueue<Object> m = new ReferenceQueue<>();

    public static class o extends WeakReference<Object> {
        private final String o;

        public o(String str, Object obj, ReferenceQueue<Object> referenceQueue) {
            super(obj, referenceQueue);
            this.o = str;
        }
    }

    public final synchronized void m(String str) {
        this.o.remove(str);
    }

    public final synchronized Object o(String str) {
        m();
        o oVar = this.o.get(str);
        if (oVar == null) {
            return null;
        }
        return oVar.get();
    }

    private void m() {
        o oVar = (o) this.m.poll();
        while (oVar != null) {
            o oVar2 = this.o.get(oVar.o);
            if (oVar2 != null && oVar2.get() == null) {
                this.o.remove(oVar.o);
            }
            oVar = (o) this.m.poll();
        }
    }

    public final synchronized void o(String str, Object obj) {
        o oVar;
        try {
            m();
            if (obj != null && ((oVar = this.o.get(str)) == null || oVar.get() != obj)) {
                this.o.put(str, new o(str, obj, this.m));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void o() {
        this.o.clear();
        m();
    }
}
