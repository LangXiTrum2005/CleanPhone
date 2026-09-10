package affiche;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: Ed25519Sign.java */
/* JADX INFO: loaded from: classes3.dex */
public final class competently implements discernable.adultoid {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f3849marial = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final byte[] f3850attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final byte[] f3851dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final byte[] f3852saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final byte[] f3853wireman;

    /* JADX INFO: compiled from: Ed25519Sign.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final byte[] f3854attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final byte[] f3855saneness;

        public attabal(byte[] bArr, byte[] bArr2) {
            this.f3854attabal = bArr;
            this.f3855saneness = bArr2;
        }

        public static attabal dern() throws GeneralSecurityException {
            return wireman(monoploid.attabal(32));
        }

        public static attabal wireman(byte[] bArr) throws GeneralSecurityException {
            if (bArr.length == 32) {
                return new attabal(hobby.marial.dovishness(hobby.marial.cutely(bArr)), bArr);
            }
            throw new IllegalArgumentException(String.format("Given secret seed length is not %s", 32));
        }

        public byte[] attabal() {
            byte[] bArr = this.f3855saneness;
            return Arrays.copyOf(bArr, bArr.length);
        }

        public byte[] saneness() {
            byte[] bArr = this.f3854attabal;
            return Arrays.copyOf(bArr, bArr.length);
        }
    }

    public competently(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (!f3849marial.isCompatible()) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given private key's length is not %s", 32));
        }
        byte[] bArrCutely = hobby.marial.cutely(bArr);
        this.f3850attabal = bArrCutely;
        this.f3852saneness = hobby.marial.dovishness(bArrCutely);
        this.f3851dern = bArr2;
        this.f3853wireman = bArr3;
    }

    public static discernable.adultoid saneness(astronautic.cutely cutelyVar) throws GeneralSecurityException {
        if (!f3849marial.isCompatible()) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        try {
            return extensively.monoploid.dern(cutelyVar);
        } catch (GeneralSecurityException unused) {
            return new competently(cutelyVar.competently().wireman(discernable.beachfront.attabal()), cutelyVar.dern().wireman(), cutelyVar.saneness().dern().equals(astronautic.taiyuan.attabal.f14726dern) ? new byte[]{0} : new byte[0]);
        }
    }

    @Override // discernable.adultoid
    public byte[] attabal(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.f3853wireman;
        byte[] bArrDern = bArr2.length == 0 ? dern(bArr) : dern(marial.attabal(bArr, bArr2));
        byte[] bArr3 = this.f3851dern;
        return bArr3.length == 0 ? bArrDern : marial.attabal(bArr3, bArrDern);
    }

    public final byte[] dern(byte[] bArr) throws GeneralSecurityException {
        return hobby.marial.rotuma(bArr, this.f3852saneness, this.f3850attabal);
    }
}
