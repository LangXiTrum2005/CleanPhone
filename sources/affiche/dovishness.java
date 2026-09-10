package affiche;

import com.google.crypto.tink.subtle.Enums$HashType;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;

/* JADX INFO: compiled from: SubtleUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dovishness {

    /* JADX INFO: compiled from: SubtleUtil.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f3870attabal;

        static {
            int[] iArr = new int[Enums$HashType.values().length];
            f3870attabal = iArr;
            try {
                iArr[Enums$HashType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3870attabal[Enums$HashType.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3870attabal[Enums$HashType.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3870attabal[Enums$HashType.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3870attabal[Enums$HashType.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static BigInteger attabal(byte[] bArr) {
        return hobby.attabal.attabal(bArr);
    }

    public static String beachfront(Enums$HashType enums$HashType) throws GeneralSecurityException {
        gintrap.wireman(enums$HashType);
        return enums$HashType + "withECDSA";
    }

    public static boolean dern() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }

    public static String marial(Enums$HashType enums$HashType) throws GeneralSecurityException {
        int i = attabal.f3870attabal[enums$HashType.ordinal()];
        if (i == 1) {
            return AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1;
        }
        if (i == 2) {
            return "SHA-224";
        }
        if (i == 3) {
            return "SHA-256";
        }
        if (i == 4) {
            return "SHA-384";
        }
        if (i == 5) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash " + enums$HashType);
    }

    public static byte[] saneness(BigInteger bigInteger, int i) throws GeneralSecurityException {
        return hobby.attabal.dern(bigInteger, i);
    }

    public static byte[] wireman(byte[] bArr, int i, Enums$HashType enums$HashType) throws GeneralSecurityException {
        MessageDigest messageDigestAttabal = cutely.f3860marial.attabal(marial(enums$HashType));
        int digestLength = messageDigestAttabal.getDigestLength();
        byte[] bArr2 = new byte[i];
        int length = 0;
        for (int i2 = 0; i2 <= (i - 1) / digestLength; i2++) {
            messageDigestAttabal.reset();
            messageDigestAttabal.update(bArr);
            messageDigestAttabal.update(saneness(BigInteger.valueOf(i2), 4));
            byte[] bArrDigest = messageDigestAttabal.digest();
            System.arraycopy(bArrDigest, 0, bArr2, length, Math.min(bArrDigest.length, i - length));
            length += bArrDigest.length;
        }
        return bArr2;
    }
}
