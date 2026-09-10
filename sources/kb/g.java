package kb;

import eb.e0;
import eb.j0;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements va.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f44568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f44569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f44571d;

    public g(a aVar, l lVar, int i10, byte[] bArr) {
        this.f44568a = aVar;
        this.f44569b = lVar;
        this.f44570c = i10;
        this.f44571d = bArr;
    }

    @Override // va.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        a aVar = this.f44568a;
        int i10 = aVar.f44549b;
        int i11 = Integer.MAX_VALUE - i10;
        if (length > i11) {
            throw new GeneralSecurityException(l1.d.e(i11, "plaintext length can not exceed "));
        }
        byte[] bArr3 = new byte[bArr.length + i10];
        byte[] bArrA = e0.a(i10);
        System.arraycopy(bArrA, 0, bArr3, 0, i10);
        aVar.a(bArr, 0, bArr.length, bArr3, aVar.f44549b, bArrA, true);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return x7.a.k(this.f44571d, bArr3, this.f44569b.a(x7.a.k(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    @Override // va.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f44571d;
        int length2 = bArr3.length;
        int i10 = this.f44570c;
        if (length < length2 + i10) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!j0.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr3.length, bArr.length - i10);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i10, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (!MessageDigest.isEqual(this.f44569b.a(x7.a.k(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))), bArrCopyOfRange2)) {
            throw new GeneralSecurityException("invalid MAC");
        }
        int length3 = bArrCopyOfRange.length;
        a aVar = this.f44568a;
        int i11 = aVar.f44549b;
        if (length3 < i11) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr4 = new byte[i11];
        System.arraycopy(bArrCopyOfRange, 0, bArr4, 0, i11);
        int length4 = bArrCopyOfRange.length;
        int i12 = aVar.f44549b;
        byte[] bArr5 = new byte[length4 - i12];
        aVar.a(bArrCopyOfRange, i12, bArrCopyOfRange.length - i12, bArr5, 0, bArr4, false);
        return bArr5;
    }
}
