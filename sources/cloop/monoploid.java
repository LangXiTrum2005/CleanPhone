package cloop;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: AesGcmSiv.java */
/* JADX INFO: loaded from: classes3.dex */
public final class monoploid implements discernable.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final attabal<Cipher> f15692attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final byte[] f15693dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final SecretKey f15694saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final byte[] f15691wireman = affiche.formularize.attabal("7a806c");

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final byte[] f15690marial = affiche.formularize.attabal("46bb91c3c5");

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final byte[] f15687beachfront = affiche.formularize.attabal("36864200e0eaf5284d884a0e77d31646");

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final byte[] f15688competently = affiche.formularize.attabal("bae8e37fc83441b16034566b");

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final byte[] f15689impromptu = affiche.formularize.attabal("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* JADX INFO: compiled from: AesGcmSiv.java */
    public interface attabal<T> {
        T get() throws GeneralSecurityException;
    }

    public monoploid(byte[] bArr, byte[] bArr2, attabal<Cipher> attabalVar) throws GeneralSecurityException {
        this.f15693dern = bArr2;
        affiche.gintrap.attabal(bArr.length);
        this.f15694saneness = new SecretKeySpec(bArr, "AES");
        this.f15692attabal = attabalVar;
    }

    public static AlgorithmParameterSpec dern(byte[] bArr) {
        return wireman(bArr, 0, bArr.length);
    }

    public static boolean marial(Cipher cipher) {
        try {
            cipher.init(2, new SecretKeySpec(f15687beachfront, "AES"), dern(f15688competently));
            cipher.updateAAD(f15690marial);
            byte[] bArr = f15689impromptu;
            return affiche.marial.saneness(cipher.doFinal(bArr, 0, bArr.length), f15691wireman);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public static discernable.attabal saneness(curiousness.dovishness dovishnessVar, attabal<Cipher> attabalVar) throws GeneralSecurityException {
        if (marial(attabalVar.get())) {
            return new monoploid(dovishnessVar.marial().wireman(discernable.beachfront.attabal()), dovishnessVar.dern().wireman(), attabalVar);
        }
        throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
    }

    public static AlgorithmParameterSpec wireman(byte[] bArr, int i, int i2) {
        return new GCMParameterSpec(128, bArr, i, i2);
    }

    @Override // discernable.attabal
    public byte[] attabal(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f15693dern;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!hobby.creditor.marial(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = this.f15692attabal.get();
        cipher.init(2, this.f15694saneness, wireman(bArr, this.f15693dern.length, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        byte[] bArr4 = this.f15693dern;
        return cipher.doFinal(bArr, bArr4.length + 12, (bArr.length - bArr4.length) - 12);
    }
}
