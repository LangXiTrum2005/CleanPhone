package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: IntArrayList.java */
/* JADX INFO: loaded from: classes3.dex */
public final class gintrap extends dern<Integer> implements rotuma.competently, RandomAccess {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final gintrap f22198molybdenite;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final int[] f22199polloi;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public int[] f22200arytenoidectomy;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f22201monoploid;

    static {
        int[] iArr = new int[0];
        f22199polloi = iArr;
        f22198molybdenite = new gintrap(iArr, 0, false);
    }

    public gintrap() {
        this(f22199polloi, 0, true);
    }

    private void competently(int i) {
        if (i < 0 || i >= this.f22201monoploid) {
            throw new IndexOutOfBoundsException(cutely(i));
        }
    }

    private String cutely(int i) {
        return "Index:" + i + ", Size:" + this.f22201monoploid;
    }

    private static int taiyuan(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.dern, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection2) {
        saneness();
        rotuma.attabal(collection2);
        if (!(collection2 instanceof gintrap)) {
            return super.addAll(collection2);
        }
        gintrap gintrapVar = (gintrap) collection2;
        int i = gintrapVar.f22201monoploid;
        if (i == 0) {
            return false;
        }
        int i2 = this.f22201monoploid;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f22200arytenoidectomy;
        if (i3 > iArr.length) {
            this.f22200arytenoidectomy = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(gintrapVar.f22200arytenoidectomy, 0, this.f22200arytenoidectomy, this.f22201monoploid, gintrapVar.f22201monoploid);
        this.f22201monoploid = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public void addInt(int i) {
        saneness();
        int i2 = this.f22201monoploid;
        int[] iArr = this.f22200arytenoidectomy;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[taiyuan(iArr.length)];
            System.arraycopy(this.f22200arytenoidectomy, 0, iArr2, 0, this.f22201monoploid);
            this.f22200arytenoidectomy = iArr2;
        }
        int[] iArr3 = this.f22200arytenoidectomy;
        int i3 = this.f22201monoploid;
        this.f22201monoploid = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.rotuma.taiyuan
    /* JADX INFO: renamed from: apical, reason: merged with bridge method [inline-methods] */
    public rotuma.competently mutableCopyWithCapacity(int i) {
        if (i >= this.f22201monoploid) {
            return new gintrap(i == 0 ? f22199polloi : Arrays.copyOf(this.f22200arytenoidectomy, i), this.f22201monoploid, true);
        }
        throw new IllegalArgumentException();
    }

    public void beachfront(int i) {
        int[] iArr = this.f22200arytenoidectomy;
        if (i <= iArr.length) {
            return;
        }
        if (iArr.length == 0) {
            this.f22200arytenoidectomy = new int[Math.max(i, 10)];
            return;
        }
        int length = iArr.length;
        while (length < i) {
            length = taiyuan(length);
        }
        this.f22200arytenoidectomy = Arrays.copyOf(this.f22200arytenoidectomy, length);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public void add(int i, Integer num) {
        marial(i, num.intValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.dern, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gintrap)) {
            return super.equals(obj);
        }
        gintrap gintrapVar = (gintrap) obj;
        if (this.f22201monoploid != gintrapVar.f22201monoploid) {
            return false;
        }
        int[] iArr = gintrapVar.f22200arytenoidectomy;
        for (int i = 0; i < this.f22201monoploid; i++) {
            if (this.f22200arytenoidectomy[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public int getInt(int i) {
        competently(i);
        return this.f22200arytenoidectomy[i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.dern, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f22201monoploid; i2++) {
            i = (i * 31) + this.f22200arytenoidectomy[i2];
        }
        return i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.dern, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i) {
        saneness();
        competently(i);
        int[] iArr = this.f22200arytenoidectomy;
        int i2 = iArr[i];
        int i3 = this.f22201monoploid;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f22201monoploid--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
    public Integer get(int i) {
        return Integer.valueOf(getInt(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f22200arytenoidectomy[i] == iIntValue) {
                return i;
            }
        }
        return -1;
    }

    public final void marial(int i, int i2) {
        int i3;
        saneness();
        if (i < 0 || i > (i3 = this.f22201monoploid)) {
            throw new IndexOutOfBoundsException(cutely(i));
        }
        int[] iArr = this.f22200arytenoidectomy;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[taiyuan(iArr.length)];
            System.arraycopy(this.f22200arytenoidectomy, 0, iArr2, 0, i);
            System.arraycopy(this.f22200arytenoidectomy, i, iArr2, i + 1, this.f22201monoploid - i);
            this.f22200arytenoidectomy = iArr2;
        }
        this.f22200arytenoidectomy[i] = i2;
        this.f22201monoploid++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        saneness();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f22200arytenoidectomy;
        System.arraycopy(iArr, i2, iArr, i, this.f22201monoploid - i2);
        this.f22201monoploid -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    public int setInt(int i, int i2) {
        saneness();
        competently(i);
        int[] iArr = this.f22200arytenoidectomy;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f22201monoploid;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: triweekly, reason: merged with bridge method [inline-methods] */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(setInt(i, num.intValue()));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    public gintrap(int[] iArr, int i, boolean z) {
        super(z);
        this.f22200arytenoidectomy = iArr;
        this.f22201monoploid = i;
    }
}
