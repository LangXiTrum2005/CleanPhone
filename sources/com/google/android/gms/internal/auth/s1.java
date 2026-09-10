package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 extends AbstractList implements RandomAccess, s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f22905a;

    public s1(r0 r0Var) {
        this.f22905a = r0Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return this.f22905a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new r1(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new q1(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22905a.f22903b.size();
    }

    @Override // com.google.android.gms.internal.auth.s0
    public final List zzg() {
        return Collections.unmodifiableList(this.f22905a.f22903b);
    }

    @Override // com.google.android.gms.internal.auth.s0
    public final s0 zze() {
        return this;
    }
}
