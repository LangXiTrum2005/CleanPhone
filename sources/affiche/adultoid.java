package affiche;

import astronautic.peridotite;
import astronautic.splinterproof;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.subtle.Enums$HashType;
import extensively.seminary;
import hobby.creditor;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;

/* JADX INFO: compiled from: RsaSsaPssVerifyJce.java */
/* JADX INFO: loaded from: classes3.dex */
public final class adultoid implements discernable.dovishness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f3827attabal = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final hobby.impromptu<Enums$HashType, peridotite.dern> f3829saneness = hobby.impromptu.attabal().attabal(Enums$HashType.SHA256, peridotite.dern.f14644attabal).attabal(Enums$HashType.SHA384, peridotite.dern.f14646saneness).attabal(Enums$HashType.SHA512, peridotite.dern.f14645dern).saneness();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final byte[] f3828dern = new byte[0];

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final byte[] f3830wireman = {0};

    /* JADX INFO: compiled from: RsaSsaPssVerifyJce.java */
    public static final class saneness implements discernable.dovishness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final RSAPublicKey f3831attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final byte[] f3832beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final Enums$HashType f3833dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final byte[] f3834marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Enums$HashType f3835saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int f3836wireman;

        private void dern(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            BigInteger publicExponent = this.f3831attabal.getPublicExponent();
            BigInteger modulus = this.f3831attabal.getModulus();
            int iBitLength = (modulus.bitLength() + 7) / 8;
            int iBitLength2 = (modulus.bitLength() + 6) / 8;
            if (iBitLength != bArr.length) {
                throw new GeneralSecurityException("invalid signature's length");
            }
            BigInteger bigIntegerAttabal = dovishness.attabal(bArr);
            if (bigIntegerAttabal.compareTo(modulus) >= 0) {
                throw new GeneralSecurityException("signature out of range");
            }
            saneness(bArr2, dovishness.saneness(bigIntegerAttabal.modPow(publicExponent, modulus), iBitLength2), modulus.bitLength() - 1);
        }

        @Override // discernable.dovishness
        public void attabal(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            byte[] bArr3 = this.f3834marial;
            if (bArr3.length == 0) {
                dern(bArr, bArr2);
            } else {
                if (!creditor.marial(bArr3, bArr)) {
                    throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                }
                dern(Arrays.copyOfRange(bArr, this.f3834marial.length, bArr.length), bArr2);
            }
        }

        public final void saneness(byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
            gintrap.wireman(this.f3835saneness);
            MessageDigest messageDigestAttabal = cutely.f3860marial.attabal(dovishness.marial(this.f3835saneness));
            messageDigestAttabal.update(bArr);
            byte[] bArr3 = this.f3832beachfront;
            if (bArr3.length != 0) {
                messageDigestAttabal.update(bArr3);
            }
            byte[] bArrDigest = messageDigestAttabal.digest();
            int digestLength = messageDigestAttabal.getDigestLength();
            int length = bArr2.length;
            if (length < this.f3836wireman + digestLength + 2) {
                throw new GeneralSecurityException("inconsistent");
            }
            byte b = 1;
            if (bArr2[bArr2.length - 1] != -68) {
                throw new GeneralSecurityException("inconsistent");
            }
            int i2 = length - digestLength;
            int i3 = i2 - 1;
            byte[] bArrCopyOf = Arrays.copyOf(bArr2, i3);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, bArrCopyOf.length, bArrCopyOf.length + digestLength);
            int i4 = 0;
            while (true) {
                int i5 = i4;
                byte b2 = b;
                int i6 = i3;
                long j = (((long) length) * 8) - ((long) i);
                if (i4 < j) {
                    if (((bArrCopyOf[i5 / 8] >> (7 - (i5 % 8))) & 1) != 0) {
                        throw new GeneralSecurityException("inconsistent");
                    }
                    i4 = i5 + 1;
                    b = b2;
                    i3 = i6;
                } else {
                    byte[] bArrWireman = dovishness.wireman(bArrCopyOfRange, i6, this.f3833dern);
                    int length2 = bArrWireman.length;
                    byte[] bArr4 = new byte[length2];
                    for (int i7 = 0; i7 < length2; i7++) {
                        bArr4[i7] = (byte) (bArrWireman[i7] ^ bArrCopyOf[i7]);
                    }
                    for (int i8 = 0; i8 <= j; i8++) {
                        int i9 = i8 / 8;
                        bArr4[i9] = (byte) ((~(b2 << (7 - (i8 % 8)))) & bArr4[i9]);
                    }
                    int i10 = 0;
                    while (true) {
                        int i11 = this.f3836wireman;
                        if (i10 >= (i2 - i11) - 2) {
                            if (bArr4[(i2 - i11) - 2] != b2) {
                                throw new GeneralSecurityException("inconsistent");
                            }
                            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr4, length2 - i11, length2);
                            int i12 = digestLength + 8;
                            byte[] bArr5 = new byte[this.f3836wireman + i12];
                            System.arraycopy(bArrDigest, 0, bArr5, 8, bArrDigest.length);
                            System.arraycopy(bArrCopyOfRange2, 0, bArr5, i12, bArrCopyOfRange2.length);
                            if (!marial.saneness(messageDigestAttabal.digest(bArr5), bArrCopyOfRange)) {
                                throw new GeneralSecurityException("inconsistent");
                            }
                            return;
                        }
                        if (bArr4[i10] != 0) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        i10++;
                    }
                }
            }
        }

        public saneness(RSAPublicKey rSAPublicKey, Enums$HashType enums$HashType, Enums$HashType enums$HashType2, int i, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (TinkFipsUtil.dern()) {
                throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            }
            gintrap.wireman(enums$HashType);
            if (!enums$HashType.equals(enums$HashType2)) {
                throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
            }
            gintrap.saneness(rSAPublicKey.getModulus().bitLength());
            gintrap.dern(rSAPublicKey.getPublicExponent());
            this.f3831attabal = rSAPublicKey;
            this.f3835saneness = enums$HashType;
            this.f3833dern = enums$HashType2;
            this.f3836wireman = i;
            this.f3834marial = bArr;
            this.f3832beachfront = bArr2;
        }
    }

    public static discernable.dovishness saneness(splinterproof splinterproofVar) throws GeneralSecurityException {
        try {
            return seminary.dern(splinterproofVar);
        } catch (NoSuchProviderException unused) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) cutely.f3859impromptu.attabal("RSA").generatePublic(new RSAPublicKeySpec(splinterproofVar.marial(), splinterproofVar.saneness().marial()));
            peridotite peridotiteVarSaneness = splinterproofVar.saneness();
            return new saneness(rSAPublicKey, (Enums$HashType) f3829saneness.dern(peridotiteVarSaneness.competently()), (Enums$HashType) f3829saneness.dern(peridotiteVarSaneness.dern()), peridotiteVarSaneness.beachfront(), splinterproofVar.dern().wireman(), splinterproofVar.saneness().impromptu().equals(peridotite.wireman.f14656dern) ? f3830wireman : f3828dern);
        }
    }
}
