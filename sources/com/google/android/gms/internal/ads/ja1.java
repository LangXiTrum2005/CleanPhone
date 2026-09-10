package com.google.android.gms.internal.ads;

import com.ironsource.X3;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ja1 extends ia1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16033d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object f16034e;

    public ja1(ka1 ka1Var) {
        this.f16034e = ka1Var;
    }

    @Override // com.google.android.gms.internal.ads.y91, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f16033d) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    ka1 ka1Var = (ka1) this.f16034e;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    Collection collection = (Collection) ((db1) ka1Var.i()).get(key);
                    if (collection != null && collection.contains(value)) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f16034e.equals(obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.y91
    public final mb1 h() {
        switch (this.f16033d) {
            case 0:
                return new ea1((ka1) this.f16034e);
            default:
                return new oa1(this.f16034e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ia1, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.f16033d) {
            case 1:
                return this.f16034e.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        switch (this.f16033d) {
            case 0:
                return new ea1((ka1) this.f16034e);
            default:
                return new oa1(this.f16034e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ia1, com.google.android.gms.internal.ads.y91
    public ca1 q() {
        switch (this.f16033d) {
            case 1:
                return ca1.u(this.f16034e);
            default:
                return super.q();
        }
    }

    @Override // com.google.android.gms.internal.ads.y91
    public final boolean r() {
        switch (this.f16033d) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.y91
    public int s(Object[] objArr, int i10) {
        switch (this.f16033d) {
            case 1:
                objArr[i10] = this.f16034e;
                return i10 + 1;
            default:
                return super.s(objArr, i10);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f16033d) {
            case 0:
                return ((ka1) this.f16034e).f16400e;
            default:
                return 1;
        }
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        switch (this.f16033d) {
            case 1:
                String string = this.f16034e.toString();
                return q4.a.j(new StringBuilder(String.valueOf(string).length() + 2), X3.j.f27834d, string, X3.j.f27836e);
            default:
                return super.toString();
        }
    }

    public ja1(Object obj) {
        obj.getClass();
        this.f16034e = obj;
    }
}
