package cloop;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: ChaCha20Poly1305Jce.java */
/* JADX INFO: loaded from: classes3.dex */
public final class gintrap implements discernable.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final SecretKey f15668attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Provider f15669dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final byte[] f15670saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f15667wireman = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final byte[] f15666marial = affiche.formularize.attabal("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final byte[] f15664beachfront = affiche.formularize.attabal("070000004041424344454647");

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final byte[] f15665competently = affiche.formularize.attabal("a0784d7a4716f3feb4f64e7f4b39bf04");

    public gintrap(byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!f15667wireman.isCompatible()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f15668attabal = new SecretKeySpec(bArr, "ChaCha20");
        this.f15670saneness = bArr2;
        this.f15669dern = provider;
    }

    public static boolean beachfront(Cipher cipher) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f15664beachfront);
            byte[] bArr = f15666marial;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f15665competently;
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            return cipher.doFinal(bArr2).length == 0;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public static Cipher dern(Provider provider) throws GeneralSecurityException {
        return Cipher.getInstance("ChaCha20-Poly1305", provider);
    }

    public static boolean marial() {
        try {
            wireman();
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public static discernable.attabal saneness(curiousness.cuirassed cuirassedVar) throws GeneralSecurityException {
        return new gintrap(cuirassedVar.marial().wireman(discernable.beachfront.attabal()), cuirassedVar.dern().wireman(), wireman().getProvider());
    }

    public static Cipher wireman() throws GeneralSecurityException {
        Cipher cipherAttabal = affiche.cutely.f3861saneness.attabal("ChaCha20-Poly1305");
        if (beachfront(cipherAttabal)) {
            return cipherAttabal;
        }
        throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
    }

    @Override // discernable.attabal
    public byte[] attabal(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f15670saneness;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!hobby.creditor.marial(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, this.f15670saneness.length, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Cipher cipherDern = dern(this.f15669dern);
        cipherDern.init(2, this.f15668attabal, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipherDern.updateAAD(bArr2);
        }
        byte[] bArr5 = this.f15670saneness;
        return cipherDern.doFinal(bArr, bArr5.length + 12, (bArr.length - bArr5.length) - 12);
    }
}
