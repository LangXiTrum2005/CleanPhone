package com.google.android.gms.internal.play_billing;

import com.ironsource.B5;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Map, Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a0 f24213g = new a0(null, new Object[0], 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient x f24214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient y f24215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient z f24216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object f24217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f24218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f24219f;

    public a0(Object obj, Object[] objArr, int i10) {
        this.f24217d = obj;
        this.f24218e = objArr;
        this.f24219f = i10;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01be  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:84:0x01db  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    public static a0 a(int i10, Object[] objArr, b2.p pVar) {
        int iHighestOneBit;
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
        s sVar;
        boolean z13;
        int i13 = i10;
        Object[] objArrCopyOf = objArr;
        if (i13 == 0) {
            return f24213g;
        }
        s sVar2 = null;
        ?? r11 = 0;
        s sVar3 = null;
        s sVar4 = null;
        boolean z14 = false;
        int i14 = 1;
        if (i13 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new a0(null, objArrCopyOf, 1);
        }
        no.b.J(i13, objArrCopyOf.length >> 1);
        char c10 = 2;
        int iMax = Math.max(i13, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i13 != 1) {
            int i15 = iHighestOneBit - 1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i16 = 0;
                int i17 = 0;
                while (i16 < i13) {
                    int i18 = i17 + i17;
                    int i19 = i16 + i16;
                    Object obj = objArrCopyOf[i19];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArrCopyOf[i19 ^ i14];
                    Objects.requireNonNull(obj2);
                    int iD = t9.e.D(obj.hashCode());
                    while (true) {
                        int i20 = iD & i15;
                        z11 = z14;
                        i12 = i14;
                        int i21 = bArr[i20] & 255;
                        if (i21 == 255) {
                            bArr[i20] = (byte) i18;
                            if (i17 < i16) {
                                objArrCopyOf[i18] = obj;
                                objArrCopyOf[i18 ^ 1] = obj2;
                            }
                            i17++;
                            break;
                        }
                        if (obj.equals(objArrCopyOf[i21 == true ? 1 : 0])) {
                            int i22 = ~i21;
                            Object obj3 = objArrCopyOf[i22 == true ? 1 : 0];
                            Objects.requireNonNull(obj3);
                            s sVar5 = new s(obj, obj2, obj3);
                            objArrCopyOf[i22 == true ? 1 : 0] = obj2;
                            sVar3 = sVar5;
                            break;
                        }
                        iD = i20 + 1;
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
                    c4 = 2;
                    r3 = bArr;
                    r16 = z10;
                } else {
                    sArr = new Object[3];
                    sArr[z10 ? 1 : 0] = bArr;
                    sArr[i11] = Integer.valueOf(i17);
                    sArr[2] = sVar3;
                    r11 = sArr;
                    z13 = z10;
                }
            } else {
                z10 = false;
                i11 = 1;
                if (iHighestOneBit <= 32768) {
                    sArr = new short[iHighestOneBit];
                    Arrays.fill(sArr, (short) -1);
                    int i23 = 0;
                    for (int i24 = 0; i24 < i13; i24++) {
                        int i25 = i23 + i23;
                        int i26 = i24 + i24;
                        Object obj4 = objArrCopyOf[i26];
                        Objects.requireNonNull(obj4);
                        Object obj5 = objArrCopyOf[i26 ^ 1];
                        Objects.requireNonNull(obj5);
                        int iD2 = t9.e.D(obj4.hashCode());
                        while (true) {
                            int i27 = iD2 & i15;
                            char c11 = (char) sArr[i27];
                            if (c11 == 65535) {
                                sArr[i27] = (short) i25;
                                if (i23 < i24) {
                                    objArrCopyOf[i25] = obj4;
                                    objArrCopyOf[i25 ^ 1] = obj5;
                                }
                                i23++;
                                break;
                            }
                            if (obj4.equals(objArrCopyOf[c11])) {
                                int i28 = c11 ^ 1;
                                Object obj6 = objArrCopyOf[i28 == true ? 1 : 0];
                                Objects.requireNonNull(obj6);
                                s sVar6 = new s(obj4, obj5, obj6);
                                objArrCopyOf[i28 == true ? 1 : 0] = obj5;
                                sVar4 = sVar6;
                                break;
                            }
                            iD2 = i27 + 1;
                        }
                    }
                    if (i23 == i13) {
                        r11 = sArr;
                        z13 = z10;
                    } else {
                        r11 = new Object[]{sArr, Integer.valueOf(i23), sVar4};
                        z13 = z10;
                    }
                } else {
                    int[] iArr = new int[iHighestOneBit];
                    Arrays.fill(iArr, -1);
                    int i29 = 0;
                    int i30 = 0;
                    while (i29 < i13) {
                        int i31 = i30 + i30;
                        int i32 = i29 + i29;
                        Object obj7 = objArrCopyOf[i32];
                        Objects.requireNonNull(obj7);
                        Object obj8 = objArrCopyOf[i32 ^ 1];
                        Objects.requireNonNull(obj8);
                        int iD3 = t9.e.D(obj7.hashCode());
                        while (true) {
                            int i33 = iD3 & i15;
                            int i34 = iArr[i33];
                            if (i34 == -1) {
                                iArr[i33] = i31;
                                if (i30 < i29) {
                                    objArrCopyOf[i31] = obj7;
                                    objArrCopyOf[i31 ^ 1] = obj8;
                                }
                                i30++;
                                c5 = c10;
                                break;
                            }
                            c5 = c10;
                            if (obj7.equals(objArrCopyOf[i34])) {
                                int i35 = i34 ^ 1;
                                Object obj9 = objArrCopyOf[i35];
                                Objects.requireNonNull(obj9);
                                s sVar7 = new s(obj7, obj8, obj9);
                                objArrCopyOf[i35] = obj8;
                                sVar2 = sVar7;
                                break;
                            }
                            iD3 = i33 + 1;
                            c10 = c5;
                        }
                        i29++;
                        c10 = c5;
                    }
                    c4 = c10;
                    if (i30 == i13) {
                        r3 = iArr;
                        r16 = z10;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i30);
                        objArr3[c4] = sVar2;
                        r3 = objArr3;
                        r16 = z10;
                    }
                }
            }
            z12 = r3 instanceof Object[];
            r10 = r3;
            if (z12) {
                objArr2 = (Object[]) r3;
                sVar = (s) objArr2[c4];
                if (pVar != null) {
                    throw sVar.a();
                }
                pVar.f5365d = sVar;
                Object obj10 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i11]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r10 = obj10;
                i13 = iIntValue;
            }
            return new a0(r10, objArrCopyOf, i13);
        }
        Objects.requireNonNull(objArrCopyOf[0]);
        Objects.requireNonNull(objArrCopyOf[1]);
        z13 = false;
        i13 = 1;
        i11 = 1;
        c4 = 2;
        r3 = r11;
        r16 = z13;
        z12 = r3 instanceof Object[];
        r10 = r3;
        if (z12) {
            objArr2 = (Object[]) r3;
            sVar = (s) objArr2[c4];
            if (pVar != null) {
                throw sVar.a();
            }
            pVar.f5365d = sVar;
            Object obj11 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i11]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r10 = obj11;
            i13 = iIntValue2;
        }
        return new a0(r10, objArrCopyOf, i13);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        z zVar = this.f24216c;
        if (zVar == null) {
            zVar = new z(1, this.f24219f, this.f24218e);
            this.f24216c = zVar;
        }
        return zVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        x xVar = this.f24214a;
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = new x(this, this.f24218e, this.f24219f);
        this.f24214a = xVar2;
        return xVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i10 = this.f24219f;
            Object[] objArr = this.f24218e;
            if (i10 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f24217d;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iD = t9.e.D(obj.hashCode());
                    while (true) {
                        int i11 = iD & length;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i12])) {
                            obj2 = objArr[i12 ^ 1];
                        } else {
                            iD = i11 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iD2 = t9.e.D(obj.hashCode());
                    while (true) {
                        int i13 = iD2 & length2;
                        char c4 = (char) sArr[i13];
                        if (c4 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c4])) {
                            obj2 = objArr[c4 ^ 1];
                        } else {
                            iD2 = i13 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iD3 = t9.e.D(obj.hashCode());
                    while (true) {
                        int i14 = iD3 & length3;
                        int i15 = iArr[i14];
                        if (i15 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i15])) {
                            obj2 = objArr[i15 ^ 1];
                        } else {
                            iD3 = i14 + 1;
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
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        x xVar = this.f24214a;
        if (xVar == null) {
            xVar = new x(this, this.f24218e, this.f24219f);
            this.f24214a = xVar;
        }
        Iterator it = xVar.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        y yVar = this.f24215b;
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(this, new z(0, this.f24219f, this.f24218e));
        this.f24215b = yVar2;
        return yVar2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f24219f;
    }

    public final String toString() {
        int i10 = this.f24219f;
        if (i10 < 0) {
            throw new IllegalArgumentException(l1.d.e(i10, "size cannot be negative but was: "));
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) i10) * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : (x) entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append(B5.U);
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        z zVar = this.f24216c;
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(1, this.f24219f, this.f24218e);
        this.f24216c = zVar2;
        return zVar2;
    }
}
