package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class XD extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f3960a;
    public final int b;
    public final int c;

    public XD(int[] iArr, int i, int i2) {
        this.f3960a = iArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            if (AbstractC2995aW.S(this.f3960a, ((Integer) obj).intValue(), this.b, this.c) != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof XD)) {
            return super.equals(obj);
        }
        XD xd = (XD) obj;
        int size = size();
        if (xd.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f3960a[this.b + i] != xd.f3960a[xd.b + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        FW.j(i, size());
        return Integer.valueOf(this.f3960a[this.b + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.b; i2 < this.c; i2++) {
            i = (i * 31) + this.f3960a[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int[] iArr = this.f3960a;
        int i = this.b;
        int iS = AbstractC2995aW.S(iArr, iIntValue, i, this.c);
        if (iS >= 0) {
            return iS - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i2 = this.c;
            do {
                i2--;
                i = this.b;
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
            } while (this.f3960a[i2] != iIntValue);
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        FW.j(i, size());
        int i2 = this.b + i;
        int[] iArr = this.f3960a;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        FW.r(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        int i3 = this.b;
        return new XD(this.f3960a, i + i3, i3 + i2);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f3960a;
        int i = this.b;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i >= this.c) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i]);
        }
    }
}
