package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ih1 extends jh1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15755c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ih1(byte[] bArr, int i10, int i11) {
        super(bArr, i10, 0);
        this.f15755c = i11;
    }

    @Override // com.google.android.gms.internal.ads.jh1
    public final int[] e(int i10, int[] iArr) {
        switch (this.f15755c) {
            case 0:
                int length = iArr.length;
                if (length != 3) {
                    throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
                }
                int[] iArr2 = new int[16];
                int[] iArr3 = hh1.f15293a;
                int length2 = iArr3.length;
                System.arraycopy(iArr3, 0, iArr2, 0, length2);
                System.arraycopy(this.f16098a, 0, iArr2, length2, 8);
                iArr2[12] = i10;
                System.arraycopy(iArr, 0, iArr2, 13, 3);
                return iArr2;
            default:
                int length3 = iArr.length;
                if (length3 != 6) {
                    throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length3 * 32)));
                }
                int[] iArr4 = new int[16];
                int[] iArrD = hh1.d(this.f16098a, iArr);
                int[] iArr5 = hh1.f15293a;
                int length4 = iArr5.length;
                System.arraycopy(iArr5, 0, iArr4, 0, length4);
                System.arraycopy(iArrD, 0, iArr4, length4, 8);
                iArr4[12] = i10;
                iArr4[13] = 0;
                iArr4[14] = iArr[4];
                iArr4[15] = iArr[5];
                return iArr4;
        }
    }

    @Override // com.google.android.gms.internal.ads.jh1
    public final int f() {
        switch (this.f15755c) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }
}
