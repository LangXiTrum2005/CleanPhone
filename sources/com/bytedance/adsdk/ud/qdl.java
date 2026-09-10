package com.bytedance.adsdk.ud;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public final class qdl<E> implements Collection<E>, Set<E> {
    private static int jpc;
    private static final int[] lnr = new int[0];
    private static final Object[] mml = new Object[0];
    private static int mo;
    private static Object[] mzz;
    private static Object[] wd;
    Object[] qdl;
    private bjy<E, E> to;
    private int[] tvp;
    int ud;

    public qdl() {
        this(0);
    }

    private void mml(int i2) {
        if (i2 == 8) {
            synchronized (qdl.class) {
                Object[] objArr = wd;
                if (objArr != null) {
                    this.qdl = objArr;
                    wd = (Object[]) objArr[0];
                    this.tvp = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    jpc--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (qdl.class) {
                Object[] objArr2 = mzz;
                if (objArr2 != null) {
                    this.qdl = objArr2;
                    mzz = (Object[]) objArr2[0];
                    this.tvp = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    mo--;
                    return;
                }
            }
        }
        this.tvp = new int[i2];
        this.qdl = new Object[i2];
    }

    private int qdl(Object obj, int i2) {
        int i3 = this.ud;
        if (i3 == 0) {
            return -1;
        }
        int iQdl = ud.qdl(this.tvp, i3, i2);
        if (iQdl < 0 || obj.equals(this.qdl[iQdl])) {
            return iQdl;
        }
        int i4 = iQdl + 1;
        while (i4 < i3 && this.tvp[i4] == i2) {
            if (obj.equals(this.qdl[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iQdl - 1; i5 >= 0 && this.tvp[i5] == i2; i5--) {
            if (obj.equals(this.qdl[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e2) {
        int i2;
        int iQdl;
        if (e2 == null) {
            iQdl = qdl();
            i2 = 0;
        } else {
            int iHashCode = e2.hashCode();
            i2 = iHashCode;
            iQdl = qdl(e2, iHashCode);
        }
        if (iQdl >= 0) {
            return false;
        }
        int i3 = ~iQdl;
        int i4 = this.ud;
        int[] iArr = this.tvp;
        if (i4 >= iArr.length) {
            int i5 = 8;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.qdl;
            mml(i5);
            int[] iArr2 = this.tvp;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.qdl, 0, objArr.length);
            }
            qdl(iArr, objArr, this.ud);
        }
        int i6 = this.ud;
        if (i3 < i6) {
            int[] iArr3 = this.tvp;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.qdl;
            System.arraycopy(objArr2, i3, objArr2, i7, this.ud - i3);
        }
        this.tvp[i3] = i2;
        this.qdl[i3] = e2;
        this.ud++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        qdl(collection.size() + this.ud);
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i2 = this.ud;
        if (i2 != 0) {
            qdl(this.tvp, this.qdl, i2);
            this.tvp = lnr;
            this.qdl = mml;
            this.ud = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return qdl(obj) >= 0;
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
            for (int i2 = 0; i2 < this.ud; i2++) {
                try {
                    if (!set.contains(ud(i2))) {
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
        int[] iArr = this.tvp;
        int i2 = this.ud;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.ud <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return ud().mml().iterator();
    }

    public E lnr(int i2) {
        Object[] objArr = this.qdl;
        E e2 = (E) objArr[i2];
        int i3 = this.ud;
        if (i3 <= 1) {
            qdl(this.tvp, objArr, i3);
            this.tvp = lnr;
            this.qdl = mml;
            this.ud = 0;
            return e2;
        }
        int[] iArr = this.tvp;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            int i4 = i3 - 1;
            this.ud = i4;
            if (i2 < i4) {
                int i5 = i2 + 1;
                System.arraycopy(iArr, i5, iArr, i2, i4 - i2);
                Object[] objArr2 = this.qdl;
                System.arraycopy(objArr2, i5, objArr2, i2, this.ud - i2);
            }
            this.qdl[this.ud] = null;
            return e2;
        }
        mml(i3 > 8 ? i3 + (i3 >> 1) : 8);
        this.ud--;
        if (i2 > 0) {
            System.arraycopy(iArr, 0, this.tvp, 0, i2);
            System.arraycopy(objArr, 0, this.qdl, 0, i2);
        }
        int i6 = this.ud;
        if (i2 < i6) {
            int i7 = i2 + 1;
            System.arraycopy(iArr, i7, this.tvp, i2, i6 - i2);
            System.arraycopy(objArr, i7, this.qdl, i2, this.ud - i2);
        }
        return e2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iQdl = qdl(obj);
        if (iQdl < 0) {
            return false;
        }
        lnr(iQdl);
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
        boolean z2 = false;
        for (int i2 = this.ud - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.qdl[i2])) {
                lnr(i2);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.ud;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i2 = this.ud;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.qdl, 0, objArr, 0, i2);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.ud * 14);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        for (int i2 = 0; i2 < this.ud; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            E eUd = ud(i2);
            if (eUd != this) {
                sb.append(eUd);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public E ud(int i2) {
        return (E) this.qdl[i2];
    }

    public qdl(int i2) {
        if (i2 == 0) {
            this.tvp = lnr;
            this.qdl = mml;
        } else {
            mml(i2);
        }
        this.ud = 0;
    }

    private bjy<E, E> ud() {
        if (this.to == null) {
            this.to = new bjy<E, E>() { // from class: com.bytedance.adsdk.ud.qdl.1
                @Override // com.bytedance.adsdk.ud.bjy
                public void lnr() {
                    qdl.this.clear();
                }

                @Override // com.bytedance.adsdk.ud.bjy
                public int qdl() {
                    return qdl.this.ud;
                }

                @Override // com.bytedance.adsdk.ud.bjy
                public Map<E, E> ud() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // com.bytedance.adsdk.ud.bjy
                public Object qdl(int i2, int i3) {
                    return qdl.this.qdl[i2];
                }

                @Override // com.bytedance.adsdk.ud.bjy
                public int qdl(Object obj) {
                    return qdl.this.qdl(obj);
                }

                @Override // com.bytedance.adsdk.ud.bjy
                public void qdl(int i2) {
                    qdl.this.lnr(i2);
                }
            };
        }
        return this.to;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.ud) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.ud));
        }
        System.arraycopy(this.qdl, 0, tArr, 0, this.ud);
        int length = tArr.length;
        int i2 = this.ud;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    private int qdl() {
        int i2 = this.ud;
        if (i2 == 0) {
            return -1;
        }
        int iQdl = ud.qdl(this.tvp, i2, 0);
        if (iQdl < 0 || this.qdl[iQdl] == null) {
            return iQdl;
        }
        int i3 = iQdl + 1;
        while (i3 < i2 && this.tvp[i3] == 0) {
            if (this.qdl[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iQdl - 1; i4 >= 0 && this.tvp[i4] == 0; i4--) {
            if (this.qdl[i4] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    private static void qdl(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (qdl.class) {
                try {
                    if (jpc < 10) {
                        objArr[0] = wd;
                        objArr[1] = iArr;
                        for (int i3 = i2 - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        wd = objArr;
                        jpc++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (qdl.class) {
                try {
                    if (mo < 10) {
                        objArr[0] = mzz;
                        objArr[1] = iArr;
                        for (int i4 = i2 - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        mzz = objArr;
                        mo++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void qdl(int i2) {
        int[] iArr = this.tvp;
        if (iArr.length < i2) {
            Object[] objArr = this.qdl;
            mml(i2);
            int i3 = this.ud;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.tvp, 0, i3);
                System.arraycopy(objArr, 0, this.qdl, 0, this.ud);
            }
            qdl(iArr, objArr, this.ud);
        }
    }

    public int qdl(Object obj) {
        return obj == null ? qdl() : qdl(obj, obj.hashCode());
    }
}
