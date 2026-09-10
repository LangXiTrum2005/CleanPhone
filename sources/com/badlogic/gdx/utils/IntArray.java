package com.badlogic.gdx.utils;

import com.badlogic.gdx.math.MathUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class IntArray {
    public int[] items;
    public boolean ordered;
    public int size;

    public IntArray() {
        this(true, 16);
    }

    public static IntArray with(int... iArr) {
        return new IntArray(iArr);
    }

    public void add(int i) {
        int[] iArrResize = this.items;
        int i2 = this.size;
        if (i2 == iArrResize.length) {
            iArrResize = resize(Math.max(8, (int) (i2 * 1.75f)));
        }
        int i3 = this.size;
        this.size = i3 + 1;
        iArrResize[i3] = i;
    }

    public void addAll(IntArray intArray) {
        addAll(intArray.items, 0, intArray.size);
    }

    public void clear() {
        this.size = 0;
    }

    public boolean contains(int i) {
        int i2 = this.size - 1;
        int[] iArr = this.items;
        while (i2 >= 0) {
            int i3 = i2 - 1;
            if (iArr[i2] == i) {
                return true;
            }
            i2 = i3;
        }
        return false;
    }

    public int[] ensureCapacity(int i) {
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
        if (!this.ordered || !(obj instanceof IntArray)) {
            return false;
        }
        IntArray intArray = (IntArray) obj;
        if (!intArray.ordered || (i = this.size) != intArray.size) {
            return false;
        }
        int[] iArr = this.items;
        int[] iArr2 = intArray.items;
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public int first() {
        if (this.size != 0) {
            return this.items[0];
        }
        throw new IllegalStateException("Array is empty.");
    }

    public int get(int i) {
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
        int[] iArr = this.items;
        int i = this.size;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    public void incr(int i, int i2) {
        if (i < this.size) {
            int[] iArr = this.items;
            iArr[i] = iArr[i] + i2;
        } else {
            java.lang.StringBuilder sbQ = AbstractC5044xl.q("index can't be >= size: ", i, " >= ");
            sbQ.append(this.size);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
    }

    public int indexOf(int i) {
        int[] iArr = this.items;
        int i2 = this.size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (iArr[i3] == i) {
                return i3;
            }
        }
        return -1;
    }

    public void insert(int i, int i2) {
        int i3 = this.size;
        if (i > i3) {
            java.lang.StringBuilder sbQ = AbstractC5044xl.q("index can't be > size: ", i, " > ");
            sbQ.append(this.size);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        int[] iArrResize = this.items;
        if (i3 == iArrResize.length) {
            iArrResize = resize(Math.max(8, (int) (i3 * 1.75f)));
        }
        if (this.ordered) {
            System.arraycopy(iArrResize, i, iArrResize, i + 1, this.size - i);
        } else {
            iArrResize[this.size] = iArrResize[i];
        }
        this.size++;
        iArrResize[i] = i2;
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
        int[] iArr = this.items;
        System.arraycopy(iArr, i, iArr, i2 + i, this.size - i);
        this.size = i4;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int lastIndexOf(int i) {
        int[] iArr = this.items;
        for (int i2 = this.size - 1; i2 >= 0; i2--) {
            if (iArr[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public void mul(int i, int i2) {
        if (i < this.size) {
            int[] iArr = this.items;
            iArr[i] = iArr[i] * i2;
        } else {
            java.lang.StringBuilder sbQ = AbstractC5044xl.q("index can't be >= size: ", i, " >= ");
            sbQ.append(this.size);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
    }

    public boolean notEmpty() {
        return this.size > 0;
    }

    public int peek() {
        return this.items[this.size - 1];
    }

    public int pop() {
        int[] iArr = this.items;
        int i = this.size - 1;
        this.size = i;
        return iArr[i];
    }

    public int random() {
        int i = this.size;
        if (i == 0) {
            return 0;
        }
        return this.items[MathUtils.random(0, i - 1)];
    }

    public boolean removeAll(IntArray intArray) {
        int i = this.size;
        int[] iArr = this.items;
        int i2 = intArray.size;
        int i3 = i;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = intArray.get(i4);
            for (int i6 = 0; i6 < i3; i6++) {
                if (i5 == iArr[i6]) {
                    removeIndex(i6);
                    i3--;
                    break;
                }
            }
        }
        return i3 != i;
    }

    public int removeIndex(int i) {
        int i2 = this.size;
        if (i >= i2) {
            java.lang.StringBuilder sbQ = AbstractC5044xl.q("index can't be >= size: ", i, " >= ");
            sbQ.append(this.size);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        int[] iArr = this.items;
        int i3 = iArr[i];
        int i4 = i2 - 1;
        this.size = i4;
        if (this.ordered) {
            System.arraycopy(iArr, i + 1, iArr, i, i4 - i);
        } else {
            iArr[i] = iArr[i4];
        }
        return i3;
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
            int[] iArr = this.items;
            int i6 = i4 + i;
            System.arraycopy(iArr, i6, iArr, i, i3 - i6);
        } else {
            int iMax = Math.max(i5, i2 + 1);
            int[] iArr2 = this.items;
            System.arraycopy(iArr2, iMax, iArr2, i, i3 - iMax);
        }
        this.size = i5;
    }

    public boolean removeValue(int i) {
        int[] iArr = this.items;
        int i2 = this.size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (iArr[i3] == i) {
                removeIndex(i3);
                return true;
            }
        }
        return false;
    }

    public int replaceAll(int i, int i2) {
        int[] iArr = this.items;
        int i3 = this.size;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            if (iArr[i5] == i) {
                iArr[i5] = i2;
                i4++;
            }
        }
        return i4;
    }

    public boolean replaceFirst(int i, int i2) {
        int[] iArr = this.items;
        int i3 = this.size;
        for (int i4 = 0; i4 < i3; i4++) {
            if (iArr[i4] == i) {
                iArr[i4] = i2;
                return true;
            }
        }
        return false;
    }

    public int[] resize(int i) {
        int[] iArr = new int[i];
        System.arraycopy(this.items, 0, iArr, 0, Math.min(this.size, i));
        this.items = iArr;
        return iArr;
    }

    public void reverse() {
        int[] iArr = this.items;
        int i = this.size;
        int i2 = i - 1;
        int i3 = i / 2;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i2 - i4;
            int i6 = iArr[i4];
            iArr[i4] = iArr[i5];
            iArr[i5] = i6;
        }
    }

    public void set(int i, int i2) {
        if (i < this.size) {
            this.items[i] = i2;
        } else {
            java.lang.StringBuilder sbQ = AbstractC5044xl.q("index can't be >= size: ", i, " >= ");
            sbQ.append(this.size);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
    }

    public int[] setSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC3950lJ.p("newSize must be >= 0: ", i));
        }
        if (i > this.items.length) {
            resize(Math.max(8, i));
        }
        this.size = i;
        return this.items;
    }

    public int[] shrink() {
        int length = this.items.length;
        int i = this.size;
        if (length != i) {
            resize(i);
        }
        return this.items;
    }

    public void shuffle() {
        int[] iArr = this.items;
        for (int i = this.size - 1; i >= 0; i--) {
            int iRandom = MathUtils.random(i);
            int i2 = iArr[i];
            iArr[i] = iArr[iRandom];
            iArr[iRandom] = i2;
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
        int[] iArr = this.items;
        int i4 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i4;
    }

    public int[] toArray() {
        int i = this.size;
        int[] iArr = new int[i];
        System.arraycopy(this.items, 0, iArr, 0, i);
        return iArr;
    }

    public String toString() {
        if (this.size == 0) {
            return "[]";
        }
        int[] iArr = this.items;
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append('[');
        stringBuilder.append(iArr[0]);
        for (int i = 1; i < this.size; i++) {
            stringBuilder.append(", ");
            stringBuilder.append(iArr[i]);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public void truncate(int i) {
        if (this.size > i) {
            this.size = i;
        }
    }

    public IntArray(int i) {
        this(true, i);
    }

    public void addAll(IntArray intArray, int i, int i2) {
        if (i + i2 <= intArray.size) {
            addAll(intArray.items, i, i2);
        } else {
            java.lang.StringBuilder sbT = AbstractC3950lJ.t("offset + length must be <= size: ", i, " + ", i2, " <= ");
            sbT.append(intArray.size);
            throw new IllegalArgumentException(sbT.toString());
        }
    }

    public IntArray(boolean z, int i) {
        this.ordered = z;
        this.items = new int[i];
    }

    public void add(int i, int i2) {
        int[] iArrResize = this.items;
        int i3 = this.size;
        if (i3 + 1 >= iArrResize.length) {
            iArrResize = resize(Math.max(8, (int) (i3 * 1.75f)));
        }
        int i4 = this.size;
        iArrResize[i4] = i;
        iArrResize[i4 + 1] = i2;
        this.size = i4 + 2;
    }

    public IntArray(IntArray intArray) {
        this.ordered = intArray.ordered;
        int i = intArray.size;
        this.size = i;
        int[] iArr = new int[i];
        this.items = iArr;
        System.arraycopy(intArray.items, 0, iArr, 0, i);
    }

    public void add(int i, int i2, int i3) {
        int[] iArrResize = this.items;
        int i4 = this.size;
        if (i4 + 2 >= iArrResize.length) {
            iArrResize = resize(Math.max(8, (int) (i4 * 1.75f)));
        }
        int i5 = this.size;
        iArrResize[i5] = i;
        iArrResize[i5 + 1] = i2;
        iArrResize[i5 + 2] = i3;
        this.size = i5 + 3;
    }

    public void incr(int i) {
        int[] iArr = this.items;
        int i2 = this.size;
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = iArr[i3] + i;
        }
    }

    public void mul(int i) {
        int[] iArr = this.items;
        int i2 = this.size;
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = iArr[i3] * i;
        }
    }

    public IntArray(int[] iArr) {
        this(true, iArr, 0, iArr.length);
    }

    public String toString(String str) {
        if (this.size == 0) {
            return "";
        }
        int[] iArr = this.items;
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append(iArr[0]);
        for (int i = 1; i < this.size; i++) {
            stringBuilder.append(str);
            stringBuilder.append(iArr[i]);
        }
        return stringBuilder.toString();
    }

    public IntArray(boolean z, int[] iArr, int i, int i2) {
        this(z, i2);
        this.size = i2;
        System.arraycopy(iArr, i, this.items, 0, i2);
    }

    public void addAll(int... iArr) {
        addAll(iArr, 0, iArr.length);
    }

    public void addAll(int[] iArr, int i, int i2) {
        int[] iArrResize = this.items;
        int i3 = this.size + i2;
        if (i3 > iArrResize.length) {
            iArrResize = resize(Math.max(Math.max(8, i3), (int) (this.size * 1.75f)));
        }
        System.arraycopy(iArr, i, iArrResize, this.size, i2);
        this.size += i2;
    }

    public void add(int i, int i2, int i3, int i4) {
        int[] iArrResize = this.items;
        int i5 = this.size;
        if (i5 + 3 >= iArrResize.length) {
            iArrResize = resize(Math.max(8, (int) (i5 * 1.8f)));
        }
        int i6 = this.size;
        iArrResize[i6] = i;
        iArrResize[i6 + 1] = i2;
        iArrResize[i6 + 2] = i3;
        iArrResize[i6 + 3] = i4;
        this.size = i6 + 4;
    }
}
