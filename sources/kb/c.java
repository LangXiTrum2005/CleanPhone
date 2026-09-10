package kb;

import eb.e0;
import eb.j0;
import eb.w;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements va.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f44557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f44558c;

    public c(byte[] bArr, int i10, byte[] bArr2) {
        this.f44556a = i10;
        switch (i10) {
            case 2:
                this.f44558c = new xa.l(bArr, 1);
                this.f44557b = bArr2;
                break;
            default:
                this.f44558c = new xa.l(bArr, 0);
                this.f44557b = bArr2;
                break;
        }
    }

    @Override // va.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f44556a) {
            case 0:
                byte[] bArr3 = (byte[]) this.f44557b;
                if (bArr == null) {
                    throw new NullPointerException("plaintext is null");
                }
                byte[] bArrA = e0.a(12);
                AlgorithmParameterSpec algorithmParameterSpecA = xa.d.a(bArrA, 0, bArrA.length);
                Cipher cipher = (Cipher) xa.d.f53687a.get();
                cipher.init(1, (SecretKeySpec) this.f44558c, algorithmParameterSpecA);
                if (bArr2 != null && bArr2.length != 0) {
                    cipher.updateAAD(bArr2);
                }
                int outputSize = cipher.getOutputSize(bArr.length);
                if (outputSize > 2147483635 - bArr3.length) {
                    throw new GeneralSecurityException("plaintext too long");
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
                System.arraycopy(bArrA, 0, bArrCopyOf, bArr3.length, 12);
                if (cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr3.length + 12) == outputSize) {
                    return bArrCopyOf;
                }
                throw new GeneralSecurityException("not enough data written");
            case 1:
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
                byte[] bArrA2 = e0.a(12);
                byteBufferAllocate.put(bArrA2);
                ((xa.l) this.f44558c).f(byteBufferAllocate, bArrA2, bArr, bArr2);
                byte[] bArrArray = byteBufferAllocate.array();
                byte[] bArr4 = (byte[]) this.f44557b;
                return bArr4.length == 0 ? bArrArray : x7.a.k(bArr4, bArrArray);
            case 2:
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArr.length + 40);
                byte[] bArrA3 = e0.a(24);
                byteBufferAllocate2.put(bArrA3);
                ((xa.l) this.f44558c).f(byteBufferAllocate2, bArrA3, bArr, bArr2);
                byte[] bArrArray2 = byteBufferAllocate2.array();
                byte[] bArr5 = (byte[]) this.f44557b;
                return bArr5.length == 0 ? bArrArray2 : x7.a.k(bArr5, bArrArray2);
            case 3:
                va.a aVar = (va.a) this.f44558c;
                byte[] bArr6 = (byte[]) this.f44557b;
                return bArr6.length == 0 ? aVar.a(bArr, bArr2) : x7.a.k(bArr6, aVar.a(bArr, bArr2));
            default:
                byte[] bArrA4 = ((xa.m) this.f44558c).f53717a.a(bArr, bArr2);
                int length = bArr.length;
                return bArrA4;
        }
    }

    @Override // va.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f44556a) {
            case 0:
                byte[] bArr3 = (byte[]) this.f44557b;
                if (bArr == null) {
                    throw new NullPointerException("ciphertext is null");
                }
                if (bArr.length < bArr3.length + 28) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                if (!j0.b(bArr3, bArr)) {
                    throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                }
                AlgorithmParameterSpec algorithmParameterSpecA = xa.d.a(bArr, bArr3.length, 12);
                Cipher cipher = (Cipher) xa.d.f53687a.get();
                cipher.init(2, (SecretKeySpec) this.f44558c, algorithmParameterSpecA);
                if (bArr2 != null && bArr2.length != 0) {
                    cipher.updateAAD(bArr2);
                }
                return cipher.doFinal(bArr, bArr3.length + 12, (bArr.length - bArr3.length) - 12);
            case 1:
                byte[] bArr4 = (byte[]) this.f44557b;
                if (bArr4.length == 0) {
                    return c(bArr, bArr2);
                }
                if (j0.b(bArr4, bArr)) {
                    return c(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            case 2:
                byte[] bArr5 = (byte[]) this.f44557b;
                if (bArr5.length == 0) {
                    return d(bArr, bArr2);
                }
                if (j0.b(bArr5, bArr)) {
                    return d(Arrays.copyOfRange(bArr, bArr5.length, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            case 3:
                va.a aVar = (va.a) this.f44558c;
                byte[] bArr6 = (byte[]) this.f44557b;
                if (bArr6.length == 0) {
                    return aVar.b(bArr, bArr2);
                }
                if (j0.b(bArr6, bArr)) {
                    return aVar.b(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("wrong prefix");
            default:
                Iterator it = ((w) this.f44557b).a(bArr).iterator();
                while (it.hasNext()) {
                    try {
                        return ((xa.m) it.next()).f53717a.b(bArr, bArr2);
                    } catch (GeneralSecurityException unused) {
                    }
                }
                throw new GeneralSecurityException("decryption failed");
        }
    }

    public byte[] c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        return ((xa.l) this.f44558c).e(ByteBuffer.wrap(bArr, 12, bArr.length - 12), bArrCopyOf, bArr2);
    }

    public byte[] d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 24);
        return ((xa.l) this.f44558c).e(ByteBuffer.wrap(bArr, 24, bArr.length - 24), bArrCopyOf, bArr2);
    }

    public c(byte[] bArr, lb.a aVar) throws GeneralSecurityException {
        this.f44556a = 0;
        if (defpackage.e.d(2)) {
            co.c cVar = xa.d.f53687a;
            m.a(bArr.length);
            this.f44558c = new SecretKeySpec(bArr, "AES");
            this.f44557b = aVar.b();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public c(xa.m mVar, w wVar) {
        this.f44556a = 4;
        this.f44558c = mVar;
        this.f44557b = wVar;
    }

    public c(va.a aVar, byte[] bArr) {
        this.f44556a = 3;
        this.f44558c = aVar;
        if (bArr.length != 0 && bArr.length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f44557b = bArr;
    }
}
