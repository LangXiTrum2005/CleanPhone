package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient a0 f24499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f24500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f24501e;

    public x(a0 a0Var, Object[] objArr, int i10) {
        this.f24499c = a0Var;
        this.f24500d = objArr;
        this.f24501e = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int b(Object[] objArr) {
        return n().b(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f24499c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return n().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.t
    public final r r() {
        return new w(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f24501e;
    }
}
