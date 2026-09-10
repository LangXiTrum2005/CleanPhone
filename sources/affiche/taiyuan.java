package affiche;

import hobby.creditor;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: EncryptThenAuthenticate.java */
/* JADX INFO: loaded from: classes3.dex */
public final class taiyuan implements discernable.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final impassible f3912attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f3913dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final discernable.polloi f3914saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final byte[] f3915wireman;

    public taiyuan(impassible impassibleVar, discernable.polloi polloiVar, int i, byte[] bArr) {
        this.f3912attabal = impassibleVar;
        this.f3914saneness = polloiVar;
        this.f3913dern = i;
        this.f3915wireman = bArr;
    }

    public static discernable.attabal saneness(curiousness.beachfront beachfrontVar) throws GeneralSecurityException {
        return new taiyuan(new attabal(beachfrontVar.marial().wireman(discernable.beachfront.attabal()), beachfrontVar.saneness().beachfront()), new arytenoidectomy(new kowloon("HMAC" + beachfrontVar.saneness().wireman(), new SecretKeySpec(beachfrontVar.beachfront().wireman(discernable.beachfront.attabal()), "HMAC")), beachfrontVar.saneness().competently()), beachfrontVar.saneness().competently(), beachfrontVar.dern().wireman());
    }

    @Override // discernable.attabal
    public byte[] attabal(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f3913dern;
        byte[] bArr3 = this.f3915wireman;
        if (length < i + bArr3.length) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!creditor.marial(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, this.f3915wireman.length, bArr.length - this.f3913dern);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f3913dern, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f3914saneness.attabal(bArrCopyOfRange2, marial.attabal(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        return this.f3912attabal.attabal(bArrCopyOfRange);
    }
}
