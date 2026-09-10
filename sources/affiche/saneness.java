package affiche;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import hobby.creditor;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: AesEaxJce.java */
/* JADX INFO: loaded from: classes3.dex */
public final class saneness implements discernable.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final byte[] f3908attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final SecretKeySpec f3909dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final larchwood.dern f3910saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f3911wireman;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f3907marial = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final ThreadLocal<Cipher> f3906beachfront = new attabal();

    /* JADX INFO: compiled from: AesEaxJce.java */
    public class attabal extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return cutely.f3861saneness.attabal("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public saneness(byte[] bArr, int i, byte[] bArr2) throws GeneralSecurityException {
        if (!f3907marial.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f3911wireman = i;
        gintrap.attabal(bArr.length);
        this.f3909dern = new SecretKeySpec(bArr, "AES");
        this.f3910saneness = dern(bArr);
        this.f3908attabal = bArr2;
    }

    private static larchwood.dern dern(byte[] bArr) throws GeneralSecurityException {
        return triweekly.saneness(larchwood.attabal.dern(larchwood.saneness.saneness(bArr.length), ebullioscopic.dern.attabal(bArr, discernable.beachfront.attabal())));
    }

    public static discernable.attabal saneness(curiousness.formularize formularizeVar) throws GeneralSecurityException {
        if (!f3907marial.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (formularizeVar.saneness().marial() == 16) {
            return new saneness(formularizeVar.marial().wireman(discernable.beachfront.attabal()), formularizeVar.saneness().dern(), formularizeVar.dern().wireman());
        }
        throw new GeneralSecurityException("AesEaxJce only supports 16 byte tag size, not " + formularizeVar.saneness().marial());
    }

    @Override // discernable.attabal
    public byte[] attabal(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f3908attabal;
        int length2 = ((length - bArr3.length) - this.f3911wireman) - 16;
        if (length2 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!creditor.marial(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrWireman = wireman(0, bArr, this.f3908attabal.length, this.f3911wireman);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrWireman2 = wireman(1, bArr2, 0, bArr2.length);
        byte[] bArrWireman3 = wireman(2, bArr, this.f3908attabal.length + this.f3911wireman, length2);
        int length3 = bArr.length - 16;
        byte b = 0;
        for (int i = 0; i < 16; i++) {
            b = (byte) (b | (((bArr[length3 + i] ^ bArrWireman2[i]) ^ bArrWireman[i]) ^ bArrWireman3[i]));
        }
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = f3906beachfront.get();
        cipher.init(1, this.f3909dern, new IvParameterSpec(bArrWireman));
        return cipher.doFinal(bArr, this.f3908attabal.length + this.f3911wireman, length2);
    }

    public final byte[] wireman(int i, byte[] bArr, int i2, int i3) throws GeneralSecurityException {
        byte[] bArr2 = new byte[i3 + 16];
        bArr2[15] = (byte) i;
        System.arraycopy(bArr, i2, bArr2, 16, i3);
        return this.f3910saneness.attabal(bArr2, 16);
    }
}
