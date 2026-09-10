package com.smartdigimkt.f5;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f35083b = "b";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, c> f35084a;

    /* JADX INFO: renamed from: com.smartdigimkt.f5.b$b, reason: collision with other inner class name */
    public static class C0481b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f35085a = new b();

        private C0481b() {
        }
    }

    public static abstract class c implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map<String, Object> f35086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f35087b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile boolean f35088c = false;

        public class a implements com.smartdigimkt.i7.a.InterfaceC0508a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f35089a;

            public a(String str) {
                this.f35089a = str;
            }

            @Override // com.smartdigimkt.i7.a.InterfaceC0508a
            public void a(String str) {
                if (!this.f35089a.equals(str) || c.this.f35088c) {
                    return;
                }
                c.this.a(3);
                c.this.c();
            }
        }

        public c() {
        }

        public abstract void a(j jVar);

        public abstract void a(com.smartdigimkt.v3.h hVar);

        public abstract void a(boolean z2);

        public int b() {
            return this.f35087b;
        }

        public abstract void b(j jVar);

        public void c() {
            if (this.f35088c) {
                return;
            }
            this.f35088c = true;
            Map<String, Object> map = this.f35086a;
            if (map != null) {
                map.put("close_scene", Integer.valueOf(this.f35087b));
            }
        }

        public abstract void d();

        public abstract void e();

        public abstract void f();

        public void a(int i2) {
            this.f35087b = i2;
        }

        public c(Map<String, Object> map, String str) {
            this.f35086a = map;
            com.smartdigimkt.i7.a.a().a(str, new a(str));
        }
    }

    public static b a() {
        return C0481b.f35085a;
    }

    public void b(String str) {
        this.f35084a.remove(str);
    }

    private b() {
        this.f35084a = new HashMap(2);
    }

    public void a(String str, c cVar) {
        this.f35084a.put(str, cVar);
    }

    public c a(String str) {
        return this.f35084a.get(str);
    }
}
