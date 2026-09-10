package com.adcolony.sdk;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a> f9270b = new ArrayList();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f9272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f9273c;
        private final String[] d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String[] f9274e;
        private final List<b> f = new ArrayList();
        private final List<c> g = new ArrayList();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final d f9275h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Map<String, String> f9276i;

        public a(f1 f1Var) throws JSONException {
            this.f9271a = f1Var.e("stream");
            this.f9272b = f1Var.e("table_name");
            this.f9273c = f1Var.a("max_rows", 10000);
            e1 e1VarL = f1Var.l("event_types");
            this.d = e1VarL != null ? c0.a(e1VarL) : new String[0];
            e1 e1VarL2 = f1Var.l("request_types");
            this.f9274e = e1VarL2 != null ? c0.a(e1VarL2) : new String[0];
            for (f1 f1Var2 : c0.b(f1Var.c("columns"))) {
                this.f.add(new b(f1Var2));
            }
            for (f1 f1Var3 : c0.b(f1Var.c("indexes"))) {
                this.g.add(new c(f1Var3, this.f9272b));
            }
            f1 f1VarN = f1Var.n("ttl");
            this.f9275h = f1VarN != null ? new d(f1VarN) : null;
            this.f9276i = f1Var.m("queries").f();
        }

        public int c() {
            return this.f9273c;
        }

        public String d() {
            return this.f9271a;
        }

        public Map<String, String> e() {
            return this.f9276i;
        }

        public String f() {
            return this.f9272b;
        }

        public d g() {
            return this.f9275h;
        }

        public List<b> a() {
            return this.f;
        }

        public List<c> b() {
            return this.g;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f9278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f9279c;

        public b(f1 f1Var) throws JSONException {
            this.f9277a = f1Var.e("name");
            this.f9278b = f1Var.e("type");
            this.f9279c = f1Var.o("default");
        }

        public Object a() {
            return this.f9279c;
        }

        public String b() {
            return this.f9277a;
        }

        public String c() {
            return this.f9278b;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f9281b;

        public c(f1 f1Var, String str) throws JSONException {
            StringBuilder sbX = android.support.v4.media.a.x(str, "_");
            sbX.append(f1Var.e("name"));
            this.f9280a = sbX.toString();
            this.f9281b = c0.a(f1Var.c("columns"));
        }

        public String[] a() {
            return this.f9281b;
        }

        public String b() {
            return this.f9280a;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f9282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f9283b;

        public d(f1 f1Var) throws JSONException {
            this.f9282a = f1Var.d("seconds");
            this.f9283b = f1Var.e("column");
        }

        public String a() {
            return this.f9283b;
        }

        public long b() {
            return this.f9282a;
        }
    }

    public n0(f1 f1Var) throws JSONException {
        this.f9269a = f1Var.b("version");
        for (f1 f1Var2 : c0.b(f1Var.c("streams"))) {
            this.f9270b.add(new a(f1Var2));
        }
    }

    public static n0 a(f1 f1Var) {
        try {
            return new n0(f1Var);
        } catch (JSONException unused) {
            return null;
        }
    }

    public int b() {
        return this.f9269a;
    }

    public List<a> a() {
        return this.f9270b;
    }

    public a a(String str) {
        if (str.isEmpty()) {
            return null;
        }
        for (a aVar : this.f9270b) {
            for (String str2 : aVar.d) {
                if (str.equals(str2)) {
                    return aVar;
                }
            }
            for (String str3 : aVar.f9274e) {
                if (str.equals(str3)) {
                    return aVar;
                }
            }
        }
        return null;
    }
}
