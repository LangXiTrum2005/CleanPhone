package cybernatic;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import org.objectweb.asm.Opcodes;

/* JADX INFO: compiled from: MpegAudioUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class sealless {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final String[] f24759attabal = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final int[] f24764saneness = {44100, 48000, 32000};

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int[] f24762dern = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final int[] f24765wireman = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final int[] f24763marial = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final int[] f24760beachfront = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final int[] f24761competently = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: compiled from: MpegAudioUtil.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f24766attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public int f24767beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public int f24768competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f24769dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int f24770marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public String f24771saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f24772wireman;

        public attabal() {
        }

        public boolean attabal(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            if (!sealless.formularize(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.f24766attabal = i2;
            this.f24771saneness = sealless.f24759attabal[3 - i3];
            int i6 = sealless.f24764saneness[i5];
            this.f24772wireman = i6;
            if (i2 == 2) {
                this.f24772wireman = i6 / 2;
            } else if (i2 == 0) {
                this.f24772wireman = i6 / 4;
            }
            int i7 = (i >>> 9) & 1;
            this.f24768competently = sealless.apical(i2, i3);
            if (i3 == 3) {
                int i8 = i2 == 3 ? sealless.f24762dern[i4 - 1] : sealless.f24765wireman[i4 - 1];
                this.f24767beachfront = i8;
                this.f24769dern = (((i8 * 12) / this.f24772wireman) + i7) * 4;
            } else {
                int i9 = Opcodes.D2F;
                if (i2 == 3) {
                    int i10 = i3 == 2 ? sealless.f24763marial[i4 - 1] : sealless.f24760beachfront[i4 - 1];
                    this.f24767beachfront = i10;
                    this.f24769dern = ((i10 * Opcodes.D2F) / this.f24772wireman) + i7;
                } else {
                    int i11 = sealless.f24761competently[i4 - 1];
                    this.f24767beachfront = i11;
                    if (i3 == 1) {
                        i9 = 72;
                    }
                    this.f24769dern = ((i9 * i11) / this.f24772wireman) + i7;
                }
            }
            this.f24770marial = ((i >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }

        public attabal(attabal attabalVar) {
            this.f24766attabal = attabalVar.f24766attabal;
            this.f24771saneness = attabalVar.f24771saneness;
            this.f24769dern = attabalVar.f24769dern;
            this.f24772wireman = attabalVar.f24772wireman;
            this.f24770marial = attabalVar.f24770marial;
            this.f24767beachfront = attabalVar.f24767beachfront;
            this.f24768competently = attabalVar.f24768competently;
        }
    }

    public static int apical(int i, int i2) {
        if (i2 == 1) {
            return i == 3 ? 1152 : 576;
        }
        if (i2 == 2) {
            return 1152;
        }
        if (i2 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    public static int cutely(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!formularize(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f24764saneness[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f24762dern[i4 - 1] : f24765wireman[i4 - 1]) * 12) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? f24763marial[i4 - 1] : f24760beachfront[i4 - 1];
        } else {
            i6 = f24761competently[i4 - 1];
        }
        int i9 = Opcodes.D2F;
        if (i2 == 3) {
            return ((i6 * Opcodes.D2F) / i7) + i8;
        }
        if (i3 == 1) {
            i9 = 72;
        }
        return ((i9 * i6) / i7) + i8;
    }

    public static boolean formularize(int i) {
        return (i & (-2097152)) == -2097152;
    }

    public static int impassible(int i) {
        int i2;
        int i3;
        if (!formularize(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        return apical(i2, i3);
    }
}
