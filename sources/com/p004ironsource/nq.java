package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public class nq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f26305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26307c;
    private rq d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f26308e;
    private int f;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f26309a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f26310b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f26311c = false;
        private rq d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f26312e = 0;
        private int f = 0;

        public b a(boolean z2) {
            this.f26309a = z2;
            return this;
        }

        public b a(boolean z2, int i2) {
            this.f26311c = z2;
            this.f = i2;
            return this;
        }

        public b a(boolean z2, rq rqVar, int i2) {
            this.f26310b = z2;
            if (rqVar == null) {
                rqVar = rq.PER_DAY;
            }
            this.d = rqVar;
            this.f26312e = i2;
            return this;
        }

        public nq a() {
            return new nq(this.f26309a, this.f26310b, this.f26311c, this.d, this.f26312e, this.f);
        }
    }

    private nq(boolean z2, boolean z3, boolean z4, rq rqVar, int i2, int i3) {
        this.f26305a = z2;
        this.f26306b = z3;
        this.f26307c = z4;
        this.d = rqVar;
        this.f26308e = i2;
        this.f = i3;
    }

    public rq a() {
        return this.d;
    }

    public int b() {
        return this.f26308e;
    }

    public int c() {
        return this.f;
    }

    public boolean d() {
        return this.f26306b;
    }

    public boolean e() {
        return this.f26305a;
    }

    public boolean f() {
        return this.f26307c;
    }
}
