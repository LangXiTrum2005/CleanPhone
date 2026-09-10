package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.C0375hc;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final s f36750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f36751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final r f36752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final z f36753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Map<Class<?>, Object> f36754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile c f36755f;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        s f36756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f36757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        r.a f36758c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        z f36759d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Map<Class<?>, Object> f36760e;

        public a() {
            this.f36760e = Collections.EMPTY_MAP;
            this.f36757b = C0375hc.f28788a;
            this.f36758c = new r.a();
        }

        public a a(s sVar) {
            if (sVar == null) {
                throw new NullPointerException("url == null");
            }
            this.f36756a = sVar;
            return this;
        }

        public a b(String str) {
            String str2;
            if (str == null) {
                throw new NullPointerException("url == null");
            }
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                str2 = "http:" + str.substring(3);
            } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                str2 = "https:" + str.substring(4);
            } else {
                str2 = str;
            }
            return a(s.b(str2));
        }

        public a c() {
            return a(C0375hc.f28788a, (z) null);
        }

        public a d() {
            return a("HEAD", (z) null);
        }

        public a c(z zVar) {
            return a(C0375hc.f28789b, zVar);
        }

        public a d(z zVar) {
            return a("PUT", zVar);
        }

        public a a(String str, String str2) {
            this.f36758c.a(str, str2);
            return this;
        }

        public a a(String str) {
            this.f36758c.b(str);
            return this;
        }

        public a(y yVar) {
            Map<Class<?>, Object> map = Collections.EMPTY_MAP;
            this.f36760e = map;
            this.f36756a = yVar.f36750a;
            this.f36757b = yVar.f36751b;
            this.f36759d = yVar.f36753d;
            this.f36760e = yVar.f36754e.isEmpty() ? map : new LinkedHashMap<>(yVar.f36754e);
            this.f36758c = yVar.f36752c.a();
        }

        public a a(r rVar) {
            this.f36758c = rVar.a();
            return this;
        }

        public a a(c cVar) {
            String string = cVar.toString();
            return string.isEmpty() ? a("Cache-Control") : b("Cache-Control", string);
        }

        public a b(String str, String str2) {
            this.f36758c.c(str, str2);
            return this;
        }

        public a b() {
            return a(com.mbridge.msdk.thrid.okhttp.internal.c.f36261d);
        }

        public a a(z zVar) {
            return a("DELETE", zVar);
        }

        public a b(z zVar) {
            return a("PATCH", zVar);
        }

        public a a(String str, z zVar) {
            if (str != null) {
                if (str.length() != 0) {
                    if (zVar != null && !com.mbridge.msdk.thrid.okhttp.internal.http.f.a(str)) {
                        throw new IllegalArgumentException(defpackage.e.o("method ", str, " must not have a request body."));
                    }
                    if (zVar == null && com.mbridge.msdk.thrid.okhttp.internal.http.f.d(str)) {
                        throw new IllegalArgumentException(defpackage.e.o("method ", str, " must have a request body."));
                    }
                    this.f36757b = str;
                    this.f36759d = zVar;
                    return this;
                }
                throw new IllegalArgumentException("method.length() == 0");
            }
            throw new NullPointerException("method == null");
        }

        public y a() {
            if (this.f36756a != null) {
                return new y(this);
            }
            throw new IllegalStateException("url == null");
        }
    }

    public y(a aVar) {
        this.f36750a = aVar.f36756a;
        this.f36751b = aVar.f36757b;
        this.f36752c = aVar.f36758c.a();
        this.f36753d = aVar.f36759d;
        this.f36754e = com.mbridge.msdk.thrid.okhttp.internal.c.a(aVar.f36760e);
    }

    public String a(String str) {
        return this.f36752c.b(str);
    }

    public c b() {
        c cVar = this.f36755f;
        if (cVar != null) {
            return cVar;
        }
        c cVarA = c.a(this.f36752c);
        this.f36755f = cVarA;
        return cVarA;
    }

    public r c() {
        return this.f36752c;
    }

    public boolean d() {
        return this.f36750a.h();
    }

    public String e() {
        return this.f36751b;
    }

    public a f() {
        return new a(this);
    }

    public s g() {
        return this.f36750a;
    }

    public String toString() {
        return "Request{method=" + this.f36751b + ", url=" + this.f36750a + ", tags=" + this.f36754e + '}';
    }

    public z a() {
        return this.f36753d;
    }
}
