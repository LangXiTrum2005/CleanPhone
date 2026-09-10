package affiche;

import astronautic.mathsort;
import astronautic.peridotite;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.subtle.Enums$HashType;
import extensively.polder;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: RsaSsaPssSignJce.java */
/* JADX INFO: loaded from: classes3.dex */
public final class graveside implements discernable.adultoid {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f3874attabal = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final byte[] f3876saneness = new byte[0];

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final byte[] f3875dern = {0};

    /* JADX INFO: compiled from: RsaSsaPssSignJce.java */
    public static final class saneness implements discernable.adultoid {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final RSAPrivateCrtKey f3877attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final byte[] f3878beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final byte[] f3879competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final Enums$HashType f3880dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final int f3881marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final RSAPublicKey f3882saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final Enums$HashType f3883wireman;

        private byte[] dern(byte[] bArr) throws GeneralSecurityException {
            return wireman(saneness(bArr, this.f3882saneness.getModulus().bitLength() - 1));
        }

        @Override // discernable.adultoid
        public byte[] attabal(byte[] bArr) throws GeneralSecurityException {
            byte[] bArrDern = dern(bArr);
            byte[] bArr2 = this.f3878beachfront;
            return bArr2.length == 0 ? bArrDern : marial.attabal(bArr2, bArrDern);
        }

        public final byte[] saneness(byte[] bArr, int i) throws GeneralSecurityException {
            gintrap.wireman(this.f3880dern);
            MessageDigest messageDigestAttabal = cutely.f3860marial.attabal(dovishness.marial(this.f3880dern));
            messageDigestAttabal.update(bArr);
            byte[] bArr2 = this.f3879competently;
            if (bArr2.length != 0) {
                messageDigestAttabal.update(bArr2);
            }
            byte[] bArrDigest = messageDigestAttabal.digest();
            int digestLength = messageDigestAttabal.getDigestLength();
            int i2 = 1;
            int i3 = ((i - 1) / 8) + 1;
            int i4 = this.f3881marial;
            if (i3 < digestLength + i4 + 2) {
                throw new GeneralSecurityException("encoding error");
            }
            byte[] bArrAttabal = monoploid.attabal(i4);
            int i5 = digestLength + 8;
            byte[] bArr3 = new byte[this.f3881marial + i5];
            System.arraycopy(bArrDigest, 0, bArr3, 8, digestLength);
            System.arraycopy(bArrAttabal, 0, bArr3, i5, bArrAttabal.length);
            byte[] bArrDigest2 = messageDigestAttabal.digest(bArr3);
            int i6 = (i3 - digestLength) - 1;
            byte[] bArr4 = new byte[i6];
            int i7 = this.f3881marial;
            bArr4[((i3 - i7) - digestLength) - 2] = 1;
            System.arraycopy(bArrAttabal, 0, bArr4, ((i3 - i7) - digestLength) - 1, bArrAttabal.length);
            byte[] bArrWireman = dovishness.wireman(bArrDigest2, i6, this.f3883wireman);
            byte[] bArr5 = new byte[i6];
            for (int i8 = 0; i8 < i6; i8++) {
                bArr5[i8] = (byte) (bArr4[i8] ^ bArrWireman[i8]);
            }
            int i9 = 0;
            while (true) {
                int i10 = i2;
                if (i9 >= (((long) i3) * 8) - ((long) i)) {
                    int i11 = digestLength + i6;
                    byte[] bArr6 = new byte[i11 + 1];
                    System.arraycopy(bArr5, 0, bArr6, 0, i6);
                    System.arraycopy(bArrDigest2, 0, bArr6, i6, bArrDigest2.length);
                    bArr6[i11] = -68;
                    return bArr6;
                }
                int i12 = i9 / 8;
                bArr5[i12] = (byte) ((~(i10 << (7 - (i9 % 8)))) & bArr5[i12]);
                i9++;
                i2 = i10;
            }
        }

        public final byte[] wireman(byte[] bArr) throws GeneralSecurityException {
            cutely<apical.attabal, Cipher> cutelyVar = cutely.f3861saneness;
            Cipher cipherAttabal = cutelyVar.attabal("RSA/ECB/NOPADDING");
            cipherAttabal.init(2, this.f3877attabal);
            byte[] bArrDoFinal = cipherAttabal.doFinal(bArr);
            Cipher cipherAttabal2 = cutelyVar.attabal("RSA/ECB/NOPADDING");
            cipherAttabal2.init(1, this.f3882saneness);
            if (new BigInteger(1, bArr).equals(new BigInteger(1, cipherAttabal2.doFinal(bArrDoFinal)))) {
                return bArrDoFinal;
            }
            throw new IllegalStateException("Security bug: RSA signature computation error");
        }

        public saneness(RSAPrivateCrtKey rSAPrivateCrtKey, Enums$HashType enums$HashType, Enums$HashType enums$HashType2, int i, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (TinkFipsUtil.dern()) {
                throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            }
            gintrap.wireman(enums$HashType);
            if (!enums$HashType.equals(enums$HashType2)) {
                throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
            }
            gintrap.saneness(rSAPrivateCrtKey.getModulus().bitLength());
            gintrap.dern(rSAPrivateCrtKey.getPublicExponent());
            this.f3877attabal = rSAPrivateCrtKey;
            this.f3882saneness = (RSAPublicKey) cutely.f3859impromptu.attabal("RSA").generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
            this.f3880dern = enums$HashType;
            this.f3883wireman = enums$HashType2;
            this.f3881marial = i;
            this.f3878beachfront = bArr;
            this.f3879competently = bArr2;
        }
    }

    public static discernable.adultoid saneness(mathsort mathsortVar) throws GeneralSecurityException {
        try {
            return polder.saneness(mathsortVar);
        } catch (NoSuchProviderException unused) {
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) cutely.f3859impromptu.attabal("RSA").generatePrivate(new RSAPrivateCrtKeySpec(mathsortVar.wireman().marial(), mathsortVar.saneness().marial(), mathsortVar.formularize().saneness(discernable.beachfront.attabal()), mathsortVar.cutely().saneness(discernable.beachfront.attabal()), mathsortVar.apical().saneness(discernable.beachfront.attabal()), mathsortVar.impromptu().saneness(discernable.beachfront.attabal()), mathsortVar.taiyuan().saneness(discernable.beachfront.attabal()), mathsortVar.beachfront().saneness(discernable.beachfront.attabal())));
            peridotite peridotiteVarSaneness = mathsortVar.saneness();
            return new saneness(rSAPrivateCrtKey, (Enums$HashType) adultoid.f3829saneness.dern(peridotiteVarSaneness.competently()), (Enums$HashType) adultoid.f3829saneness.dern(peridotiteVarSaneness.dern()), peridotiteVarSaneness.beachfront(), mathsortVar.dern().wireman(), mathsortVar.saneness().impromptu().equals(peridotite.wireman.f14656dern) ? f3875dern : f3876saneness);
        }
    }
}
