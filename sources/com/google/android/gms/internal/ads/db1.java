package com.google.android.gms.internal.ads;

import com.ironsource.B5;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class db1 implements Map, Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final db1 f13484g = new db1(null, new Object[0], 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient ab1 f13485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient bb1 f13486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient cb1 f13487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object f13488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f13489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f13490f;

    public db1(Object obj, Object[] objArr, int i10) {
        this.f13488d = obj;
        this.f13489e = objArr;
        this.f13490f = i10;
    }

    public static db1 a(Map map) {
        if ((map instanceof db1) && !(map instanceof SortedMap)) {
            return (db1) map;
        }
        Set setEntrySet = map.entrySet();
        pb pbVar = new pb(setEntrySet != null ? setEntrySet.size() : 4);
        pbVar.i(setEntrySet);
        return pbVar.p(true);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x019e  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bb  */
    /* JADX WARN: Multi-variable type inference failed */
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
    public static db1 h(int i10, Object[] objArr, pb pbVar) {
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
        da1 da1Var;
        boolean z13;
        int i13 = i10;
        Object[] objArrCopyOf = objArr;
        if (i13 == 0) {
            return f13484g;
        }
        da1 da1Var2 = null;
        ?? r11 = 0;
        da1 da1Var3 = null;
        da1 da1Var4 = null;
        boolean z14 = false;
        int i14 = 1;
        if (i13 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new db1(null, objArrCopyOf, 1);
        }
        ps1.g0(i13, objArrCopyOf.length >> 1);
        int iU = ia1.u(i13);
        char c10 = 2;
        if (i13 != 1) {
            int i15 = iU - 1;
            if (iU <= 128) {
                byte[] bArr = new byte[iU];
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
                    int iL = dv.l(obj.hashCode());
                    while (true) {
                        int i20 = iL & i15;
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
                            da1 da1Var5 = new da1(obj, obj2, obj3);
                            objArrCopyOf[i22 == true ? 1 : 0] = obj2;
                            da1Var3 = da1Var5;
                            break;
                        }
                        iL = i20 + 1;
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
                    sArr[2] = da1Var3;
                    r11 = sArr;
                    z13 = z10;
                }
            } else {
                z10 = false;
                i11 = 1;
                if (iU <= 32768) {
                    sArr = new short[iU];
                    Arrays.fill(sArr, (short) -1);
                    int i23 = 0;
                    for (int i24 = 0; i24 < i13; i24++) {
                        int i25 = i23 + i23;
                        int i26 = i24 + i24;
                        Object obj4 = objArrCopyOf[i26];
                        Objects.requireNonNull(obj4);
                        Object obj5 = objArrCopyOf[i26 ^ 1];
                        Objects.requireNonNull(obj5);
                        int iL2 = dv.l(obj4.hashCode());
                        while (true) {
                            int i27 = iL2 & i15;
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
                                da1 da1Var6 = new da1(obj4, obj5, obj6);
                                objArrCopyOf[i28 == true ? 1 : 0] = obj5;
                                da1Var4 = da1Var6;
                                break;
                            }
                            iL2 = i27 + 1;
                        }
                    }
                    if (i23 == i13) {
                        r11 = sArr;
                        z13 = z10;
                    } else {
                        r11 = new Object[]{sArr, Integer.valueOf(i23), da1Var4};
                        z13 = z10;
                    }
                } else {
                    int[] iArr = new int[iU];
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
                        int iL3 = dv.l(obj7.hashCode());
                        while (true) {
                            int i33 = iL3 & i15;
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
                                da1 da1Var7 = new da1(obj7, obj8, obj9);
                                objArrCopyOf[i35] = obj8;
                                da1Var2 = da1Var7;
                                break;
                            }
                            iL3 = i33 + 1;
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
                        objArr3[c4] = da1Var2;
                        r3 = objArr3;
                        r16 = z10;
                    }
                }
            }
            z12 = r3 instanceof Object[];
            r10 = r3;
            if (z12) {
                objArr2 = (Object[]) r3;
                da1Var = (da1) objArr2[c4];
                if (pbVar != null) {
                    throw da1Var.a();
                }
                pbVar.f18584c = da1Var;
                Object obj10 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i11]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r10 = obj10;
                i13 = iIntValue;
            }
            return new db1(r10, objArrCopyOf, i13);
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
            da1Var = (da1) objArr2[c4];
            if (pbVar != null) {
                throw da1Var.a();
            }
            pbVar.f18584c = da1Var;
            Object obj11 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i11]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r10 = obj11;
            i13 = iIntValue2;
        }
        return new db1(r10, objArrCopyOf, i13);
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
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ia1 entrySet() {
        ab1 ab1Var = this.f13485a;
        if (ab1Var != null) {
            return ab1Var;
        }
        ab1 ab1Var2 = new ab1(this, this.f13489e, this.f13490f);
        this.f13485a = ab1Var2;
        return ab1Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return pi1.u(obj, this);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final y91 values() {
        cb1 cb1Var = this.f13487c;
        if (cb1Var != null) {
            return cb1Var;
        }
        cb1 cb1Var2 = new cb1(1, this.f13490f, this.f13489e);
        this.f13487c = cb1Var2;
        return cb1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i10 = this.f13490f;
            Object[] objArr = this.f13489e;
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
                Object obj4 = this.f13488d;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iL = dv.l(obj.hashCode());
                    while (true) {
                        int i11 = iL & length;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i12])) {
                            obj2 = objArr[i12 ^ 1];
                        } else {
                            iL = i11 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iL2 = dv.l(obj.hashCode());
                    while (true) {
                        int i13 = iL2 & length2;
                        char c4 = (char) sArr[i13];
                        if (c4 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c4])) {
                            obj2 = objArr[c4 ^ 1];
                        } else {
                            iL2 = i13 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iL3 = dv.l(obj.hashCode());
                    while (true) {
                        int i14 = iL3 & length3;
                        int i15 = iArr[i14];
                        if (i15 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i15])) {
                            obj2 = objArr[i15 ^ 1];
                        } else {
                            iL3 = i14 + 1;
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
        return dv.v(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        bb1 bb1Var = this.f13486b;
        if (bb1Var != null) {
            return bb1Var;
        }
        bb1 bb1Var2 = new bb1(this, new cb1(0, this.f13490f, this.f13489e));
        this.f13486b = bb1Var2;
        return bb1Var2;
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
        return this.f13490f;
    }

    public final String toString() {
        int i10 = this.f13490f;
        rb0.p(i10, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) i10) * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : (ab1) entrySet()) {
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
}
