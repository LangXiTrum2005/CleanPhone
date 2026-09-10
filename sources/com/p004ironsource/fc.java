package com.p004ironsource;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class fc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f25011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f25012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f25013c;
    private dg d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25014e;
    private ArrayList<Pair<String, String>> f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f25015a;
        private dg d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f25016b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f25017c = ko.f25535b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f25018e = false;
        private ArrayList<Pair<String, String>> f = new ArrayList<>();

        public a(String str) {
            this.f25015a = "";
            if (str == null || str.isEmpty()) {
                return;
            }
            this.f25015a = str;
        }

        public a a(Pair<String, String> pair) {
            this.f.add(pair);
            return this;
        }

        public a b() {
            this.f25017c = ko.f25534a;
            return this;
        }

        public a c() {
            this.f25017c = ko.f25535b;
            return this;
        }

        public a a(dg dgVar) {
            this.d = dgVar;
            return this;
        }

        public a b(boolean z2) {
            this.f25016b = z2;
            return this;
        }

        public a a(List<Pair<String, String>> list) {
            this.f.addAll(list);
            return this;
        }

        public a a(boolean z2) {
            this.f25018e = z2;
            return this;
        }

        public fc a() {
            return new fc(this);
        }
    }

    public fc(a aVar) {
        this.f25014e = false;
        this.f25011a = aVar.f25015a;
        this.f25012b = aVar.f25016b;
        this.f25013c = aVar.f25017c;
        this.d = aVar.d;
        this.f25014e = aVar.f25018e;
        if (aVar.f != null) {
            this.f = new ArrayList<>(aVar.f);
        }
    }

    public boolean a() {
        return this.f25012b;
    }

    public String b() {
        return this.f25011a;
    }

    public dg c() {
        return this.d;
    }

    public ArrayList<Pair<String, String>> d() {
        return new ArrayList<>(this.f);
    }

    public String e() {
        return this.f25013c;
    }

    public boolean f() {
        return this.f25014e;
    }
}
