package com.badlogic.gdx.utils;

import com.badlogic.gdx.math.MathUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
public class BooleanArray {
    public boolean[] items;
    public boolean ordered;
    public int size;

    public BooleanArray() {
        this(true, 16);
    }

    public static BooleanArray with(boolean... zArr) {
        return new BooleanArray(zArr);
    }

    public void add(boolean z) {
        boolean[] zArrResize = this.items;
        int i = this.size;
        if (i == zArrResize.length) {
            zArrResize = resize(Math.max(8, (int) (i * 1.75f)));
        }
        int i2 = this.size;
        this.size = i2 + 1;
        zArrResize[i2] = z;
    }

    public void addAll(BooleanArray booleanArray) {
        addAll(booleanArray.items, 0, booleanArray.size);
    }

    public void clear() {
        this.size = 0;
    }

    public boolean[] ensureCapacity(int i) {
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
        if (!this.ordered || !(obj instanceof BooleanArray)) {
            return false;
        }
        BooleanArray booleanArray = (BooleanArray) obj;
        if (!booleanArray.ordered || (i = this.size) != booleanArray.size) {
            return false;
        }
        boolean[] zArr = this.items;
        boolean[] zArr2 = booleanArray.items;
        for (int i2 = 0; i2 < i; i2++) {
            if (zArr[i2] != zArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public boolean first() {
        if (this.size != 0) {
            return this.items[0];
        }
        throw new IllegalStateException("Array is empty.");
    }

    public boolean get(int i) {
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
        boolean[] zArr = this.items;
        int i = this.size;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + (zArr[i3] ? 1231 : 1237);
        }
        return i2;
    }

    public void insert(int i, boolean z) {
        int i2 = this.size;
        if (i > i2) {
            java.lang.StringBuilder sbQ = AbstractC5044xl.q("index can't be > size: ", i, " > ");
            sbQ.append(this.size);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        boolean[] zArrResize = this.items;
        if (i2 == zArrResize.length) {
            zArrResize = resize(Math.max(8, (int) (i2 * 1.75f)));
        }
        if (this.ordered) {
            System.arraycopy(zArrResize, i, zArrResize, i + 1, this.size - i);
        } else {
            zArrResize[this.size] = zArrResize[i];
        }
        this.size++;
        zArrResize[i] = z;
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
        boolean[] zArr = this.items;
        System.arraycopy(zArr, i, zArr, i2 + i, this.size - i);
        this.size = i4;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean notEmpty() {
        return this.size > 0;
    }

    public boolean peek() {
        return this.items[this.size - 1];
    }

    public boolean pop() {
        boolean[] zArr = this.items;
        int i = this.size - 1;
        this.size = i;
        return zArr[i];
    }

    public boolean random() {
        int i = this.size;
        if (i == 0) {
            return false;
        }
        return this.items[MathUtils.random(0, i - 1)];
    }

    public boolean removeAll(BooleanArray booleanArray) {
        int i = this.size;
        boolean[] zArr = this.items;
        int i2 = booleanArray.size;
        int i3 = i;
        for (int i4 = 0; i4 < i2; i4++) {
            boolean z = booleanArray.get(i4);
            for (int i5 = 0; i5 < i3; i5++) {
                if (z == zArr[i5]) {
                    removeIndex(i5);
                    i3--;
                    break;
                }
            }
        }
        return i3 != i;
    }

    public boolean removeIndex(int i) {
        int i2 = this.size;
        if (i >= i2) {
            java.lang.StringBuilder sbQ = AbstractC5044xl.q("index can't be >= size: ", i, " >= ");
            sbQ.append(this.size);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        boolean[] zArr = this.items;
        boolean z = zArr[i];
        int i3 = i2 - 1;
        this.size = i3;
        if (this.ordered) {
            System.arraycopy(zArr, i + 1, zArr, i, i3 - i);
        } else {
            zArr[i] = zArr[i3];
        }
        return z;
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
            boolean[] zArr = this.items;
            int i6 = i4 + i;
            System.arraycopy(zArr, i6, zArr, i, i3 - i6);
        } else {
            int iMax = Math.max(i5, i2 + 1);
            boolean[] zArr2 = this.items;
            System.arraycopy(zArr2, iMax, zArr2, i, i3 - iMax);
        }
        this.size = i5;
    }

    public int replaceAll(boolean z, boolean z2) {
        boolean[] zArr = this.items;
        int i = this.size;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (zArr[i3] == z) {
                zArr[i3] = z2;
                i2++;
            }
        }
        return i2;
    }

    public boolean replaceFirst(boolean z, boolean z2) {
        boolean[] zArr = this.items;
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (zArr[i2] == z) {
                zArr[i2] = z2;
                return true;
            }
        }
        return false;
    }

    public boolean[] resize(int i) {
        boolean[] zArr = new boolean[i];
        System.arraycopy(this.items, 0, zArr, 0, Math.min(this.size, i));
        this.items = zArr;
        return zArr;
    }

    public void reverse() {
        boolean[] zArr = this.items;
        int i = this.size;
        int i2 = i - 1;
        int i3 = i / 2;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i2 - i4;
            boolean z = zArr[i4];
            zArr[i4] = zArr[i5];
            zArr[i5] = z;
        }
    }

    public void set(int i, boolean z) {
        if (i < this.size) {
            this.items[i] = z;
        } else {
            java.lang.StringBuilder sbQ = AbstractC5044xl.q("index can't be >= size: ", i, " >= ");
            sbQ.append(this.size);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
    }

    public boolean[] setSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC3950lJ.p("newSize must be >= 0: ", i));
        }
        if (i > this.items.length) {
            resize(Math.max(8, i));
        }
        this.size = i;
        return this.items;
    }

    public boolean[] shrink() {
        int length = this.items.length;
        int i = this.size;
        if (length != i) {
            resize(i);
        }
        return this.items;
    }

    public void shuffle() {
        boolean[] zArr = this.items;
        for (int i = this.size - 1; i >= 0; i--) {
            int iRandom = MathUtils.random(i);
            boolean z = zArr[i];
            zArr[i] = zArr[iRandom];
            zArr[iRandom] = z;
        }
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
        boolean[] zArr = this.items;
        boolean z = zArr[i];
        zArr[i] = zArr[i2];
        zArr[i2] = z;
    }

    public boolean[] toArray() {
        int i = this.size;
        boolean[] zArr = new boolean[i];
        System.arraycopy(this.items, 0, zArr, 0, i);
        return zArr;
    }

    public String toString() {
        if (this.size == 0) {
            return "[]";
        }
        boolean[] zArr = this.items;
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append('[');
        stringBuilder.append(zArr[0]);
        for (int i = 1; i < this.size; i++) {
            stringBuilder.append(", ");
            stringBuilder.append(zArr[i]);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public void truncate(int i) {
        if (this.size > i) {
            this.size = i;
        }
    }

    public BooleanArray(int i) {
        this(true, i);
    }

    public void addAll(BooleanArray booleanArray, int i, int i2) {
        if (i + i2 <= booleanArray.size) {
            addAll(booleanArray.items, i, i2);
        } else {
            java.lang.StringBuilder sbT = AbstractC3950lJ.t("offset + length must be <= size: ", i, " + ", i2, " <= ");
            sbT.append(booleanArray.size);
            throw new IllegalArgumentException(sbT.toString());
        }
    }

    public BooleanArray(boolean z, int i) {
        this.ordered = z;
        this.items = new boolean[i];
    }

    public void add(boolean z, boolean z2) {
        boolean[] zArrResize = this.items;
        int i = this.size;
        if (i + 1 >= zArrResize.length) {
            zArrResize = resize(Math.max(8, (int) (i * 1.75f)));
        }
        int i2 = this.size;
        zArrResize[i2] = z;
        zArrResize[i2 + 1] = z2;
        this.size = i2 + 2;
    }

    public BooleanArray(BooleanArray booleanArray) {
        this.ordered = booleanArray.ordered;
        int i = booleanArray.size;
        this.size = i;
        boolean[] zArr = new boolean[i];
        this.items = zArr;
        System.arraycopy(booleanArray.items, 0, zArr, 0, i);
    }

    public void add(boolean z, boolean z2, boolean z3) {
        boolean[] zArrResize = this.items;
        int i = this.size;
        if (i + 2 >= zArrResize.length) {
            zArrResize = resize(Math.max(8, (int) (i * 1.75f)));
        }
        int i2 = this.size;
        zArrResize[i2] = z;
        zArrResize[i2 + 1] = z2;
        zArrResize[i2 + 2] = z3;
        this.size = i2 + 3;
    }

    public BooleanArray(boolean[] zArr) {
        this(true, zArr, 0, zArr.length);
    }

    public String toString(String str) {
        if (this.size == 0) {
            return "";
        }
        boolean[] zArr = this.items;
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append(zArr[0]);
        for (int i = 1; i < this.size; i++) {
            stringBuilder.append(str);
            stringBuilder.append(zArr[i]);
        }
        return stringBuilder.toString();
    }

    public BooleanArray(boolean z, boolean[] zArr, int i, int i2) {
        this(z, i2);
        this.size = i2;
        System.arraycopy(zArr, i, this.items, 0, i2);
    }

    public void addAll(boolean... zArr) {
        addAll(zArr, 0, zArr.length);
    }

    public void addAll(boolean[] zArr, int i, int i2) {
        boolean[] zArrResize = this.items;
        int i3 = this.size + i2;
        if (i3 > zArrResize.length) {
            zArrResize = resize(Math.max(Math.max(8, i3), (int) (this.size * 1.75f)));
        }
        System.arraycopy(zArr, i, zArrResize, this.size, i2);
        this.size += i2;
    }

    public void add(boolean z, boolean z2, boolean z3, boolean z4) {
        boolean[] zArrResize = this.items;
        int i = this.size;
        if (i + 3 >= zArrResize.length) {
            zArrResize = resize(Math.max(8, (int) (i * 1.8f)));
        }
        int i2 = this.size;
        zArrResize[i2] = z;
        zArrResize[i2 + 1] = z2;
        zArrResize[i2 + 2] = z3;
        zArrResize[i2 + 3] = z4;
        this.size = i2 + 4;
    }
}
