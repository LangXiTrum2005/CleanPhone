package androidx.media3.extractor;

import android.support.v4.media.a;

/* JADX INFO: loaded from: classes.dex */
public final class MpegAudioUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f6785a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f6786b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f6787c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f6788e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class Header {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f6790b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6791c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f6792e;
        public int f;
        public int g;

        public final boolean a(int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (!((i2 & (-2097152)) == -2097152) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
                return false;
            }
            this.f6789a = i3;
            this.f6790b = MpegAudioUtil.f6785a[3 - i4];
            int i7 = MpegAudioUtil.f6786b[i6];
            this.d = i7;
            if (i3 == 2) {
                this.d = i7 / 2;
            } else if (i3 == 0) {
                this.d = i7 / 4;
            }
            int i8 = (i2 >>> 9) & 1;
            int i9 = 1152;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new IllegalArgumentException();
                    }
                    i9 = 384;
                }
            } else if (i3 != 3) {
                i9 = 576;
            }
            this.g = i9;
            if (i4 == 3) {
                int i10 = i3 == 3 ? MpegAudioUtil.f6787c[i5 - 1] : MpegAudioUtil.d[i5 - 1];
                this.f = i10;
                this.f6791c = (((i10 * 12) / this.d) + i8) * 4;
            } else {
                if (i3 == 3) {
                    int i11 = i4 == 2 ? MpegAudioUtil.f6788e[i5 - 1] : MpegAudioUtil.f[i5 - 1];
                    this.f = i11;
                    this.f6791c = ((i11 * 144) / this.d) + i8;
                } else {
                    int i12 = MpegAudioUtil.g[i5 - 1];
                    this.f = i12;
                    this.f6791c = (((i4 == 1 ? 72 : 144) * i12) / this.d) + i8;
                }
            }
            this.f6792e = ((i2 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int a(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (!((i2 & (-2097152)) == -2097152) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = f6786b[i6];
        if (i3 == 2) {
            i8 /= 2;
        } else if (i3 == 0) {
            i8 /= 4;
        }
        int i9 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? f6787c[i5 - 1] : d[i5 - 1]) * 12) / i8) + i9) * 4;
        }
        if (i3 == 3) {
            i7 = i4 == 2 ? f6788e[i5 - 1] : f[i5 - 1];
        } else {
            i7 = g[i5 - 1];
        }
        if (i3 == 3) {
            return a.B(i7, 144, i8, i9);
        }
        return a.B(i4 == 1 ? 72 : 144, i7, i8, i9);
    }
}
