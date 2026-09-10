package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ax1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12534b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractCollection f12535c;

    public /* synthetic */ ax1(AbstractCollection abstractCollection, int i10) {
        this.f12533a = i10;
        this.f12535c = abstractCollection;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f12533a) {
            case 0:
                int i10 = this.f12534b;
                bx1 bx1Var = (bx1) this.f12535c;
                return i10 < bx1Var.f12920a.size() || bx1Var.f12921b.hasNext();
            case 1:
                int i11 = this.f12534b;
                com.google.android.gms.internal.measurement.u uVar = (com.google.android.gms.internal.measurement.u) this.f12535c;
                return i11 < uVar.h() - uVar.b();
            default:
                return this.f12534b < ((com.google.android.gms.internal.measurement.gi) ((androidx.datastore.preferences.protobuf.i1) this.f12535c).f4103b).f23521e;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f12533a) {
            case 0:
                int i10 = this.f12534b;
                bx1 bx1Var = (bx1) this.f12535c;
                List list = bx1Var.f12920a;
                if (i10 >= list.size()) {
                    list.add(bx1Var.f12921b.next());
                    return next();
                }
                int i11 = this.f12534b;
                this.f12534b = i11 + 1;
                return list.get(i11);
            case 1:
                int i12 = this.f12534b;
                com.google.android.gms.internal.measurement.u uVar = (com.google.android.gms.internal.measurement.u) this.f12535c;
                if (i12 >= uVar.h() - uVar.b()) {
                    throw new NoSuchElementException();
                }
                com.google.android.gms.internal.measurement.v vVar = uVar.f24003b;
                Object obj = vVar.f24053a[uVar.b() + i12];
                this.f12534b = i12 + 1;
                return obj;
            default:
                int i13 = this.f12534b;
                this.f12534b = i13 + 1;
                com.google.android.gms.internal.measurement.gi giVar = (com.google.android.gms.internal.measurement.gi) ((androidx.datastore.preferences.protobuf.i1) this.f12535c).f4103b;
                return giVar.d(giVar.f23520d[i13] & 31);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f12533a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
