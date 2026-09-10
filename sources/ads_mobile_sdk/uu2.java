package ads_mobile_sdk;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import saneness.shent;

/* JADX INFO: loaded from: classes.dex */
public abstract class uu2 extends AbstractMap {
    public Object[] a;
    public int b;
    public Map c;
    public boolean d;
    public volatile tu2 e;
    public Map f;

    public uu2() {
        Map map = Collections.EMPTY_MAP;
        this.c = map;
        this.f = map;
    }

    public static shent d() {
        return new shent();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:21:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0030 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int i4 = this.b;
        int i5 = i4 - 1;
        if (i5 < 0) {
            i = 0;
            while (i <= i5) {
                i3 = (i + i5) / 2;
                iCompareTo = comparable.compareTo(((ru2) this.a[i3]).a);
                if (iCompareTo < 0) {
                    i5 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((ru2) this.a[i5]).a);
            if (iCompareTo2 > 0) {
                i2 = i4 + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i5;
                }
                i = 0;
                while (i <= i5) {
                    i3 = (i + i5) / 2;
                    iCompareTo = comparable.compareTo(((ru2) this.a[i3]).a);
                    if (iCompareTo < 0) {
                        i5 = i3 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i3;
                        }
                        i = i3 + 1;
                    }
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    public final Set b() {
        return this.c.isEmpty() ? Collections.EMPTY_SET : this.c.entrySet();
    }

    public final SortedMap c() {
        a();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        a();
        if (this.b != 0) {
            this.a = null;
            this.b = 0;
        }
        if (this.c.isEmpty()) {
            return;
        }
        this.c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.e == null) {
            this.e = new tu2(this);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu2)) {
            return super.equals(obj);
        }
        uu2 uu2Var = (uu2) obj;
        int size = this.c.size() + this.b;
        if (size != uu2Var.c.size() + uu2Var.b) {
            return false;
        }
        int i = this.b;
        if (i != uu2Var.b) {
            return entrySet().equals(uu2Var.entrySet());
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!a(i2).equals(uu2Var.a(i2))) {
                return false;
            }
        }
        if (i != size) {
            return this.c.equals(uu2Var.c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((ru2) this.a[iA]).b : this.c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.a[i2].hashCode();
        }
        return this.c.size() > 0 ? this.c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        a();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return b(iA);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size() + this.b;
    }

    public final Object b(int i) {
        a();
        Object[] objArr = this.a;
        Object obj = ((ru2) objArr[i]).b;
        System.arraycopy(objArr, i + 1, objArr, i, (this.b - i) - 1);
        this.b--;
        if (!this.c.isEmpty()) {
            Iterator it = c().entrySet().iterator();
            Object[] objArr2 = this.a;
            int i2 = this.b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new ru2(this, (Comparable) entry.getKey(), entry.getValue());
            this.b++;
            it.remove();
        }
        return obj;
    }

    public final void a() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }

    public final ru2 a(int i) {
        if (i < this.b) {
            return (ru2) this.a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final Object a(Comparable comparable, Object obj) {
        a();
        int iA = a(comparable);
        if (iA >= 0) {
            ru2 ru2Var = (ru2) this.a[iA];
            ru2Var.c.a();
            Object obj2 = ru2Var.b;
            ru2Var.b = obj;
            return obj2;
        }
        a();
        if (this.a == null) {
            this.a = new Object[16];
        }
        int i = -(iA + 1);
        if (i >= 16) {
            return c().put(comparable, obj);
        }
        int i2 = this.b;
        if (i2 == 16) {
            ru2 ru2Var2 = (ru2) this.a[15];
            this.b = i2 - 1;
            c().put(ru2Var2.a, ru2Var2.b);
        }
        Object[] objArr = this.a;
        System.arraycopy(objArr, i, objArr, i + 1, (objArr.length - i) - 1);
        this.a[i] = new ru2(this, comparable, obj);
        this.b++;
        return null;
    }
}
