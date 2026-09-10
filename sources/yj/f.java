package yj;

import com.ironsource.B5;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.n;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements Map, Serializable, kk.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f f54421n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f54422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f54423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f54424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f54425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f54426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f54427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f54428g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f54429h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f54430i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f54431j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h f54432k;
    public g l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f54433m;

    static {
        f fVar = new f(0);
        fVar.f54433m = true;
        f54421n = fVar;
    }

    public f() {
        this(8);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (!this.f54433m) {
            throw new NotSerializableException("The map cannot be serialized while it is being built.");
        }
        j jVar = new j();
        jVar.f54439a = this;
        return jVar;
    }

    public final int a(Object obj) {
        h();
        while (true) {
            int iT = t(obj);
            int i10 = this.f54426e * 2;
            int length = this.f54425d.length / 2;
            if (i10 > length) {
                i10 = length;
            }
            int i11 = 0;
            while (true) {
                int[] iArr = this.f54425d;
                int i12 = iArr[iT];
                if (i12 <= 0) {
                    int i13 = this.f54427f;
                    Object[] objArr = this.f54422a;
                    if (i13 >= objArr.length) {
                        q(1);
                        break;
                    }
                    int i14 = i13 + 1;
                    this.f54427f = i14;
                    objArr[i13] = obj;
                    this.f54424c[i13] = iT;
                    iArr[iT] = i14;
                    this.f54430i++;
                    this.f54429h++;
                    if (i11 > this.f54426e) {
                        this.f54426e = i11;
                    }
                    return i13;
                }
                if (n.a(this.f54422a[i12 - 1], obj)) {
                    return -i12;
                }
                i11++;
                if (i11 > i10) {
                    u(this.f54425d.length * 2);
                    break;
                }
                iT = iT == 0 ? this.f54425d.length - 1 : iT - 1;
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        h();
        int i10 = this.f54427f - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f54424c;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f54425d[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        i0.i0(0, this.f54427f, this.f54422a);
        Object[] objArr = this.f54423b;
        if (objArr != null) {
            i0.i0(0, this.f54427f, objArr);
        }
        this.f54430i = 0;
        this.f54427f = 0;
        this.f54429h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return r(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return s(obj) >= 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        g gVar = this.l;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 0);
        this.l = gVar2;
        return gVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f54430i == map.size() && m(map.entrySet());
    }

    public final f g() {
        h();
        this.f54433m = true;
        if (this.f54430i > 0) {
            return this;
        }
        f fVar = f54421n;
        n.d(fVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return fVar;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iR = r(obj);
        if (iR < 0) {
            return null;
        }
        Object[] objArr = this.f54423b;
        n.c(objArr);
        return objArr[iR];
    }

    public final void h() {
        if (this.f54433m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        d dVar = new d(this, 0);
        int i10 = 0;
        while (dVar.hasNext()) {
            int i11 = dVar.f45717a;
            f fVar = (f) dVar.f45720d;
            if (i11 >= fVar.f54427f) {
                throw new NoSuchElementException();
            }
            dVar.f45717a = i11 + 1;
            dVar.f45718b = i11;
            Object obj = fVar.f54422a[i11];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = fVar.f54423b;
            n.c(objArr);
            Object obj2 = objArr[dVar.f45718b];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            dVar.g();
            i10 += iHashCode ^ iHashCode2;
        }
        return i10;
    }

    public final void i(boolean z10) {
        int i10;
        Object[] objArr = this.f54423b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f54427f;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f54424c;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                Object[] objArr2 = this.f54422a;
                objArr2[i12] = objArr2[i11];
                if (objArr != null) {
                    objArr[i12] = objArr[i11];
                }
                if (z10) {
                    iArr[i12] = i13;
                    this.f54425d[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        i0.i0(i12, i10, this.f54422a);
        if (objArr != null) {
            i0.i0(i12, this.f54427f, objArr);
        }
        this.f54427f = i12;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f54430i == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        g gVar = this.f54431j;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 1);
        this.f54431j = gVar2;
        return gVar2;
    }

    public final boolean m(Collection m7) {
        n.f(m7, "m");
        for (Object obj : m7) {
            if (obj != null) {
                try {
                    if (!p((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean p(Map.Entry entry) {
        n.f(entry, "entry");
        int iR = r(entry.getKey());
        if (iR < 0) {
            return false;
        }
        Object[] objArr = this.f54423b;
        n.c(objArr);
        return n.a(objArr[iR], entry.getValue());
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        h();
        int iA = a(obj);
        Object[] objArr = this.f54423b;
        if (objArr == null) {
            int length = this.f54422a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f54423b = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i10 = (-iA) - 1;
        Object obj3 = objArr[i10];
        objArr[i10] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        n.f(from, "from");
        h();
        Set<Map.Entry> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        q(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.f54423b;
            if (objArr == null) {
                int length = this.f54422a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f54423b = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i10 = (-iA) - 1;
                if (!n.a(entry.getValue(), objArr[i10])) {
                    objArr[i10] = entry.getValue();
                }
            }
        }
    }

    public final void q(int i10) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f54422a;
        int length = objArr.length;
        int i11 = this.f54427f;
        int i12 = length - i11;
        int i13 = i11 - this.f54430i;
        if (i12 < i10 && i12 + i13 >= i10 && i13 >= objArr.length / 4) {
            i(true);
            return;
        }
        int i14 = i11 + i10;
        if (i14 < 0) {
            throw new OutOfMemoryError();
        }
        if (i14 > objArr.length) {
            xj.c cVar = xj.f.Companion;
            int length2 = objArr.length;
            cVar.getClass();
            int iD = xj.c.d(length2, i14);
            Object[] objArr2 = this.f54422a;
            n.f(objArr2, "<this>");
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, iD);
            n.e(objArrCopyOf2, "copyOf(...)");
            this.f54422a = objArrCopyOf2;
            Object[] objArr3 = this.f54423b;
            if (objArr3 != null) {
                objArrCopyOf = Arrays.copyOf(objArr3, iD);
                n.e(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f54423b = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f54424c, iD);
            n.e(iArrCopyOf, "copyOf(...)");
            this.f54424c = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((iD >= 1 ? iD : 1) * 3);
            if (iHighestOneBit > this.f54425d.length) {
                u(iHighestOneBit);
            }
        }
    }

    public final int r(Object obj) {
        int iT = t(obj);
        int i10 = this.f54426e;
        while (true) {
            int i11 = this.f54425d[iT];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (n.a(this.f54422a[i12], obj)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iT = iT == 0 ? this.f54425d.length - 1 : iT - 1;
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        h();
        int iR = r(obj);
        if (iR < 0) {
            return null;
        }
        Object[] objArr = this.f54423b;
        n.c(objArr);
        Object obj2 = objArr[iR];
        v(iR);
        return obj2;
    }

    public final int s(Object obj) {
        int i10 = this.f54427f;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f54424c[i10] >= 0) {
                Object[] objArr = this.f54423b;
                n.c(objArr);
                if (n.a(objArr[i10], obj)) {
                    return i10;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.f54430i;
    }

    public final int t(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f54428g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f54430i * 3) + 2);
        sb2.append("{");
        d dVar = new d(this, 0);
        int i10 = 0;
        while (dVar.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            int i11 = dVar.f45717a;
            f fVar = (f) dVar.f45720d;
            if (i11 >= fVar.f54427f) {
                throw new NoSuchElementException();
            }
            dVar.f45717a = i11 + 1;
            dVar.f45718b = i11;
            Object obj = fVar.f54422a[i11];
            if (obj == fVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append(B5.U);
            Object[] objArr = fVar.f54423b;
            n.c(objArr);
            Object obj2 = objArr[dVar.f45718b];
            if (obj2 == fVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            dVar.g();
            i10++;
        }
        sb2.append("}");
        String string = sb2.toString();
        n.e(string, "toString(...)");
        return string;
    }

    public final void u(int i10) {
        int[] iArr;
        this.f54429h++;
        int i11 = 0;
        if (this.f54427f > this.f54430i) {
            i(false);
        }
        this.f54425d = new int[i10];
        this.f54428g = Integer.numberOfLeadingZeros(i10) + 1;
        while (i11 < this.f54427f) {
            int i12 = i11 + 1;
            int iT = t(this.f54422a[i11]);
            int i13 = this.f54426e;
            while (true) {
                iArr = this.f54425d;
                if (iArr[iT] == 0) {
                    break;
                }
                i13--;
                if (i13 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iT = iT == 0 ? iArr.length - 1 : iT - 1;
            }
            iArr[iT] = i12;
            this.f54424c[i11] = iT;
            i11 = i12;
        }
    }

    public final void v(int i10) {
        Object[] objArr = this.f54422a;
        n.f(objArr, "<this>");
        objArr[i10] = null;
        Object[] objArr2 = this.f54423b;
        if (objArr2 != null) {
            objArr2[i10] = null;
        }
        int length = this.f54424c[i10];
        int i11 = this.f54426e * 2;
        int length2 = this.f54425d.length / 2;
        if (i11 > length2) {
            i11 = length2;
        }
        int i12 = i11;
        int i13 = 0;
        int i14 = length;
        do {
            length = length == 0 ? this.f54425d.length - 1 : length - 1;
            i13++;
            if (i13 > this.f54426e) {
                this.f54425d[i14] = 0;
            } else {
                int[] iArr = this.f54425d;
                int i15 = iArr[length];
                if (i15 == 0) {
                    iArr[i14] = 0;
                } else {
                    if (i15 < 0) {
                        iArr[i14] = -1;
                    } else {
                        int i16 = i15 - 1;
                        int iT = t(this.f54422a[i16]) - length;
                        int[] iArr2 = this.f54425d;
                        if ((iT & (iArr2.length - 1)) >= i13) {
                            iArr2[i14] = i15;
                            this.f54424c[i16] = i14;
                        }
                        i12--;
                    }
                    i14 = length;
                    i13 = 0;
                    i12--;
                }
            }
            this.f54424c[i10] = -1;
            this.f54430i--;
            this.f54429h++;
        } while (i12 >= 0);
        this.f54425d[i14] = -1;
        this.f54424c[i10] = -1;
        this.f54430i--;
        this.f54429h++;
    }

    @Override // java.util.Map
    public final Collection values() {
        h hVar = this.f54432k;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this);
        this.f54432k = hVar2;
        return hVar2;
    }

    public f(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i10];
        int[] iArr = new int[i10];
        int iHighestOneBit = Integer.highestOneBit((i10 < 1 ? 1 : i10) * 3);
        this.f54422a = objArr;
        this.f54423b = null;
        this.f54424c = iArr;
        this.f54425d = new int[iHighestOneBit];
        this.f54426e = 2;
        this.f54427f = 0;
        this.f54428g = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
