package affiche;

import astronautic.saran;
import astronautic.seminary;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.subtle.Enums$HashType;
import extensively.trm;
import hobby.creditor;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;

/* JADX INFO: compiled from: RsaSsaPkcs1VerifyJce.java */
/* JADX INFO: loaded from: classes3.dex */
public final class molybdenite implements discernable.dovishness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f3894attabal = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final byte[] f3896saneness = new byte[0];

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final byte[] f3895dern = {0};

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final hobby.impromptu<Enums$HashType, seminary.dern> f3897wireman = hobby.impromptu.attabal().attabal(Enums$HashType.SHA256, seminary.dern.f14704attabal).attabal(Enums$HashType.SHA384, seminary.dern.f14706saneness).attabal(Enums$HashType.SHA512, seminary.dern.f14705dern).saneness();

    /* JADX INFO: compiled from: RsaSsaPkcs1VerifyJce.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f3898attabal;

        static {
            int[] iArr = new int[Enums$HashType.values().length];
            f3898attabal = iArr;
            try {
                iArr[Enums$HashType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3898attabal[Enums$HashType.SHA384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3898attabal[Enums$HashType.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: RsaSsaPkcs1VerifyJce.java */
    public static final class saneness implements discernable.dovishness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final RSAPublicKey f3899attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final byte[] f3900dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Enums$HashType f3901saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final byte[] f3902wireman;

        public /* synthetic */ saneness(RSAPublicKey rSAPublicKey, Enums$HashType enums$HashType, byte[] bArr, byte[] bArr2, attabal attabalVar) throws GeneralSecurityException {
            this(rSAPublicKey, enums$HashType, bArr, bArr2);
        }

        private void dern(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            BigInteger publicExponent = this.f3899attabal.getPublicExponent();
            BigInteger modulus = this.f3899attabal.getModulus();
            int iBitLength = (modulus.bitLength() + 7) / 8;
            if (iBitLength != bArr.length) {
                throw new GeneralSecurityException("invalid signature's length");
            }
            BigInteger bigIntegerAttabal = dovishness.attabal(bArr);
            if (bigIntegerAttabal.compareTo(modulus) >= 0) {
                throw new GeneralSecurityException("signature out of range");
            }
            if (!marial.saneness(dovishness.saneness(bigIntegerAttabal.modPow(publicExponent, modulus), iBitLength), saneness(bArr2, iBitLength, this.f3901saneness))) {
                throw new GeneralSecurityException("invalid signature");
            }
        }

        @Override // discernable.dovishness
        public void attabal(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            byte[] bArr3 = this.f3900dern;
            if (bArr3.length == 0) {
                dern(bArr, bArr2);
            } else {
                if (!creditor.marial(bArr3, bArr)) {
                    throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                }
                dern(Arrays.copyOfRange(bArr, this.f3900dern.length, bArr.length), bArr2);
            }
        }

        public final byte[] saneness(byte[] bArr, int i, Enums$HashType enums$HashType) throws GeneralSecurityException {
            gintrap.wireman(enums$HashType);
            MessageDigest messageDigestAttabal = cutely.f3860marial.attabal(dovishness.marial(this.f3901saneness));
            messageDigestAttabal.update(bArr);
            byte[] bArr2 = this.f3902wireman;
            if (bArr2.length != 0) {
                messageDigestAttabal.update(bArr2);
            }
            byte[] bArrDigest = messageDigestAttabal.digest();
            byte[] bArrWireman = wireman(enums$HashType);
            int length = bArrWireman.length + bArrDigest.length;
            if (i < length + 11) {
                throw new GeneralSecurityException("intended encoded message length too short");
            }
            byte[] bArr3 = new byte[i];
            bArr3[0] = 0;
            bArr3[1] = 1;
            int i2 = 2;
            int i3 = 0;
            while (i3 < (i - length) - 3) {
                bArr3[i2] = -1;
                i3++;
                i2++;
            }
            int i4 = i2 + 1;
            bArr3[i2] = 0;
            System.arraycopy(bArrWireman, 0, bArr3, i4, bArrWireman.length);
            System.arraycopy(bArrDigest, 0, bArr3, i4 + bArrWireman.length, bArrDigest.length);
            return bArr3;
        }

        public final byte[] wireman(Enums$HashType enums$HashType) throws GeneralSecurityException {
            int i = attabal.f3898attabal[enums$HashType.ordinal()];
            if (i == 1) {
                return formularize.attabal("3031300d060960864801650304020105000420");
            }
            if (i == 2) {
                return formularize.attabal("3041300d060960864801650304020205000430");
            }
            if (i == 3) {
                return formularize.attabal("3051300d060960864801650304020305000440");
            }
            throw new GeneralSecurityException("Unsupported hash " + enums$HashType);
        }

        public saneness(RSAPublicKey rSAPublicKey, Enums$HashType enums$HashType, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (TinkFipsUtil.dern()) {
                throw new GeneralSecurityException("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
            }
            gintrap.wireman(enums$HashType);
            gintrap.saneness(rSAPublicKey.getModulus().bitLength());
            gintrap.dern(rSAPublicKey.getPublicExponent());
            this.f3899attabal = rSAPublicKey;
            this.f3901saneness = enums$HashType;
            this.f3900dern = bArr;
            this.f3902wireman = bArr2;
        }
    }

    public static discernable.dovishness saneness(saran saranVar) throws GeneralSecurityException {
        try {
            return trm.dern(saranVar);
        } catch (NoSuchProviderException unused) {
            return new saneness((RSAPublicKey) cutely.f3859impromptu.attabal("RSA").generatePublic(new RSAPublicKeySpec(saranVar.marial(), saranVar.saneness().marial())), (Enums$HashType) f3897wireman.dern(saranVar.saneness().dern()), saranVar.dern().wireman(), saranVar.saneness().beachfront().equals(seminary.wireman.f14714dern) ? f3895dern : f3896saneness, null);
        }
    }
}
