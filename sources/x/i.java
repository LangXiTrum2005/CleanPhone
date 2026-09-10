package x;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.B5;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.n;
import xj.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f53504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f53505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53506c;

    public i(int i10) {
        this.f53504a = i10 == 0 ? y.a.f54098a : new int[i10];
        this.f53505b = i10 == 0 ? y.a.f54099b : new Object[i10 << 1];
    }

    public final int a(Object obj) {
        int i10 = this.f53506c * 2;
        Object[] objArr = this.f53505b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i10) {
        int i11 = this.f53506c;
        int[] iArr = this.f53504a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            n.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f53504a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f53505b, i10 * 2);
            n.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f53505b = objArrCopyOf;
        }
        if (this.f53506c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i10, Object obj) {
        int i11 = this.f53506c;
        if (i11 == 0) {
            return -1;
        }
        int iA = y.a.a(i11, i10, this.f53504a);
        if (iA < 0 || n.a(obj, this.f53505b[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f53504a[i12] == i10) {
            if (n.a(obj, this.f53505b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f53504a[i13] == i10; i13--) {
            if (n.a(obj, this.f53505b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public void clear() {
        if (this.f53506c > 0) {
            this.f53504a = y.a.f54098a;
            this.f53505b = y.a.f54099b;
            this.f53506c = 0;
        }
        if (this.f53506c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i10 = this.f53506c;
        if (i10 == 0) {
            return -1;
        }
        int iA = y.a.a(i10, 0, this.f53504a);
        if (iA < 0 || this.f53505b[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f53504a[i11] == 0) {
            if (this.f53505b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f53504a[i12] == 0; i12--) {
            if (this.f53505b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof i) {
                int i10 = this.f53506c;
                if (i10 != ((i) obj).f53506c) {
                    return false;
                }
                i iVar = (i) obj;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object objF = f(i11);
                    Object objJ = j(i11);
                    Object obj2 = iVar.get(objF);
                    if (objJ == null) {
                        if (obj2 != null || !iVar.containsKey(objF)) {
                            return false;
                        }
                    } else if (!objJ.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f53506c != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f53506c;
            for (int i13 = 0; i13 < i12; i13++) {
                Object objF2 = f(i13);
                Object objJ2 = j(i13);
                Object obj3 = ((Map) obj).get(objF2);
                if (objJ2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!objJ2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i10) {
        if (i10 < 0 || i10 >= this.f53506c) {
            throw new IllegalArgumentException(l1.d.e(i10, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f53505b[i10 << 1];
    }

    public void g(i iVar) {
        int i10 = iVar.f53506c;
        b(this.f53506c + i10);
        if (this.f53506c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(iVar.f(i11), iVar.j(i11));
            }
        } else if (i10 > 0) {
            k.f0(0, 0, iVar.f53504a, this.f53504a, i10);
            k.e0(0, 0, i10 << 1, iVar.f53505b, this.f53505b);
            this.f53506c = i10;
        }
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f53505b[(iD << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.f53505b[(iD << 1) + 1] : obj2;
    }

    public Object h(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f53506c)) {
            throw new IllegalArgumentException(l1.d.e(i10, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.f53505b;
        int i12 = i10 << 1;
        Object obj = objArr[i12 + 1];
        if (i11 <= 1) {
            clear();
            return obj;
        }
        int i13 = i11 - 1;
        int[] iArr = this.f53504a;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                k.f0(i10, i14, iArr, iArr, i11);
                Object[] objArr2 = this.f53505b;
                k.e0(i12, i14 << 1, i11 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f53505b;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
            n.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f53504a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f53505b, i16 << 1);
            n.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f53505b = objArrCopyOf;
            if (i11 != this.f53506c) {
                throw new ConcurrentModificationException();
            }
            if (i10 > 0) {
                k.f0(0, 0, iArr, this.f53504a, i10);
                k.e0(0, 0, i12, objArr, this.f53505b);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                k.f0(i10, i17, iArr, this.f53504a, i11);
                k.e0(i12, i17 << 1, i11 << 1, objArr, this.f53505b);
            }
        }
        if (i11 != this.f53506c) {
            throw new ConcurrentModificationException();
        }
        this.f53506c = i13;
        return obj;
    }

    public int hashCode() {
        int[] iArr = this.f53504a;
        Object[] objArr = this.f53505b;
        int i10 = this.f53506c;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public Object i(int i10, Object obj) {
        if (i10 < 0 || i10 >= this.f53506c) {
            throw new IllegalArgumentException(l1.d.e(i10, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f53505b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.f53506c <= 0;
    }

    public final Object j(int i10) {
        if (i10 < 0 || i10 >= this.f53506c) {
            throw new IllegalArgumentException(l1.d.e(i10, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f53505b[(i10 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i10 = this.f53506c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : e();
        if (iC >= 0) {
            int i11 = (iC << 1) + 1;
            Object[] objArr = this.f53505b;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~iC;
        int[] iArr = this.f53504a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            n.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f53504a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f53505b, i13 << 1);
            n.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f53505b = objArrCopyOf;
            if (i10 != this.f53506c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f53504a;
            int i14 = i12 + 1;
            k.f0(i14, i12, iArr2, iArr2, i10);
            Object[] objArr2 = this.f53505b;
            k.e0(i14 << 1, i12 << 1, this.f53506c << 1, objArr2, objArr2);
        }
        int i15 = this.f53506c;
        if (i10 == i15) {
            int[] iArr3 = this.f53504a;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f53505b;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f53506c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return i(iD, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f53506c;
    }

    public final String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f53506c * 28);
        sb2.append('{');
        int i10 = this.f53506c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object objF = f(i11);
            if (objF != sb2) {
                sb2.append(objF);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append(B5.U);
            Object objJ = j(i11);
            if (objJ != sb2) {
                sb2.append(objJ);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        n.e(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !n.a(obj2, j(iD))) {
            return false;
        }
        h(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !n.a(obj2, j(iD))) {
            return false;
        }
        i(iD, obj3);
        return true;
    }

    public i(i iVar) {
        this(0);
        g(iVar);
    }
}
