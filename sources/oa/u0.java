package oa;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u0 extends c0 implements Set {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f47325c = 0;
    private static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient j0 f47326b;

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static int t(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            go.k.h("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static u0 u(int i10, Object... objArr) {
        if (i10 == 0) {
            return u1.f47328j;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new b2(obj);
        }
        int iT = t(i10);
        Object[] objArr2 = new Object[iT];
        int i11 = iT - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                throw new NullPointerException(l1.d.e(i14, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iV = q.v(iHashCode);
            while (true) {
                int i15 = iV & i11;
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
                iV++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new b2(obj4);
        }
        if (t(i13) < iT / 2) {
            return u(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new u1(i12, i11, i13, objArr, objArr2);
    }

    public static u0 v(Collection collection) {
        if ((collection instanceof u0) && !(collection instanceof SortedSet)) {
            u0 u0Var = (u0) collection;
            if (!u0Var.r()) {
                return u0Var;
            }
        }
        Object[] array = collection.toArray();
        return u(array.length, array);
    }

    public static u0 w(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? u(objArr.length, (Object[]) objArr.clone()) : new b2(objArr[0]);
        }
        return u1.f47328j;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof u0) && (this instanceof u1) && (((u0) obj) instanceof u1) && hashCode() != obj.hashCode()) {
            return false;
        }
        return q.h(this, obj);
    }

    @Override // oa.c0
    public j0 h() {
        j0 j0Var = this.f47326b;
        if (j0Var != null) {
            return j0Var;
        }
        j0 j0VarX = x();
        this.f47326b = j0VarX;
        return j0VarX;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return q.o(this);
    }

    @Override // oa.c0
    public Object writeReplace() {
        return new t0(toArray(c0.f47231a));
    }

    public j0 x() {
        Object[] array = toArray(c0.f47231a);
        f0 f0Var = j0.f47265b;
        return j0.t(array.length, array);
    }
}
