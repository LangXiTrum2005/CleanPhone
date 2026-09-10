package com.smartdigimkt.z3;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40336a;

    public void a() {
        this.f40336a = 0;
    }

    public final boolean b() {
        return c(Integer.MIN_VALUE);
    }

    public final boolean c() {
        return c(4);
    }

    public final boolean d() {
        return c(1);
    }

    public final void a(int i2) {
        this.f40336a = i2 | this.f40336a;
    }

    public final void b(int i2) {
        this.f40336a = (~i2) & this.f40336a;
    }

    public final boolean c(int i2) {
        return (this.f40336a & i2) == i2;
    }

    public final void d(int i2) {
        this.f40336a = i2;
    }
}
