package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.oh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4246oh0 implements InterfaceC3966lZ {
    public static final VS d = new VS("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C3982lh0(0));
    public static final VS e = new VS("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C3982lh0(1));
    public static final C4710tz f = new C4710tz(15);
    public static final List g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4158nh0 f4802a;
    public final InterfaceC2459Ha b;
    public final C4710tz c = f;

    public C4246oh0(InterfaceC2459Ha interfaceC2459Ha, InterfaceC4158nh0 interfaceC4158nh0) {
        this.b = interfaceC2459Ha;
        this.f4802a = interfaceC4158nh0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3966lZ
    public final InterfaceC3616hZ a(Object obj, int i, int i2, YS ys) throws IOException {
        long jLongValue = ((Long) ys.c(d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(AbstractC5044xl.h("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", jLongValue));
        }
        Integer num = (Integer) ys.c(e);
        if (num == null) {
            num = 2;
        }
        AbstractC2578Lp abstractC2578Lp = (AbstractC2578Lp) ys.c(AbstractC2578Lp.f);
        if (abstractC2578Lp == null) {
            abstractC2578Lp = AbstractC2578Lp.e;
        }
        AbstractC2578Lp abstractC2578Lp2 = abstractC2578Lp;
        this.c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f4802a.y(mediaMetadataRetriever, obj);
            return C2485Ia.c(c(obj, mediaMetadataRetriever, jLongValue, num.intValue(), i, i2, abstractC2578Lp2), this.b);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetriever.release();
            } else {
                mediaMetadataRetriever.release();
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3966lZ
    public final boolean b(Object obj, YS ys) {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:58:0x010b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:59:0x010d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x0155 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x0156  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public final Bitmap c(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, AbstractC2578Lp abstractC2578Lp) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        MediaExtractor mediaExtractor;
        String str = Build.DEVICE;
        Bitmap bitmapCreateBitmap = null;
        if (str != null && str.matches(".+_cheets|cheets_.+")) {
            try {
                if ("video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                    mediaExtractor = new MediaExtractor();
                    try {
                        this.f4802a.r(mediaExtractor, obj);
                        int trackCount = mediaExtractor.getTrackCount();
                        for (int i9 = 0; i9 < trackCount; i9++) {
                            if (MimeTypes.VIDEO_VP8.equals(mediaExtractor.getTrackFormat(i9).getString("mime"))) {
                                mediaExtractor.release();
                                throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
                            }
                        }
                    } catch (Throwable unused) {
                        if (mediaExtractor != null) {
                        }
                        if (Build.VERSION.SDK_INT >= 27) {
                            try {
                                i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                                i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                                i8 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                                if (i8 != 90) {
                                    i7 = i6;
                                    i6 = i7;
                                } else {
                                    i7 = i6;
                                    i6 = i7;
                                }
                                float fB = abstractC2578Lp.b(i6, i7, i2, i3);
                                bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(i6 * fB), Math.round(fB * i7));
                            } catch (Throwable unused2) {
                            }
                        }
                        if (bitmapCreateBitmap == null) {
                            bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j, i);
                        }
                        if (Build.MODEL.startsWith("Pixel")) {
                            i4 = Build.VERSION.SDK_INT;
                            if (i4 >= 30) {
                                try {
                                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
                                    String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
                                    i5 = Integer.parseInt(strExtractMetadata);
                                    int i10 = Integer.parseInt(strExtractMetadata2);
                                    if (i5 != 7) {
                                        Matrix matrix = new Matrix();
                                        matrix.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
                                    } else {
                                        Matrix matrix2 = new Matrix();
                                        matrix2.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix2, true);
                                    }
                                } catch (NumberFormatException unused3) {
                                }
                            }
                        } else {
                            i4 = Build.VERSION.SDK_INT;
                            if (i4 >= 30) {
                                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(36);
                                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(35);
                                i5 = Integer.parseInt(strExtractMetadata3);
                                int i11 = Integer.parseInt(strExtractMetadata4);
                                if (i5 != 7) {
                                    Matrix matrix3 = new Matrix();
                                    matrix3.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix3, true);
                                } else {
                                    Matrix matrix4 = new Matrix();
                                    matrix4.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix4, true);
                                }
                            }
                        }
                        if (bitmapCreateBitmap != null) {
                            return bitmapCreateBitmap;
                        }
                        throw new C3770jF(1);
                    }
                    mediaExtractor.release();
                }
            } catch (Throwable unused4) {
                mediaExtractor = null;
            }
        }
        if (Build.VERSION.SDK_INT >= 27 && i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE && abstractC2578Lp != AbstractC2578Lp.d) {
            i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            i8 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i8 != 90 || i8 == 270) {
                i7 = i6;
                i6 = i7;
            }
            float fB2 = abstractC2578Lp.b(i6, i7, i2, i3);
            bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(i6 * fB2), Math.round(fB2 * i7));
        }
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j, i);
        }
        if (Build.MODEL.startsWith("Pixel") || Build.VERSION.SDK_INT != 33) {
            i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30 && i4 < 33) {
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(36);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(35);
                i5 = Integer.parseInt(strExtractMetadata5);
                int i12 = Integer.parseInt(strExtractMetadata6);
                if ((i5 != 7 || i5 == 6) && i12 == 6 && Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                    Matrix matrix5 = new Matrix();
                    matrix5.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix5, true);
                }
            }
        } else {
            Iterator it = g.iterator();
            do {
                if (it.hasNext()) {
                }
            } while (!Build.ID.startsWith((String) it.next()));
            String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(36);
            String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(35);
            i5 = Integer.parseInt(strExtractMetadata7);
            int i13 = Integer.parseInt(strExtractMetadata8);
            if (i5 != 7) {
                Matrix matrix6 = new Matrix();
                matrix6.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix6, true);
            } else {
                Matrix matrix7 = new Matrix();
                matrix7.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix7, true);
            }
        }
        if (bitmapCreateBitmap != null) {
            return bitmapCreateBitmap;
        }
        throw new C3770jF(1);
    }
}
