package com.badlogic.gdx.utils;

import com.badlogic.gdx.math.MathUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class FloatArray {
    public float[] items;
    public boolean ordered;
    public int size;

    public FloatArray() {
        this(true, 16);
    }

    public static FloatArray with(float... fArr) {
        return new FloatArray(fArr);
    }

    public void add(float f) {
        float[] fArrResize = this.items;
        int i = this.size;
        if (i == fArrResize.length) {
            fArrResize = resize(Math.max(8, (int) (i * 1.75f)));
        }
        int i2 = this.size;
        this.size = i2 + 1;
        fArrResize[i2] = f;
    }

    public void addAll(FloatArray floatArray) {
        addAll(floatArray.items, 0, floatArray.size);
    }

    public void clear() {
        this.size = 0;
    }

    public boolean contains(float f) {
        int i = this.size - 1;
        float[] fArr = this.items;
        while (i >= 0) {
            int i2 = i - 1;
            if (fArr[i] == f) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    public float[] ensureCapacity(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC3950lJ.p("additionalCapacity must be >= 0: ", i));
        }
        int i2 = this.size + i;
        if (i2 > this.items.length) {
            resize(Math.max(Math.max(8, i2), (int) (this.size * 1.75f)));
        }
        return this.items;
    }

    public boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (!this.ordered || !(obj instanceof FloatArray)) {
            return false;
        }
        FloatArray floatArray = (FloatArray) obj;
        if (!floatArray.ordered || (i = this.size) != floatArray.size) {
            return false;
        }
        float[] fArr = this.items;
        float[] fArr2 = floatArray.items;
        for (int i2 = 0; i2 < i; i2++) {
            if (fArr[i2] != fArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public float first() {
        if (this.size != 0) {
            return this.items[0];
        }
        throw new IllegalStateException("Array is empty.");
    }

    public float get(int i) {
        if (i < this.size) {
            return this.items[i];
        }
        java.lang.StringBuilder sbQ = AbstractC5044xl.q("index can't be >= size: ", i, " >= ");
        sbQ.append(this.size);
        throw new IndexOutOfBoundsException(sbQ.toString());
    }

    public int hashCode() {
        if (!this.ordered) {
            return super.hashCode();
        }
        float[] fArr = this.items;
        int i = this.size;
        int iFloatToRawIntBits = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iFloatToRawIntBits = (iFloatToRawIntBits * 31) + NumberUtils.floatToRawIntBits(fArr[i2]);
        }
        return iFloatToRawIntBits;
    }

    public void incr(int i, float f) {
        if (i < this.size) {
            float[] fArr = this.items;
            fArr[i] = fArr[i] + f;
        } else {
            java.lang.StringBuilder sbQ = AbstractC5044xl.q("index can't be >= size: ", i, " >= ");
            sbQ.append(this.size);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
    }

    public int indexOf(float f) {
        float[] fArr = this.items;
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (fArr[i2] == f) {
                return i2;
            }
        }
        return -1;
    }

    public void insert(int i, float f) {
        int i2 = this.size;
        if (i > i2) {
            java.lang.StringBuilder sbQ = AbstractC5044xl.q("index can't be > size: ", i, " > ");
            sbQ.append(this.size);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        float[] fArrResize = this.items;
        if (i2 == fArrResize.length) {
            fArrResize = resize(Math.max(8, (int) (i2 * 1.75f)));
        }
        if (this.ordered) {
            System.arraycopy(fArrResize, i, fArrResize, i + 1, this.size - i);
        } else {
            fArrResize[this.size] = fArrResize[i];
        }
        this.size++;
        fArrResize[i] = f;
    }

    public void insertRange(int i, int i2) {
        int i3 = this.size;
        if (i > i3) {
            java.lang.StringBuilder sbQ = AbstractC5044xl.q("index can't be > size: ", i, " > ");
            sbQ.append(this.size);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        int i4 = i3 + i2;
        if (i4 > this.items.length) {
            this.items = resize(Math.max(Math.max(8, i4), (int) (this.size * 1.75f)));
        }
        float[] fArr = this.items;
        System.arraycopy(fArr, i, fArr, i2 + i, this.size - i);
        this.size = i4;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int lastIndexOf(float f) {
        float[] fArr = this.items;
        for (int i = this.size - 1; i >= 0; i--) {
            if (fArr[i] == f) {
                return i;
            }
        }
        return -1;
    }

    public void mul(int i, float f) {
        if (i < this.size) {
            float[] fArr = this.items;
            fArr[i] = fArr[i] * f;
        } else {
            java.lang.StringBuilder sbQ = AbstractC5044xl.q("index can't be >= size: ", i, " >= ");
            sbQ.append(this.size);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
    }

    public boolean notEmpty() {
        return this.size > 0;
    }

    public float peek() {
        return this.items[this.size - 1];
    }

    public float pop() {
        float[] fArr = this.items;
        int i = this.size - 1;
        this.size = i;
        return fArr[i];
    }

    public float random() {
        int i = this.size;
        if (i == 0) {
            return 0.0f;
        }
        return this.items[MathUtils.random(0, i - 1)];
    }

    public boolean removeAll(FloatArray floatArray) {
        int i = this.size;
        float[] fArr = this.items;
        int i2 = floatArray.size;
        int i3 = i;
        for (int i4 = 0; i4 < i2; i4++) {
            float f = floatArray.get(i4);
            for (int i5 = 0; i5 < i3; i5++) {
                if (f == fArr[i5]) {
                    removeIndex(i5);
                    i3--;
                    break;
                }
            }
        }
        return i3 != i;
    }

    public float removeIndex(int i) {
        int i2 = this.size;
        if (i >= i2) {
            java.lang.StringBuilder sbQ = AbstractC5044xl.q("index can't be >= size: ", i, " >= ");
            sbQ.append(this.size);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        float[] fArr = this.items;
        float f = fArr[i];
        int i3 = i2 - 1;
        this.size = i3;
        if (this.ordered) {
            System.arraycopy(fArr, i + 1, fArr, i, i3 - i);
        } else {
            fArr[i] = fArr[i3];
        }
        return f;
    }

    public void removeRange(int i, int i2) {
        int i3 = this.size;
        if (i2 >= i3) {
            java.lang.StringBuilder sbQ = AbstractC5044xl.q("end can't be >= size: ", i2, " >= ");
            sbQ.append(this.size);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        if (i > i2) {
            throw new IndexOutOfBoundsException(AbstractC3888ke0.h("start can't be > end: ", i, " > ", i2));
        }
        int i4 = (i2 - i) + 1;
        int i5 = i3 - i4;
        if (this.ordered) {
            float[] fArr = this.items;
            int i6 = i4 + i;
            System.arraycopy(fArr, i6, fArr, i, i3 - i6);
        } else {
            int iMax = Math.max(i5, i2 + 1);
            float[] fArr2 = this.items;
            System.arraycopy(fArr2, iMax, fArr2, i, i3 - iMax);
        }
        this.size = i5;
    }

    public boolean removeValue(float f) {
        float[] fArr = this.items;
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (fArr[i2] == f) {
                removeIndex(i2);
                return true;
            }
        }
        return false;
    }

    public int replaceAll(float f, float f2) {
        float[] fArr = this.items;
        int i = this.size;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (fArr[i3] == f) {
                fArr[i3] = f2;
                i2++;
            }
        }
        return i2;
    }

    public boolean replaceFirst(float f, float f2) {
        float[] fArr = this.items;
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (fArr[i2] == f) {
                fArr[i2] = f2;
                return true;
            }
        }
        return false;
    }

    public float[] resize(int i) {
        float[] fArr = new float[i];
        System.arraycopy(this.items, 0, fArr, 0, Math.min(this.size, i));
        this.items = fArr;
        return fArr;
    }

    public void reverse() {
        float[] fArr = this.items;
        int i = this.size;
        int i2 = i - 1;
        int i3 = i / 2;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i2 - i4;
            float f = fArr[i4];
            fArr[i4] = fArr[i5];
            fArr[i5] = f;
        }
    }

    public void set(int i, float f) {
        if (i < this.size) {
            this.items[i] = f;
        } else {
            java.lang.StringBuilder sbQ = AbstractC5044xl.q("index can't be >= size: ", i, " >= ");
            sbQ.append(this.size);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
    }

    public float[] setSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC3950lJ.p("newSize must be >= 0: ", i));
        }
        if (i > this.items.length) {
            resize(Math.max(8, i));
        }
        this.size = i;
        return this.items;
    }

    public float[] shrink() {
        int length = this.items.length;
        int i = this.size;
        if (length != i) {
            resize(i);
        }
        return this.items;
    }

    public void shuffle() {
        float[] fArr = this.items;
        for (int i = this.size - 1; i >= 0; i--) {
            int iRandom = MathUtils.random(i);
            float f = fArr[i];
            fArr[i] = fArr[iRandom];
            fArr[iRandom] = f;
        }
    }

    public void sort() {
        Arrays.sort(this.items, 0, this.size);
    }

    public void swap(int i, int i2) {
        int i3 = this.size;
        if (i >= i3) {
            java.lang.StringBuilder sbQ = AbstractC5044xl.q("first can't be >= size: ", i, " >= ");
            sbQ.append(this.size);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        if (i2 >= i3) {
            java.lang.StringBuilder sbQ2 = AbstractC5044xl.q("second can't be >= size: ", i2, " >= ");
            sbQ2.append(this.size);
            throw new IndexOutOfBoundsException(sbQ2.toString());
        }
        float[] fArr = this.items;
        float f = fArr[i];
        fArr[i] = fArr[i2];
        fArr[i2] = f;
    }

    public float[] toArray() {
        int i = this.size;
        float[] fArr = new float[i];
        System.arraycopy(this.items, 0, fArr, 0, i);
        return fArr;
    }

    public String toString() {
        if (this.size == 0) {
            return "[]";
        }
        float[] fArr = this.items;
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append('[');
        stringBuilder.append(fArr[0]);
        for (int i = 1; i < this.size; i++) {
            stringBuilder.append(", ");
            stringBuilder.append(fArr[i]);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public void truncate(int i) {
        if (this.size > i) {
            this.size = i;
        }
    }

    public FloatArray(int i) {
        this(true, i);
    }

    public void addAll(FloatArray floatArray, int i, int i2) {
        if (i + i2 <= floatArray.size) {
            addAll(floatArray.items, i, i2);
        } else {
            java.lang.StringBuilder sbT = AbstractC3950lJ.t("offset + length must be <= size: ", i, " + ", i2, " <= ");
            sbT.append(floatArray.size);
            throw new IllegalArgumentException(sbT.toString());
        }
    }

    public FloatArray(boolean z, int i) {
        this.ordered = z;
        this.items = new float[i];
    }

    public void add(float f, float f2) {
        float[] fArrResize = this.items;
        int i = this.size;
        if (i + 1 >= fArrResize.length) {
            fArrResize = resize(Math.max(8, (int) (i * 1.75f)));
        }
        int i2 = this.size;
        fArrResize[i2] = f;
        fArrResize[i2 + 1] = f2;
        this.size = i2 + 2;
    }

    public FloatArray(FloatArray floatArray) {
        this.ordered = floatArray.ordered;
        int i = floatArray.size;
        this.size = i;
        float[] fArr = new float[i];
        this.items = fArr;
        System.arraycopy(floatArray.items, 0, fArr, 0, i);
    }

    public void add(float f, float f2, float f3) {
        float[] fArrResize = this.items;
        int i = this.size;
        if (i + 2 >= fArrResize.length) {
            fArrResize = resize(Math.max(8, (int) (i * 1.75f)));
        }
        int i2 = this.size;
        fArrResize[i2] = f;
        fArrResize[i2 + 1] = f2;
        fArrResize[i2 + 2] = f3;
        this.size = i2 + 3;
    }

    public boolean equals(Object obj, float f) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FloatArray)) {
            return false;
        }
        FloatArray floatArray = (FloatArray) obj;
        int i = this.size;
        if (i != floatArray.size || !this.ordered || !floatArray.ordered) {
            return false;
        }
        float[] fArr = this.items;
        float[] fArr2 = floatArray.items;
        for (int i2 = 0; i2 < i; i2++) {
            if (Math.abs(fArr[i2] - fArr2[i2]) > f) {
                return false;
            }
        }
        return true;
    }

    public void incr(float f) {
        float[] fArr = this.items;
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = fArr[i2] + f;
        }
    }

    public void mul(float f) {
        float[] fArr = this.items;
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = fArr[i2] * f;
        }
    }

    public FloatArray(float[] fArr) {
        this(true, fArr, 0, fArr.length);
    }

    public String toString(String str) {
        if (this.size == 0) {
            return "";
        }
        float[] fArr = this.items;
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append(fArr[0]);
        for (int i = 1; i < this.size; i++) {
            stringBuilder.append(str);
            stringBuilder.append(fArr[i]);
        }
        return stringBuilder.toString();
    }

    public FloatArray(boolean z, float[] fArr, int i, int i2) {
        this(z, i2);
        this.size = i2;
        System.arraycopy(fArr, i, this.items, 0, i2);
    }

    public void addAll(float... fArr) {
        addAll(fArr, 0, fArr.length);
    }

    public void addAll(float[] fArr, int i, int i2) {
        float[] fArrResize = this.items;
        int i3 = this.size + i2;
        if (i3 > fArrResize.length) {
            fArrResize = resize(Math.max(Math.max(8, i3), (int) (this.size * 1.75f)));
        }
        System.arraycopy(fArr, i, fArrResize, this.size, i2);
        this.size += i2;
    }

    public void add(float f, float f2, float f3, float f4) {
        float[] fArrResize = this.items;
        int i = this.size;
        if (i + 3 >= fArrResize.length) {
            fArrResize = resize(Math.max(8, (int) (i * 1.8f)));
        }
        int i2 = this.size;
        fArrResize[i2] = f;
        fArrResize[i2 + 1] = f2;
        fArrResize[i2 + 2] = f3;
        fArrResize[i2 + 3] = f4;
        this.size = i2 + 4;
    }
}
