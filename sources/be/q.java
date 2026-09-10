package be;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends ge.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final p f5663r = new p();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final com.google.gson.l f5664s = new com.google.gson.l("closed");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f5665o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f5666p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public com.google.gson.g f5667q;

    public q() {
        super(f5663r);
        this.f5665o = new ArrayList();
        this.f5667q = com.google.gson.i.f24753a;
    }

    @Override // ge.b
    public final void A(Number number) {
        if (number == null) {
            F(com.google.gson.i.f24753a);
            return;
        }
        if (this.f41886h != 1) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        F(new com.google.gson.l(number));
    }

    @Override // ge.b
    public final void B(String str) {
        if (str == null) {
            F(com.google.gson.i.f24753a);
        } else {
            F(new com.google.gson.l(str));
        }
    }

    @Override // ge.b
    public final void C(boolean z10) {
        F(new com.google.gson.l(Boolean.valueOf(z10)));
    }

    public final com.google.gson.g E() {
        return (com.google.gson.g) l1.d.d(this.f5665o, 1);
    }

    public final void F(com.google.gson.g gVar) {
        if (this.f5666p != null) {
            if (!(gVar instanceof com.google.gson.i) || this.f41889k) {
                com.google.gson.j jVar = (com.google.gson.j) E();
                jVar.f24754a.put(this.f5666p, gVar);
            }
            this.f5666p = null;
            return;
        }
        if (this.f5665o.isEmpty()) {
            this.f5667q = gVar;
            return;
        }
        com.google.gson.g gVarE = E();
        if (!(gVarE instanceof com.google.gson.e)) {
            throw new IllegalStateException();
        }
        ((com.google.gson.e) gVarE).f24752a.add(gVar);
    }

    @Override // ge.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f5665o;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(f5664s);
    }

    @Override // ge.b
    public final void h() {
        com.google.gson.e eVar = new com.google.gson.e();
        F(eVar);
        this.f5665o.add(eVar);
    }

    @Override // ge.b
    public final void k() {
        com.google.gson.j jVar = new com.google.gson.j();
        F(jVar);
        this.f5665o.add(jVar);
    }

    @Override // ge.b
    public final void o() {
        ArrayList arrayList = this.f5665o;
        if (arrayList.isEmpty() || this.f5666p != null) {
            throw new IllegalStateException();
        }
        if (!(E() instanceof com.google.gson.e)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // ge.b
    public final void p() {
        ArrayList arrayList = this.f5665o;
        if (arrayList.isEmpty() || this.f5666p != null) {
            throw new IllegalStateException();
        }
        if (!(E() instanceof com.google.gson.j)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // ge.b
    public final void q(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f5665o.isEmpty() || this.f5666p != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(E() instanceof com.google.gson.j)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f5666p = str;
    }

    @Override // ge.b
    public final ge.b s() {
        F(com.google.gson.i.f24753a);
        return this;
    }

    @Override // ge.b
    public final void x(double d10) {
        if (this.f41886h == 1 || (!Double.isNaN(d10) && !Double.isInfinite(d10))) {
            F(new com.google.gson.l(Double.valueOf(d10)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
        }
    }

    @Override // ge.b
    public final void y(long j10) {
        F(new com.google.gson.l(Long.valueOf(j10)));
    }

    @Override // ge.b
    public final void z(Boolean bool) {
        if (bool == null) {
            F(com.google.gson.i.f24753a);
        } else {
            F(new com.google.gson.l(bool));
        }
    }

    @Override // ge.b, java.io.Flushable
    public final void flush() {
    }
}
