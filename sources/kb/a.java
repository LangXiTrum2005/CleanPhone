package kb;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final co.c f44547d = new co.c(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f44548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44550c;

    public a(byte[] bArr, int i10) throws GeneralSecurityException {
        if (!defpackage.e.d(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        m.a(bArr.length);
        this.f44548a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f44547d.get()).getBlockSize();
        this.f44550c = blockSize;
        if (i10 < 12 || i10 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f44549b = i10;
    }

    public final void a(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3, boolean z10) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f44547d.get();
        byte[] bArr4 = new byte[this.f44550c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f44549b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f44548a;
        if (z10) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i10, i11, bArr2, i12) != i11) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
