package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgvd extends zzgtg {
    static final zzgtg zza = new zzgvd(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzgvd(Object obj, Object[] objArr, int i2) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i2;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ce  */
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
    public static zzgvd zzk(int i2, Object[] objArr, zzgtf zzgtfVar) {
        boolean z2;
        int i3;
        char c2;
        ?? r3;
        char c3;
        short[] sArr;
        boolean z3;
        int i4;
        ?? r16;
        boolean z4;
        ?? r4;
        Object[] objArr2;
        zzgte zzgteVar;
        boolean z5;
        int i5 = i2;
        Object[] objArrCopyOf = objArr;
        if (i5 == 0) {
            return (zzgvd) zza;
        }
        zzgte zzgteVar2 = null;
        ?? r5 = 0;
        zzgte zzgteVar3 = null;
        zzgte zzgteVar4 = null;
        boolean z6 = false;
        int i6 = 1;
        if (i5 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            zzgrz.zza(obj, obj2);
            return new zzgvd(null, objArrCopyOf, 1);
        }
        zzgqa.zzn(i5, objArrCopyOf.length >> 1, "index");
        int iZzn = zzgtn.zzn(i5);
        char c4 = 2;
        if (i5 != 1) {
            int i7 = iZzn - 1;
            if (iZzn <= 128) {
                byte[] bArr = new byte[iZzn];
                Arrays.fill(bArr, (byte) -1);
                int i8 = 0;
                int i9 = 0;
                while (i8 < i5) {
                    int i10 = i9 + i9;
                    int i11 = i8 + i8;
                    Object obj3 = objArrCopyOf[i11];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArrCopyOf[i11 ^ i6];
                    Objects.requireNonNull(obj4);
                    zzgrz.zza(obj3, obj4);
                    int iZza = zzgsw.zza(obj3.hashCode());
                    while (true) {
                        int i12 = iZza & i7;
                        z3 = z6;
                        i4 = i6;
                        int i13 = bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        if (i13 == 255) {
                            bArr[i12] = (byte) i10;
                            if (i9 < i8) {
                                objArrCopyOf[i10] = obj3;
                                objArrCopyOf[i10 ^ 1] = obj4;
                            }
                            i9++;
                            break;
                        }
                        if (obj3.equals(objArrCopyOf[i13 == true ? 1 : 0])) {
                            int i14 = ~i13;
                            Object obj5 = objArrCopyOf[i14 == true ? 1 : 0];
                            Objects.requireNonNull(obj5);
                            zzgte zzgteVar5 = new zzgte(obj3, obj4, obj5);
                            objArrCopyOf[i14 == true ? 1 : 0] = obj4;
                            zzgteVar3 = zzgteVar5;
                            break;
                        }
                        iZza = i12 + 1;
                        z6 = z3;
                        i6 = i4;
                    }
                    i8++;
                    z6 = z3;
                    i6 = i4;
                }
                z2 = z6;
                i3 = i6;
                if (i9 == i5) {
                    r5 = bArr;
                    z5 = z2;
                } else {
                    sArr = new Object[3];
                    sArr[z2 ? 1 : 0] = bArr;
                    sArr[i3] = Integer.valueOf(i9);
                    sArr[2] = zzgteVar3;
                    r5 = sArr;
                    z5 = z2;
                }
            } else {
                z2 = false;
                i3 = 1;
                if (iZzn <= 32768) {
                    sArr = new short[iZzn];
                    Arrays.fill(sArr, (short) -1);
                    int i15 = 0;
                    for (int i16 = 0; i16 < i5; i16++) {
                        int i17 = i15 + i15;
                        int i18 = i16 + i16;
                        Object obj6 = objArrCopyOf[i18];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArrCopyOf[i18 ^ 1];
                        Objects.requireNonNull(obj7);
                        zzgrz.zza(obj6, obj7);
                        int iZza2 = zzgsw.zza(obj6.hashCode());
                        while (true) {
                            int i19 = iZza2 & i7;
                            char c5 = (char) sArr[i19];
                            if (c5 == 65535) {
                                sArr[i19] = (short) i17;
                                if (i15 < i16) {
                                    objArrCopyOf[i17] = obj6;
                                    objArrCopyOf[i17 ^ 1] = obj7;
                                }
                                i15++;
                                break;
                            }
                            if (obj6.equals(objArrCopyOf[c5])) {
                                int i20 = c5 ^ 1;
                                Object obj8 = objArrCopyOf[i20 == true ? 1 : 0];
                                Objects.requireNonNull(obj8);
                                zzgte zzgteVar6 = new zzgte(obj6, obj7, obj8);
                                objArrCopyOf[i20 == true ? 1 : 0] = obj7;
                                zzgteVar4 = zzgteVar6;
                                break;
                            }
                            iZza2 = i19 + 1;
                        }
                    }
                    if (i15 == i5) {
                        r5 = sArr;
                        z5 = z2;
                    } else {
                        r5 = new Object[]{sArr, Integer.valueOf(i15), zzgteVar4};
                        z5 = z2;
                    }
                } else {
                    int[] iArr = new int[iZzn];
                    Arrays.fill(iArr, -1);
                    int i21 = 0;
                    int i22 = 0;
                    while (i21 < i5) {
                        int i23 = i22 + i22;
                        int i24 = i21 + i21;
                        Object obj9 = objArrCopyOf[i24];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArrCopyOf[i24 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzgrz.zza(obj9, obj10);
                        int iZza3 = zzgsw.zza(obj9.hashCode());
                        while (true) {
                            int i25 = iZza3 & i7;
                            int i26 = iArr[i25];
                            if (i26 == -1) {
                                iArr[i25] = i23;
                                if (i22 < i21) {
                                    objArrCopyOf[i23] = obj9;
                                    objArrCopyOf[i23 ^ 1] = obj10;
                                }
                                i22++;
                                c3 = c4;
                                break;
                            }
                            c3 = c4;
                            if (obj9.equals(objArrCopyOf[i26])) {
                                int i27 = i26 ^ 1;
                                Object obj11 = objArrCopyOf[i27];
                                Objects.requireNonNull(obj11);
                                zzgte zzgteVar7 = new zzgte(obj9, obj10, obj11);
                                objArrCopyOf[i27] = obj10;
                                zzgteVar2 = zzgteVar7;
                                break;
                            }
                            iZza3 = i25 + 1;
                            c4 = c3;
                        }
                        i21++;
                        c4 = c3;
                    }
                    c2 = c4;
                    if (i22 == i5) {
                        r3 = iArr;
                        r16 = z2;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i22);
                        objArr3[c2] = zzgteVar2;
                        r3 = objArr3;
                        r16 = z2;
                    }
                }
            }
            z4 = r3 instanceof Object[];
            r4 = r3;
            if (z4) {
                objArr2 = (Object[]) r3;
                zzgteVar = (zzgte) objArr2[c2];
                if (zzgtfVar != null) {
                    throw zzgteVar.zza();
                }
                zzgtfVar.zzc = zzgteVar;
                Object obj12 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i3]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r4 = obj12;
                i5 = iIntValue;
            }
            return new zzgvd(r4, objArrCopyOf, i5);
        }
        Object obj13 = objArrCopyOf[0];
        Objects.requireNonNull(obj13);
        Object obj14 = objArrCopyOf[1];
        Objects.requireNonNull(obj14);
        zzgrz.zza(obj13, obj14);
        z5 = false;
        i5 = 1;
        i3 = 1;
        c2 = 2;
        r3 = r5;
        r16 = z5;
        z4 = r3 instanceof Object[];
        r4 = r3;
        if (z4) {
            objArr2 = (Object[]) r3;
            zzgteVar = (zzgte) objArr2[c2];
            if (zzgtfVar != null) {
                throw zzgteVar.zza();
            }
            zzgtfVar.zzc = zzgteVar;
            Object obj15 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i3]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r4 = obj15;
            i5 = iIntValue2;
        }
        return new zzgvd(r4, objArrCopyOf, i5);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.ads.zzgtg, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i2 = this.zzd;
            Object[] objArr = this.zzb;
            if (i2 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.zzc;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iZza = zzgsw.zza(obj.hashCode());
                    while (true) {
                        int i3 = iZza & length;
                        int i4 = bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        if (i4 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i4])) {
                            obj2 = objArr[i4 ^ 1];
                        } else {
                            iZza = i3 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iZza2 = zzgsw.zza(obj.hashCode());
                    while (true) {
                        int i5 = iZza2 & length2;
                        char c2 = (char) sArr[i5];
                        if (c2 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c2])) {
                            obj2 = objArr[c2 ^ 1];
                        } else {
                            iZza2 = i5 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iZza3 = zzgsw.zza(obj.hashCode());
                    while (true) {
                        int i6 = iZza3 & length3;
                        int i7 = iArr[i6];
                        if (i7 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i7])) {
                            obj2 = objArr[i7 ^ 1];
                        } else {
                            iZza3 = i6 + 1;
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
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgtg
    public final zzgtn zze() {
        return new zzgva(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgtg
    public final zzgtn zzg() {
        return new zzgvb(this, new zzgvc(this.zzb, 0, this.zzd));
    }

    @Override // com.google.android.gms.internal.ads.zzgtg
    public final zzgsz zzi() {
        return new zzgvc(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgtg
    public final boolean zzj() {
        return false;
    }
}
