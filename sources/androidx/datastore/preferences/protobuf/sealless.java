package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: LongArrayList.java */
/* JADX INFO: loaded from: classes.dex */
public final class sealless extends dern<Long> implements gintrap.marial, RandomAccess, overspeculate {

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final sealless f9842polloi = new sealless(new long[0], 0, false);

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public long[] f9843arytenoidectomy;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f9844monoploid;

    public sealless() {
        this(new long[10], 0, true);
    }

    private void beachfront(int i) {
        if (i < 0 || i >= this.f9844monoploid) {
            throw new IndexOutOfBoundsException(impromptu(i));
        }
    }

    private String impromptu(int i) {
        return "Index:" + i + ", Size:" + this.f9844monoploid;
    }

    @Override // androidx.datastore.preferences.protobuf.dern, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection2) {
        saneness();
        gintrap.attabal(collection2);
        if (!(collection2 instanceof sealless)) {
            return super.addAll(collection2);
        }
        sealless seallessVar = (sealless) collection2;
        int i = seallessVar.f9844monoploid;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9844monoploid;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f9843arytenoidectomy;
        if (i3 > jArr.length) {
            this.f9843arytenoidectomy = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(seallessVar.f9843arytenoidectomy, 0, this.f9843arytenoidectomy, this.f9844monoploid, seallessVar.f9844monoploid);
        this.f9844monoploid = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public void addLong(long j) {
        saneness();
        int i = this.f9844monoploid;
        long[] jArr = this.f9843arytenoidectomy;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f9843arytenoidectomy = jArr2;
        }
        long[] jArr3 = this.f9843arytenoidectomy;
        int i2 = this.f9844monoploid;
        this.f9844monoploid = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: apical, reason: merged with bridge method [inline-methods] */
    public Long set(int i, Long l) {
        return Long.valueOf(setLong(i, l.longValue()));
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
    public Long get(int i) {
        return Long.valueOf(getLong(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // androidx.datastore.preferences.protobuf.dern, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: cutely, reason: merged with bridge method [inline-methods] */
    public Long remove(int i) {
        saneness();
        beachfront(i);
        long[] jArr = this.f9843arytenoidectomy;
        long j = jArr[i];
        int i2 = this.f9844monoploid;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f9844monoploid--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public void add(int i, Long l) {
        marial(i, l.longValue());
    }

    @Override // androidx.datastore.preferences.protobuf.dern, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sealless)) {
            return super.equals(obj);
        }
        sealless seallessVar = (sealless) obj;
        if (this.f9844monoploid != seallessVar.f9844monoploid) {
            return false;
        }
        long[] jArr = seallessVar.f9843arytenoidectomy;
        for (int i = 0; i < this.f9844monoploid; i++) {
            if (this.f9843arytenoidectomy[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public long getLong(int i) {
        beachfront(i);
        return this.f9843arytenoidectomy[i];
    }

    @Override // androidx.datastore.preferences.protobuf.dern, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iBeachfront = 1;
        for (int i = 0; i < this.f9844monoploid; i++) {
            iBeachfront = (iBeachfront * 31) + gintrap.beachfront(this.f9843arytenoidectomy[i]);
        }
        return iBeachfront;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f9843arytenoidectomy[i] == jLongValue) {
                return i;
            }
        }
        return -1;
    }

    public final void marial(int i, long j) {
        int i2;
        saneness();
        if (i < 0 || i > (i2 = this.f9844monoploid)) {
            throw new IndexOutOfBoundsException(impromptu(i));
        }
        long[] jArr = this.f9843arytenoidectomy;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f9843arytenoidectomy, i, jArr2, i + 1, this.f9844monoploid - i);
            this.f9843arytenoidectomy = jArr2;
        }
        this.f9843arytenoidectomy[i] = j;
        this.f9844monoploid++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        saneness();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f9843arytenoidectomy;
        System.arraycopy(jArr, i2, jArr, i, this.f9844monoploid - i2);
        this.f9844monoploid -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    public long setLong(int i, long j) {
        saneness();
        beachfront(i);
        long[] jArr = this.f9843arytenoidectomy;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f9844monoploid;
    }

    @Override // androidx.datastore.preferences.protobuf.gintrap.beachfront
    /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
    public gintrap.marial mutableCopyWithCapacity(int i) {
        if (i >= this.f9844monoploid) {
            return new sealless(Arrays.copyOf(this.f9843arytenoidectomy, i), this.f9844monoploid, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l) {
        addLong(l.longValue());
        return true;
    }

    public sealless(long[] jArr, int i, boolean z) {
        super(z);
        this.f9843arytenoidectomy = jArr;
        this.f9844monoploid = i;
    }
}
