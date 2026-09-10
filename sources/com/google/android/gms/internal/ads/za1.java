package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class za1 extends ca1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ab1 f22575c;

    public za1(ab1 ab1Var) {
        this.f22575c = ab1Var;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i10) {
        ab1 ab1Var = this.f22575c;
        ps1.f0(i10, ab1Var.f11976f);
        Object[] objArr = ab1Var.f11975e;
        int i11 = i10 + i10;
        Object obj = objArr[i11];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.y91
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22575c.f11976f;
    }
}
