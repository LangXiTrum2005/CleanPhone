package com.adcolony.sdk;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
class e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static e0 f9129c;
    static e0 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static e0 f9130e;
    static e0 f;
    static e0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static e0 f9131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static e0 f9132i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f9134b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        StringBuilder f9135a = new StringBuilder();

        public a a(String str) {
            this.f9135a.append(str);
            return this;
        }

        public a a(Object obj) {
            if (obj != null) {
                this.f9135a.append(obj.toString());
                return this;
            }
            this.f9135a.append(AbstractJsonLexerKt.NULL);
            return this;
        }

        public a a(int i2) {
            this.f9135a.append(i2);
            return this;
        }

        public void a(e0 e0Var) {
            e0Var.a(this.f9135a.toString());
        }
    }

    static {
        new e0(3, false);
        f9129c = new e0(3, true);
        d = new e0(2, false);
        f9130e = new e0(2, true);
        f = new e0(1, false);
        g = new e0(1, true);
        f9131h = new e0(0, false);
        f9132i = new e0(0, true);
    }

    public e0(int i2, boolean z2) {
        this.f9133a = i2;
        this.f9134b = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        com.adcolony.sdk.a.b().q().a(this.f9133a, str, this.f9134b);
    }
}
