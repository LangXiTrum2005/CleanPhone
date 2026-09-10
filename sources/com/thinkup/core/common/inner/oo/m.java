package com.thinkup.core.common.inner.oo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class m {
    public static final String o = "m";
    private Map<String, AbstractC0660m> m;

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.oo.m$m, reason: collision with other inner class name */
    public static abstract class AbstractC0660m implements Serializable {
        private int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private volatile boolean f41829n = false;
        private Map<String, Object> o;

        public AbstractC0660m() {
        }

        public abstract void m();

        public abstract void m(oo ooVar);

        public abstract void n();

        public abstract void o();

        public abstract void o(com.thinkup.core.common.inner.m.o oVar);

        public abstract void o(oo ooVar);

        public abstract void o(boolean z2);

        public void o0() {
            if (this.f41829n) {
                return;
            }
            this.f41829n = true;
            Map<String, Object> map = this.o;
            if (map != null) {
                map.put("close_scene", Integer.valueOf(this.m));
            }
        }

        public final int oo() {
            return this.m;
        }

        public final void o(int i2) {
            this.m = i2;
        }

        private AbstractC0660m(Map<String, Object> map, final String str) {
            this.o = map;
            com.thinkup.core.common.oo0.o.o().o(str, new com.thinkup.core.common.oo0.o.InterfaceC0685o() { // from class: com.thinkup.core.common.inner.oo.m.m.1
                @Override // com.thinkup.core.common.oo0.o.InterfaceC0685o
                public final void o(String str2) {
                    if (!str.equals(str2) || AbstractC0660m.this.f41829n) {
                        return;
                    }
                    AbstractC0660m.this.o(3);
                    AbstractC0660m.this.o0();
                }
            });
        }
    }

    public static class o {
        private static final m o = new m(0);

        private o() {
        }
    }

    public /* synthetic */ m(byte b2) {
        this();
    }

    public static m o() {
        return o.o;
    }

    public final void m(String str) {
        this.m.remove(str);
    }

    private m() {
        this.m = new HashMap(2);
    }

    public final void o(String str, AbstractC0660m abstractC0660m) {
        this.m.put(str, abstractC0660m);
    }

    public final AbstractC0660m o(String str) {
        return this.m.get(str);
    }
}
