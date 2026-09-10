package com.bytedance.adsdk.lr;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ri<E> implements Collection<E>, Set<E> {
    private static int di;
    private static Object[] fi;
    private static final int[] ik = new int[0];
    private static final Object[] ka = new Object[0];
    private static int mj;
    private static Object[] xha;
    private int[] jbs;
    int lr;
    private vr<E, E> qt;
    Object[] ri;

    public ri() {
        this(0);
    }

    private void ka(int i) {
        if (i == 8) {
            synchronized (ri.class) {
                Object[] objArr = xha;
                if (objArr != null) {
                    this.ri = objArr;
                    xha = (Object[]) objArr[0];
                    this.jbs = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    mj--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (ri.class) {
                Object[] objArr2 = fi;
                if (objArr2 != null) {
                    this.ri = objArr2;
                    fi = (Object[]) objArr2[0];
                    this.jbs = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    di--;
                    return;
                }
            }
        }
        this.jbs = new int[i];
        this.ri = new Object[i];
    }

    private int ri(Object obj, int i) {
        int i2 = this.lr;
        if (i2 == 0) {
            return -1;
        }
        int iRi = lr.ri(this.jbs, i2, i);
        if (iRi < 0 || obj.equals(this.ri[iRi])) {
            return iRi;
        }
        int i3 = iRi + 1;
        while (i3 < i2 && this.jbs[i3] == i) {
            if (obj.equals(this.ri[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iRi - 1; i4 >= 0 && this.jbs[i4] == i; i4--) {
            if (obj.equals(this.ri[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int iRi;
        if (e == null) {
            iRi = ri();
            i = 0;
        } else {
            int iHashCode = e.hashCode();
            i = iHashCode;
            iRi = ri(e, iHashCode);
        }
        if (iRi >= 0) {
            return false;
        }
        int i2 = ~iRi;
        int i3 = this.lr;
        int[] iArr = this.jbs;
        if (i3 >= iArr.length) {
            int i4 = 8;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.ri;
            ka(i4);
            int[] iArr2 = this.jbs;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.ri, 0, objArr.length);
            }
            ri(iArr, objArr, this.lr);
        }
        int i5 = this.lr;
        if (i2 < i5) {
            int[] iArr3 = this.jbs;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.ri;
            System.arraycopy(objArr2, i2, objArr2, i6, this.lr - i2);
        }
        this.jbs[i2] = i;
        this.ri[i2] = e;
        this.lr++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection2) {
        ri(this.lr + collection2.size());
        Iterator<? extends E> it = collection2.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.lr;
        if (i != 0) {
            ri(this.jbs, this.ri, i);
            this.jbs = ik;
            this.ri = ka;
            this.lr = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return ri(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
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
            for (int i = 0; i < this.lr; i++) {
                try {
                    if (!set.contains(lr(i))) {
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
        int[] iArr = this.jbs;
        int i = this.lr;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public E ik(int i) {
        Object[] objArr = this.ri;
        E e = (E) objArr[i];
        int i2 = this.lr;
        if (i2 <= 1) {
            ri(this.jbs, objArr, i2);
            this.jbs = ik;
            this.ri = ka;
            this.lr = 0;
            return e;
        }
        int[] iArr = this.jbs;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            int i3 = i2 - 1;
            this.lr = i3;
            if (i < i3) {
                int i4 = i + 1;
                System.arraycopy(iArr, i4, iArr, i, i3 - i);
                Object[] objArr2 = this.ri;
                System.arraycopy(objArr2, i4, objArr2, i, this.lr - i);
            }
            this.ri[this.lr] = null;
            return e;
        }
        ka(i2 > 8 ? i2 + (i2 >> 1) : 8);
        this.lr--;
        if (i > 0) {
            System.arraycopy(iArr, 0, this.jbs, 0, i);
            System.arraycopy(objArr, 0, this.ri, 0, i);
        }
        int i5 = this.lr;
        if (i < i5) {
            int i6 = i + 1;
            System.arraycopy(iArr, i6, this.jbs, i, i5 - i);
            System.arraycopy(objArr, i6, this.ri, i, this.lr - i);
        }
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.lr <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return lr().ka().iterator();
    }

    public E lr(int i) {
        return (E) this.ri[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iRi = ri(obj);
        if (iRi < 0) {
            return false;
        }
        ik(iRi);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection2) {
        boolean z = false;
        for (int i = this.lr - 1; i >= 0; i--) {
            if (!collection2.contains(this.ri[i])) {
                ik(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.lr;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.lr;
        Object[] objArr = new Object[i];
        System.arraycopy(this.ri, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.lr * 14);
        sb.append('{');
        for (int i = 0; i < this.lr; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E eLr = lr(i);
            if (eLr != this) {
                sb.append(eLr);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public ri(int i) {
        if (i == 0) {
            this.jbs = ik;
            this.ri = ka;
        } else {
            ka(i);
        }
        this.lr = 0;
    }

    private vr<E, E> lr() {
        if (this.qt == null) {
            this.qt = new vr<E, E>() { // from class: com.bytedance.adsdk.lr.ri.1
                @Override // com.bytedance.adsdk.lr.vr
                public void ik() {
                    ri.this.clear();
                }

                @Override // com.bytedance.adsdk.lr.vr
                public Map<E, E> lr() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // com.bytedance.adsdk.lr.vr
                public int ri() {
                    return ri.this.lr;
                }

                @Override // com.bytedance.adsdk.lr.vr
                public Object ri(int i, int i2) {
                    return ri.this.ri[i];
                }

                @Override // com.bytedance.adsdk.lr.vr
                public int ri(Object obj) {
                    return ri.this.ri(obj);
                }

                @Override // com.bytedance.adsdk.lr.vr
                public void ri(int i) {
                    ri.this.ik(i);
                }
            };
        }
        return this.qt;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.lr) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.lr));
        }
        System.arraycopy(this.ri, 0, tArr, 0, this.lr);
        int length = tArr.length;
        int i = this.lr;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    private int ri() {
        int i = this.lr;
        if (i == 0) {
            return -1;
        }
        int iRi = lr.ri(this.jbs, i, 0);
        if (iRi < 0 || this.ri[iRi] == null) {
            return iRi;
        }
        int i2 = iRi + 1;
        while (i2 < i && this.jbs[i2] == 0) {
            if (this.ri[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iRi - 1; i3 >= 0 && this.jbs[i3] == 0; i3--) {
            if (this.ri[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    private static void ri(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (ri.class) {
                try {
                    if (mj < 10) {
                        objArr[0] = xha;
                        objArr[1] = iArr;
                        for (int i2 = i - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        xha = objArr;
                        mj++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (ri.class) {
                try {
                    if (di < 10) {
                        objArr[0] = fi;
                        objArr[1] = iArr;
                        for (int i3 = i - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        fi = objArr;
                        di++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void ri(int i) {
        int[] iArr = this.jbs;
        if (iArr.length < i) {
            Object[] objArr = this.ri;
            ka(i);
            int i2 = this.lr;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.jbs, 0, i2);
                System.arraycopy(objArr, 0, this.ri, 0, this.lr);
            }
            ri(iArr, objArr, this.lr);
        }
    }

    public int ri(Object obj) {
        return obj == null ? ri() : ri(obj, obj.hashCode());
    }
}
