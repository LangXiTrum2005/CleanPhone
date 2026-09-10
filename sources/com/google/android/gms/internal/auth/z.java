package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ z f22929a = new z();

    public static boolean a(byte[] bArr, int i10, int i11) {
        int iA;
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 >= i11) {
            iA = 0;
            break;
        }
        while (true) {
            if (i10 >= i11) {
                iA = 0;
                break;
            }
            int i12 = i10 + 1;
            iA = bArr[i10];
            if (iA < 0) {
                if (iA >= -32) {
                    if (iA >= -16) {
                        if (i12 < i11 - 2) {
                            int i13 = i10 + 2;
                            byte b10 = bArr[i12];
                            if (b10 <= -65) {
                                if ((((b10 + 112) + (iA << 28)) >> 30) == 0) {
                                    int i14 = i10 + 3;
                                    if (bArr[i13] <= -65) {
                                        i10 += 4;
                                        if (bArr[i14] > -65) {
                                        }
                                    }
                                }
                            }
                            iA = -1;
                            break;
                        }
                        iA = y1.a(bArr, i12, i11);
                        break;
                    }
                    if (i12 < i11 - 1) {
                        int i15 = i10 + 2;
                        byte b11 = bArr[i12];
                        if (b11 <= -65 && ((iA != -32 || b11 >= -96) && (iA != -19 || b11 < -96))) {
                            i10 += 3;
                            if (bArr[i15] > -65) {
                            }
                        }
                        iA = -1;
                        break;
                    }
                    iA = y1.a(bArr, i12, i11);
                    break;
                }
                if (i12 >= i11) {
                    break;
                }
                if (iA >= -62) {
                    i10 += 2;
                    if (bArr[i12] > -65) {
                    }
                }
                iA = -1;
                break;
            }
            i10 = i12;
        }
        return iA == 0;
    }

    @Override // com.google.android.gms.internal.auth.x
    public Object zza() {
        throw new IllegalStateException();
    }
}
