package affiche;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.subtle.Enums$HashType;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: Validators.java */
/* JADX INFO: loaded from: classes3.dex */
public final class gintrap {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Pattern f3871attabal = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"), 2);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Pattern f3872saneness = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"), 2);

    /* JADX INFO: compiled from: Validators.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f3873attabal;

        static {
            int[] iArr = new int[Enums$HashType.values().length];
            f3873attabal = iArr;
            try {
                iArr[Enums$HashType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3873attabal[Enums$HashType.SHA384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3873attabal[Enums$HashType.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void attabal(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
    }

    public static void dern(BigInteger bigInteger) throws GeneralSecurityException {
        if (!bigInteger.testBit(0)) {
            throw new GeneralSecurityException("Public exponent must be odd.");
        }
        if (bigInteger.compareTo(BigInteger.valueOf(65536L)) <= 0) {
            throw new GeneralSecurityException("Public exponent must be greater than 65536.");
        }
    }

    public static void saneness(int i) throws GeneralSecurityException {
        if (i < 2048) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size >= 2048-bit is supported", Integer.valueOf(i)));
        }
        if (TinkFipsUtil.dern() && i != 2048 && i != 3072) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size of 2048- or 3072-bit is supported in FIPS mode.", Integer.valueOf(i)));
        }
    }

    public static void wireman(Enums$HashType enums$HashType) throws GeneralSecurityException {
        int i = attabal.f3873attabal[enums$HashType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return;
        }
        throw new GeneralSecurityException("Unsupported hash: " + enums$HashType.name());
    }
}
