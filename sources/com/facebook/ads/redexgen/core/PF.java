package com.facebook.ads.redexgen.core;

import com.p004ironsource.dc;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class PF<K, V> {
    public static int A03;
    public static int A04;
    public static Object[] A05;
    public static Object[] A06;
    public static byte[] A07;
    public static String[] A08 = {"8z1HmzrTIPy39LL5zlYrlacFIwKg5dSL", "BF3wuf", "SqgiIkCbsFt", "0ewbfDqWIohK", "kTJoDQcQ4hAXz", "5fxnXFw2KP9B", "f0gXGPwWqu0hk91oP6YtPFY8hQ1GOrGw", "wtH1M9"};
    public int[] A01 = P5.A01;
    public Object[] A02 = P5.A03;
    public int A00 = 0;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A07 = new byte[]{44, 112, 108, 109, 119, 36, 73, 101, 116, 45, 34, 46, 63, 57};
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        if (r4 == r9.A00) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (r10 <= 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        java.lang.System.arraycopy(r2, 0, r9.A01, 0, r10);
        java.lang.System.arraycopy(r1, 0, r9.A02, 0, r10 << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        if (r10 >= r3) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        java.lang.System.arraycopy(r2, r10 + 1, r9.A01, r10, r3 - r10);
        java.lang.System.arraycopy(r1, (r10 + 1) << 1, r9.A02, r10 << 1, (r3 - r10) << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
    
        if (r4 == r9.A00) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ea, code lost:
    
        throw new java.util.ConcurrentModificationException();
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V A0A(int r10) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.PF.A0A(int):java.lang.Object");
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PF) {
            PF pf = (PF) obj;
            if (size() != pf.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.A00; i2++) {
                try {
                    K kA09 = A09(i2);
                    V vA0B = A0B(i2);
                    Object obj2 = pf.get(kA09);
                    if (vA0B == null) {
                        if (obj2 == null && pf.containsKey(kA09)) {
                        }
                        return false;
                    }
                    if (!vA0B.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException unused) {
                    return false;
                } catch (NullPointerException unused2) {
                    return false;
                }
            }
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        for (int i3 = 0; i3 < this.A00; i3++) {
            try {
                K kA010 = A09(i3);
                V vA0B2 = A0B(i3);
                Object obj3 = map.get(kA010);
                if (vA0B2 == null) {
                    if (obj3 == null && map.containsKey(kA010)) {
                    }
                    return false;
                }
                if (!vA0B2.equals(obj3)) {
                    return false;
                }
            } catch (ClassCastException unused3) {
                return false;
            } catch (NullPointerException unused4) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final int hashCode() {
        int[] iArr = this.A01;
        Object[] objArr = this.A02;
        int iHashCode = 0;
        int i2 = 0;
        int i3 = 1;
        int i4 = this.A00;
        while (i2 < i4) {
            Object obj = objArr[i3];
            iHashCode += iArr[i2] ^ (obj == null ? 0 : obj.hashCode());
            i2++;
            i3 += 2;
        }
        return iHashCode;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final V put(K k, V v) {
        int iHashCode;
        int iA01;
        int i2 = this.A00;
        if (k == null) {
            iHashCode = 0;
            iA01 = A00();
        } else {
            iHashCode = k.hashCode();
            iA01 = A01(k, iHashCode);
        }
        if (iA01 >= 0) {
            int i3 = (iA01 << 1) + 1;
            V v2 = (V) this.A02[i3];
            this.A02[i3] = v;
            return v2;
        }
        int i4 = ~iA01;
        if (i2 >= this.A01.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            int[] iArr = this.A01;
            Object[] objArr = this.A02;
            A05(i5);
            if (i2 != this.A00) {
                throw new ConcurrentModificationException();
            }
            if (this.A01.length > 0) {
                System.arraycopy(iArr, 0, this.A01, 0, iArr.length);
                System.arraycopy(objArr, 0, this.A02, 0, objArr.length);
            }
            A06(iArr, objArr, i2);
        }
        if (i4 < i2) {
            System.arraycopy(this.A01, i4, this.A01, i4 + 1, i2 - i4);
            System.arraycopy(this.A02, i4 << 1, this.A02, (i4 + 1) << 1, (this.A00 - i4) << 1);
        }
        if (i2 == this.A00) {
            int[] iArr2 = this.A01;
            if (A08[2].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[6] = "wNq2gfAl4zWIB1XFoKeYdvHUl0gsJJAY";
            strArr[0] = "ABvHOLLiQ2Gbe1PeIygvGpsQN2lfiJ3N";
            if (i4 < iArr2.length) {
                this.A01[i4] = iHashCode;
                this.A02[i4 << 1] = k;
                this.A02[(i4 << 1) + 1] = v;
                this.A00++;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    static {
        A04();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    private final int A00() {
        int i2 = this.A00;
        if (i2 == 0) {
            return -1;
        }
        int end = A02(this.A01, i2, 0);
        if (end < 0) {
            return end;
        }
        int N2 = end << 1;
        if (this.A02[N2] == null) {
            return end;
        }
        int i3 = end + 1;
        while (i3 < i2) {
            int N3 = this.A01[i3];
            if (N3 != 0) {
                break;
            }
            int N4 = i3 << 1;
            if (this.A02[N4] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = end - 1; i4 >= 0; i4--) {
            int N5 = this.A01[i4];
            if (N5 != 0) {
                break;
            }
            Object[] objArr = this.A02;
            String[] strArr = A08;
            String str = strArr[3];
            String str2 = strArr[5];
            int index = str.length();
            int N6 = str2.length();
            if (index != N6) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "nljZKXIH96LM";
            strArr2[5] = "33MSJmaTT2hK";
            int N7 = i4 << 1;
            if (objArr[N7] == null) {
                return i4;
            }
        }
        int N8 = ~i3;
        return N8;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    private final int A01(Object obj, int i2) {
        int i3 = this.A00;
        if (i3 == 0) {
            return -1;
        }
        int end = A02(this.A01, i3, i2);
        if (end < 0) {
            return end;
        }
        int N2 = end << 1;
        if (obj.equals(this.A02[N2])) {
            return end;
        }
        int i4 = end + 1;
        while (i4 < i3) {
            int N3 = this.A01[i4];
            if (N3 != i2) {
                break;
            }
            int N4 = i4 << 1;
            if (obj.equals(this.A02[N4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = end - 1; i5 >= 0; i5--) {
            int[] iArr = this.A01;
            int index = A08[2].length();
            if (index != 11) {
                throw new RuntimeException();
            }
            A08[2] = "0KWp7g9eUEy";
            int N5 = iArr[i5];
            if (N5 != i2) {
                break;
            }
            int N6 = i5 << 1;
            if (obj.equals(this.A02[N6])) {
                return i5;
            }
        }
        int N7 = ~i4;
        return N7;
    }

    public static int A02(int[] iArr, int i2, int i3) {
        try {
            return P5.A02(iArr, i2, i3);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    private void A05(int i2) {
        if (i2 == 8) {
            synchronized (C2384i7.class) {
                if (A06 != null) {
                    Object[] objArr = A06;
                    this.A02 = objArr;
                    A06 = (Object[]) objArr[0];
                    this.A01 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    A04--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (C2384i7.class) {
                if (A05 != null) {
                    Object[] objArr2 = A05;
                    this.A02 = objArr2;
                    A05 = (Object[]) objArr2[0];
                    this.A01 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    A03--;
                    return;
                }
            }
        }
        this.A01 = new int[i2];
        this.A02 = new Object[i2 << 1];
    }

    public static void A06(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (C2384i7.class) {
                if (A04 < 10) {
                    objArr[0] = A06;
                    objArr[1] = iArr;
                    for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    A06 = objArr;
                    A04++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C2384i7.class) {
                if (A03 < 10) {
                    objArr[0] = A05;
                    objArr[1] = iArr;
                    for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    A05 = objArr;
                    A03++;
                }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int A07(Object obj) {
        int i2 = this.A00 * 2;
        Object[] objArr = this.A02;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    int N2 = i3 >> 1;
                    return N2;
                }
            }
        } else {
            for (int i4 = 1; i4 < i2; i4 += 2) {
                boolean zEquals = obj.equals(objArr[i4]);
                if (A08[4].length() != 22) {
                    String[] strArr = A08;
                    strArr[3] = "bt44SpsCW8by";
                    strArr[5] = "Iovdsjym1Cx2";
                    if (zEquals) {
                        int i5 = i4 >> 1;
                        String[] strArr2 = A08;
                        String str = strArr2[3];
                        String str2 = strArr2[5];
                        int length = str.length();
                        int N3 = str2.length();
                        if (length == N3) {
                            String[] strArr3 = A08;
                            strArr3[1] = "ZvOUY6";
                            strArr3[7] = "nVlZAl";
                            return i5;
                        }
                    }
                }
                throw new RuntimeException();
            }
        }
        String[] strArr4 = A08;
        String str3 = strArr4[6];
        String str4 = strArr4[0];
        int iCharAt = str3.charAt(31);
        int N4 = str4.charAt(31);
        if (iCharAt != N4) {
            A08[2] = "MKm6k3UubQ6";
            return -1;
        }
        String[] strArr5 = A08;
        strArr5[3] = "2Vghj6DMfX1I";
        strArr5[5] = "igqcF6KEPQ66";
        return -1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int A08(Object obj) {
        return obj == null ? A00() : A01(obj, obj.hashCode());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final K A09(int i2) {
        return (K) this.A02[i2 << 1];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V A0B(int i2) {
        return (V) this.A02[(i2 << 1) + 1];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V A0C(int i2, V v) {
        int i3 = (i2 << 1) + 1;
        V v2 = (V) this.A02[i3];
        this.A02[i3] = v;
        return v2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final void A0D(int i2) {
        int i3 = this.A00;
        int osize = this.A01.length;
        if (osize < i2) {
            int[] iArr = this.A01;
            Object[] objArr = this.A02;
            A05(i2);
            int osize2 = this.A00;
            if (osize2 > 0) {
                System.arraycopy(iArr, 0, this.A01, 0, i3);
                int osize3 = i3 << 1;
                System.arraycopy(objArr, 0, this.A02, 0, osize3);
            }
            A06(iArr, objArr, i3);
        }
        int osize4 = this.A00;
        if (osize4 == i3) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final void clear() {
        if (this.A00 > 0) {
            int[] iArr = this.A01;
            String[] strArr = A08;
            if (strArr[6].charAt(31) == strArr[0].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[6] = "UNrHeFRST0N9gyLTBJ6FVG6osgOV0jla";
            strArr2[0] = "Uxp69fMHdnF3RanJB6hneAcQQEE567qn";
            Object[] objArr = this.A02;
            int i2 = this.A00;
            int[] ohashes = P5.A01;
            this.A01 = ohashes;
            this.A02 = P5.A03;
            this.A00 = 0;
            A06(iArr, objArr, i2);
        }
        if (this.A00 <= 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final boolean containsKey(Object obj) {
        return A08(obj) >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final boolean containsValue(Object obj) {
        return A07(obj) >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V get(Object obj) {
        int iA08 = A08(obj);
        if (iA08 >= 0) {
            return (V) this.A02[(iA08 << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final boolean isEmpty() {
        return this.A00 <= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V remove(Object obj) {
        int index = A08(obj);
        if (index >= 0) {
            return A0A(index);
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int size() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PF != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final String toString() {
        if (isEmpty()) {
            return A03(12, 2, 37);
        }
        StringBuilder sb = new StringBuilder(this.A00 * 28);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        for (int i2 = 0; i2 < this.A00; i2++) {
            if (i2 > 0) {
                sb.append(A03(10, 2, 111));
            }
            K kA09 = A09(i2);
            String strA03 = A03(0, 10, 101);
            if (kA09 != this) {
                sb.append(kA09);
            } else {
                sb.append(strA03);
            }
            sb.append(dc.T);
            V vA0B = A0B(i2);
            if (vA0B != this) {
                sb.append(vA0B);
            } else {
                sb.append(strA03);
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
