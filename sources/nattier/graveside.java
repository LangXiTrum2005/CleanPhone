package nattier;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import cybernatic.privatdozent;

/* JADX INFO: compiled from: TrackEncryptionBox.java */
/* JADX INFO: loaded from: classes.dex */
public final class graveside {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final boolean f33717attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final privatdozent.attabal f33718dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final byte[] f33719marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f33720saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f33721wireman;

    public graveside(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        decarock.attabal.attabal((bArr2 == null) ^ (i == 0));
        this.f33717attabal = z;
        this.f33720saneness = str;
        this.f33721wireman = i;
        this.f33719marial = bArr2;
        this.f33718dern = new privatdozent.attabal(attabal(str), bArr, i2, i3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int attabal(String str) {
        if (str == null) {
            return 1;
        }
        byte b = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(C.CENC_TYPE_cbc1)) {
                    b = 0;
                }
                break;
            case 3046671:
                if (str.equals(C.CENC_TYPE_cbcs)) {
                    b = 1;
                }
                break;
            case 3049879:
                if (str.equals(C.CENC_TYPE_cenc)) {
                    b = 2;
                }
                break;
            case 3049895:
                if (str.equals(C.CENC_TYPE_cens)) {
                    b = 3;
                }
                break;
        }
        switch (b) {
            case 0:
            case 1:
                return 2;
            default:
                decarock.triweekly.impromptu("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
