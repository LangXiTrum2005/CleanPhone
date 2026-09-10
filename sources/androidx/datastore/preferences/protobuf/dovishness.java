package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: IntArrayList.java */
/* JADX INFO: loaded from: classes.dex */
public final class dovishness extends dern<Integer> implements gintrap.wireman, RandomAccess, overspeculate {

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final dovishness f9711polloi = new dovishness(new int[0], 0, false);

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public int[] f9712arytenoidectomy;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f9713monoploid;

    public dovishness() {
        this(new int[10], 0, true);
    }

    private void beachfront(int i) {
        if (i < 0 || i >= this.f9713monoploid) {
            throw new IndexOutOfBoundsException(impromptu(i));
        }
    }

    private String impromptu(int i) {
        return "Index:" + i + ", Size:" + this.f9713monoploid;
    }

    @Override // androidx.datastore.preferences.protobuf.dern, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection2) {
        saneness();
        gintrap.attabal(collection2);
        if (!(collection2 instanceof dovishness)) {
            return super.addAll(collection2);
        }
        dovishness dovishnessVar = (dovishness) collection2;
        int i = dovishnessVar.f9713monoploid;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9713monoploid;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f9712arytenoidectomy;
        if (i3 > iArr.length) {
            this.f9712arytenoidectomy = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(dovishnessVar.f9712arytenoidectomy, 0, this.f9712arytenoidectomy, this.f9713monoploid, dovishnessVar.f9713monoploid);
        this.f9713monoploid = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public void addInt(int i) {
        saneness();
        int i2 = this.f9713monoploid;
        int[] iArr = this.f9712arytenoidectomy;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f9712arytenoidectomy = iArr2;
        }
        int[] iArr3 = this.f9712arytenoidectomy;
        int i3 = this.f9713monoploid;
        this.f9713monoploid = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: apical, reason: merged with bridge method [inline-methods] */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(setInt(i, num.intValue()));
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
    public Integer get(int i) {
        return Integer.valueOf(getInt(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // androidx.datastore.preferences.protobuf.dern, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: cutely, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i) {
        saneness();
        beachfront(i);
        int[] iArr = this.f9712arytenoidectomy;
        int i2 = iArr[i];
        int i3 = this.f9713monoploid;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f9713monoploid--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public void add(int i, Integer num) {
        marial(i, num.intValue());
    }

    @Override // androidx.datastore.preferences.protobuf.dern, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dovishness)) {
            return super.equals(obj);
        }
        dovishness dovishnessVar = (dovishness) obj;
        if (this.f9713monoploid != dovishnessVar.f9713monoploid) {
            return false;
        }
        int[] iArr = dovishnessVar.f9712arytenoidectomy;
        for (int i = 0; i < this.f9713monoploid; i++) {
            if (this.f9712arytenoidectomy[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public int getInt(int i) {
        beachfront(i);
        return this.f9712arytenoidectomy[i];
    }

    @Override // androidx.datastore.preferences.protobuf.dern, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9713monoploid; i2++) {
            i = (i * 31) + this.f9712arytenoidectomy[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f9712arytenoidectomy[i] == iIntValue) {
                return i;
            }
        }
        return -1;
    }

    public final void marial(int i, int i2) {
        int i3;
        saneness();
        if (i < 0 || i > (i3 = this.f9713monoploid)) {
            throw new IndexOutOfBoundsException(impromptu(i));
        }
        int[] iArr = this.f9712arytenoidectomy;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f9712arytenoidectomy, i, iArr2, i + 1, this.f9713monoploid - i);
            this.f9712arytenoidectomy = iArr2;
        }
        this.f9712arytenoidectomy[i] = i2;
        this.f9713monoploid++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        saneness();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f9712arytenoidectomy;
        System.arraycopy(iArr, i2, iArr, i, this.f9713monoploid - i2);
        this.f9713monoploid -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    public int setInt(int i, int i2) {
        saneness();
        beachfront(i);
        int[] iArr = this.f9712arytenoidectomy;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f9713monoploid;
    }

    @Override // androidx.datastore.preferences.protobuf.gintrap.beachfront
    /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
    public gintrap.wireman mutableCopyWithCapacity(int i) {
        if (i >= this.f9713monoploid) {
            return new dovishness(Arrays.copyOf(this.f9712arytenoidectomy, i), this.f9713monoploid, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    public dovishness(int[] iArr, int i, boolean z) {
        super(z);
        this.f9712arytenoidectomy = iArr;
        this.f9713monoploid = i;
    }
}
