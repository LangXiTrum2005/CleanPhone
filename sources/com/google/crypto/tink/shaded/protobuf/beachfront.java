package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: BooleanArrayList.java */
/* JADX INFO: loaded from: classes3.dex */
public final class beachfront extends dern<Boolean> implements rotuma.attabal, RandomAccess {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final beachfront f22169molybdenite;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final boolean[] f22170polloi;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public boolean[] f22171arytenoidectomy;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f22172monoploid;

    static {
        boolean[] zArr = new boolean[0];
        f22170polloi = zArr;
        f22169molybdenite = new beachfront(zArr, 0, false);
    }

    public beachfront() {
        this(f22170polloi, 0, true);
    }

    public static int impromptu(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.dern, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection2) {
        saneness();
        rotuma.attabal(collection2);
        if (!(collection2 instanceof beachfront)) {
            return super.addAll(collection2);
        }
        beachfront beachfrontVar = (beachfront) collection2;
        int i = beachfrontVar.f22172monoploid;
        if (i == 0) {
            return false;
        }
        int i2 = this.f22172monoploid;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f22171arytenoidectomy;
        if (i3 > zArr.length) {
            this.f22171arytenoidectomy = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(beachfrontVar.f22171arytenoidectomy, 0, this.f22171arytenoidectomy, this.f22172monoploid, beachfrontVar.f22172monoploid);
        this.f22172monoploid = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public void addBoolean(boolean z) {
        saneness();
        int i = this.f22172monoploid;
        boolean[] zArr = this.f22171arytenoidectomy;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[impromptu(zArr.length)];
            System.arraycopy(this.f22171arytenoidectomy, 0, zArr2, 0, this.f22172monoploid);
            this.f22171arytenoidectomy = zArr2;
        }
        boolean[] zArr3 = this.f22171arytenoidectomy;
        int i2 = this.f22172monoploid;
        this.f22172monoploid = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.dern, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: apical, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i) {
        saneness();
        beachfront(i);
        boolean[] zArr = this.f22171arytenoidectomy;
        boolean z = zArr[i];
        int i2 = this.f22172monoploid;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f22172monoploid--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    public final void beachfront(int i) {
        if (i < 0 || i >= this.f22172monoploid) {
            throw new IndexOutOfBoundsException(taiyuan(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i) {
        return Boolean.valueOf(getBoolean(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.rotuma.taiyuan
    /* JADX INFO: renamed from: cutely, reason: merged with bridge method [inline-methods] */
    public rotuma.attabal mutableCopyWithCapacity(int i) {
        if (i >= this.f22172monoploid) {
            return new beachfront(i == 0 ? f22170polloi : Arrays.copyOf(this.f22171arytenoidectomy, i), this.f22172monoploid, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public void add(int i, Boolean bool) {
        marial(i, bool.booleanValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.dern, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof beachfront)) {
            return super.equals(obj);
        }
        beachfront beachfrontVar = (beachfront) obj;
        if (this.f22172monoploid != beachfrontVar.f22172monoploid) {
            return false;
        }
        boolean[] zArr = beachfrontVar.f22171arytenoidectomy;
        for (int i = 0; i < this.f22172monoploid; i++) {
            if (this.f22171arytenoidectomy[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean getBoolean(int i) {
        beachfront(i);
        return this.f22171arytenoidectomy[i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.dern, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iDern = 1;
        for (int i = 0; i < this.f22172monoploid; i++) {
            iDern = (iDern * 31) + rotuma.dern(this.f22171arytenoidectomy[i]);
        }
        return iDern;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(setBoolean(i, bool.booleanValue()));
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f22171arytenoidectomy[i] == zBooleanValue) {
                return i;
            }
        }
        return -1;
    }

    public final void marial(int i, boolean z) {
        int i2;
        saneness();
        if (i < 0 || i > (i2 = this.f22172monoploid)) {
            throw new IndexOutOfBoundsException(taiyuan(i));
        }
        boolean[] zArr = this.f22171arytenoidectomy;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[impromptu(zArr.length)];
            System.arraycopy(this.f22171arytenoidectomy, 0, zArr2, 0, i);
            System.arraycopy(this.f22171arytenoidectomy, i, zArr2, i + 1, this.f22172monoploid - i);
            this.f22171arytenoidectomy = zArr2;
        }
        this.f22171arytenoidectomy[i] = z;
        this.f22172monoploid++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        saneness();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f22171arytenoidectomy;
        System.arraycopy(zArr, i2, zArr, i, this.f22172monoploid - i2);
        this.f22172monoploid -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    public boolean setBoolean(int i, boolean z) {
        saneness();
        beachfront(i);
        boolean[] zArr = this.f22171arytenoidectomy;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f22172monoploid;
    }

    public final String taiyuan(int i) {
        return "Index:" + i + ", Size:" + this.f22172monoploid;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        addBoolean(bool.booleanValue());
        return true;
    }

    public beachfront(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f22171arytenoidectomy = zArr;
        this.f22172monoploid = i;
    }
}
