package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: LongArrayList.java */
/* JADX INFO: loaded from: classes3.dex */
public final class kattegat extends dern<Long> implements rotuma.impromptu, RandomAccess {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final kattegat f22231molybdenite;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final long[] f22232polloi;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public long[] f22233arytenoidectomy;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f22234monoploid;

    static {
        long[] jArr = new long[0];
        f22232polloi = jArr;
        f22231molybdenite = new kattegat(jArr, 0, false);
    }

    public kattegat() {
        this(f22232polloi, 0, true);
    }

    private void competently(int i) {
        if (i < 0 || i >= this.f22234monoploid) {
            throw new IndexOutOfBoundsException(cutely(i));
        }
    }

    private String cutely(int i) {
        return "Index:" + i + ", Size:" + this.f22234monoploid;
    }

    private static int taiyuan(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.dern, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection2) {
        saneness();
        rotuma.attabal(collection2);
        if (!(collection2 instanceof kattegat)) {
            return super.addAll(collection2);
        }
        kattegat kattegatVar = (kattegat) collection2;
        int i = kattegatVar.f22234monoploid;
        if (i == 0) {
            return false;
        }
        int i2 = this.f22234monoploid;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f22233arytenoidectomy;
        if (i3 > jArr.length) {
            this.f22233arytenoidectomy = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(kattegatVar.f22233arytenoidectomy, 0, this.f22233arytenoidectomy, this.f22234monoploid, kattegatVar.f22234monoploid);
        this.f22234monoploid = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public void addLong(long j) {
        saneness();
        int i = this.f22234monoploid;
        long[] jArr = this.f22233arytenoidectomy;
        if (i == jArr.length) {
            long[] jArr2 = new long[taiyuan(jArr.length)];
            System.arraycopy(this.f22233arytenoidectomy, 0, jArr2, 0, this.f22234monoploid);
            this.f22233arytenoidectomy = jArr2;
        }
        long[] jArr3 = this.f22233arytenoidectomy;
        int i2 = this.f22234monoploid;
        this.f22234monoploid = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.rotuma.taiyuan
    /* JADX INFO: renamed from: apical, reason: merged with bridge method [inline-methods] */
    public rotuma.impromptu mutableCopyWithCapacity(int i) {
        if (i >= this.f22234monoploid) {
            return new kattegat(i == 0 ? f22232polloi : Arrays.copyOf(this.f22233arytenoidectomy, i), this.f22234monoploid, true);
        }
        throw new IllegalArgumentException();
    }

    public void beachfront(int i) {
        long[] jArr = this.f22233arytenoidectomy;
        if (i <= jArr.length) {
            return;
        }
        if (jArr.length == 0) {
            this.f22233arytenoidectomy = new long[Math.max(i, 10)];
            return;
        }
        int length = jArr.length;
        while (length < i) {
            length = taiyuan(length);
        }
        this.f22233arytenoidectomy = Arrays.copyOf(this.f22233arytenoidectomy, length);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public void add(int i, Long l) {
        marial(i, l.longValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.dern, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kattegat)) {
            return super.equals(obj);
        }
        kattegat kattegatVar = (kattegat) obj;
        if (this.f22234monoploid != kattegatVar.f22234monoploid) {
            return false;
        }
        long[] jArr = kattegatVar.f22233arytenoidectomy;
        for (int i = 0; i < this.f22234monoploid; i++) {
            if (this.f22233arytenoidectomy[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public long getLong(int i) {
        competently(i);
        return this.f22233arytenoidectomy[i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.dern, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iBeachfront = 1;
        for (int i = 0; i < this.f22234monoploid; i++) {
            iBeachfront = (iBeachfront * 31) + rotuma.beachfront(this.f22233arytenoidectomy[i]);
        }
        return iBeachfront;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.dern, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
    public Long remove(int i) {
        saneness();
        competently(i);
        long[] jArr = this.f22233arytenoidectomy;
        long j = jArr[i];
        int i2 = this.f22234monoploid;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f22234monoploid--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
    public Long get(int i) {
        return Long.valueOf(getLong(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f22233arytenoidectomy[i] == jLongValue) {
                return i;
            }
        }
        return -1;
    }

    public final void marial(int i, long j) {
        int i2;
        saneness();
        if (i < 0 || i > (i2 = this.f22234monoploid)) {
            throw new IndexOutOfBoundsException(cutely(i));
        }
        long[] jArr = this.f22233arytenoidectomy;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[taiyuan(jArr.length)];
            System.arraycopy(this.f22233arytenoidectomy, 0, jArr2, 0, i);
            System.arraycopy(this.f22233arytenoidectomy, i, jArr2, i + 1, this.f22234monoploid - i);
            this.f22233arytenoidectomy = jArr2;
        }
        this.f22233arytenoidectomy[i] = j;
        this.f22234monoploid++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        saneness();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f22233arytenoidectomy;
        System.arraycopy(jArr, i2, jArr, i, this.f22234monoploid - i2);
        this.f22234monoploid -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    public long setLong(int i, long j) {
        saneness();
        competently(i);
        long[] jArr = this.f22233arytenoidectomy;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f22234monoploid;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: triweekly, reason: merged with bridge method [inline-methods] */
    public Long set(int i, Long l) {
        return Long.valueOf(setLong(i, l.longValue()));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l) {
        addLong(l.longValue());
        return true;
    }

    public kattegat(long[] jArr, int i, boolean z) {
        super(z);
        this.f22233arytenoidectomy = jArr;
        this.f22234monoploid = i;
    }
}
