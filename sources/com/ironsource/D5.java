package com.ironsource;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class D5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f25928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f25929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f25930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private G7 f25931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<Pair<String, String>> f25933f;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f25934a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private G7 f25937d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f25935b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f25936c = C0375hc.f28789b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f25938e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ArrayList<Pair<String, String>> f25939f = new ArrayList<>();

        public a(String str) {
            this.f25934a = "";
            if (str == null || str.isEmpty()) {
                return;
            }
            this.f25934a = str;
        }

        public a a(G7 g10) {
            this.f25937d = g10;
            return this;
        }

        public a b(boolean z10) {
            this.f25935b = z10;
            return this;
        }

        public a c() {
            this.f25936c = C0375hc.f28789b;
            return this;
        }

        public a a(Pair<String, String> pair) {
            this.f25939f.add(pair);
            return this;
        }

        public a b() {
            this.f25936c = C0375hc.f28788a;
            return this;
        }

        public a a(List<Pair<String, String>> list) {
            this.f25939f.addAll(list);
            return this;
        }

        public a a(boolean z10) {
            this.f25938e = z10;
            return this;
        }

        public D5 a() {
            return new D5(this);
        }
    }

    public D5(a aVar) {
        this.f25932e = false;
        this.f25928a = aVar.f25934a;
        this.f25929b = aVar.f25935b;
        this.f25930c = aVar.f25936c;
        this.f25931d = aVar.f25937d;
        this.f25932e = aVar.f25938e;
        if (aVar.f25939f != null) {
            this.f25933f = new ArrayList<>(aVar.f25939f);
        }
    }

    public boolean a() {
        return this.f25929b;
    }

    public String b() {
        return this.f25928a;
    }

    public G7 c() {
        return this.f25931d;
    }

    public ArrayList<Pair<String, String>> d() {
        return new ArrayList<>(this.f25933f);
    }

    public String e() {
        return this.f25930c;
    }

    public boolean f() {
        return this.f25932e;
    }
}
