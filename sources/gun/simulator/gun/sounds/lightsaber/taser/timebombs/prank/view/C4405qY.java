package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4405qY extends FC {
    public static final C4405qY g = new C4405qY(null, new Object[0], 0);
    public final transient Object d;
    public final transient Object[] e;
    public final transient int f;

    public C4405qY(Object obj, Object[] objArr, int i) {
        this.d = obj;
        this.e = objArr;
        this.f = i;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0179  */
    /* JADX WARN: Code duplicated, block: B:74:0x0181  */
    /* JADX WARN: Code duplicated, block: B:75:0x0197  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public static C4405qY g(int i, Object[] objArr, EC ec) {
        short[] sArr;
        char c;
        ?? r3;
        ?? r7;
        boolean z;
        ?? r8;
        Object[] objArr2;
        DC dc;
        int i2 = i;
        Object[] objArrCopyOf = objArr;
        if (i2 == 0) {
            return g;
        }
        DC dc2 = null;
        ?? r9 = 0;
        DC dc3 = null;
        DC dc4 = null;
        if (i2 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new C4405qY(null, objArrCopyOf, 1);
        }
        FW.q(i2, objArrCopyOf.length >> 1);
        int iH = KC.h(i);
        if (i2 != 1) {
            int i3 = iH - 1;
            byte b = -1;
            if (iH <= 128) {
                byte[] bArr = new byte[iH];
                Arrays.fill(bArr, (byte) -1);
                int i4 = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i5 * 2;
                    int i7 = i4 * 2;
                    Object obj = objArrCopyOf[i6];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArrCopyOf[i6 ^ 1];
                    Objects.requireNonNull(obj2);
                    int iB0 = FW.b0(obj.hashCode());
                    while (true) {
                        int i8 = iB0 & i3;
                        int i9 = bArr[i8] & 255;
                        if (i9 == 255) {
                            bArr[i8] = (byte) i7;
                            if (i4 < i5) {
                                objArrCopyOf[i7] = obj;
                                objArrCopyOf[i7 ^ 1] = obj2;
                            }
                            i4++;
                            break;
                        }
                        if (obj.equals(objArrCopyOf[i9 == true ? 1 : 0])) {
                            int i10 = ~i9;
                            Object obj3 = objArrCopyOf[i10 == true ? 1 : 0];
                            Objects.requireNonNull(obj3);
                            DC dc5 = new DC(obj, obj2, obj3);
                            objArrCopyOf[i10 == true ? 1 : 0] = obj2;
                            dc3 = dc5;
                            break;
                        }
                        iB0 = i8 + 1;
                    }
                }
                if (i4 == i2) {
                    r9 = bArr;
                } else {
                    c = 2;
                    r3 = new Object[]{bArr, Integer.valueOf(i4), dc3};
                    r7 = r3;
                }
            } else if (iH <= 32768) {
                sArr = new short[iH];
                Arrays.fill(sArr, (short) -1);
                int i11 = 0;
                for (int i12 = 0; i12 < i2; i12++) {
                    int i13 = i12 * 2;
                    int i14 = i11 * 2;
                    Object obj4 = objArrCopyOf[i13];
                    Objects.requireNonNull(obj4);
                    Object obj5 = objArrCopyOf[i13 ^ 1];
                    Objects.requireNonNull(obj5);
                    int iB1 = FW.b0(obj4.hashCode());
                    while (true) {
                        int i15 = iB1 & i3;
                        int i16 = sArr[i15] & 65535;
                        if (i16 == 65535) {
                            sArr[i15] = (short) i14;
                            if (i11 < i12) {
                                objArrCopyOf[i14] = obj4;
                                objArrCopyOf[i14 ^ 1] = obj5;
                            }
                            i11++;
                            break;
                        }
                        if (obj4.equals(objArrCopyOf[i16 == true ? 1 : 0])) {
                            int i17 = ~i16;
                            Object obj6 = objArrCopyOf[i17 == true ? 1 : 0];
                            Objects.requireNonNull(obj6);
                            dc4 = new DC(obj4, obj5, obj6);
                            objArrCopyOf[i17 == true ? 1 : 0] = obj5;
                            break;
                        }
                        iB1 = i15 + 1;
                    }
                }
                if (i11 != i2) {
                    c = 2;
                    r3 = new Object[]{sArr, Integer.valueOf(i11), dc4};
                    r7 = r3;
                }
                r9 = sArr;
            } else {
                sArr = new int[iH];
                Arrays.fill((int[]) sArr, -1);
                int i18 = 0;
                int i19 = 0;
                while (i18 < i2) {
                    int i20 = i18 * 2;
                    int i21 = i19 * 2;
                    Object obj7 = objArrCopyOf[i20];
                    Objects.requireNonNull(obj7);
                    Object obj8 = objArrCopyOf[i20 ^ 1];
                    Objects.requireNonNull(obj8);
                    int iB2 = FW.b0(obj7.hashCode());
                    while (true) {
                        int i22 = iB2 & i3;
                        ?? r15 = sArr[i22];
                        if (r15 == b) {
                            sArr[i22] = i21;
                            if (i19 < i18) {
                                objArrCopyOf[i21] = obj7;
                                objArrCopyOf[i21 ^ 1] = obj8;
                            }
                            i19++;
                            break;
                        }
                        if (obj7.equals(objArrCopyOf[r15])) {
                            int i23 = r15 ^ 1;
                            Object obj9 = objArrCopyOf[i23 == true ? 1 : 0];
                            Objects.requireNonNull(obj9);
                            dc2 = new DC(obj7, obj8, obj9);
                            objArrCopyOf[i23 == true ? 1 : 0] = obj8;
                            break;
                        }
                        iB2 = i22 + 1;
                        b = -1;
                    }
                    i18++;
                    b = -1;
                }
                if (i19 != i2) {
                    c = 2;
                    r3 = new Object[]{sArr, Integer.valueOf(i19), dc2};
                    r7 = r3;
                }
                r9 = sArr;
            }
            z = r7 instanceof Object[];
            r8 = r7;
            if (z) {
                objArr2 = (Object[]) r7;
                dc = (DC) objArr2[c];
                if (ec != null) {
                    throw dc.a();
                }
                ec.c = dc;
                Object obj10 = objArr2[0];
                int iIntValue = ((Integer) objArr2[1]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue * 2);
                r8 = obj10;
                i2 = iIntValue;
            }
            return new C4405qY(r8, objArrCopyOf, i2);
        }
        Objects.requireNonNull(objArrCopyOf[0]);
        Objects.requireNonNull(objArrCopyOf[1]);
        c = 2;
        r7 = r9;
        z = r7 instanceof Object[];
        r8 = r7;
        if (z) {
            objArr2 = (Object[]) r7;
            dc = (DC) objArr2[c];
            if (ec != null) {
                throw dc.a();
            }
            ec.c = dc;
            Object obj11 = objArr2[0];
            int iIntValue2 = ((Integer) objArr2[1]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 * 2);
            r8 = obj11;
            i2 = iIntValue2;
        }
        return new C4405qY(r8, objArrCopyOf, i2);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FC, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.e;
            if (this.f == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.d;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iB0 = FW.b0(obj.hashCode());
                    while (true) {
                        int i = iB0 & length;
                        int i2 = bArr[i] & 255;
                        if (i2 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i2])) {
                            obj2 = objArr[i2 ^ 1];
                        } else {
                            iB0 = i + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iB1 = FW.b0(obj.hashCode());
                    while (true) {
                        int i3 = iB1 & length2;
                        int i4 = sArr[i3] & 65535;
                        if (i4 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i4])) {
                            obj2 = objArr[i4 ^ 1];
                        } else {
                            iB1 = i3 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iB2 = FW.b0(obj.hashCode());
                    while (true) {
                        int i5 = iB2 & length3;
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i6])) {
                            obj2 = objArr[i6 ^ 1];
                        } else {
                            iB2 = i5 + 1;
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
        return this.f;
    }
}
