package oa;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class s1 extends o0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s1 f47307g = new s1(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object f47308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f47309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f47310f;

    public s1(Object obj, Object[] objArr, int i10) {
        this.f47308d = obj;
        this.f47309e = objArr;
        this.f47310f = i10;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0199  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    public static s1 j(int i10, Object[] objArr, b2.p pVar) {
        boolean z10;
        int i11;
        char c4;
        ?? r3;
        char c5;
        short[] sArr;
        boolean z11;
        int i12;
        ?? r16;
        boolean z12;
        ?? r10;
        Object[] objArr2;
        m0 m0Var;
        boolean z13;
        int i13 = i10;
        Object[] objArrCopyOf = objArr;
        if (i13 == 0) {
            return f47307g;
        }
        m0 m0Var2 = null;
        ?? r11 = 0;
        m0 m0Var3 = null;
        m0 m0Var4 = null;
        boolean z14 = false;
        int i14 = 1;
        if (i13 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new s1(null, objArrCopyOf, 1);
        }
        go.k.q(i13, objArrCopyOf.length >> 1);
        int iT = u0.t(i13);
        char c10 = 2;
        if (i13 != 1) {
            int i15 = iT - 1;
            if (iT <= 128) {
                byte[] bArr = new byte[iT];
                Arrays.fill(bArr, (byte) -1);
                int i16 = 0;
                int i17 = 0;
                while (i16 < i13) {
                    int i18 = i16 * 2;
                    int i19 = i17 * 2;
                    Object obj = objArrCopyOf[i18];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArrCopyOf[i18 ^ i14];
                    Objects.requireNonNull(obj2);
                    int iV = q.v(obj.hashCode());
                    while (true) {
                        int i20 = iV & i15;
                        z11 = z14;
                        i12 = i14;
                        int i21 = bArr[i20] & 255;
                        if (i21 == 255) {
                            bArr[i20] = (byte) i19;
                            if (i17 < i16) {
                                objArrCopyOf[i19] = obj;
                                objArrCopyOf[i19 ^ 1] = obj2;
                            }
                            i17++;
                            break;
                        }
                        if (obj.equals(objArrCopyOf[i21 == true ? 1 : 0])) {
                            int i22 = ~i21;
                            Object obj3 = objArrCopyOf[i22 == true ? 1 : 0];
                            Objects.requireNonNull(obj3);
                            m0Var3 = new m0(obj, obj2, obj3);
                            objArrCopyOf[i22 == true ? 1 : 0] = obj2;
                            break;
                        }
                        iV = i20 + 1;
                        z14 = z11;
                        i14 = i12;
                    }
                    i16++;
                    z14 = z11;
                    i14 = i12;
                }
                z10 = z14;
                i11 = i14;
                if (i17 == i13) {
                    r11 = bArr;
                    z13 = z10;
                } else {
                    sArr = new Object[3];
                    sArr[z10 ? 1 : 0] = bArr;
                    sArr[i11] = Integer.valueOf(i17);
                    sArr[2] = m0Var3;
                    r11 = sArr;
                    z13 = z10;
                }
            } else {
                z10 = false;
                i11 = 1;
                if (iT <= 32768) {
                    sArr = new short[iT];
                    Arrays.fill(sArr, (short) -1);
                    int i23 = 0;
                    for (int i24 = 0; i24 < i13; i24++) {
                        int i25 = i24 * 2;
                        int i26 = i23 * 2;
                        Object obj4 = objArrCopyOf[i25];
                        Objects.requireNonNull(obj4);
                        Object obj5 = objArrCopyOf[i25 ^ 1];
                        Objects.requireNonNull(obj5);
                        int iV2 = q.v(obj4.hashCode());
                        while (true) {
                            int i27 = iV2 & i15;
                            int i28 = sArr[i27] & 65535;
                            if (i28 == 65535) {
                                sArr[i27] = (short) i26;
                                if (i23 < i24) {
                                    objArrCopyOf[i26] = obj4;
                                    objArrCopyOf[i26 ^ 1] = obj5;
                                }
                                i23++;
                                break;
                            }
                            if (obj4.equals(objArrCopyOf[i28 == true ? 1 : 0])) {
                                int i29 = ~i28;
                                Object obj6 = objArrCopyOf[i29 == true ? 1 : 0];
                                Objects.requireNonNull(obj6);
                                m0Var4 = new m0(obj4, obj5, obj6);
                                objArrCopyOf[i29 == true ? 1 : 0] = obj5;
                                break;
                            }
                            iV2 = i27 + 1;
                        }
                    }
                    if (i23 == i13) {
                        r11 = sArr;
                        z13 = z10;
                    } else {
                        r11 = new Object[]{sArr, Integer.valueOf(i23), m0Var4};
                        z13 = z10;
                    }
                } else {
                    int[] iArr = new int[iT];
                    Arrays.fill(iArr, -1);
                    int i30 = 0;
                    int i31 = 0;
                    while (i30 < i13) {
                        int i32 = i30 * 2;
                        int i33 = i31 * 2;
                        Object obj7 = objArrCopyOf[i32];
                        Objects.requireNonNull(obj7);
                        Object obj8 = objArrCopyOf[i32 ^ 1];
                        Objects.requireNonNull(obj8);
                        int iV3 = q.v(obj7.hashCode());
                        while (true) {
                            int i34 = iV3 & i15;
                            int i35 = iArr[i34];
                            if (i35 == -1) {
                                iArr[i34] = i33;
                                if (i31 < i30) {
                                    objArrCopyOf[i33] = obj7;
                                    objArrCopyOf[i33 ^ 1] = obj8;
                                }
                                i31++;
                                c5 = c10;
                                break;
                            }
                            c5 = c10;
                            if (obj7.equals(objArrCopyOf[i35])) {
                                int i36 = i35 ^ 1;
                                Object obj9 = objArrCopyOf[i36];
                                Objects.requireNonNull(obj9);
                                m0Var2 = new m0(obj7, obj8, obj9);
                                objArrCopyOf[i36] = obj8;
                                break;
                            }
                            iV3 = i34 + 1;
                            c10 = c5;
                        }
                        i30++;
                        c10 = c5;
                    }
                    c4 = c10;
                    if (i31 == i13) {
                        r3 = iArr;
                        r16 = z10;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i31);
                        objArr3[c4] = m0Var2;
                        r3 = objArr3;
                        r16 = z10;
                    }
                }
            }
            z12 = r3 instanceof Object[];
            r10 = r3;
            if (z12) {
                objArr2 = (Object[]) r3;
                m0Var = (m0) objArr2[c4];
                if (pVar != null) {
                    throw m0Var.a();
                }
                pVar.f5365d = m0Var;
                Object obj10 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i11]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue * 2);
                r10 = obj10;
                i13 = iIntValue;
            }
            return new s1(r10, objArrCopyOf, i13);
        }
        Objects.requireNonNull(objArrCopyOf[0]);
        Objects.requireNonNull(objArrCopyOf[1]);
        z13 = false;
        i11 = 1;
        c4 = 2;
        r3 = r11;
        r16 = z13;
        z12 = r3 instanceof Object[];
        r10 = r3;
        if (z12) {
            objArr2 = (Object[]) r3;
            m0Var = (m0) objArr2[c4];
            if (pVar != null) {
                throw m0Var.a();
            }
            pVar.f5365d = m0Var;
            Object obj11 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i11]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 * 2);
            r10 = obj11;
            i13 = iIntValue2;
        }
        return new s1(r10, objArrCopyOf, i13);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // oa.o0, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.f47309e;
            if (this.f47310f == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f47308d;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iV = q.v(obj.hashCode());
                    while (true) {
                        int i10 = iV & length;
                        int i11 = bArr[i10] & 255;
                        if (i11 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i11])) {
                            obj2 = objArr[i11 ^ 1];
                        } else {
                            iV = i10 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iV2 = q.v(obj.hashCode());
                    while (true) {
                        int i12 = iV2 & length2;
                        int i13 = sArr[i12] & 65535;
                        if (i13 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i13])) {
                            obj2 = objArr[i13 ^ 1];
                        } else {
                            iV2 = i12 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iV3 = q.v(obj.hashCode());
                    while (true) {
                        int i14 = iV3 & length3;
                        int i15 = iArr[i14];
                        if (i15 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i15])) {
                            obj2 = objArr[i15 ^ 1];
                        } else {
                            iV3 = i14 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f47310f;
    }

    @Override // oa.o0
    public Object writeReplace() {
        return super.writeReplace();
    }
}
