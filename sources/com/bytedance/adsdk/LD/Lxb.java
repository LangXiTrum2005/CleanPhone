package com.bytedance.adsdk.LD;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class Lxb<E> implements Collection<E>, Set<E> {
    private static Object[] JXs;
    private static int OY;
    private static Object[] ebl;
    private static int lc;
    int LD;
    Object[] Lxb;
    private int[] QAg;
    private IeN<E, E> nBu;
    private static final int[] lk = new int[0];
    private static final Object[] ZU = new Object[0];

    public Lxb() {
        this(0);
    }

    private int Lxb(Object obj, int i) {
        int i2 = this.LD;
        if (i2 == 0) {
            return -1;
        }
        int iLxb = LD.Lxb(this.QAg, i2, i);
        if (iLxb < 0 || obj.equals(this.Lxb[iLxb])) {
            return iLxb;
        }
        int i3 = iLxb + 1;
        while (i3 < i2 && this.QAg[i3] == i) {
            if (obj.equals(this.Lxb[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iLxb - 1; i4 >= 0 && this.QAg[i4] == i; i4--) {
            if (obj.equals(this.Lxb[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    private void ZU(int i) {
        if (i == 8) {
            synchronized (Lxb.class) {
                Object[] objArr = ebl;
                if (objArr != null) {
                    this.Lxb = objArr;
                    ebl = (Object[]) objArr[0];
                    this.QAg = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    OY--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (Lxb.class) {
                Object[] objArr2 = JXs;
                if (objArr2 != null) {
                    this.Lxb = objArr2;
                    JXs = (Object[]) objArr2[0];
                    this.QAg = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    lc--;
                    return;
                }
            }
        }
        this.QAg = new int[i];
        this.Lxb = new Object[i];
    }

    public E LD(int i) {
        return (E) this.Lxb[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int iLxb;
        if (e == null) {
            iLxb = Lxb();
            i = 0;
        } else {
            int iHashCode = e.hashCode();
            i = iHashCode;
            iLxb = Lxb(e, iHashCode);
        }
        if (iLxb >= 0) {
            return false;
        }
        int i2 = ~iLxb;
        int i3 = this.LD;
        int[] iArr = this.QAg;
        if (i3 >= iArr.length) {
            int i4 = 8;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.Lxb;
            ZU(i4);
            int[] iArr2 = this.QAg;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.Lxb, 0, objArr.length);
            }
            Lxb(iArr, objArr, this.LD);
        }
        int i5 = this.LD;
        if (i2 < i5) {
            int[] iArr3 = this.QAg;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.Lxb;
            System.arraycopy(objArr2, i2, objArr2, i6, this.LD - i2);
        }
        this.QAg[i2] = i;
        this.Lxb[i2] = e;
        this.LD++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        Lxb(collection.size() + this.LD);
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.LD;
        if (i != 0) {
            Lxb(this.QAg, this.Lxb, i);
            this.QAg = lk;
            this.Lxb = ZU;
            this.LD = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return Lxb(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.LD; i++) {
                try {
                    if (!set.contains(LD(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.QAg;
        int i = this.LD;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.LD <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return LD().ZU().iterator();
    }

    public E lk(int i) {
        Object[] objArr = this.Lxb;
        E e = (E) objArr[i];
        int i2 = this.LD;
        if (i2 <= 1) {
            Lxb(this.QAg, objArr, i2);
            this.QAg = lk;
            this.Lxb = ZU;
            this.LD = 0;
        } else {
            int[] iArr = this.QAg;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i3 = i2 - 1;
                this.LD = i3;
                if (i < i3) {
                    int i4 = i + 1;
                    System.arraycopy(iArr, i4, iArr, i, i3 - i);
                    Object[] objArr2 = this.Lxb;
                    System.arraycopy(objArr2, i4, objArr2, i, this.LD - i);
                }
                this.Lxb[this.LD] = null;
            } else {
                ZU(i2 > 8 ? i2 + (i2 >> 1) : 8);
                this.LD--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.QAg, 0, i);
                    System.arraycopy(objArr, 0, this.Lxb, 0, i);
                }
                int i5 = this.LD;
                if (i < i5) {
                    int i6 = i + 1;
                    System.arraycopy(iArr, i6, this.QAg, i, i5 - i);
                    System.arraycopy(objArr, i6, this.Lxb, i, this.LD - i);
                }
            }
        }
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iLxb = Lxb(obj);
        if (iLxb < 0) {
            return false;
        }
        lk(iLxb);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.LD - 1; i >= 0; i--) {
            if (!collection.contains(this.Lxb[i])) {
                lk(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.LD;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.LD;
        Object[] objArr = new Object[i];
        System.arraycopy(this.Lxb, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.LD * 14);
        sb.append('{');
        for (int i = 0; i < this.LD; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E eLD = LD(i);
            if (eLD != this) {
                sb.append(eLD);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Lxb(int i) {
        if (i == 0) {
            this.QAg = lk;
            this.Lxb = ZU;
        } else {
            ZU(i);
        }
        this.LD = 0;
    }

    private IeN<E, E> LD() {
        if (this.nBu == null) {
            this.nBu = new IeN<E, E>() { // from class: com.bytedance.adsdk.LD.Lxb.1
                @Override // com.bytedance.adsdk.LD.IeN
                public Map<E, E> LD() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // com.bytedance.adsdk.LD.IeN
                public int Lxb() {
                    return Lxb.this.LD;
                }

                @Override // com.bytedance.adsdk.LD.IeN
                public void lk() {
                    Lxb.this.clear();
                }

                @Override // com.bytedance.adsdk.LD.IeN
                public Object Lxb(int i, int i2) {
                    return Lxb.this.Lxb[i];
                }

                @Override // com.bytedance.adsdk.LD.IeN
                public int Lxb(Object obj) {
                    return Lxb.this.Lxb(obj);
                }

                @Override // com.bytedance.adsdk.LD.IeN
                public void Lxb(int i) {
                    Lxb.this.lk(i);
                }
            };
        }
        return this.nBu;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.LD) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.LD));
        }
        System.arraycopy(this.Lxb, 0, tArr, 0, this.LD);
        int length = tArr.length;
        int i = this.LD;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    private int Lxb() {
        int i = this.LD;
        if (i == 0) {
            return -1;
        }
        int iLxb = LD.Lxb(this.QAg, i, 0);
        if (iLxb < 0 || this.Lxb[iLxb] == null) {
            return iLxb;
        }
        int i2 = iLxb + 1;
        while (i2 < i && this.QAg[i2] == 0) {
            if (this.Lxb[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iLxb - 1; i3 >= 0 && this.QAg[i3] == 0; i3--) {
            if (this.Lxb[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    private static void Lxb(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (Lxb.class) {
                try {
                    if (OY < 10) {
                        objArr[0] = ebl;
                        objArr[1] = iArr;
                        for (int i2 = i - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        ebl = objArr;
                        OY++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (Lxb.class) {
                try {
                    if (lc < 10) {
                        objArr[0] = JXs;
                        objArr[1] = iArr;
                        for (int i3 = i - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        JXs = objArr;
                        lc++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void Lxb(int i) {
        int[] iArr = this.QAg;
        if (iArr.length < i) {
            Object[] objArr = this.Lxb;
            ZU(i);
            int i2 = this.LD;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.QAg, 0, i2);
                System.arraycopy(objArr, 0, this.Lxb, 0, this.LD);
            }
            Lxb(iArr, objArr, this.LD);
        }
    }

    public int Lxb(Object obj) {
        return obj == null ? Lxb() : Lxb(obj, obj.hashCode());
    }
}
