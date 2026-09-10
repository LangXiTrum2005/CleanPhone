package com.adjust.sdk.sig;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f7024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7025b = true;

    public x(o1 o1Var) {
        this.f7024a = o1Var;
    }

    public void a() {
        this.f7025b = false;
    }

    public final void a(char c4) {
        o1 o1Var = this.f7024a;
        o1Var.a(o1Var.f6994b, 1);
        char[] cArr = o1Var.f6993a;
        int i10 = o1Var.f6994b;
        o1Var.f6994b = i10 + 1;
        cArr[i10] = c4;
    }

    public void b() {
    }

    public void c() {
    }
}
