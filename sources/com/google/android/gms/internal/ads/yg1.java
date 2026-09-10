package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yg1 implements wk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f22246b = new ArrayList(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public po1 f22248d;

    public yg1(boolean z10) {
        this.f22245a = z10;
    }

    public final void a(po1 po1Var) {
        for (int i10 = 0; i10 < this.f22247c; i10++) {
            ((ox1) this.f22246b.get(i10)).getClass();
        }
    }

    public final void c(po1 po1Var) {
        this.f22248d = po1Var;
        for (int i10 = 0; i10 < this.f22247c; i10++) {
            ((ox1) this.f22246b.get(i10)).i(this, po1Var, this.f22245a);
        }
    }

    public final void d(int i10) {
        po1 po1Var = this.f22248d;
        String str = uu0.f20901a;
        for (int i11 = 0; i11 < this.f22247c; i11++) {
            ((ox1) this.f22246b.get(i11)).d(po1Var, this.f22245a, i10);
        }
    }

    public final void e() {
        po1 po1Var = this.f22248d;
        String str = uu0.f20901a;
        for (int i10 = 0; i10 < this.f22247c; i10++) {
            ((ox1) this.f22246b.get(i10)).f(po1Var, this.f22245a);
        }
        this.f22248d = null;
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public final void n(ox1 ox1Var) {
        ox1Var.getClass();
        ArrayList arrayList = this.f22246b;
        if (arrayList.contains(ox1Var)) {
            return;
        }
        arrayList.add(ox1Var);
        this.f22247c++;
    }
}
