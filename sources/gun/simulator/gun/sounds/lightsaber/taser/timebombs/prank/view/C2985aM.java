package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.aM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2985aM implements Map, Serializable {
    public static final C2985aM m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f4119a;
    public Object[] b;
    public int[] c;
    public int[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public C3074bM i;
    public C3162cM j;
    public C3074bM k;
    public boolean l;

    static {
        C2985aM c2985aM = new C2985aM(0);
        c2985aM.l = true;
        m = c2985aM;
    }

    public C2985aM(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.".toString());
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f4119a = objArr;
        this.b = null;
        this.c = iArr;
        this.d = new int[iHighestOneBit];
        this.e = 2;
        this.f = 0;
        this.g = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int a(Object obj) {
        b();
        while (true) {
            int i = i(obj);
            int i2 = this.e * 2;
            int length = this.d.length / 2;
            if (i2 > length) {
                i2 = length;
            }
            int i3 = 0;
            while (true) {
                int[] iArr = this.d;
                int i4 = iArr[i];
                if (i4 <= 0) {
                    int i5 = this.f;
                    Object[] objArr = this.f4119a;
                    if (i5 >= objArr.length) {
                        f(1);
                        break;
                    }
                    int i6 = i5 + 1;
                    this.f = i6;
                    objArr[i5] = obj;
                    this.c[i5] = i;
                    iArr[i] = i6;
                    this.h++;
                    if (i3 > this.e) {
                        this.e = i3;
                    }
                    return i5;
                }
                if (AbstractC2995aW.i(this.f4119a[i4 - 1], obj)) {
                    return -i4;
                }
                i3++;
                if (i3 > i2) {
                    j(this.d.length * 2);
                    break;
                }
                i = i == 0 ? this.d.length - 1 : i - 1;
            }
        }
    }

    public final void b() {
        if (this.l) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean c(Collection collection) {
        AbstractC2995aW.q(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!d((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final void clear() {
        b();
        C5087yD it = new C5175zD(0, this.f - 1, 1).iterator();
        while (it.c) {
            int iNextInt = it.nextInt();
            int[] iArr = this.c;
            int i = iArr[iNextInt];
            if (i >= 0) {
                this.d[i] = 0;
                iArr[iNextInt] = -1;
            }
        }
        AbstractC2340Cl.P(this.f4119a, 0, this.f);
        Object[] objArr = this.b;
        if (objArr != null) {
            AbstractC2340Cl.P(objArr, 0, this.f);
        }
        this.h = 0;
        this.f = 0;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final boolean d(Map.Entry entry) {
        AbstractC2995aW.q(entry, "entry");
        int iG = g(entry.getKey());
        if (iG < 0) {
            return false;
        }
        Object[] objArr = this.b;
        AbstractC2995aW.n(objArr);
        return AbstractC2995aW.i(objArr[iG], entry.getValue());
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C3074bM c3074bM = this.k;
        if (c3074bM != null) {
            return c3074bM;
        }
        C3074bM c3074bM2 = new C3074bM(this, 0);
        this.k = c3074bM2;
        return c3074bM2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.h != map.size() || !c(map.entrySet())) {
                }
            }
            return false;
        }
        return true;
    }

    public final void f(int i) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f4119a;
        int length = objArr.length;
        int i2 = this.f;
        int i3 = length - i2;
        int i4 = i2 - this.h;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            j(this.d.length);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = (objArr.length * 3) / 2;
            if (i5 <= length2) {
                i5 = length2;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i5);
            AbstractC2995aW.p(objArrCopyOf2, "copyOf(this, newSize)");
            this.f4119a = objArrCopyOf2;
            Object[] objArr2 = this.b;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i5);
                AbstractC2995aW.p(objArrCopyOf, "copyOf(this, newSize)");
            } else {
                objArrCopyOf = null;
            }
            this.b = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.c, i5);
            AbstractC2995aW.p(iArrCopyOf, "copyOf(this, newSize)");
            this.c = iArrCopyOf;
            if (i5 < 1) {
                i5 = 1;
            }
            int iHighestOneBit = Integer.highestOneBit(i5 * 3);
            if (iHighestOneBit > this.d.length) {
                j(iHighestOneBit);
            }
        }
    }

    public final int g(Object obj) {
        int i = i(obj);
        int i2 = this.e;
        while (true) {
            int i3 = this.d[i];
            if (i3 == 0) {
                return -1;
            }
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (AbstractC2995aW.i(this.f4119a[i4], obj)) {
                    return i4;
                }
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            i = i == 0 ? this.d.length - 1 : i - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iG = g(obj);
        if (iG < 0) {
            return null;
        }
        Object[] objArr = this.b;
        AbstractC2995aW.n(objArr);
        return objArr[iG];
    }

    public final int h(Object obj) {
        int i = this.f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.c[i] >= 0) {
                Object[] objArr = this.b;
                AbstractC2995aW.n(objArr);
                if (AbstractC2995aW.i(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        XL xl = new XL(this, 0);
        int i = 0;
        while (xl.hasNext()) {
            int i2 = xl.b;
            C2985aM c2985aM = xl.f4066a;
            if (i2 >= c2985aM.f) {
                throw new NoSuchElementException();
            }
            xl.b = i2 + 1;
            xl.c = i2;
            Object obj = c2985aM.f4119a[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = c2985aM.b;
            AbstractC2995aW.n(objArr);
            Object obj2 = objArr[xl.c];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            xl.a();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.g;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.h == 0;
    }

    public final void j(int i) {
        int[] iArr;
        int i2;
        int i3 = 0;
        if (this.f > this.h) {
            Object[] objArr = this.b;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i2 = this.f;
                if (i4 >= i2) {
                    break;
                }
                if (this.c[i4] >= 0) {
                    Object[] objArr2 = this.f4119a;
                    objArr2[i5] = objArr2[i4];
                    if (objArr != null) {
                        objArr[i5] = objArr[i4];
                    }
                    i5++;
                }
                i4++;
            }
            AbstractC2340Cl.P(this.f4119a, i5, i2);
            if (objArr != null) {
                AbstractC2340Cl.P(objArr, i5, this.f);
            }
            this.f = i5;
        }
        int[] iArr2 = this.d;
        if (i != iArr2.length) {
            this.d = new int[i];
            this.g = Integer.numberOfLeadingZeros(i) + 1;
        } else {
            int length = iArr2.length;
            AbstractC2995aW.q(iArr2, "<this>");
            Arrays.fill(iArr2, 0, length, 0);
        }
        while (i3 < this.f) {
            int i6 = i3 + 1;
            int i7 = i(this.f4119a[i3]);
            int i8 = this.e;
            while (true) {
                iArr = this.d;
                if (iArr[i7] == 0) {
                    break;
                }
                i8--;
                if (i8 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                i7 = i7 == 0 ? iArr.length - 1 : i7 - 1;
            }
            iArr[i7] = i6;
            this.c[i3] = i7;
            i3 = i6;
        }
    }

    public final void k(int i) {
        Object[] objArr = this.f4119a;
        AbstractC2995aW.q(objArr, "<this>");
        objArr[i] = null;
        int length = this.c[i];
        int i2 = this.e * 2;
        int length2 = this.d.length / 2;
        if (i2 > length2) {
            i2 = length2;
        }
        int i3 = i2;
        int i4 = 0;
        int i5 = length;
        do {
            length = length == 0 ? this.d.length - 1 : length - 1;
            i4++;
            if (i4 > this.e) {
                this.d[i5] = 0;
            } else {
                int[] iArr = this.d;
                int i6 = iArr[length];
                if (i6 == 0) {
                    iArr[i5] = 0;
                } else {
                    if (i6 < 0) {
                        iArr[i5] = -1;
                    } else {
                        int i7 = i6 - 1;
                        int i8 = i(this.f4119a[i7]) - length;
                        int[] iArr2 = this.d;
                        if ((i8 & (iArr2.length - 1)) >= i4) {
                            iArr2[i5] = i6;
                            this.c[i7] = i5;
                        }
                        i3--;
                    }
                    i5 = length;
                    i4 = 0;
                    i3--;
                }
            }
            this.c[i] = -1;
            this.h--;
        } while (i3 >= 0);
        this.d[i5] = -1;
        this.c[i] = -1;
        this.h--;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C3074bM c3074bM = this.i;
        if (c3074bM != null) {
            return c3074bM;
        }
        C3074bM c3074bM2 = new C3074bM(this, 1);
        this.i = c3074bM2;
        return c3074bM2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        int iA = a(obj);
        Object[] objArr = this.b;
        if (objArr == null) {
            int length = this.f4119a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.".toString());
            }
            objArr = new Object[length];
            this.b = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        AbstractC2995aW.q(map, TypedValues.TransitionType.S_FROM);
        b();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        f(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.b;
            if (objArr == null) {
                int length = this.f4119a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.".toString());
                }
                objArr = new Object[length];
                this.b = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!AbstractC2995aW.i(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        b();
        int iG = g(obj);
        if (iG < 0) {
            iG = -1;
        } else {
            k(iG);
        }
        if (iG < 0) {
            return null;
        }
        Object[] objArr = this.b;
        AbstractC2995aW.n(objArr);
        Object obj2 = objArr[iG];
        objArr[iG] = null;
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.h * 3) + 2);
        sb.append("{");
        int i = 0;
        XL xl = new XL(this, 0);
        while (xl.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = xl.b;
            C2985aM c2985aM = xl.f4066a;
            if (i2 >= c2985aM.f) {
                throw new NoSuchElementException();
            }
            xl.b = i2 + 1;
            xl.c = i2;
            Object obj = c2985aM.f4119a[i2];
            if (AbstractC2995aW.i(obj, c2985aM)) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = c2985aM.b;
            AbstractC2995aW.n(objArr);
            Object obj2 = objArr[xl.c];
            if (AbstractC2995aW.i(obj2, c2985aM)) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            xl.a();
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        AbstractC2995aW.p(string, "sb.toString()");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        C3162cM c3162cM = this.j;
        if (c3162cM != null) {
            return c3162cM;
        }
        C3162cM c3162cM2 = new C3162cM(this);
        this.j = c3162cM2;
        return c3162cM2;
    }
}
