package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: DoubleArrayList.java */
/* JADX INFO: loaded from: classes3.dex */
public final class formularize extends dern<Double> implements rotuma.saneness, RandomAccess {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final formularize f22194molybdenite;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final double[] f22195polloi;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public double[] f22196arytenoidectomy;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f22197monoploid;

    static {
        double[] dArr = new double[0];
        f22195polloi = dArr;
        f22194molybdenite = new formularize(dArr, 0, false);
    }

    public formularize() {
        this(f22195polloi, 0, true);
    }

    private void competently(int i) {
        if (i < 0 || i >= this.f22197monoploid) {
            throw new IndexOutOfBoundsException(cutely(i));
        }
    }

    private String cutely(int i) {
        return "Index:" + i + ", Size:" + this.f22197monoploid;
    }

    private static int taiyuan(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.dern, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection2) {
        saneness();
        rotuma.attabal(collection2);
        if (!(collection2 instanceof formularize)) {
            return super.addAll(collection2);
        }
        formularize formularizeVar = (formularize) collection2;
        int i = formularizeVar.f22197monoploid;
        if (i == 0) {
            return false;
        }
        int i2 = this.f22197monoploid;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f22196arytenoidectomy;
        if (i3 > dArr.length) {
            this.f22196arytenoidectomy = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(formularizeVar.f22196arytenoidectomy, 0, this.f22196arytenoidectomy, this.f22197monoploid, formularizeVar.f22197monoploid);
        this.f22197monoploid = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public void addDouble(double d) {
        saneness();
        int i = this.f22197monoploid;
        double[] dArr = this.f22196arytenoidectomy;
        if (i == dArr.length) {
            double[] dArr2 = new double[taiyuan(dArr.length)];
            System.arraycopy(this.f22196arytenoidectomy, 0, dArr2, 0, this.f22197monoploid);
            this.f22196arytenoidectomy = dArr2;
        }
        double[] dArr3 = this.f22196arytenoidectomy;
        int i2 = this.f22197monoploid;
        this.f22197monoploid = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.rotuma.taiyuan
    /* JADX INFO: renamed from: apical, reason: merged with bridge method [inline-methods] */
    public rotuma.saneness mutableCopyWithCapacity(int i) {
        if (i >= this.f22197monoploid) {
            return new formularize(i == 0 ? f22195polloi : Arrays.copyOf(this.f22196arytenoidectomy, i), this.f22197monoploid, true);
        }
        throw new IllegalArgumentException();
    }

    public void beachfront(int i) {
        double[] dArr = this.f22196arytenoidectomy;
        if (i <= dArr.length) {
            return;
        }
        if (dArr.length == 0) {
            this.f22196arytenoidectomy = new double[Math.max(i, 10)];
            return;
        }
        int length = dArr.length;
        while (length < i) {
            length = taiyuan(length);
        }
        this.f22196arytenoidectomy = Arrays.copyOf(this.f22196arytenoidectomy, length);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public void add(int i, Double d) {
        marial(i, d.doubleValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.dern, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof formularize)) {
            return super.equals(obj);
        }
        formularize formularizeVar = (formularize) obj;
        if (this.f22197monoploid != formularizeVar.f22197monoploid) {
            return false;
        }
        double[] dArr = formularizeVar.f22196arytenoidectomy;
        for (int i = 0; i < this.f22197monoploid; i++) {
            if (Double.doubleToLongBits(this.f22196arytenoidectomy[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public double getDouble(int i) {
        competently(i);
        return this.f22196arytenoidectomy[i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.dern, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iBeachfront = 1;
        for (int i = 0; i < this.f22197monoploid; i++) {
            iBeachfront = (iBeachfront * 31) + rotuma.beachfront(Double.doubleToLongBits(this.f22196arytenoidectomy[i]));
        }
        return iBeachfront;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.dern, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
    public Double remove(int i) {
        saneness();
        competently(i);
        double[] dArr = this.f22196arytenoidectomy;
        double d = dArr[i];
        int i2 = this.f22197monoploid;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f22197monoploid--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
    public Double get(int i) {
        return Double.valueOf(getDouble(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f22196arytenoidectomy[i] == dDoubleValue) {
                return i;
            }
        }
        return -1;
    }

    public final void marial(int i, double d) {
        int i2;
        saneness();
        if (i < 0 || i > (i2 = this.f22197monoploid)) {
            throw new IndexOutOfBoundsException(cutely(i));
        }
        double[] dArr = this.f22196arytenoidectomy;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[taiyuan(dArr.length)];
            System.arraycopy(this.f22196arytenoidectomy, 0, dArr2, 0, i);
            System.arraycopy(this.f22196arytenoidectomy, i, dArr2, i + 1, this.f22197monoploid - i);
            this.f22196arytenoidectomy = dArr2;
        }
        this.f22196arytenoidectomy[i] = d;
        this.f22197monoploid++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        saneness();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f22196arytenoidectomy;
        System.arraycopy(dArr, i2, dArr, i, this.f22197monoploid - i2);
        this.f22197monoploid -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    public double setDouble(int i, double d) {
        saneness();
        competently(i);
        double[] dArr = this.f22196arytenoidectomy;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f22197monoploid;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: triweekly, reason: merged with bridge method [inline-methods] */
    public Double set(int i, Double d) {
        return Double.valueOf(setDouble(i, d.doubleValue()));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d) {
        addDouble(d.doubleValue());
        return true;
    }

    public formularize(double[] dArr, int i, boolean z) {
        super(z);
        this.f22196arytenoidectomy = dArr;
        this.f22197monoploid = i;
    }
}
