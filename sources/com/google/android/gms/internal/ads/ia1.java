package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ia1 extends y91 implements Set {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f15692c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient ca1 f15693b;

    public static ia1 t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i10 = length + 6;
        Object[] objArr2 = new Object[i10];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return z(i10, objArr2);
    }

    public static int u(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            ps1.C("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static ia1 v(Set set) {
        if ((set instanceof ia1) && !(set instanceof SortedSet)) {
            ia1 ia1Var = (ia1) set;
            if (!ia1Var.r()) {
                return ia1Var;
            }
        }
        Object[] array = set.toArray();
        return z(array.length, array);
    }

    public static ia1 w(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? z(length, (Object[]) objArr.clone()) : new ja1(objArr[0]);
        }
        return eb1.f13923j;
    }

    public static ha1 y(int i10) {
        rb0.p(i10, "expectedSize");
        ha1 ha1Var = new ha1(i10);
        ha1Var.f15230d = new Object[u(i10)];
        return ha1Var;
    }

    public static ia1 z(int i10, Object... objArr) {
        if (i10 == 0) {
            return eb1.f13923j;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new ja1(obj);
        }
        int iU = u(i10);
        Object[] objArr2 = new Object[iU];
        int i11 = iU - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            ps1.A(i14, obj2);
            int iHashCode = obj2.hashCode();
            int iL = dv.l(iHashCode);
            while (true) {
                int i15 = iL & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iL++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new ja1(obj4);
        }
        if (u(i13) < iU / 2) {
            return z(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new eb1(i12, i11, i13, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ia1) && (this instanceof eb1) && (((ia1) obj) instanceof eb1) && hashCode() != obj.hashCode()) {
            return false;
        }
        return dv.C(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return dv.v(this);
    }

    @Override // com.google.android.gms.internal.ads.y91
    public ca1 q() {
        ca1 ca1Var = this.f15693b;
        if (ca1Var != null) {
            return ca1Var;
        }
        ca1 ca1VarX = x();
        this.f15693b = ca1VarX;
        return ca1VarX;
    }

    public ca1 x() {
        Object[] array = toArray(y91.f22207a);
        aa1 aa1Var = ca1.f13122b;
        return ca1.A(array.length, array);
    }
}
