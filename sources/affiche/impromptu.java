package affiche;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import hobby.creditor;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: Ed25519Verify.java */
/* JADX INFO: loaded from: classes3.dex */
public final class impromptu implements discernable.dovishness {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f3884wireman = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ebullioscopic.attabal f3885attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final byte[] f3886dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final byte[] f3887saneness;

    public impromptu(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!f3884wireman.isCompatible()) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", 32));
        }
        this.f3885attabal = ebullioscopic.attabal.attabal(bArr);
        this.f3887saneness = bArr2;
        this.f3886dern = bArr3;
        hobby.marial.formularize();
    }

    private void dern(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length != 64) {
            throw new GeneralSecurityException(String.format("The length of the signature is not %s.", 64));
        }
        if (!hobby.marial.cuirassed(bArr2, bArr, this.f3885attabal.wireman())) {
            throw new GeneralSecurityException("Signature check failed.");
        }
    }

    public static discernable.dovishness saneness(astronautic.kowloon kowloonVar) throws GeneralSecurityException {
        if (!f3884wireman.isCompatible()) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        try {
            return extensively.polloi.dern(kowloonVar);
        } catch (GeneralSecurityException unused) {
            return new impromptu(kowloonVar.competently().wireman(), kowloonVar.dern().wireman(), kowloonVar.saneness().dern().equals(astronautic.taiyuan.attabal.f14726dern) ? new byte[]{0} : new byte[0]);
        }
    }

    @Override // discernable.dovishness
    public void attabal(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f3887saneness;
        if (bArr3.length == 0 && this.f3886dern.length == 0) {
            dern(bArr, bArr2);
        } else {
            if (!creditor.marial(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            byte[] bArr4 = this.f3886dern;
            if (bArr4.length != 0) {
                bArr2 = marial.attabal(bArr2, bArr4);
            }
            dern(Arrays.copyOfRange(bArr, this.f3887saneness.length, bArr.length), bArr2);
        }
    }
}
