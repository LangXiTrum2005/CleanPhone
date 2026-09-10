package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t3 extends cc.a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f24473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f24474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f24475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f24476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f24477e;

    public t3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f24473a = atomicReferenceFieldUpdater;
        this.f24474b = atomicReferenceFieldUpdater2;
        this.f24475c = atomicReferenceFieldUpdater3;
        this.f24476d = atomicReferenceFieldUpdater4;
        this.f24477e = atomicReferenceFieldUpdater5;
    }

    @Override // cc.a2
    public final void Q(h4 h4Var, h4 h4Var2) {
        this.f24474b.lazySet(h4Var, h4Var2);
    }

    @Override // cc.a2
    public final void R(h4 h4Var, Thread thread) {
        this.f24473a.lazySet(h4Var, thread);
    }

    @Override // cc.a2
    public final boolean S(i4 i4Var, u2 u2Var, u2 u2Var2) {
        return q1.J(this.f24476d, i4Var, u2Var, u2Var2);
    }

    @Override // cc.a2
    public final boolean T(i4 i4Var, Object obj, Object obj2) {
        return q1.J(this.f24477e, i4Var, obj, obj2);
    }

    @Override // cc.a2
    public final boolean U(i4 i4Var, h4 h4Var, h4 h4Var2) {
        return q1.J(this.f24475c, i4Var, h4Var, h4Var2);
    }
}
