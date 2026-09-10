package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zt1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f22720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zr1 f22721b;

    public zt1(cs1 cs1Var) {
        if (!(cs1Var instanceof au1)) {
            this.f22720a = null;
            this.f22721b = (zr1) cs1Var;
            return;
        }
        au1 au1Var = (au1) cs1Var;
        ArrayDeque arrayDeque = new ArrayDeque(au1Var.f12526g);
        this.f22720a = arrayDeque;
        arrayDeque.push(au1Var);
        cs1 cs1Var2 = au1Var.f12523d;
        while (cs1Var2 instanceof au1) {
            au1 au1Var2 = (au1) cs1Var2;
            this.f22720a.push(au1Var2);
            cs1Var2 = au1Var2.f12523d;
        }
        this.f22721b = (zr1) cs1Var2;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zr1 next() {
        zr1 zr1Var;
        zr1 zr1Var2 = this.f22721b;
        if (zr1Var2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f22720a;
            zr1Var = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            cs1 cs1Var = ((au1) arrayDeque.pop()).f12524e;
            while (cs1Var instanceof au1) {
                au1 au1Var = (au1) cs1Var;
                arrayDeque.push(au1Var);
                cs1Var = au1Var.f12523d;
            }
            zr1Var = (zr1) cs1Var;
        } while (zr1Var.q() == 0);
        this.f22721b = zr1Var;
        return zr1Var2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22721b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
