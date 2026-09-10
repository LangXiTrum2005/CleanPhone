package com.google.android.gms.internal.measurement;

import java.util.AbstractList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends AbstractList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1 f23831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1 f23832b;

    public p1(n1 n1Var, o1 o1Var) {
        this.f23831a = n1Var;
        this.f23832b = o1Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int iM = ((j1) this.f23831a).m(i10);
        ((f1) this.f23832b).getClass();
        j0 j0VarA = j0.a(iM);
        return j0VarA == null ? j0.UNKNOWN : j0VarA;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23831a.size();
    }
}
