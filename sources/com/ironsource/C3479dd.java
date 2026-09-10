package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.dd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3479dd {
    private boolean a;
    private boolean b;
    private boolean c;
    private EnumC3551hd d;
    private int e;
    private int f;

    /* JADX INFO: renamed from: com.ironsource.dd$a */
    public static class a {
        private boolean a = true;
        private boolean b = false;
        private boolean c = false;
        private EnumC3551hd d = null;
        private int e = 0;
        private int f = 0;

        public a a(boolean z) {
            this.a = z;
            return this;
        }

        public a a(boolean z, EnumC3551hd enumC3551hd, int i) {
            this.b = z;
            if (enumC3551hd == null) {
                enumC3551hd = EnumC3551hd.PER_DAY;
            }
            this.d = enumC3551hd;
            this.e = i;
            return this;
        }

        public a a(boolean z, int i) {
            this.c = z;
            this.f = i;
            return this;
        }

        public C3479dd a() {
            return new C3479dd(this.a, this.b, this.c, this.d, this.e, this.f);
        }
    }

    public EnumC3551hd a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

    public boolean d() {
        return this.b;
    }

    public boolean e() {
        return this.a;
    }

    public boolean f() {
        return this.c;
    }

    private C3479dd(boolean z, boolean z2, boolean z3, EnumC3551hd enumC3551hd, int i, int i2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = enumC3551hd;
        this.e = i;
        this.f = i2;
    }
}
