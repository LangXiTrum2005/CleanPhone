package com.smartdigimkt.u7;

import com.smartdigimkt.k8.c;
import com.smartdigimkt.l8.e;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f38929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Object> f38930c;
    private final c.a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f38931e;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f38932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e f38933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map<String, Object> f38934c;
        private c.a d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f38935e;

        public b(String str) {
            this.f38932a = str;
        }

        public b a(e eVar) {
            this.f38933b = eVar;
            return this;
        }

        public b a(Map<String, Object> map) {
            this.f38934c = map;
            return this;
        }

        public b a(c.a aVar) {
            this.d = aVar;
            return this;
        }

        public b a(boolean z2) {
            this.f38935e = z2;
            return this;
        }

        public a a() {
            return new a(this);
        }
    }

    public e a() {
        return this.f38929b;
    }

    public c.a b() {
        return this.d;
    }

    public String c() {
        return this.f38928a;
    }

    public Map<String, Object> d() {
        return this.f38930c;
    }

    public boolean e() {
        return this.f38931e;
    }

    private a(b bVar) {
        this.f38928a = bVar.f38932a;
        this.f38929b = bVar.f38933b;
        this.f38930c = bVar.f38934c;
        this.d = bVar.d;
        this.f38931e = bVar.f38935e;
    }
}
