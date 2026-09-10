package ebullioscopic;

import affiche.formularize;
import java.util.Arrays;

/* JADX INFO: compiled from: Bytes.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final byte[] f25574attabal;

    public attabal(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f25574attabal = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    public static attabal attabal(byte[] bArr) {
        if (bArr != null) {
            return saneness(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static attabal saneness(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        if (i + i2 > bArr.length) {
            i2 = bArr.length - i;
        }
        return new attabal(bArr, i, i2);
    }

    public int dern() {
        return this.f25574attabal.length;
    }

    public boolean equals(Object obj) {
        if (obj instanceof attabal) {
            return Arrays.equals(((attabal) obj).f25574attabal, this.f25574attabal);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f25574attabal);
    }

    public String toString() {
        return "Bytes(" + formularize.saneness(this.f25574attabal) + ")";
    }

    public byte[] wireman() {
        byte[] bArr = this.f25574attabal;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
