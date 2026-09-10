package com.smartdigimkt.m3;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36575b;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f36576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f36577b;

        public b a(int i2) {
            this.f36576a = i2;
            return this;
        }

        public b a(String str) {
            this.f36577b = str;
            return this;
        }

        public e a() {
            return new e(this);
        }
    }

    public int a() {
        return this.f36574a;
    }

    public String b() {
        return this.f36575b;
    }

    private e(b bVar) {
        this.f36574a = bVar.f36576a;
        this.f36575b = bVar.f36577b;
    }
}
