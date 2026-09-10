package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends d0 implements RandomAccess, s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f22903b;

    static {
        new r0();
    }

    public r0(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        super(true);
        this.f22903b = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        b();
        this.f22903b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.d0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        b();
        if (collection instanceof s0) {
            collection = ((s0) collection).zzg();
        }
        boolean zAddAll = this.f22903b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.auth.d0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f22903b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.n0
    public final n0 f(int i10) {
        List list = this.f22903b;
        if (i10 < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(list);
        return new r0(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final String get(int i10) {
        List list = this.f22903b;
        Object obj = list.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            String str = h0Var.m() == 0 ? "" : new String(h0Var.f22840b, 0, h0Var.m(), p0.f22890a);
            byte[] bArr = h0Var.f22840b;
            int iM = h0Var.m();
            y1.f22928a.getClass();
            if (z.a(bArr, 0, iM)) {
                list.set(i10, str);
            }
            return str;
        }
        byte[] bArr2 = (byte[]) obj;
        String str2 = new String(bArr2, p0.f22890a);
        z zVar = y1.f22928a;
        int length = bArr2.length;
        zVar.getClass();
        if (z.a(bArr2, 0, length)) {
            list.set(i10, str2);
        }
        return str2;
    }

    @Override // com.google.android.gms.internal.auth.d0, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        b();
        Object objRemove = this.f22903b.remove(i10);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof h0)) {
            return new String((byte[]) objRemove, p0.f22890a);
        }
        h0 h0Var = (h0) objRemove;
        return h0Var.m() == 0 ? "" : new String(h0Var.f22840b, 0, h0Var.m(), p0.f22890a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        b();
        Object obj2 = this.f22903b.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof h0)) {
            return new String((byte[]) obj2, p0.f22890a);
        }
        h0 h0Var = (h0) obj2;
        return h0Var.m() == 0 ? "" : new String(h0Var.f22840b, 0, h0Var.m(), p0.f22890a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22903b.size();
    }

    @Override // com.google.android.gms.internal.auth.s0
    public final s0 zze() {
        return this.f22802a ? new s1(this) : this;
    }

    @Override // com.google.android.gms.internal.auth.s0
    public final List zzg() {
        return Collections.unmodifiableList(this.f22903b);
    }

    public r0(ArrayList arrayList) {
        super(true);
        this.f22903b = arrayList;
    }

    public r0() {
        super(false);
        this.f22903b = Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.auth.d0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f22903b.size(), collection);
    }
}
