package cybernatic;

import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: DtsUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class kowloon {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final int[] f24678attabal = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final int[] f24684saneness = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int[] f24681dern = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final int[] f24686wireman = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final int[] f24683marial = {5, 8, 10, 12};

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final int[] f24679beachfront = {6, 9, 12, 15};

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final int[] f24680competently = {2, 4, 6, 8};

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final int[] f24682impromptu = {9, 11, 13, 16};

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final int[] f24685taiyuan = {5, 8, 10, 12};

    /* JADX INFO: compiled from: DtsUtil.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String f24687attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final int f24688beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f24689dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final long f24690marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f24691saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int f24692wireman;

        public saneness(String str, int i, int i2, int i3, long j, int i4) {
            this.f24687attabal = str;
            this.f24689dern = i;
            this.f24691saneness = i2;
            this.f24692wireman = i3;
            this.f24690marial = j;
            this.f24688beachfront = i4;
        }
    }

    public static saneness apical(byte[] bArr, AtomicInteger atomicInteger) throws ParserException {
        int iImpromptu;
        long jDeadwork;
        AtomicInteger atomicInteger2;
        int i;
        int i2;
        decarock.cuirassed cuirassedVarWireman = wireman(bArr);
        int i3 = cuirassedVarWireman.impromptu(32) == 1078008818 ? 1 : 0;
        int iImpassible = impassible(cuirassedVarWireman, f24683marial, true) + 1;
        if (i3 == 0) {
            iImpromptu = -2147483647;
            jDeadwork = C.TIME_UNSET;
        } else {
            if (!cuirassedVarWireman.competently()) {
                throw ParserException.createForUnsupportedContainerFeature("Only supports full channel mask-based audio presentation");
            }
            attabal(bArr, iImpassible);
            int iImpromptu2 = cuirassedVarWireman.impromptu(2);
            if (iImpromptu2 == 0) {
                i = 512;
            } else if (iImpromptu2 == 1) {
                i = 480;
            } else {
                if (iImpromptu2 != 2) {
                    throw ParserException.createForMalformedContainer("Unsupported base duration index in DTS UHD header: " + iImpromptu2, null);
                }
                i = 384;
            }
            int iImpromptu3 = i * (cuirassedVarWireman.impromptu(3) + 1);
            int iImpromptu4 = cuirassedVarWireman.impromptu(2);
            if (iImpromptu4 == 0) {
                i2 = 32000;
            } else if (iImpromptu4 == 1) {
                i2 = 44100;
            } else {
                if (iImpromptu4 != 2) {
                    throw ParserException.createForMalformedContainer("Unsupported clock rate index in DTS UHD header: " + iImpromptu4, null);
                }
                i2 = 48000;
            }
            if (cuirassedVarWireman.competently()) {
                cuirassedVarWireman.polloi(36);
            }
            iImpromptu = (1 << cuirassedVarWireman.impromptu(2)) * i2;
            jDeadwork = decarock.grimness.deadwork(iImpromptu3, 1000000L, i2);
        }
        int i4 = iImpromptu;
        long j = jDeadwork;
        int iImpassible2 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            iImpassible2 += impassible(cuirassedVarWireman, f24679beachfront, true);
        }
        if (i3 != 0) {
            atomicInteger2 = atomicInteger;
            atomicInteger2.set(impassible(cuirassedVarWireman, f24680competently, true));
        } else {
            atomicInteger2 = atomicInteger;
        }
        return new saneness("audio/vnd.dts.uhd;profile=p2", 2, i4, iImpassible + iImpassible2 + (atomicInteger2.get() != 0 ? impassible(cuirassedVarWireman, f24682impromptu, true) : 0), j, 0);
    }

    public static void attabal(byte[] bArr, int i) throws ParserException {
        int i2 = i - 2;
        if (((bArr[i - 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i2] << 8) & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) != decarock.grimness.adultoid(bArr, 0, i2, Settings.DEFAULT_INITIAL_WINDOW_SIZE)) {
            throw ParserException.createForMalformedContainer("CRC check failed", null);
        }
    }

    public static int beachfront(ByteBuffer byteBuffer) {
        int i;
        byte b;
        int i2;
        byte b2;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition = byteBuffer.position();
        byte b3 = byteBuffer.get(iPosition);
        if (b3 != -2) {
            if (b3 == -1) {
                i = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b2 = byteBuffer.get(iPosition + 7);
            } else if (b3 != 31) {
                i = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b = byteBuffer.get(iPosition + 5);
            } else {
                i = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b2 = byteBuffer.get(iPosition + 6);
            }
            i2 = b2 & 60;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b = byteBuffer.get(iPosition + 4);
        i2 = b & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }

    public static int competently(byte[] bArr) {
        int i;
        byte b;
        int i2;
        byte b2;
        byte b3 = bArr[0];
        if (b3 != -2) {
            if (b3 == -1) {
                i = (bArr[4] & 7) << 4;
                b2 = bArr[7];
            } else if (b3 != 31) {
                i = (bArr[4] & 1) << 6;
                b = bArr[5];
            } else {
                i = (bArr[5] & 7) << 4;
                b2 = bArr[6];
            }
            i2 = b2 & 60;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (bArr[5] & 1) << 6;
        b = bArr[4];
        i2 = b & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }

    public static int cutely(byte[] bArr) {
        decarock.cuirassed cuirassedVarWireman = wireman(bArr);
        cuirassedVarWireman.polloi(42);
        return cuirassedVarWireman.impromptu(cuirassedVarWireman.competently() ? 12 : 8) + 1;
    }

    public static int dern(int i) {
        if (i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368) {
            return 1;
        }
        if (i == 1683496997 || i == 622876772) {
            return 2;
        }
        if (i == 1078008818 || i == -233094848) {
            return 3;
        }
        return (i == 1908687592 || i == -398277519) ? 4 : 0;
    }

    public static int formularize(byte[] bArr) {
        decarock.cuirassed cuirassedVarWireman = wireman(bArr);
        cuirassedVarWireman.polloi(32);
        return impassible(cuirassedVarWireman, f24685taiyuan, true) + 1;
    }

    public static int impassible(decarock.cuirassed cuirassedVar, int[] iArr, boolean z) {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && cuirassedVar.competently(); i3++) {
            i2++;
        }
        if (z) {
            int i4 = 0;
            while (i < i2) {
                i4 += 1 << iArr[i];
                i++;
            }
            i = i4;
        }
        return i + cuirassedVar.impromptu(iArr[i2]);
    }

    public static androidx.media3.common.polloi impromptu(byte[] bArr, String str, String str2, int i, DrmInitData drmInitData) {
        decarock.cuirassed cuirassedVarWireman = wireman(bArr);
        cuirassedVarWireman.polloi(60);
        int i2 = f24678attabal[cuirassedVarWireman.impromptu(6)];
        int i3 = f24684saneness[cuirassedVarWireman.impromptu(4)];
        int iImpromptu = cuirassedVarWireman.impromptu(5);
        int[] iArr = f24681dern;
        int i4 = iImpromptu >= iArr.length ? -1 : (iArr[iImpromptu] * 1000) / 2;
        cuirassedVarWireman.polloi(10);
        return new androidx.media3.common.polloi.saneness().cultivated(str).sensatory(MimeTypes.AUDIO_DTS).grimness(i4).saran(i2 + (cuirassedVarWireman.impromptu(2) > 0 ? 1 : 0)).underbelly(i3).mathsort(drmInitData).treadless(str2).coi(i).polder();
    }

    public static boolean marial(byte[] bArr) {
        byte b = bArr[0];
        return b == -2 || b == -1 || b == 37 || b == -14 || b == -24;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int saneness(byte[] bArr) {
        int i;
        byte b;
        int i2;
        int i3;
        byte b2;
        boolean z = false;
        byte b3 = bArr[0];
        if (b3 != -2) {
            if (b3 == -1) {
                i3 = ((bArr[7] & 3) << 12) | ((bArr[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4);
                b2 = bArr[9];
            } else if (b3 != 31) {
                i = ((bArr[5] & 3) << 12) | ((bArr[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4);
                b = bArr[7];
            } else {
                i3 = ((bArr[6] & 3) << 12) | ((bArr[7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4);
                b2 = bArr[8];
            }
            i2 = (((b2 & 60) >> 2) | i3) + 1;
            z = true;
            if (z) {
                return (i2 * 16) / 14;
            }
            return i2;
        }
        i = ((bArr[4] & 3) << 12) | ((bArr[7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4);
        b = bArr[6];
        i2 = (((b & 240) >> 4) | i) + 1;
        if (z) {
            return (i2 * 16) / 14;
        }
        return i2;
    }

    public static saneness taiyuan(byte[] bArr) throws ParserException {
        int i;
        int i2;
        int iImpromptu;
        int i3;
        long jDeadwork;
        int i4;
        decarock.cuirassed cuirassedVarWireman = wireman(bArr);
        cuirassedVarWireman.polloi(40);
        int iImpromptu2 = cuirassedVarWireman.impromptu(2);
        if (cuirassedVarWireman.competently()) {
            i = 20;
            i2 = 12;
        } else {
            i = 16;
            i2 = 8;
        }
        cuirassedVarWireman.polloi(i2);
        int iImpromptu3 = cuirassedVarWireman.impromptu(i) + 1;
        boolean zCompetently = cuirassedVarWireman.competently();
        int iImpromptu4 = -1;
        int i5 = 0;
        if (zCompetently) {
            iImpromptu = cuirassedVarWireman.impromptu(2);
            int iImpromptu5 = (cuirassedVarWireman.impromptu(3) + 1) * 512;
            if (cuirassedVarWireman.competently()) {
                cuirassedVarWireman.polloi(36);
            }
            int iImpromptu6 = cuirassedVarWireman.impromptu(3) + 1;
            int iImpromptu7 = cuirassedVarWireman.impromptu(3) + 1;
            if (iImpromptu6 != 1 || iImpromptu7 != 1) {
                throw ParserException.createForUnsupportedContainerFeature("Multiple audio presentations or assets not supported");
            }
            int i6 = iImpromptu2 + 1;
            int iImpromptu8 = cuirassedVarWireman.impromptu(i6);
            for (int i7 = 0; i7 < i6; i7++) {
                if (((iImpromptu8 >> i7) & 1) == 1) {
                    cuirassedVarWireman.polloi(8);
                }
            }
            if (cuirassedVarWireman.competently()) {
                cuirassedVarWireman.polloi(2);
                int iImpromptu9 = (cuirassedVarWireman.impromptu(2) + 1) << 2;
                int iImpromptu10 = cuirassedVarWireman.impromptu(2) + 1;
                while (i5 < iImpromptu10) {
                    cuirassedVarWireman.polloi(iImpromptu9);
                    i5++;
                }
            }
            i5 = iImpromptu5;
        } else {
            iImpromptu = -1;
        }
        cuirassedVarWireman.polloi(i);
        cuirassedVarWireman.polloi(12);
        if (zCompetently) {
            if (cuirassedVarWireman.competently()) {
                cuirassedVarWireman.polloi(4);
            }
            if (cuirassedVarWireman.competently()) {
                cuirassedVarWireman.polloi(24);
            }
            if (cuirassedVarWireman.competently()) {
                cuirassedVarWireman.molybdenite(cuirassedVarWireman.impromptu(10) + 1);
            }
            cuirassedVarWireman.polloi(5);
            i3 = f24686wireman[cuirassedVarWireman.impromptu(4)];
            iImpromptu4 = cuirassedVarWireman.impromptu(8) + 1;
        } else {
            i3 = -2147483647;
        }
        int i8 = i3;
        if (zCompetently) {
            if (iImpromptu == 0) {
                i4 = 32000;
            } else if (iImpromptu == 1) {
                i4 = 44100;
            } else {
                if (iImpromptu != 2) {
                    throw ParserException.createForMalformedContainer("Unsupported reference clock code in DTS HD header: " + iImpromptu, null);
                }
                i4 = 48000;
            }
            jDeadwork = decarock.grimness.deadwork(i5, 1000000L, i4);
        } else {
            jDeadwork = C.TIME_UNSET;
        }
        return new saneness(MimeTypes.AUDIO_DTS_EXPRESS, iImpromptu4, i8, iImpromptu3, jDeadwork, 0);
    }

    public static decarock.cuirassed wireman(byte[] bArr) {
        byte b = bArr[0];
        if (b == 127 || b == 100 || b == 64 || b == 113) {
            return new decarock.cuirassed(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (marial(bArrCopyOf)) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b2 = bArrCopyOf[i];
                int i2 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i2];
                bArrCopyOf[i2] = b2;
            }
        }
        decarock.cuirassed cuirassedVar = new decarock.cuirassed(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            decarock.cuirassed cuirassedVar2 = new decarock.cuirassed(bArrCopyOf);
            while (cuirassedVar2.saneness() >= 16) {
                cuirassedVar2.polloi(2);
                cuirassedVar.beachfront(cuirassedVar2.impromptu(14), 14);
            }
        }
        cuirassedVar.triweekly(bArrCopyOf);
        return cuirassedVar;
    }
}
