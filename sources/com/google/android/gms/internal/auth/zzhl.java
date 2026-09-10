package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class zzhl extends zzhk {
    @Override // com.google.android.gms.internal.auth.zzhk
    public final int zza(int i2, byte[] bArr, int i3, int i4) {
        while (i3 < i4 && bArr[i3] >= 0) {
            i3++;
        }
        if (i3 >= i4) {
            return 0;
        }
        while (i3 < i4) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                i3 = i5;
            } else {
                if (b2 < -32) {
                    if (i5 >= i4) {
                        return b2;
                    }
                    if (b2 >= -62) {
                        i3 += 2;
                        if (bArr[i5] > -65) {
                        }
                    }
                    return -1;
                }
                if (b2 >= -16) {
                    if (i5 >= i4 - 2) {
                        return zzhm.zza(bArr, i5, i4);
                    }
                    int i6 = i3 + 2;
                    byte b3 = bArr[i5];
                    if (b3 <= -65) {
                        if ((((b3 + 112) + (b2 << 28)) >> 30) == 0) {
                            int i7 = i3 + 3;
                            if (bArr[i6] <= -65) {
                                i3 += 4;
                                if (bArr[i7] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                if (i5 >= i4 - 1) {
                    return zzhm.zza(bArr, i5, i4);
                }
                int i8 = i3 + 2;
                byte b4 = bArr[i5];
                if (b4 > -65 || (b2 == -32 && b4 < -96)) {
                    return -1;
                }
                if (b2 == -19 && b4 >= -96) {
                    return -1;
                }
                i3 += 3;
                if (bArr[i8] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
