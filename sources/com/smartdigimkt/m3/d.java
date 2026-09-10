package com.smartdigimkt.m3;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f36567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f36568c;
    private final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f36569e;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f36570a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f36571b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f36572c = "";
        private String d = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f36573e = false;

        public b a(String str) {
            this.f36570a = str;
            return this;
        }

        public b b(String str) {
            this.d = str;
            return this;
        }

        public b c(String str) {
            this.f36572c = str;
            return this;
        }

        public b a(boolean z2) {
            this.f36571b = z2;
            return this;
        }

        public b b(boolean z2) {
            this.f36573e = z2;
            return this;
        }

        public d a() {
            return new d(this);
        }
    }

    public String a() {
        return this.f36566a;
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.f36568c;
    }

    public boolean d() {
        return this.f36567b;
    }

    public boolean e() {
        return this.f36569e;
    }

    private d(b bVar) {
        this.f36566a = bVar.f36570a;
        this.f36567b = bVar.f36571b;
        this.f36568c = bVar.f36572c;
        this.d = bVar.d;
        this.f36569e = bVar.f36573e;
    }
}
