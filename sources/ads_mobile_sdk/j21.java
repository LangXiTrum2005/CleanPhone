package ads_mobile_sdk;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import saneness.ampleness;
import saneness.cyrtometer;
import saneness.outmarry;

/* JADX INFO: loaded from: classes.dex */
public final class j21 extends j implements cyrtometer, RandomAccess, ampleness {
    public static final int[] d;
    public static final j21 e;
    public int[] b;
    public int c;

    static {
        int[] iArr = new int[0];
        d = iArr;
        e = new j21(iArr, 0, false);
    }

    public j21(int[] iArr, int i, boolean z) {
        super(z);
        this.b = iArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(e(i));
        }
        int[] iArr = this.b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[outmarry.attabal(iArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.b, 0, iArr2, 0, i);
            System.arraycopy(this.b, i, iArr2, i + 1, this.c - i);
            this.b = iArr2;
        }
        this.b[i] = iIntValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // ads_mobile_sdk.j, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection2) {
        a();
        byte[] bArr = r21.a;
        collection2.getClass();
        if (!(collection2 instanceof j21)) {
            return super.addAll(collection2);
        }
        j21 j21Var = (j21) collection2;
        int i = j21Var.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.b;
        if (i3 > iArr.length) {
            this.b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(j21Var.b, 0, this.b, this.c, j21Var.c);
        this.c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i) {
        a();
        int i2 = this.c;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[outmarry.attabal(iArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.b, 0, iArr2, 0, this.c);
            this.b = iArr2;
        }
        int[] iArr3 = this.b;
        int i3 = this.c;
        this.c = i3 + 1;
        iArr3[i3] = i;
    }

    public final void c(int i) {
        int[] iArr = this.b;
        if (i <= iArr.length) {
            return;
        }
        if (iArr.length == 0) {
            this.b = new int[Math.max(i, 10)];
            return;
        }
        int length = iArr.length;
        while (length < i) {
            length = outmarry.attabal(length, 3, 2, 1, 10);
        }
        this.b = Arrays.copyOf(this.b, length);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(e(i));
        }
    }

    public final String e(int i) {
        return "Index:" + i + ", Size:" + this.c;
    }

    @Override // ads_mobile_sdk.j, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j21)) {
            return super.equals(obj);
        }
        j21 j21Var = (j21) obj;
        if (this.c != j21Var.c) {
            return false;
        }
        int[] iArr = j21Var.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // saneness.prescient
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final j21 a(int i) {
        if (i >= this.c) {
            return new j21(i == 0 ? d : Arrays.copyOf(this.b, i), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        d(i);
        return Integer.valueOf(this.b[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + this.b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // ads_mobile_sdk.j, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        d(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        int i3 = this.c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.b;
        System.arraycopy(iArr, i2, iArr, i, this.c - i2);
        this.c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        d(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b(((Integer) obj).intValue());
        return true;
    }
}
