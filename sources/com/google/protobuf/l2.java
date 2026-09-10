package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class l2 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24896a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f24897b;

    public /* synthetic */ l2() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f24896a) {
            case 0:
                break;
        }
        return this.f24897b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f24896a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f24897b.next();
                if (!(entry.getValue() instanceof LazyField)) {
                    return entry;
                }
                k2 k2Var = new k2();
                k2Var.f24886a = entry;
                return k2Var;
            default:
                return (String) this.f24897b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f24896a) {
            case 0:
                this.f24897b.remove();
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public l2(Iterator it) {
        this.f24897b = it;
    }
}
