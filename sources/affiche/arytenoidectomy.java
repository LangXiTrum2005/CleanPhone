package affiche;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: PrfMac.java */
/* JADX INFO: loaded from: classes3.dex */
public class arytenoidectomy implements discernable.polloi {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final byte[] f3837marial = {0};

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final larchwood.dern f3838attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final byte[] f3839dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f3840saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final byte[] f3841wireman;

    public arytenoidectomy(larchwood.dern dernVar, int i) throws GeneralSecurityException {
        this.f3838attabal = dernVar;
        this.f3840saneness = i;
        this.f3839dern = new byte[0];
        this.f3841wireman = new byte[0];
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        dernVar.attabal(new byte[0], i);
    }

    public static discernable.polloi dern(horsehair.attabal attabalVar) throws GeneralSecurityException {
        return new arytenoidectomy(attabalVar);
    }

    public static larchwood.dern marial(horsehair.attabal attabalVar) throws GeneralSecurityException {
        return triweekly.saneness(larchwood.attabal.dern(larchwood.saneness.saneness(attabalVar.saneness().wireman()), attabalVar.marial()));
    }

    public static discernable.polloi wireman(horsehair.taiyuan taiyuanVar) throws GeneralSecurityException {
        return new arytenoidectomy(taiyuanVar);
    }

    @Override // discernable.polloi
    public void attabal(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!marial.saneness(saneness(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    public byte[] saneness(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.f3841wireman;
        return bArr2.length > 0 ? marial.attabal(this.f3839dern, this.f3838attabal.attabal(marial.attabal(bArr, bArr2), this.f3840saneness)) : marial.attabal(this.f3839dern, this.f3838attabal.attabal(bArr, this.f3840saneness));
    }

    public arytenoidectomy(horsehair.attabal attabalVar) throws GeneralSecurityException {
        this.f3838attabal = marial(attabalVar);
        this.f3840saneness = attabalVar.saneness().dern();
        this.f3839dern = attabalVar.dern().wireman();
        if (attabalVar.saneness().beachfront().equals(horsehair.beachfront.dern.f27931dern)) {
            byte[] bArr = f3837marial;
            this.f3841wireman = Arrays.copyOf(bArr, bArr.length);
        } else {
            this.f3841wireman = new byte[0];
        }
    }

    public arytenoidectomy(horsehair.taiyuan taiyuanVar) throws GeneralSecurityException {
        this.f3838attabal = new kowloon("HMAC" + taiyuanVar.saneness().wireman(), new SecretKeySpec(taiyuanVar.marial().wireman(discernable.beachfront.attabal()), "HMAC"));
        this.f3840saneness = taiyuanVar.saneness().dern();
        this.f3839dern = taiyuanVar.dern().wireman();
        if (taiyuanVar.saneness().competently().equals(horsehair.triweekly.wireman.f27988dern)) {
            byte[] bArr = f3837marial;
            this.f3841wireman = Arrays.copyOf(bArr, bArr.length);
        } else {
            this.f3841wireman = new byte[0];
        }
    }
}
