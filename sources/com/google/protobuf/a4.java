package com.google.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a4 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24766a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f24768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f24769d;

    public a4(z3 z3Var) {
        this.f24769d = z3Var;
        this.f24767b = z3Var.f25060b.size();
    }

    public Iterator a() {
        if (this.f24768c == null) {
            this.f24768c = ((z3) this.f24769d).f25064f.entrySet().iterator();
        }
        return this.f24768c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f24766a) {
            case 0:
                int i10 = this.f24767b;
                return (i10 > 0 && i10 <= ((z3) this.f24769d).f25060b.size()) || a().hasNext();
            default:
                return this.f24767b > 0;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f24766a) {
            case 0:
                if (a().hasNext()) {
                    return (Map.Entry) a().next();
                }
                List list = ((z3) this.f24769d).f25060b;
                int i10 = this.f24767b - 1;
                this.f24767b = i10;
                return (Map.Entry) list.get(i10);
            default:
                if (!((androidx.datastore.preferences.protobuf.e) this.f24769d).hasNext()) {
                    this.f24769d = new androidx.datastore.preferences.protobuf.e(((u3) this.f24768c).b());
                }
                this.f24767b--;
                return Byte.valueOf(((androidx.datastore.preferences.protobuf.e) this.f24769d).nextByte());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f24766a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public a4(zl.w wVar) {
        u3 u3Var = new u3(wVar);
        this.f24768c = u3Var;
        this.f24769d = new androidx.datastore.preferences.protobuf.e(u3Var.b());
        this.f24767b = wVar.f55082b;
    }
}
