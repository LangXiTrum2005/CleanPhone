package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vi1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final vi1 f21181b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f21182a = new AtomicReference(new qj1(new uw(17)));

    static {
        try {
            vi1 vi1Var = new vi1();
            vi1Var.a(new hi1(ni1.class, xg1.D));
            f21181b = vi1Var;
        } catch (Exception e10) {
            throw new aa.b(e10, 7);
        }
    }

    public final synchronized void a(hi1 hi1Var) {
        AtomicReference atomicReference = this.f21182a;
        uw uwVar = new uw((qj1) atomicReference.get());
        uwVar.e(hi1Var);
        atomicReference.set(new qj1(uwVar));
    }

    public final synchronized void b(fi1 fi1Var) {
        AtomicReference atomicReference = this.f21182a;
        uw uwVar = new uw((qj1) atomicReference.get());
        uwVar.k(fi1Var);
        atomicReference.set(new qj1(uwVar));
    }

    public final synchronized void c(zi1 zi1Var) {
        AtomicReference atomicReference = this.f21182a;
        uw uwVar = new uw((qj1) atomicReference.get());
        uwVar.n(zi1Var);
        atomicReference.set(new qj1(uwVar));
    }

    public final synchronized void d(xi1 xi1Var) {
        AtomicReference atomicReference = this.f21182a;
        uw uwVar = new uw((qj1) atomicReference.get());
        uwVar.p(xi1Var);
        atomicReference.set(new qj1(uwVar));
    }

    public final jc1 e(kj1 kj1Var) throws GeneralSecurityException {
        qj1 qj1Var = (qj1) this.f21182a.get();
        qj1Var.getClass();
        oj1 oj1Var = new oj1(kj1.class, (zq1) kj1Var.f16464c);
        HashMap map = qj1Var.f19111b;
        if (map.containsKey(oj1Var)) {
            return ((fi1) map.get(oj1Var)).f14443b.d(kj1Var);
        }
        String string = oj1Var.toString();
        throw new GeneralSecurityException(q4.a.j(new StringBuilder(string.length() + 47), "No Key Parser for requested key type ", string, " available"));
    }

    public final nj1 f(jc1 jc1Var) throws GeneralSecurityException {
        qj1 qj1Var = (qj1) this.f21182a.get();
        qj1Var.getClass();
        pj1 pj1Var = new pj1(jc1Var.getClass(), kj1.class);
        HashMap map = qj1Var.f19110a;
        if (map.containsKey(pj1Var)) {
            return ((hi1) map.get(pj1Var)).f15308b.c(jc1Var);
        }
        String string = pj1Var.toString();
        throw new GeneralSecurityException(q4.a.j(new StringBuilder(string.length() + 32), "No Key serializer for ", string, " available"));
    }

    public final ff1 g(lj1 lj1Var) throws GeneralSecurityException {
        qj1 qj1Var = (qj1) this.f21182a.get();
        qj1Var.getClass();
        oj1 oj1Var = new oj1(lj1.class, (zq1) lj1Var.f17036b);
        HashMap map = qj1Var.f19113d;
        if (map.containsKey(oj1Var)) {
            return ((xi1) map.get(oj1Var)).f21907b.g(lj1Var);
        }
        String string = oj1Var.toString();
        throw new GeneralSecurityException(q4.a.j(new StringBuilder(string.length() + 54), "No Parameters Parser for requested key type ", string, " available"));
    }

    public final nj1 h(ff1 ff1Var) throws GeneralSecurityException {
        qj1 qj1Var = (qj1) this.f21182a.get();
        qj1Var.getClass();
        pj1 pj1Var = new pj1(ff1Var.getClass(), lj1.class);
        HashMap map = qj1Var.f19112c;
        if (map.containsKey(pj1Var)) {
            return ((zi1) map.get(pj1Var)).f22630b.h(ff1Var);
        }
        String string = pj1Var.toString();
        throw new GeneralSecurityException(q4.a.j(new StringBuilder(string.length() + 39), "No Key Format serializer for ", string, " available"));
    }
}
