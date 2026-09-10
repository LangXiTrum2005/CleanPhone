package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.p004ironsource.dc;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/collection/SimpleArrayMap;", "K", "V", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class SimpleArrayMap<K, V> {
    public int[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Object[] f3771Y;
    public int Z;

    public SimpleArrayMap(int i2) {
        this.X = i2 == 0 ? ContainerHelpersKt.f3775a : new int[i2];
        this.f3771Y = i2 == 0 ? ContainerHelpersKt.f3777c : new Object[i2 << 1];
    }

    public final int a(Object obj) {
        int i2 = this.Z * 2;
        Object[] objArr = this.f3771Y;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i2) {
        int i3 = this.Z;
        int[] iArr = this.X;
        if (iArr.length < i2) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i2);
            Intrinsics.e(iArrCopyOf, "copyOf(...)");
            this.X = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f3771Y, i2 * 2);
            Intrinsics.e(objArrCopyOf, "copyOf(...)");
            this.f3771Y = objArrCopyOf;
        }
        if (this.Z != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i2, Object obj) {
        int i3 = this.Z;
        if (i3 == 0) {
            return -1;
        }
        int iA = ContainerHelpersKt.a(i3, i2, this.X);
        if (iA < 0 || Intrinsics.a(obj, this.f3771Y[iA << 1])) {
            return iA;
        }
        int i4 = iA + 1;
        while (i4 < i3 && this.X[i4] == i2) {
            if (Intrinsics.a(obj, this.f3771Y[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iA - 1; i5 >= 0 && this.X[i5] == i2; i5--) {
            if (Intrinsics.a(obj, this.f3771Y[i5 << 1])) {
                return i5;
            }
        }
        return ~i4;
    }

    public void clear() {
        if (this.Z > 0) {
            this.X = ContainerHelpersKt.f3775a;
            this.f3771Y = ContainerHelpersKt.f3777c;
            this.Z = 0;
        }
        if (this.Z > 0) {
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
        int i2 = this.Z;
        if (i2 == 0) {
            return -1;
        }
        int iA = ContainerHelpersKt.a(i2, 0, this.X);
        if (iA < 0 || this.f3771Y[iA << 1] == null) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && this.X[i3] == 0) {
            if (this.f3771Y[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && this.X[i4] == 0; i4--) {
            if (this.f3771Y[i4 << 1] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof SimpleArrayMap) {
                int i2 = this.Z;
                if (i2 != ((SimpleArrayMap) obj).Z) {
                    return false;
                }
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
                for (int i3 = 0; i3 < i2; i3++) {
                    Object objF = f(i3);
                    Object objJ = j(i3);
                    Object obj2 = simpleArrayMap.get(objF);
                    if (objJ == null) {
                        if (obj2 != null || !simpleArrayMap.containsKey(objF)) {
                            return false;
                        }
                    } else if (!objJ.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.Z != ((Map) obj).size()) {
                return false;
            }
            int i4 = this.Z;
            for (int i5 = 0; i5 < i4; i5++) {
                Object objF2 = f(i5);
                Object objJ2 = j(i5);
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

    public final Object f(int i2) {
        boolean z2 = false;
        if (i2 >= 0 && i2 < this.Z) {
            z2 = true;
        }
        if (z2) {
            return this.f3771Y[i2 << 1];
        }
        RuntimeHelpersKt.a("Expected index to be within 0..size()-1, but was " + i2);
        throw null;
    }

    public void g(SimpleArrayMap map) {
        Intrinsics.f(map, "map");
        int i2 = map.Z;
        b(this.Z + i2);
        if (this.Z != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(map.f(i3), map.j(i3));
            }
        } else if (i2 > 0) {
            ArraysKt.n(0, 0, i2, map.X, this.X);
            ArraysKt.o(map.f3771Y, 0, this.f3771Y, 0, i2 << 1);
            this.Z = i2;
        }
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f3771Y[(iD << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.f3771Y[(iD << 1) + 1] : obj2;
    }

    public Object h(int i2) {
        if (!(i2 >= 0 && i2 < this.Z)) {
            RuntimeHelpersKt.a("Expected index to be within 0..size()-1, but was " + i2);
            throw null;
        }
        Object[] objArr = this.f3771Y;
        int i3 = i2 << 1;
        Object obj = objArr[i3 + 1];
        int i4 = this.Z;
        if (i4 <= 1) {
            clear();
            return obj;
        }
        int i5 = i4 - 1;
        int[] iArr = this.X;
        if (iArr.length <= 8 || i4 >= iArr.length / 3) {
            if (i2 < i5) {
                int i6 = i2 + 1;
                ArraysKt.n(i2, i6, i4, iArr, iArr);
                Object[] objArr2 = this.f3771Y;
                ArraysKt.o(objArr2, i3, objArr2, i6 << 1, i4 << 1);
            }
            Object[] objArr3 = this.f3771Y;
            int i7 = i5 << 1;
            objArr3[i7] = null;
            objArr3[i7 + 1] = null;
        } else {
            int i8 = i4 > 8 ? i4 + (i4 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i8);
            Intrinsics.e(iArrCopyOf, "copyOf(...)");
            this.X = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f3771Y, i8 << 1);
            Intrinsics.e(objArrCopyOf, "copyOf(...)");
            this.f3771Y = objArrCopyOf;
            if (i4 != this.Z) {
                throw new ConcurrentModificationException();
            }
            if (i2 > 0) {
                ArraysKt.n(0, 0, i2, iArr, this.X);
                ArraysKt.o(objArr, 0, this.f3771Y, 0, i3);
            }
            if (i2 < i5) {
                int i9 = i2 + 1;
                ArraysKt.n(i2, i9, i4, iArr, this.X);
                ArraysKt.o(objArr, i3, this.f3771Y, i9 << 1, i4 << 1);
            }
        }
        if (i4 != this.Z) {
            throw new ConcurrentModificationException();
        }
        this.Z = i5;
        return obj;
    }

    public int hashCode() {
        int[] iArr = this.X;
        Object[] objArr = this.f3771Y;
        int i2 = this.Z;
        int i3 = 1;
        int i4 = 0;
        int iHashCode = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return iHashCode;
    }

    public Object i(int i2, Object obj) {
        boolean z2 = false;
        if (i2 >= 0 && i2 < this.Z) {
            z2 = true;
        }
        if (!z2) {
            RuntimeHelpersKt.a("Expected index to be within 0..size()-1, but was " + i2);
            throw null;
        }
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.f3771Y;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.Z <= 0;
    }

    public final Object j(int i2) {
        boolean z2 = false;
        if (i2 >= 0 && i2 < this.Z) {
            z2 = true;
        }
        if (z2) {
            return this.f3771Y[(i2 << 1) + 1];
        }
        RuntimeHelpersKt.a("Expected index to be within 0..size()-1, but was " + i2);
        throw null;
    }

    public Object put(Object obj, Object obj2) {
        int i2 = this.Z;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : e();
        if (iC >= 0) {
            int i3 = (iC << 1) + 1;
            Object[] objArr = this.f3771Y;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~iC;
        int[] iArr = this.X;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i5);
            Intrinsics.e(iArrCopyOf, "copyOf(...)");
            this.X = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f3771Y, i5 << 1);
            Intrinsics.e(objArrCopyOf, "copyOf(...)");
            this.f3771Y = objArrCopyOf;
            if (i2 != this.Z) {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr2 = this.X;
            int i6 = i4 + 1;
            ArraysKt.n(i6, i4, i2, iArr2, iArr2);
            Object[] objArr2 = this.f3771Y;
            ArraysKt.o(objArr2, i6 << 1, objArr2, i4 << 1, this.Z << 1);
        }
        int i7 = this.Z;
        if (i2 == i7) {
            int[] iArr3 = this.X;
            if (i4 < iArr3.length) {
                iArr3[i4] = iHashCode;
                Object[] objArr3 = this.f3771Y;
                int i8 = i4 << 1;
                objArr3[i8] = obj;
                objArr3[i8 + 1] = obj2;
                this.Z = i7 + 1;
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

    /* JADX INFO: renamed from: size, reason: from getter */
    public final int getZ() {
        return this.Z;
    }

    public final String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.Z * 28);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i2 = this.Z;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object objF = f(i3);
            if (objF != sb) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
            sb.append(dc.T);
            Object objJ = j(i3);
            if (objJ != sb) {
                sb.append(objJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb.toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !Intrinsics.a(obj2, j(iD))) {
            return false;
        }
        h(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !Intrinsics.a(obj2, j(iD))) {
            return false;
        }
        i(iD, obj3);
        return true;
    }

    public SimpleArrayMap(SimpleArrayMap simpleArrayMap) {
        this(0);
        if (simpleArrayMap != null) {
            g(simpleArrayMap);
        }
    }
}
