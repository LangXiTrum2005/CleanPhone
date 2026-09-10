package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p91 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18572a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f18576e;

    public p91(r91 r91Var) {
        Objects.requireNonNull(r91Var);
        this.f18576e = r91Var;
        this.f18573b = r91Var.f19488e;
        this.f18574c = r91Var.isEmpty() ? -1 : 0;
        this.f18575d = -1;
    }

    public abstract Object a(int i10);

    public abstract Object b(int i10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f18572a) {
            case 0:
                return this.f18574c >= 0;
            default:
                return this.f18574c >= 0;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f18572a) {
            case 0:
                r91 r91Var = (r91) this.f18576e;
                if (r91Var.f19488e != this.f18573b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i10 = this.f18574c;
                this.f18575d = i10;
                Object objB = b(i10);
                int i11 = this.f18574c + 1;
                if (i11 >= r91Var.f19489f) {
                    i11 = -1;
                }
                this.f18574c = i11;
                return objB;
            default:
                oa.u uVar = (oa.u) this.f18576e;
                if (uVar.f47320e != this.f18573b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i12 = this.f18574c;
                this.f18575d = i12;
                Object objA = a(i12);
                int i13 = this.f18574c + 1;
                if (i13 >= uVar.f47321f) {
                    i13 = -1;
                }
                this.f18574c = i13;
                return objA;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f18572a) {
            case 0:
                r91 r91Var = (r91) this.f18576e;
                if (r91Var.f19488e != this.f18573b) {
                    throw new ConcurrentModificationException();
                }
                ps1.d0("no calls to next() since the last call to remove()", this.f18575d >= 0);
                this.f18573b += 32;
                r91Var.remove(r91Var.g()[this.f18575d]);
                this.f18574c--;
                this.f18575d = -1;
                return;
            default:
                oa.u uVar = (oa.u) this.f18576e;
                if (uVar.f47320e != this.f18573b) {
                    throw new ConcurrentModificationException();
                }
                go.k.s("no calls to next() since the last call to remove()", this.f18575d >= 0);
                this.f18573b += 32;
                uVar.remove(uVar.p()[this.f18575d]);
                this.f18574c--;
                this.f18575d = -1;
                return;
        }
    }

    public p91(oa.u uVar) {
        this.f18576e = uVar;
        this.f18573b = uVar.f47320e;
        this.f18574c = uVar.isEmpty() ? -1 : 0;
        this.f18575d = -1;
    }
}
