package supersedeas;

import affiche.cutely;
import affiche.gintrap;
import affiche.marial;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import discernable.beachfront;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import larchwood.dern;

/* JADX INFO: compiled from: PrfAesCmac.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal implements dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final SecretKey f38284attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public byte[] f38285dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public byte[] f38286saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f38283wireman = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final ThreadLocal<Cipher> f38282marial = new C0803attabal();

    /* JADX INFO: renamed from: supersedeas.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PrfAesCmac.java */
    public class C0803attabal extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return cutely.f3861saneness.attabal("AES/ECB/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public attabal(byte[] bArr) throws GeneralSecurityException {
        gintrap.attabal(bArr.length);
        this.f38284attabal = new SecretKeySpec(bArr, "AES");
        wireman();
    }

    public static void beachfront(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        for (int i2 = 0; i2 < 16; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2 + i]);
        }
    }

    public static dern dern(larchwood.attabal attabalVar) throws GeneralSecurityException {
        return new attabal(attabalVar.wireman().wireman(beachfront.attabal()));
    }

    public static Cipher marial() throws GeneralSecurityException {
        if (f38283wireman.isCompatible()) {
            return f38282marial.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    public static int saneness(int i) {
        if (i == 0) {
            return 1;
        }
        return ((i - 1) / 16) + 1;
    }

    @Override // larchwood.dern
    public byte[] attabal(byte[] bArr, int i) throws GeneralSecurityException {
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipherMarial = marial();
        cipherMarial.init(1, this.f38284attabal);
        int iSaneness = saneness(bArr.length);
        byte[] bArrWireman = iSaneness * 16 == bArr.length ? marial.wireman(bArr, (iSaneness - 1) * 16, this.f38286saneness, 0, 16) : marial.marial(ascolichen.beachfront.attabal(Arrays.copyOfRange(bArr, (iSaneness - 1) * 16, bArr.length)), this.f38285dern);
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i2 = 0; i2 < iSaneness - 1; i2++) {
            beachfront(bArr2, bArr, i2 * 16, bArr3);
            if (cipherMarial.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        beachfront(bArr2, bArrWireman, 0, bArr3);
        if (cipherMarial.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return 16 == i ? bArr2 : Arrays.copyOf(bArr2, i);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }

    public final void wireman() throws GeneralSecurityException {
        Cipher cipherMarial = marial();
        cipherMarial.init(1, this.f38284attabal);
        byte[] bArrSaneness = ascolichen.beachfront.saneness(cipherMarial.doFinal(new byte[16]));
        this.f38286saneness = bArrSaneness;
        this.f38285dern = ascolichen.beachfront.saneness(bArrSaneness);
    }
}
