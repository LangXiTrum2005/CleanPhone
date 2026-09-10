package cloop;

import curiousness.sayid;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: XAesGcm.java */
/* JADX INFO: loaded from: classes3.dex */
public final class grimness implements discernable.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final byte[] f15671attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final larchwood.dern f15672dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f15673saneness;

    public grimness(byte[] bArr, ebullioscopic.attabal attabalVar, int i) throws GeneralSecurityException {
        this.f15672dern = dern(bArr);
        this.f15671attabal = attabalVar.wireman();
        this.f15673saneness = i;
    }

    public static larchwood.dern dern(byte[] bArr) throws GeneralSecurityException {
        return affiche.triweekly.saneness(larchwood.attabal.dern(larchwood.saneness.saneness(bArr.length), ebullioscopic.dern.attabal(bArr, discernable.beachfront.attabal())));
    }

    public static discernable.attabal saneness(sayid sayidVar) throws GeneralSecurityException {
        if (sayidVar.saneness().dern() < 8 || sayidVar.saneness().dern() > 12) {
            throw new GeneralSecurityException("invalid salt size");
        }
        return new grimness(sayidVar.marial().wireman(discernable.beachfront.attabal()), sayidVar.dern(), sayidVar.saneness().dern());
    }

    @Override // discernable.attabal
    public byte[] attabal(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f15671attabal;
        if (length < bArr3.length + this.f15673saneness + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!hobby.creditor.marial(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int length2 = this.f15671attabal.length + this.f15673saneness;
        int i = length2 + 12;
        return new oilcan(wireman(Arrays.copyOfRange(bArr, this.f15671attabal.length, length2))).attabal(Arrays.copyOfRange(bArr, length2, i), bArr, i, bArr2);
    }

    public final byte[] wireman(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr3 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (bArr.length > 12 || bArr.length < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        System.arraycopy(bArr, 0, bArr3, 4, bArr.length);
        byte[] bArr4 = new byte[32];
        System.arraycopy(this.f15672dern.attabal(bArr2, 16), 0, bArr4, 0, 16);
        System.arraycopy(this.f15672dern.attabal(bArr3, 16), 0, bArr4, 16, 16);
        return bArr4;
    }
}
