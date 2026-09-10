package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class lh1 implements xe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f16993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16994c;

    public lh1(xe1 xe1Var, byte[] bArr) {
        this.f16992a = 0;
        this.f16994c = xe1Var;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f16993b = bArr;
    }

    @Override // com.google.android.gms.internal.ads.xe1
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i10 = this.f16992a;
        Object obj = this.f16994c;
        byte[] bArr3 = this.f16993b;
        switch (i10) {
            case 0:
                xe1 xe1Var = (xe1) obj;
                if (bArr3.length == 0) {
                    return xe1Var.a(bArr, bArr2);
                }
                if (rj1.c(bArr3, bArr)) {
                    return xe1Var.a(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("wrong prefix");
            case 1:
                if (bArr == null) {
                    throw new NullPointerException("ciphertext is null");
                }
                int length = bArr.length;
                int length2 = bArr3.length;
                if (length < length2 + 28) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                if (!rj1.c(bArr3, bArr)) {
                    throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                }
                co.c cVar = bh1.f12778a;
                Objects.equals(System.getProperty("java.vendor"), "The Android Project");
                GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, length2, 12);
                Cipher cipher = (Cipher) bh1.f12778a.get();
                cipher.init(2, (SecretKeySpec) obj, gCMParameterSpec);
                if (bArr2 != null && bArr2.length != 0) {
                    cipher.updateAAD(bArr2);
                }
                return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
            case 2:
                int length3 = bArr3.length;
                if (length3 == 0) {
                    return b(bArr, bArr2);
                }
                if (rj1.c(bArr3, bArr)) {
                    return b(Arrays.copyOfRange(bArr, length3, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            default:
                int length4 = bArr3.length;
                if (length4 == 0) {
                    return c(bArr, bArr2);
                }
                if (rj1.c(bArr3, bArr)) {
                    return c(Arrays.copyOfRange(bArr, length4, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
    }

    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return ((kh1) this.f16994c).p(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }

    public byte[] c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return ((kh1) this.f16994c).p(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
    }

    public lh1(byte[] bArr, int i10, byte[] bArr2) {
        this.f16992a = i10;
        switch (i10) {
            case 3:
                this.f16994c = new kh1(bArr, 1);
                this.f16993b = bArr2;
                break;
            default:
                this.f16994c = new kh1(bArr, 0);
                this.f16993b = bArr2;
                break;
        }
    }

    public lh1(byte[] bArr, zq1 zq1Var) throws GeneralSecurityException {
        this.f16992a = 1;
        if (jc1.e(2)) {
            co.c cVar = bh1.f12778a;
            ic1.c(bArr.length);
            this.f16994c = new SecretKeySpec(bArr, "AES");
            this.f16993b = zq1Var.b();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
