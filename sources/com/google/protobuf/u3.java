package com.google.protobuf;

import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class u3 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractCollection f24961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterable f24962c;

    public u3(ByteString byteString) {
        this.f24960a = 0;
        if (!(byteString instanceof w3)) {
            this.f24961b = null;
            this.f24962c = (s) byteString;
            return;
        }
        w3 w3Var = (w3) byteString;
        ArrayDeque arrayDeque = new ArrayDeque(w3Var.f24997e);
        this.f24961b = arrayDeque;
        arrayDeque.push(w3Var);
        ByteString byteString2 = w3Var.f24994b;
        while (byteString2 instanceof w3) {
            w3 w3Var2 = (w3) byteString2;
            ((ArrayDeque) this.f24961b).push(w3Var2);
            byteString2 = w3Var2.f24994b;
        }
        this.f24962c = (s) byteString2;
    }

    public s a() {
        s sVar;
        ArrayDeque arrayDeque = (ArrayDeque) this.f24961b;
        s sVar2 = (s) this.f24962c;
        if (sVar2 == null) {
            throw new NoSuchElementException();
        }
        while (arrayDeque != null && !arrayDeque.isEmpty()) {
            ByteString byteString = ((w3) arrayDeque.pop()).f24995c;
            while (byteString instanceof w3) {
                w3 w3Var = (w3) byteString;
                arrayDeque.push(w3Var);
                byteString = w3Var.f24994b;
            }
            sVar = (s) byteString;
            if (!sVar.isEmpty()) {
                this.f24962c = sVar;
                return sVar2;
            }
        }
        sVar = null;
        this.f24962c = sVar;
        return sVar2;
    }

    public zl.t b() {
        zl.t tVar;
        Stack stack = (Stack) this.f24961b;
        zl.t tVar2 = (zl.t) this.f24962c;
        if (tVar2 == null) {
            throw new NoSuchElementException();
        }
        while (!stack.isEmpty()) {
            zl.d dVar = ((zl.w) stack.pop()).f55084d;
            while (dVar instanceof zl.w) {
                zl.w wVar = (zl.w) dVar;
                stack.push(wVar);
                dVar = wVar.f55083c;
            }
            zl.t tVar3 = (zl.t) dVar;
            if (tVar3.f55079b.length != 0) {
                tVar = tVar3;
                this.f24962c = tVar;
                return tVar2;
            }
        }
        tVar = null;
        this.f24962c = tVar;
        return tVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f24960a) {
            case 0:
                return ((s) this.f24962c) != null;
            default:
                return ((zl.t) this.f24962c) != null;
        }
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        switch (this.f24960a) {
            case 0:
                return a();
            default:
                return b();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f24960a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public u3(zl.d dVar) {
        this.f24960a = 1;
        this.f24961b = new Stack();
        while (dVar instanceof zl.w) {
            zl.w wVar = (zl.w) dVar;
            ((Stack) this.f24961b).push(wVar);
            dVar = wVar.f55083c;
        }
        this.f24962c = (zl.t) dVar;
    }
}
