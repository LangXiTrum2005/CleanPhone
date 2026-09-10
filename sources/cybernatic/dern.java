package cybernatic;

import androidx.media3.common.DrmInitData;
import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;
import org.jacoco.core.runtime.RemoteControlWriter;

/* JADX INFO: compiled from: Ac4Util.java */
/* JADX INFO: loaded from: classes.dex */
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final int[] f24621attabal = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX INFO: compiled from: Ac4Util.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f24622attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f24623dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final int f24624marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f24625saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int f24626wireman;

        public saneness(int i, int i2, int i3, int i4, int i5) {
            this.f24622attabal = i;
            this.f24623dern = i2;
            this.f24625saneness = i3;
            this.f24626wireman = i4;
            this.f24624marial = i5;
        }
    }

    public static void attabal(int i, decarock.stratoscope stratoscopeVar) {
        stratoscopeVar.starveling(7);
        byte[] bArrMarial = stratoscopeVar.marial();
        bArrMarial[0] = -84;
        bArrMarial[1] = RemoteControlWriter.BLOCK_CMDDUMP;
        bArrMarial[2] = -1;
        bArrMarial[3] = -1;
        bArrMarial[4] = (byte) ((i >> 16) & 255);
        bArrMarial[5] = (byte) ((i >> 8) & 255);
        bArrMarial[6] = (byte) (i & 255);
    }

    public static int beachfront(decarock.cuirassed cuirassedVar, int i) {
        int i2 = 0;
        while (true) {
            int iImpromptu = i2 + cuirassedVar.impromptu(i);
            if (!cuirassedVar.competently()) {
                return iImpromptu;
            }
            i2 = (iImpromptu + 1) << i;
        }
    }

    public static int dern(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return wireman(new decarock.cuirassed(bArr)).f24624marial;
    }

    public static int marial(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i3 = ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        if (i3 == 65535) {
            i3 = ((bArr[4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return i3 + i2;
    }

    public static androidx.media3.common.polloi saneness(decarock.stratoscope stratoscopeVar, String str, String str2, DrmInitData drmInitData) {
        stratoscopeVar.splinterproof(1);
        return new androidx.media3.common.polloi.saneness().cultivated(str).sensatory("audio/ac4").saran(2).underbelly(((stratoscopeVar.supplicat() & 32) >> 5) == 1 ? 48000 : 44100).mathsort(drmInitData).treadless(str2).polder();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    public static saneness wireman(decarock.cuirassed cuirassedVar) {
        int i;
        int i2;
        int i3;
        int iImpromptu = cuirassedVar.impromptu(16);
        int iImpromptu2 = cuirassedVar.impromptu(16);
        if (iImpromptu2 == 65535) {
            iImpromptu2 = cuirassedVar.impromptu(24);
            i = 7;
        } else {
            i = 4;
        }
        int i4 = iImpromptu2 + i;
        if (iImpromptu == 44097) {
            i4 += 2;
        }
        int i5 = i4;
        int iImpromptu3 = cuirassedVar.impromptu(2);
        if (iImpromptu3 == 3) {
            iImpromptu3 += beachfront(cuirassedVar, 2);
        }
        int i6 = iImpromptu3;
        int iImpromptu4 = cuirassedVar.impromptu(10);
        if (cuirassedVar.competently() && cuirassedVar.impromptu(3) > 0) {
            cuirassedVar.polloi(2);
        }
        int i7 = 48000;
        if (!cuirassedVar.competently()) {
            i7 = 44100;
        }
        int iImpromptu5 = cuirassedVar.impromptu(4);
        if (i7 != 44100 || iImpromptu5 != 13) {
            if (i7 == 48000) {
                int[] iArr = f24621attabal;
                if (iImpromptu5 < iArr.length) {
                    int i8 = iArr[iImpromptu5];
                    int i9 = iImpromptu4 % 5;
                    if (i9 == 1) {
                        if (iImpromptu5 != 3 || iImpromptu5 == 8) {
                            i2 = i8 + 1;
                        } else {
                            i3 = i8;
                        }
                    } else if (i9 != 2) {
                        if (i9 == 3) {
                            if (iImpromptu5 != 3) {
                            }
                            i2 = i8 + 1;
                        } else if (i9 == 4 && (iImpromptu5 == 3 || iImpromptu5 == 8 || iImpromptu5 == 11)) {
                            i2 = i8 + 1;
                        } else {
                            i3 = i8;
                        }
                    } else if (iImpromptu5 == 8 || iImpromptu5 == 11) {
                        i2 = i8 + 1;
                    } else {
                        i3 = i8;
                    }
                } else {
                    i2 = 0;
                }
            } else {
                i2 = 0;
            }
            return new saneness(i6, 2, i7, i5, i3);
        }
        i2 = f24621attabal[iImpromptu5];
        i3 = i2;
        return new saneness(i6, 2, i7, i5, i3);
    }
}
