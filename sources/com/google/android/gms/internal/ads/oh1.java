package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class oh1 implements xe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f18273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ok1 f18275c;

    public oh1(byte[] bArr, zq1 zq1Var, int i10) {
        this.f18275c = zw1.i(mk1.j(nk1.b(bArr.length), new uo0(zq1.a(bArr), 13)));
        this.f18273a = zq1Var.b();
        this.f18274b = i10;
    }

    @Override // com.google.android.gms.internal.ads.xe1
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f18273a;
        int length2 = bArr3.length;
        int i10 = this.f18274b + length2;
        int i11 = i10 + 28;
        if (length < i11) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!rj1.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i10);
        byte[] bArr4 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr5 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length3 = bArrCopyOfRange.length;
        if (length3 > 12 || length3 < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArrCopyOfRange, 0, bArr4, 4, length3);
        System.arraycopy(bArrCopyOfRange, 0, bArr5, 4, length3);
        byte[] bArr6 = new byte[32];
        ok1 ok1Var = this.f18275c;
        System.arraycopy(ok1Var.a(16, bArr4), 0, bArr6, 0, 16);
        System.arraycopy(ok1Var.a(16, bArr5), 0, bArr6, 16, 16);
        if (!jc1.e(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        co.c cVar = bh1.f12778a;
        ic1.c(32);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr6, "AES");
        int i12 = i10 + 12;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i10, i12);
        if (bArrCopyOfRange2.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (length < i11) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Objects.equals(System.getProperty("java.vendor"), "The Android Project");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArrCopyOfRange2, 0, 12);
        Cipher cipher = (Cipher) bh1.f12778a.get();
        cipher.init(2, secretKeySpec, gCMParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, i12, length - i12);
    }
}
