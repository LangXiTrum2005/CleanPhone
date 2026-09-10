package affiche;

import cloop.kattegat;
import curiousness.cuirassed;
import hobby.creditor;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: ChaCha20Poly1305.java */
/* JADX INFO: loaded from: classes3.dex */
public final class beachfront implements discernable.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final kattegat f3847attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final byte[] f3848saneness;

    public beachfront(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.f3847attabal = new kattegat(bArr);
        this.f3848saneness = bArr2;
    }

    public static discernable.attabal saneness(cuirassed cuirassedVar) throws GeneralSecurityException {
        return new beachfront(cuirassedVar.marial().wireman(discernable.beachfront.attabal()), cuirassedVar.dern().wireman());
    }

    @Override // discernable.attabal
    public byte[] attabal(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f3848saneness;
        if (bArr3.length == 0) {
            return dern(bArr, bArr2);
        }
        if (creditor.marial(bArr3, bArr)) {
            return dern(Arrays.copyOfRange(bArr, this.f3848saneness.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }

    public final byte[] dern(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        return this.f3847attabal.attabal(ByteBuffer.wrap(bArr, 12, bArr.length - 12), bArrCopyOf, bArr2);
    }
}
