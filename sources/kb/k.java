package kb;

import com.google.android.gms.internal.ads.tq1;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements hb.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tq1 f44575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f44577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44578d;

    public k(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        byte b10 = 1;
        tq1 tq1Var = new tq1(this, 1);
        this.f44575a = tq1Var;
        if (!defpackage.e.d(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f44576b = str;
        this.f44577c = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1823053428:
                b10 = !str.equals("HMACSHA1") ? (byte) -1 : (byte) 0;
                break;
            case 392315023:
                if (!str.equals("HMACSHA224")) {
                    b10 = -1;
                }
                break;
            case 392315118:
                b10 = !str.equals("HMACSHA256") ? (byte) -1 : (byte) 2;
                break;
            case 392316170:
                b10 = !str.equals("HMACSHA384") ? (byte) -1 : (byte) 3;
                break;
            case 392317873:
                b10 = !str.equals("HMACSHA512") ? (byte) -1 : (byte) 4;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                this.f44578d = 20;
                break;
            case 1:
                this.f44578d = 28;
                break;
            case 2:
                this.f44578d = 32;
                break;
            case 3:
                this.f44578d = 48;
                break;
            case 4:
                this.f44578d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        tq1Var.get();
    }

    @Override // hb.c
    public final byte[] q(int i10, byte[] bArr) throws InvalidAlgorithmParameterException {
        if (i10 > this.f44578d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        tq1 tq1Var = this.f44575a;
        ((Mac) tq1Var.get()).update(bArr);
        return Arrays.copyOf(((Mac) tq1Var.get()).doFinal(), i10);
    }
}
