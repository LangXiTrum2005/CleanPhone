package cloop;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import curiousness.underbelly;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: XChaCha20Poly1305Jce.java */
/* JADX INFO: loaded from: classes3.dex */
public final class walach implements discernable.attabal {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f15712wireman = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final byte[] f15713attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Provider f15714dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final byte[] f15715saneness;

    public walach(byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!f15712wireman.isCompatible()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f15713attabal = bArr;
        this.f15715saneness = bArr2;
        this.f15714dern = provider;
    }

    public static byte[] dern(byte[] bArr) {
        byte[] bArr2 = new byte[12];
        System.arraycopy(bArr, 16, bArr2, 4, 8);
        return bArr2;
    }

    public static discernable.attabal saneness(underbelly underbellyVar) throws GeneralSecurityException {
        return new walach(underbellyVar.marial().wireman(discernable.beachfront.attabal()), underbellyVar.dern().wireman(), gintrap.wireman().getProvider());
    }

    public static boolean wireman() {
        return gintrap.marial();
    }

    @Override // discernable.attabal
    public byte[] attabal(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f15715saneness;
        if (length < bArr3.length + 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!hobby.creditor.marial(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, this.f15715saneness.length, bArr4, 0, 24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(trm.attabal(this.f15713attabal, bArr4), "ChaCha20");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(dern(bArr4));
        Cipher cipherDern = gintrap.dern(this.f15714dern);
        cipherDern.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipherDern.updateAAD(bArr2);
        }
        byte[] bArr5 = this.f15715saneness;
        return cipherDern.doFinal(bArr, bArr5.length + 24, (bArr.length - bArr5.length) - 24);
    }
}
