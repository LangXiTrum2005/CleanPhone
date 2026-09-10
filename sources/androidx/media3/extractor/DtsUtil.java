package androidx.media3.extractor;

import androidx.media3.common.util.ParsableBitArray;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.p004ironsource.mediationsdk.metadata.a;
import com.smartdigimkt.v0.p;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class DtsUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f6748a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f6749b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f6750c = {64, 112, 128, PsExtractor.AUDIO_STREAM, 224, 256, 384, p.e.f39014a, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, a.f25965n, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f6751e = {5, 8, 10, 12};
    public static final int[] f = {6, 9, 12, 15};
    public static final int[] g = {2, 4, 6, 8};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f6752h = {9, 11, 13, 16};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f6753i = {5, 8, 10, 12};

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DtsAudioMimeType {
    }

    public static final class DtsHeader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6756c;

        public DtsHeader(String str, int i2, int i3, int i4, long j) {
            this.f6754a = str;
            this.f6756c = i2;
            this.f6755b = i3;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FrameType {
    }

    public static ParsableBitArray a(byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 == 127 || b2 == 100 || b2 == 64 || b2 == 113) {
            return new ParsableBitArray(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = bArrCopyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b4 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b4;
            }
        }
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArrCopyOf, bArrCopyOf.length);
        if (bArrCopyOf[0] == 31) {
            ParsableBitArray parsableBitArray2 = new ParsableBitArray(bArrCopyOf, bArrCopyOf.length);
            while (parsableBitArray2.b() >= 16) {
                parsableBitArray2.o(2);
                int iG = parsableBitArray2.g(14) & 16383;
                int iMin = Math.min(8 - parsableBitArray.f5665c, 14);
                int i4 = parsableBitArray.f5665c;
                int i5 = (8 - i4) - iMin;
                byte[] bArr2 = parsableBitArray.f5663a;
                int i6 = parsableBitArray.f5664b;
                byte b5 = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr2[i6]);
                bArr2[i6] = b5;
                int i7 = 14 - iMin;
                bArr2[i6] = (byte) (b5 | ((iG >>> i7) << i5));
                int i8 = i6 + 1;
                while (i7 > 8) {
                    parsableBitArray.f5663a[i8] = (byte) (iG >>> (i7 - 8));
                    i7 -= 8;
                    i8++;
                }
                int i9 = 8 - i7;
                byte[] bArr3 = parsableBitArray.f5663a;
                byte b6 = (byte) (bArr3[i8] & ((1 << i9) - 1));
                bArr3[i8] = b6;
                bArr3[i8] = (byte) (((iG & ((1 << i7) - 1)) << i9) | b6);
                parsableBitArray.o(14);
                parsableBitArray.a();
            }
        }
        parsableBitArray.l(bArrCopyOf, bArrCopyOf.length);
        return parsableBitArray;
    }

    public static int b(ParsableBitArray parsableBitArray, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && parsableBitArray.f(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return parsableBitArray.g(iArr[i2]) + i4;
    }
}
