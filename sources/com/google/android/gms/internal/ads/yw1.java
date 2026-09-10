package com.google.android.gms.internal.ads;

import com.ironsource.X3;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yw1 implements Iterator, Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final dc f22384g = new dc("eof ", 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xb f22385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s10 f22386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zb f22387c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f22388d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f22389e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f22390f = new ArrayList();

    static {
        zw1.j(yw1.class);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final zb next() {
        zb zbVarA;
        zb zbVar = this.f22387c;
        if (zbVar != null && zbVar != f22384g) {
            this.f22387c = null;
            return zbVar;
        }
        s10 s10Var = this.f22386b;
        if (s10Var == null || this.f22388d >= this.f22389e) {
            this.f22387c = f22384g;
            throw new NoSuchElementException();
        }
        try {
            synchronized (s10Var) {
                this.f22386b.f19758a.position((int) this.f22388d);
                zbVarA = ((wb) this.f22385a).a(this.f22386b, this);
                this.f22388d = this.f22386b.d();
            }
            return zbVarA;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zb zbVar = this.f22387c;
        dc dcVar = f22384g;
        if (zbVar == dcVar) {
            return false;
        }
        if (zbVar != null) {
            return true;
        }
        try {
            this.f22387c = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f22387c = dcVar;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append(X3.j.f27834d);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f22390f;
            if (i10 >= arrayList.size()) {
                sb2.append(X3.j.f27836e);
                return sb2.toString();
            }
            if (i10 > 0) {
                sb2.append(";");
            }
            sb2.append(((zb) arrayList.get(i10)).toString());
            i10++;
        }
    }

    public void close() {
    }
}
