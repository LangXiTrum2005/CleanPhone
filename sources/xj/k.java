package xj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import qk.i0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k extends go.k {
    public static void A0(Object[] objArr, HashSet hashSet) {
        kotlin.jvm.internal.n.f(objArr, "<this>");
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
    }

    public static List B0(byte[] bArr) {
        kotlin.jvm.internal.n.f(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            return v.f53866a;
        }
        if (length == 1) {
            return j1.f.C(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b10 : bArr) {
            arrayList.add(Byte.valueOf(b10));
        }
        return arrayList;
    }

    public static List C0(Object[] objArr) {
        kotlin.jvm.internal.n.f(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? D0(objArr) : j1.f.C(objArr[0]);
        }
        return v.f53866a;
    }

    public static ArrayList D0(Object[] objArr) {
        kotlin.jvm.internal.n.f(objArr, "<this>");
        return new ArrayList(new i(objArr, false));
    }

    public static Set E0(Object[] objArr) {
        kotlin.jvm.internal.n.f(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return x.f53868a;
        }
        if (length == 1) {
            return i0.k0(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(b0.O(objArr.length));
        A0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static List a0(Object[] objArr) {
        kotlin.jvm.internal.n.f(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        kotlin.jvm.internal.n.e(listAsList, "asList(...)");
        return listAsList;
    }

    public static zm.i b0(Object[] objArr) {
        return objArr.length == 0 ? zm.d.f55098a : new an.r(objArr, 2);
    }

    public static boolean c0(Object[] objArr, Object obj) {
        kotlin.jvm.internal.n.f(objArr, "<this>");
        return t0(obj, objArr) >= 0;
    }

    public static boolean d0(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                Object obj = objArr[i10];
                Object obj2 = objArr2[i10];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!d0((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof wj.l) && (obj2 instanceof wj.l)) {
                            if (!Arrays.equals((byte[]) null, (byte[]) null)) {
                            }
                        } else if ((obj instanceof wj.p) && (obj2 instanceof wj.p)) {
                            if (!Arrays.equals((short[]) null, (short[]) null)) {
                            }
                        } else if ((obj instanceof wj.m) && (obj2 instanceof wj.m)) {
                            if (!Arrays.equals((int[]) null, (int[]) null)) {
                            }
                        } else if ((obj instanceof wj.n) && (obj2 instanceof wj.n)) {
                            if (!Arrays.equals((long[]) null, (long[]) null)) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static void e0(int i10, int i11, int i12, Object[] objArr, Object[] destination) {
        kotlin.jvm.internal.n.f(objArr, "<this>");
        kotlin.jvm.internal.n.f(destination, "destination");
        System.arraycopy(objArr, i11, destination, i10, i12 - i11);
    }

    public static void f0(int i10, int i11, int[] iArr, int[] destination, int i12) {
        kotlin.jvm.internal.n.f(iArr, "<this>");
        kotlin.jvm.internal.n.f(destination, "destination");
        System.arraycopy(iArr, i11, destination, i10, i12 - i11);
    }

    public static void g0(byte[] bArr, int i10, int i11, byte[] destination, int i12) {
        kotlin.jvm.internal.n.f(bArr, "<this>");
        kotlin.jvm.internal.n.f(destination, "destination");
        System.arraycopy(bArr, i11, destination, i10, i12 - i11);
    }

    public static /* synthetic */ void h0(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = objArr.length;
        }
        e0(0, i10, i11, objArr, objArr2);
    }

    public static byte[] i0(byte[] bArr, int i10, int i11) {
        kotlin.jvm.internal.n.f(bArr, "<this>");
        go.k.A(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        kotlin.jvm.internal.n.e(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] j0(int i10, int i11, Object[] objArr) {
        kotlin.jvm.internal.n.f(objArr, "<this>");
        go.k.A(i11, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        kotlin.jvm.internal.n.e(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void k0(Object[] objArr, Object obj, int i10, int i11) {
        kotlin.jvm.internal.n.f(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, obj);
    }

    public static ArrayList m0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static double n0(double[] dArr) {
        if (dArr.length != 0) {
            return dArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object o0(Object[] objArr) {
        kotlin.jvm.internal.n.f(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object p0(Object[] objArr) {
        kotlin.jvm.internal.n.f(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static pk.c q0(Object[] objArr) {
        kotlin.jvm.internal.n.f(objArr, "<this>");
        return new pk.c(0, objArr.length - 1, 1);
    }

    public static Integer r0(int i10, int[] iArr) {
        kotlin.jvm.internal.n.f(iArr, "<this>");
        if (i10 < 0 || i10 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i10]);
    }

    public static Object s0(int i10, Object[] objArr) {
        kotlin.jvm.internal.n.f(objArr, "<this>");
        if (i10 < 0 || i10 >= objArr.length) {
            return null;
        }
        return objArr[i10];
    }

    public static int t0(Object obj, Object[] objArr) {
        kotlin.jvm.internal.n.f(objArr, "<this>");
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i10 < length2) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final void u0(Object[] objArr, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, jk.b bVar) {
        kotlin.jvm.internal.n.f(objArr, "<this>");
        sb2.append(charSequence2);
        int i10 = 0;
        for (Object obj : objArr) {
            i10++;
            if (i10 > 1) {
                sb2.append(charSequence);
            }
            go.k.a(sb2, obj, bVar);
        }
        sb2.append(charSequence3);
    }

    public static String v0(Object[] objArr, String str, String str2, String str3, jk.b bVar, int i10) {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i10 & 2) != 0 ? "" : str2;
        String str6 = (i10 & 4) != 0 ? "" : str3;
        if ((i10 & 32) != 0) {
            bVar = null;
        }
        kotlin.jvm.internal.n.f(objArr, "<this>");
        StringBuilder sb2 = new StringBuilder();
        u0(objArr, sb2, str4, str5, str6, "...", bVar);
        return sb2.toString();
    }

    public static double w0(double[] dArr) {
        if (dArr.length != 0) {
            return dArr[dArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object x0(Object[] objArr) {
        kotlin.jvm.internal.n.f(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object[] y0(Object[] objArr, Object[] objArr2) {
        kotlin.jvm.internal.n.f(objArr, "<this>");
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, objArrCopyOf, length, length2);
        kotlin.jvm.internal.n.c(objArrCopyOf);
        return objArrCopyOf;
    }

    public static Object z0(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }
}
