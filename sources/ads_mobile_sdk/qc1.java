package ads_mobile_sdk;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import saneness.ampleness;
import saneness.dessertspoon;
import saneness.outmarry;

/* JADX INFO: loaded from: classes.dex */
public final class qc1 extends j implements dessertspoon, RandomAccess, ampleness {
    public static final long[] d;
    public static final qc1 e;
    public long[] b;
    public int c;

    static {
        long[] jArr = new long[0];
        d = jArr;
        e = new qc1(jArr, 0, false);
    }

    public qc1(long[] jArr, int i, boolean z) {
        super(z);
        this.b = jArr;
        this.c = i;
    }

    public final void a(long j) {
        a();
        int i = this.c;
        long[] jArr = this.b;
        if (i == jArr.length) {
            long[] jArr2 = new long[outmarry.attabal(jArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.b, 0, jArr2, 0, this.c);
            this.b = jArr2;
        }
        long[] jArr3 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(d(i));
        }
        long[] jArr = this.b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[outmarry.attabal(jArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.b, 0, jArr2, 0, i);
            System.arraycopy(this.b, i, jArr2, i + 1, this.c - i);
            this.b = jArr2;
        }
        this.b[i] = jLongValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // ads_mobile_sdk.j, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection2) {
        a();
        byte[] bArr = r21.a;
        collection2.getClass();
        if (!(collection2 instanceof qc1)) {
            return super.addAll(collection2);
        }
        qc1 qc1Var = (qc1) collection2;
        int i = qc1Var.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.b;
        if (i3 > jArr.length) {
            this.b = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(qc1Var.b, 0, this.b, this.c, qc1Var.c);
        this.c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i) {
        long[] jArr = this.b;
        if (i <= jArr.length) {
            return;
        }
        if (jArr.length == 0) {
            this.b = new long[Math.max(i, 10)];
            return;
        }
        int length = jArr.length;
        while (length < i) {
            length = outmarry.attabal(length, 3, 2, 1, 10);
        }
        this.b = Arrays.copyOf(this.b, length);
    }

    public final void c(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(d(i));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final String d(int i) {
        return "Index:" + i + ", Size:" + this.c;
    }

    @Override // saneness.prescient
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final qc1 a(int i) {
        if (i >= this.c) {
            return new qc1(i == 0 ? d : Arrays.copyOf(this.b, i), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // ads_mobile_sdk.j, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc1)) {
            return super.equals(obj);
        }
        qc1 qc1Var = (qc1) obj;
        if (this.c != qc1Var.c) {
            return false;
        }
        long[] jArr = qc1Var.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return Long.valueOf(this.b[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            long j = this.b[i2];
            byte[] bArr = r21.a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // ads_mobile_sdk.j, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        c(i);
        long[] jArr = this.b;
        long j = jArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.b;
        System.arraycopy(jArr, i2, jArr, i, this.c - i2);
        this.c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        c(i);
        long[] jArr = this.b;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a(((Long) obj).longValue());
        return true;
    }
}
