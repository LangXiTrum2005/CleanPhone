package affiche;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: compiled from: PrfHmacJce.java */
/* JADX INFO: loaded from: classes3.dex */
public final class kowloon implements larchwood.dern {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f3888marial = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ThreadLocal<Mac> f3889attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Key f3890dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f3891saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f3892wireman;

    /* JADX INFO: compiled from: PrfHmacJce.java */
    public class attabal extends ThreadLocal<Mac> {
        public attabal() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Mac initialValue() {
            try {
                Mac macAttabal = cutely.f3858dern.attabal(kowloon.this.f3891saneness);
                macAttabal.init(kowloon.this.f3890dern);
                return macAttabal;
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public kowloon(String str, Key key) throws GeneralSecurityException {
        attabal attabalVar = new attabal();
        this.f3889attabal = attabalVar;
        if (!f3888marial.isCompatible()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f3891saneness = str;
        this.f3890dern = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.getClass();
        switch (str) {
            case "HMACSHA1":
                this.f3892wireman = 20;
                break;
            case "HMACSHA224":
                this.f3892wireman = 28;
                break;
            case "HMACSHA256":
                this.f3892wireman = 32;
                break;
            case "HMACSHA384":
                this.f3892wireman = 48;
                break;
            case "HMACSHA512":
                this.f3892wireman = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
        }
        attabalVar.get();
    }

    @Override // larchwood.dern
    public byte[] attabal(byte[] bArr, int i) throws GeneralSecurityException {
        if (i > this.f3892wireman) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.f3889attabal.get().update(bArr);
        return Arrays.copyOf(this.f3889attabal.get().doFinal(), i);
    }
}
