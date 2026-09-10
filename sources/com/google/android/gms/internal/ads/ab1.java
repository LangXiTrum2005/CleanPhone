package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ab1 extends ia1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient db1 f11974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f11975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f11976f;

    public ab1(db1 db1Var, Object[] objArr, int i10) {
        this.f11974d = db1Var;
        this.f11975e = objArr;
        this.f11976f = i10;
    }

    @Override // com.google.android.gms.internal.ads.y91, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f11974d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.y91
    public final mb1 h() {
        return q().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return q().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.y91
    public final boolean r() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.y91
    public final int s(Object[] objArr, int i10) {
        return q().s(objArr, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f11976f;
    }

    @Override // com.google.android.gms.internal.ads.ia1
    public final ca1 x() {
        return new za1(this);
    }
}
