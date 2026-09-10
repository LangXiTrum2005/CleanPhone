package xa;

import com.google.android.gms.internal.ads.jh1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends jh1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f53715c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(byte[] bArr, int i10, int i11) {
        super(bArr, i10, 1);
        this.f53715c = i11;
    }

    @Override // com.google.android.gms.internal.ads.jh1
    public final int[] b(int i10, int[] iArr) {
        switch (this.f53715c) {
            case 0:
                if (iArr.length != 3) {
                    throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
                }
                int[] iArr2 = new int[16];
                int[] iArr3 = j.f53714a;
                System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
                System.arraycopy(this.f16098a, 0, iArr2, iArr3.length, 8);
                iArr2[12] = i10;
                System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
                return iArr2;
            default:
                if (iArr.length != 6) {
                    throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
                }
                int[] iArr4 = new int[16];
                int[] iArrB = j.b(this.f16098a, iArr);
                int[] iArr5 = j.f53714a;
                System.arraycopy(iArr5, 0, iArr4, 0, iArr5.length);
                System.arraycopy(iArrB, 0, iArr4, iArr5.length, 8);
                iArr4[12] = i10;
                iArr4[13] = 0;
                iArr4[14] = iArr[4];
                iArr4[15] = iArr[5];
                return iArr4;
        }
    }

    @Override // com.google.android.gms.internal.ads.jh1
    public final int c() {
        switch (this.f53715c) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }
}
