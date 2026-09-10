package kotlin.collections;

import com.chartboost.sdk.impl.e6;
import com.p004ironsource.d9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.EmptySequence;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"kotlin/collections/ArraysKt__ArraysJVMKt", "kotlin/collections/ArraysKt__ArraysKt", "kotlin/collections/ArraysKt___ArraysJvmKt", "kotlin/collections/ArraysKt___ArraysKt"}, k = 4, mv = {2, 1, 0}, xi = 49)
public final class ArraysKt extends ArraysKt___ArraysKt {
    public static Object A(int i2, Object[] objArr) {
        Intrinsics.f(objArr, "<this>");
        if (i2 < 0 || i2 >= objArr.length) {
            return null;
        }
        return objArr[i2];
    }

    public static int B(int i2, int[] iArr) {
        Intrinsics.f(iArr, "<this>");
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (i2 == iArr[i3]) {
                return i3;
            }
        }
        return -1;
    }

    public static int C(byte[] bArr, byte b2) {
        Intrinsics.f(bArr, "<this>");
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (b2 == bArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static int D(long[] jArr, long j) {
        Intrinsics.f(jArr, "<this>");
        int length = jArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (j == jArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static int E(Object[] objArr, Object obj) {
        Intrinsics.f(objArr, "<this>");
        int i2 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i2 < length) {
                if (objArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i2 < length2) {
            if (obj.equals(objArr[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int F(short[] sArr, short s) {
        Intrinsics.f(sArr, "<this>");
        int length = sArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (s == sArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static String H(byte[] bArr, String str, e6.j jVar, int i2) {
        String str2 = (i2 & 2) != 0 ? "" : d9.i.d;
        String str3 = (i2 & 4) == 0 ? d9.i.f24752e : "";
        if ((i2 & 32) != 0) {
            jVar = null;
        }
        Intrinsics.f(bArr, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i3 = 0;
        for (byte b2 : bArr) {
            i3++;
            if (i3 > 1) {
                sb.append((CharSequence) str);
            }
            if (jVar != null) {
                sb.append((CharSequence) jVar.invoke(Byte.valueOf(b2)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b2));
            }
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static String I(Object[] objArr, String str, String str2, Function1 function1, int i2) {
        CharSequence charSequence = (i2 & 1) != 0 ? ", " : "";
        String str3 = (i2 & 2) != 0 ? "" : str;
        String str4 = (i2 & 4) != 0 ? "" : str2;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        StringBuilder sb = new StringBuilder();
        ArraysKt___ArraysKt.b(objArr, sb, charSequence, str3, str4, "...", function1);
        return sb.toString();
    }

    public static Object J(Object[] objArr) {
        Intrinsics.f(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object K(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static HashSet L(Object[] objArr) {
        HashSet hashSet = new HashSet(MapsKt.h(objArr.length));
        ArraysKt___ArraysKt.c(objArr, hashSet);
        return hashSet;
    }

    public static List M(Object[] objArr) {
        Intrinsics.f(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? N(objArr) : CollectionsKt.H(objArr[0]);
        }
        return EmptyList.X;
    }

    public static ArrayList N(Object[] objArr) {
        Intrinsics.f(objArr, "<this>");
        return new ArrayList(new ArrayAsCollection(objArr, false));
    }

    public static Set O(Object[] objArr) {
        Intrinsics.f(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return EmptySet.X;
        }
        if (length == 1) {
            return SetsKt.h(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.h(objArr.length));
        ArraysKt___ArraysKt.c(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static ArrayList P(Object[] objArr, Object[] other) {
        Intrinsics.f(objArr, "<this>");
        Intrinsics.f(other, "other");
        int iMin = Math.min(objArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(new Pair(objArr[i2], other[i2]));
        }
        return arrayList;
    }

    public static Iterable d(Object[] objArr) {
        Intrinsics.f(objArr, "<this>");
        return objArr.length == 0 ? EmptyList.X : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$1(objArr);
    }

    public static List e(Object[] objArr) {
        Intrinsics.f(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        Intrinsics.e(listAsList, "asList(...)");
        return listAsList;
    }

    public static Sequence f(final Object[] objArr) {
        return objArr.length == 0 ? EmptySequence.f44657a : new Sequence<Object>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public final Iterator iterator() {
                return ArrayIteratorKt.a(objArr);
            }
        };
    }

    public static boolean g(byte[] bArr, byte b2) {
        Intrinsics.f(bArr, "<this>");
        return C(bArr, b2) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0017 A[RETURN] */
    public static boolean h(char[] cArr, char c2) {
        Intrinsics.f(cArr, "<this>");
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (c2 == cArr[i2]) {
                if (i2 >= 0) {
                    return true;
                }
                return false;
            }
            i2++;
        }
        i2 = -1;
        if (i2 >= 0) {
            return true;
        }
        return false;
    }

    public static boolean i(int[] iArr, int i2) {
        Intrinsics.f(iArr, "<this>");
        return B(i2, iArr) >= 0;
    }

    public static boolean j(long[] jArr, long j) {
        Intrinsics.f(jArr, "<this>");
        return D(jArr, j) >= 0;
    }

    public static boolean k(Object[] objArr, Object obj) {
        Intrinsics.f(objArr, "<this>");
        return E(objArr, obj) >= 0;
    }

    public static boolean l(short[] sArr, short s) {
        Intrinsics.f(sArr, "<this>");
        return F(sArr, s) >= 0;
    }

    public static void m(int i2, int i3, int i4, byte[] bArr, byte[] destination) {
        Intrinsics.f(bArr, "<this>");
        Intrinsics.f(destination, "destination");
        System.arraycopy(bArr, i3, destination, i2, i4 - i3);
    }

    public static void n(int i2, int i3, int i4, int[] iArr, int[] destination) {
        Intrinsics.f(iArr, "<this>");
        Intrinsics.f(destination, "destination");
        System.arraycopy(iArr, i3, destination, i2, i4 - i3);
    }

    public static void o(Object[] objArr, int i2, Object[] destination, int i3, int i4) {
        Intrinsics.f(objArr, "<this>");
        Intrinsics.f(destination, "destination");
        System.arraycopy(objArr, i3, destination, i2, i4 - i3);
    }

    public static /* synthetic */ void p(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        o(objArr, 0, objArr2, i2, i3);
    }

    public static byte[] q(int i2, int i3, byte[] bArr) {
        Intrinsics.f(bArr, "<this>");
        ArraysKt__ArraysJVMKt.a(i3, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i2, i3);
        Intrinsics.e(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] r(Object[] objArr, int i2, int i3) {
        Intrinsics.f(objArr, "<this>");
        ArraysKt__ArraysJVMKt.a(i3, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i2, i3);
        Intrinsics.e(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void s(Object[] objArr, Symbol symbol, int i2, int i3) {
        Intrinsics.f(objArr, "<this>");
        Arrays.fill(objArr, i2, i3, symbol);
    }

    public static void t(int i2, int[] iArr) {
        int length = iArr.length;
        Intrinsics.f(iArr, "<this>");
        Arrays.fill(iArr, 0, length, i2);
    }

    public static void u(long[] jArr, long j) {
        int length = jArr.length;
        Intrinsics.f(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j);
    }

    public static ArrayList w(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object x(Object[] objArr) {
        Intrinsics.f(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object y(Object[] objArr) {
        Intrinsics.f(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static Integer z(int i2, int[] iArr) {
        Intrinsics.f(iArr, "<this>");
        if (i2 < 0 || i2 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i2]);
    }
}
