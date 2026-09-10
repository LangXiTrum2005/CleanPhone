package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: FloatArrayList.java */
/* JADX INFO: loaded from: classes3.dex */
public final class adultoid extends dern<Float> implements rotuma.beachfront, RandomAccess {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final adultoid f22163molybdenite;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final float[] f22164polloi;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public float[] f22165arytenoidectomy;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f22166monoploid;

    static {
        float[] fArr = new float[0];
        f22164polloi = fArr;
        f22163molybdenite = new adultoid(fArr, 0, false);
    }

    public adultoid() {
        this(f22164polloi, 0, true);
    }

    private void competently(int i) {
        if (i < 0 || i >= this.f22166monoploid) {
            throw new IndexOutOfBoundsException(cutely(i));
        }
    }

    private String cutely(int i) {
        return "Index:" + i + ", Size:" + this.f22166monoploid;
    }

    private static int taiyuan(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.dern, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection2) {
        saneness();
        rotuma.attabal(collection2);
        if (!(collection2 instanceof adultoid)) {
            return super.addAll(collection2);
        }
        adultoid adultoidVar = (adultoid) collection2;
        int i = adultoidVar.f22166monoploid;
        if (i == 0) {
            return false;
        }
        int i2 = this.f22166monoploid;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f22165arytenoidectomy;
        if (i3 > fArr.length) {
            this.f22165arytenoidectomy = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(adultoidVar.f22165arytenoidectomy, 0, this.f22165arytenoidectomy, this.f22166monoploid, adultoidVar.f22166monoploid);
        this.f22166monoploid = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public void addFloat(float f) {
        saneness();
        int i = this.f22166monoploid;
        float[] fArr = this.f22165arytenoidectomy;
        if (i == fArr.length) {
            float[] fArr2 = new float[taiyuan(fArr.length)];
            System.arraycopy(this.f22165arytenoidectomy, 0, fArr2, 0, this.f22166monoploid);
            this.f22165arytenoidectomy = fArr2;
        }
        float[] fArr3 = this.f22165arytenoidectomy;
        int i2 = this.f22166monoploid;
        this.f22166monoploid = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.rotuma.taiyuan
    /* JADX INFO: renamed from: apical, reason: merged with bridge method [inline-methods] */
    public rotuma.beachfront mutableCopyWithCapacity(int i) {
        if (i >= this.f22166monoploid) {
            return new adultoid(i == 0 ? f22164polloi : Arrays.copyOf(this.f22165arytenoidectomy, i), this.f22166monoploid, true);
        }
        throw new IllegalArgumentException();
    }

    public void beachfront(int i) {
        float[] fArr = this.f22165arytenoidectomy;
        if (i <= fArr.length) {
            return;
        }
        if (fArr.length == 0) {
            this.f22165arytenoidectomy = new float[Math.max(i, 10)];
            return;
        }
        int length = fArr.length;
        while (length < i) {
            length = taiyuan(length);
        }
        this.f22165arytenoidectomy = Arrays.copyOf(this.f22165arytenoidectomy, length);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public void add(int i, Float f) {
        marial(i, f.floatValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.dern, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adultoid)) {
            return super.equals(obj);
        }
        adultoid adultoidVar = (adultoid) obj;
        if (this.f22166monoploid != adultoidVar.f22166monoploid) {
            return false;
        }
        float[] fArr = adultoidVar.f22165arytenoidectomy;
        for (int i = 0; i < this.f22166monoploid; i++) {
            if (Float.floatToIntBits(this.f22165arytenoidectomy[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public float getFloat(int i) {
        competently(i);
        return this.f22165arytenoidectomy[i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.dern, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f22166monoploid; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f22165arytenoidectomy[i]);
        }
        return iFloatToIntBits;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.dern, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
    public Float remove(int i) {
        saneness();
        competently(i);
        float[] fArr = this.f22165arytenoidectomy;
        float f = fArr[i];
        int i2 = this.f22166monoploid;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f22166monoploid--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
    public Float get(int i) {
        return Float.valueOf(getFloat(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f22165arytenoidectomy[i] == fFloatValue) {
                return i;
            }
        }
        return -1;
    }

    public final void marial(int i, float f) {
        int i2;
        saneness();
        if (i < 0 || i > (i2 = this.f22166monoploid)) {
            throw new IndexOutOfBoundsException(cutely(i));
        }
        float[] fArr = this.f22165arytenoidectomy;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[taiyuan(fArr.length)];
            System.arraycopy(this.f22165arytenoidectomy, 0, fArr2, 0, i);
            System.arraycopy(this.f22165arytenoidectomy, i, fArr2, i + 1, this.f22166monoploid - i);
            this.f22165arytenoidectomy = fArr2;
        }
        this.f22165arytenoidectomy[i] = f;
        this.f22166monoploid++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        saneness();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f22165arytenoidectomy;
        System.arraycopy(fArr, i2, fArr, i, this.f22166monoploid - i2);
        this.f22166monoploid -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    public float setFloat(int i, float f) {
        saneness();
        competently(i);
        float[] fArr = this.f22165arytenoidectomy;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f22166monoploid;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: triweekly, reason: merged with bridge method [inline-methods] */
    public Float set(int i, Float f) {
        return Float.valueOf(setFloat(i, f.floatValue()));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f) {
        addFloat(f.floatValue());
        return true;
    }

    public adultoid(float[] fArr, int i, boolean z) {
        super(z);
        this.f22165arytenoidectomy = fArr;
        this.f22166monoploid = i;
    }
}
