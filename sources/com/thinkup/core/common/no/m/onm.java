package com.thinkup.core.common.no.m;

import android.support.v4.media.a;
import com.applovin.impl.Z;
import com.p004ironsource.ko;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class onm {
    final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final ooo f42076n;
    final oom o;
    final onn o0;
    private volatile o0 om;
    final Map<Class<?>, Object> oo;

    public static class o {
        String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        ooo.o f42077n;
        oom o;
        onn o0;
        Map<Class<?>, Object> oo;

        public o() {
            this.oo = Collections.EMPTY_MAP;
            this.m = ko.f25534a;
            this.f42077n = new ooo.o();
        }

        private o m(String str, String str2) {
            this.f42077n.o(str, str2);
            return this;
        }

        private o n() {
            return o("HEAD", (onn) null);
        }

        private o o0() {
            return o("DELETE", com.thinkup.core.common.no.m.o.n.oo);
        }

        public final o o(oom oomVar) {
            if (oomVar == null) {
                throw new NullPointerException("url == null");
            }
            this.o = oomVar;
            return this;
        }

        private o n(onn onnVar) {
            return o("PUT", onnVar);
        }

        public final o m(String str) {
            this.f42077n.m(str);
            return this;
        }

        private o m(onn onnVar) {
            return o("DELETE", onnVar);
        }

        private o o0(onn onnVar) {
            return o("PATCH", onnVar);
        }

        public final o o(String str) {
            String str2;
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    str2 = "http:" + str.substring(3);
                } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    str2 = "https:" + str.substring(4);
                } else {
                    str2 = str;
                }
                return o(oom.o0(str2));
            }
            throw new NullPointerException("url == null");
        }

        public final onm m() {
            if (this.o != null) {
                return new onm(this);
            }
            throw new IllegalStateException("url == null");
        }

        public o(onm onmVar) {
            Map<Class<?>, Object> map = Collections.EMPTY_MAP;
            this.oo = map;
            this.o = onmVar.o;
            this.m = onmVar.m;
            this.o0 = onmVar.o0;
            this.oo = onmVar.oo.isEmpty() ? map : new LinkedHashMap<>(onmVar.oo);
            this.f42077n = onmVar.f42076n.m();
        }

        private o o(URL url) {
            if (url != null) {
                return o(oom.o0(url.toString()));
            }
            throw new NullPointerException("url == null");
        }

        public final o o(String str, String str2) {
            this.f42077n.o0(str, str2);
            return this;
        }

        public final o o(ooo oooVar) {
            this.f42077n = oooVar.m();
            return this;
        }

        private o o(o0 o0Var) {
            String string = o0Var.toString();
            return string.isEmpty() ? m("Cache-Control") : o("Cache-Control", string);
        }

        public final o o() {
            return o(ko.f25534a, (onn) null);
        }

        private o o(onn onnVar) {
            return o(ko.f25535b, onnVar);
        }

        public final o o(String str, onn onnVar) {
            if (str != null) {
                if (str.length() == 0) {
                    throw new IllegalArgumentException("method.length() == 0");
                }
                if (onnVar != null && !com.thinkup.core.common.no.m.o.n.om.n(str)) {
                    throw new IllegalArgumentException(a.n("method ", str, " must not have a request body."));
                }
                if (onnVar == null && com.thinkup.core.common.no.m.o.n.om.m(str)) {
                    throw new IllegalArgumentException(a.n("method ", str, " must have a request body."));
                }
                this.m = str;
                this.o0 = onnVar;
                return this;
            }
            throw new NullPointerException("method == null");
        }

        private <T> o o(Class<? super T> cls, T t) {
            if (t == null) {
                this.oo.remove(cls);
                return this;
            }
            if (this.oo.isEmpty()) {
                this.oo = new LinkedHashMap();
            }
            this.oo.put(cls, cls.cast(t));
            return this;
        }

        private o o(Object obj) {
            if (obj == null) {
                this.oo.remove(Object.class);
                return this;
            }
            if (this.oo.isEmpty()) {
                this.oo = new LinkedHashMap();
            }
            this.oo.put(Object.class, Object.class.cast(obj));
            return this;
        }
    }

    public onm(o oVar) {
        this.o = oVar.o;
        this.m = oVar.m;
        this.f42076n = oVar.f42077n.o();
        this.o0 = oVar.o0;
        this.oo = com.thinkup.core.common.no.m.o.n.o(oVar.oo);
    }

    private Object m0() {
        return Object.class.cast(this.oo.get(Object.class));
    }

    public final String m() {
        return this.m;
    }

    public final ooo n() {
        return this.f42076n;
    }

    public final oom o() {
        return this.o;
    }

    public final onn o0() {
        return this.o0;
    }

    public final o0 om() {
        o0 o0Var = this.om;
        if (o0Var != null) {
            return o0Var;
        }
        o0 o0VarO = o0.o(this.f42076n);
        this.om = o0VarO;
        return o0VarO;
    }

    public final boolean on() {
        return this.o.n();
    }

    public final o oo() {
        return new o(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.m);
        sb.append(", url=");
        sb.append(this.o);
        sb.append(", tags=");
        return Z.o(sb, this.oo, AbstractJsonLexerKt.END_OBJ);
    }

    public final List<String> m(String str) {
        return this.f42076n.m(str);
    }

    public final String o(String str) {
        return this.f42076n.o(str);
    }

    private <T> T o(Class<? extends T> cls) {
        return cls.cast(this.oo.get(cls));
    }
}
