package com.facebook.ads.redexgen.core;

import com.p004ironsource.dc;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class P6<E> implements Cloneable {
    public static byte[] A04;
    public static String[] A05 = {"3rdfmaS4Bvs6KD5DohCaazKJ5nPjrowZ", "nk5cgk6zHA99knZ4VIBWP6swe9j6XVxJ", "SR1GrmmGZb5WiV5DUpa8V4qNmvh", "hXJT0tWkN7S4w3G0a7yWDauM9ZCHUr7o", "HR23fndUBIfy3sX8NPdMDAzNZ7ikzeu", "Yza27yUTeZsQZywWns2Eqk9QSJgdTaNC", "To1PPTsvrqg0vOGGncKBfzj1ovx9xtsA", "AHHllHZ2j6xopeQt7"};
    public static final Object A06;
    public int A00;
    public boolean A01;
    public long[] A02;
    public Object[] A03;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 104);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A04 = new byte[]{107, 55, 43, 42, 48, 99, 14, 34, 51, 106, 4, 8, 25, 31};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final String toString() {
        if (A06() <= 0) {
            String strA03 = A03(12, 2, 10);
            String[] strArr = A05;
            if (strArr[6].charAt(16) != strArr[5].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[1] = "Skpu9y55M8HCr5nD5qLEIrlUv7DMUr8f";
            strArr2[3] = "83PSjIhGPkyHWD5a17BzKCZMIovhzHLb";
            return strA03;
        }
        StringBuilder sb = new StringBuilder(this.A00 * 28);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        for (int i2 = 0; i2 < this.A00; i2++) {
            if (i2 > 0) {
                sb.append(A03(10, 2, 64));
            }
            sb.append(A00(i2));
            sb.append(dc.T);
            E eA07 = A07(i2);
            if (eA07 != this) {
                sb.append(eA07);
            } else {
                sb.append(A03(0, 10, 43));
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    static {
        A05();
        A06 = new Object();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P6 != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public P6() {
        this(10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P6 != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public P6(int i2) {
        this.A01 = false;
        if (i2 == 0) {
            this.A02 = P5.A02;
            this.A03 = P5.A03;
        } else {
            int iA00 = P5.A00(i2);
            this.A02 = new long[iA00];
            this.A03 = new Object[iA00];
        }
        this.A00 = 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P6 != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private final long A00(int i2) {
        if (this.A01) {
            A04();
        }
        return this.A02[i2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P6 != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final P6<E> clone() {
        P6<E> p6 = null;
        try {
            p6 = (P6) super.clone();
            p6.A02 = (long[]) this.A02.clone();
            p6.A03 = (Object[]) this.A03.clone();
            return p6;
        } catch (CloneNotSupportedException unused) {
            return p6;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P6 != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private final E A02(long j, E e2) {
        int iA03 = P5.A03(this.A02, this.A00, j);
        if (iA03 >= 0) {
            Object[] objArr = this.A03;
            if (A05[7].length() != 17) {
                throw new RuntimeException();
            }
            A05[2] = "jXlMUCcAItIj0GcupoJ3Otj";
            if (objArr[iA03] != A06) {
                return (E) this.A03[iA03];
            }
        }
        return e2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P6 != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private void A04() {
        int i2 = this.A00;
        int i3 = 0;
        long[] jArr = this.A02;
        Object[] objArr = this.A03;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != A06) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.A01 = false;
        this.A00 = i3;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P6 != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final int A06() {
        if (this.A01) {
            A04();
        }
        int i2 = this.A00;
        String[] strArr = A05;
        if (strArr[6].charAt(16) != strArr[5].charAt(16)) {
            throw new RuntimeException();
        }
        A05[4] = "ypCZ";
        return i2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P6 != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final E A07(int i2) {
        if (this.A01) {
            A04();
        }
        return (E) this.A03[i2];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P6 != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final E A08(long j) {
        return A02(j, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P6 != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A09() {
        int i2 = this.A00;
        Object[] objArr = this.A03;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.A00 = 0;
        this.A01 = false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P6 != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A0A(int i2) {
        if (this.A03[i2] != A06) {
            this.A03[i2] = A06;
            this.A01 = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0058  */
    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P6 != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A0B(long j, E e2) {
        int i2;
        int i3;
        int iA03 = P5.A03(this.A02, this.A00, j);
        if (iA03 >= 0) {
            Object[] objArr = this.A03;
            if (A05[4].length() != 11) {
                A05[2] = "zIN2";
                objArr[iA03] = e2;
                return;
            }
        } else {
            int i4 = ~iA03;
            int i5 = this.A00;
            if (i4 < i5 && this.A03[i4] == A06) {
                this.A02[i4] = j;
                this.A03[i4] = e2;
                return;
            }
            boolean z2 = this.A01;
            String[] strArr = A05;
            String str = strArr[1];
            String str2 = strArr[3];
            int iCharAt = str.charAt(17);
            int i6 = str2.charAt(17);
            if (iCharAt != i6) {
                A05[0] = "5FIvphvUgQVU1M732kCMD6tquLVSGC6u";
                if (z2) {
                    i2 = this.A00;
                    i3 = this.A02.length;
                    if (i2 >= i3) {
                        A04();
                        long[] jArr = this.A02;
                        int i7 = this.A00;
                        i4 = ~P5.A03(jArr, i7, j);
                    }
                }
            } else {
                A05[2] = "2a9UU1wdCLKEgsYJNRrqpR";
                if (z2) {
                    i2 = this.A00;
                    i3 = this.A02.length;
                    if (i2 >= i3) {
                        A04();
                        long[] jArr2 = this.A02;
                        int i8 = this.A00;
                        i4 = ~P5.A03(jArr2, i8, j);
                    }
                }
            }
            int i9 = this.A00;
            if (A05[7].length() != 17) {
                throw new RuntimeException();
            }
            A05[7] = "rLvHDd51XfoeTGgnr";
            int i10 = this.A02.length;
            if (i9 >= i10) {
                int i11 = this.A00;
                int i12 = P5.A00(i11 + 1);
                long[] jArr3 = new long[i12];
                Object[] objArr2 = new Object[i12];
                long[] jArr4 = this.A02;
                int length = this.A02.length;
                int n2 = A05[7].length();
                if (n2 == 17) {
                    A05[2] = "L48OP70swgk";
                    System.arraycopy(jArr4, 0, jArr3, 0, length);
                    Object[] objArr3 = this.A03;
                    int i13 = this.A03.length;
                    System.arraycopy(objArr3, 0, objArr2, 0, i13);
                    this.A02 = jArr3;
                    this.A03 = objArr2;
                }
            }
            int i14 = this.A00;
            if (i14 - i4 != 0) {
                int i15 = this.A00;
                System.arraycopy(this.A02, i4, this.A02, i4 + 1, i15 - i4);
                int i16 = this.A00;
                System.arraycopy(this.A03, i4, this.A03, i4 + 1, i16 - i4);
            }
            this.A02[i4] = j;
            this.A03[i4] = e2;
            int i17 = this.A00;
            this.A00 = i17 + 1;
            return;
        }
        throw new RuntimeException();
    }
}
