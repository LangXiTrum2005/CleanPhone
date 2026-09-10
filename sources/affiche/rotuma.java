package affiche;

import cloop.merc;
import curiousness.underbelly;
import hobby.creditor;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: XChaCha20Poly1305.java */
/* JADX INFO: loaded from: classes3.dex */
public final class rotuma implements discernable.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final merc f3904attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final byte[] f3905saneness;

    public rotuma(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.f3904attabal = new merc(bArr);
        this.f3905saneness = bArr2;
    }

    private byte[] dern(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 24);
        return this.f3904attabal.attabal(ByteBuffer.wrap(bArr, 24, bArr.length - 24), bArrCopyOf, bArr2);
    }

    public static discernable.attabal saneness(underbelly underbellyVar) throws GeneralSecurityException {
        return new rotuma(underbellyVar.marial().wireman(discernable.beachfront.attabal()), underbellyVar.dern().wireman());
    }

    @Override // discernable.attabal
    public byte[] attabal(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f3905saneness;
        if (bArr3.length == 0) {
            return dern(bArr, bArr2);
        }
        if (creditor.marial(bArr3, bArr)) {
            return dern(Arrays.copyOfRange(bArr, this.f3905saneness.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
}
