package n6;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements e6.k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e6.h f46578d = new e6.h("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a0());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e6.h f46579e = new e6.h("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new s4.i(27));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j2.n f46580f = new j2.n(28);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f46581g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f46582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h6.a f46583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j2.n f46584c = f46580f;

    public e0(h6.a aVar, c0 c0Var) {
        this.f46583b = aVar;
        this.f46582a = c0Var;
    }

    @Override // e6.k
    public final g6.a0 a(Object obj, int i10, int i11, e6.i iVar) throws IOException {
        long jLongValue = ((Long) iVar.c(f46578d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(defpackage.e.i(jLongValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
        }
        Integer num = (Integer) iVar.c(f46579e);
        if (num == null) {
            num = 2;
        }
        l lVar = (l) iVar.c(l.f46592c);
        if (lVar == null) {
            lVar = l.f46591b;
        }
        l lVar2 = lVar;
        this.f46584c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f46582a.q(mediaMetadataRetriever, obj);
            return new d(c(obj, mediaMetadataRetriever, jLongValue, num.intValue(), i10, i11, lVar2), this.f46583b);
        } finally {
            mediaMetadataRetriever.close();
        }
    }

    @Override // e6.k
    public final boolean b(Object obj, e6.i iVar) {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:63:0x0100  */
    /* JADX WARN: Code duplicated, block: B:65:0x0104  */
    /* JADX WARN: Code duplicated, block: B:68:0x011c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x011e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x0136  */
    /* JADX WARN: Code duplicated, block: B:81:0x017b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x017c  */
    public final Bitmap c(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, l lVar) {
        int i13;
        int i14;
        int i15;
        int i16;
        MediaExtractor mediaExtractor;
        String str = Build.DEVICE;
        Bitmap bitmapCreateBitmap = null;
        if (str != null && str.matches(".+_cheets|cheets_.+")) {
            try {
                if ("video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                    mediaExtractor = new MediaExtractor();
                    try {
                        this.f46582a.k(mediaExtractor, obj);
                        int trackCount = mediaExtractor.getTrackCount();
                        for (int i17 = 0; i17 < trackCount; i17++) {
                            if (MimeTypes.VIDEO_VP8.equals(mediaExtractor.getTrackFormat(i17).getString("mime"))) {
                                mediaExtractor.release();
                                throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            if (Log.isLoggable("VideoDecoder", 3)) {
                                Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                            }
                            if (mediaExtractor != null) {
                            }
                            if (i11 != Integer.MIN_VALUE) {
                                try {
                                    i14 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                                    i15 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                                    i16 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                                    if (i16 != 90) {
                                        i15 = i14;
                                        i14 = i15;
                                    } else {
                                        i15 = i14;
                                        i14 = i15;
                                    }
                                    float fB = lVar.b(i14, i15, i11, i12);
                                    bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(i14 * fB), Math.round(fB * i15));
                                } catch (Throwable th3) {
                                    if (Log.isLoggable("VideoDecoder", 3)) {
                                        Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th3);
                                    }
                                }
                            }
                            if (bitmapCreateBitmap == null) {
                                bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j10, i10);
                            }
                            if (!Build.MODEL.startsWith("Pixel")) {
                                if (Build.VERSION.SDK_INT < 33) {
                                    try {
                                        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
                                        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
                                        i13 = Integer.parseInt(strExtractMetadata);
                                        int i18 = Integer.parseInt(strExtractMetadata2);
                                        if (i13 != 7) {
                                            if (Log.isLoggable("VideoDecoder", 3)) {
                                                Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                                            }
                                            Matrix matrix = new Matrix();
                                            matrix.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
                                        } else {
                                            if (Log.isLoggable("VideoDecoder", 3)) {
                                                Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                                            }
                                            Matrix matrix2 = new Matrix();
                                            matrix2.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix2, true);
                                        }
                                    } catch (NumberFormatException unused) {
                                        if (Log.isLoggable("VideoDecoder", 3)) {
                                            Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
                                        }
                                    }
                                }
                            } else if (Build.VERSION.SDK_INT < 33) {
                                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(36);
                                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(35);
                                i13 = Integer.parseInt(strExtractMetadata3);
                                int i19 = Integer.parseInt(strExtractMetadata4);
                                if (i13 != 7) {
                                    if (Log.isLoggable("VideoDecoder", 3)) {
                                        Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                                    }
                                    Matrix matrix3 = new Matrix();
                                    matrix3.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix3, true);
                                } else {
                                    if (Log.isLoggable("VideoDecoder", 3)) {
                                        Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                                    }
                                    Matrix matrix4 = new Matrix();
                                    matrix4.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix4, true);
                                }
                            }
                            if (bitmapCreateBitmap != null) {
                                return bitmapCreateBitmap;
                            }
                            throw new d0("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
                        } catch (Throwable th4) {
                            if (mediaExtractor != null) {
                                mediaExtractor.release();
                            }
                            throw th4;
                        }
                    }
                    mediaExtractor.release();
                }
            } catch (Throwable th5) {
                th = th5;
                mediaExtractor = null;
            }
        }
        if (i11 != Integer.MIN_VALUE && i12 != Integer.MIN_VALUE && lVar != l.f46590a) {
            i14 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            i15 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            i16 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i16 != 90 || i16 == 270) {
                i15 = i14;
                i14 = i15;
            }
            float fB2 = lVar.b(i14, i15, i11, i12);
            bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(i14 * fB2), Math.round(fB2 * i15));
        }
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j10, i10);
        }
        if (!Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            Iterator it = f46581g.iterator();
            do {
                if (it.hasNext()) {
                }
            } while (!Build.ID.startsWith((String) it.next()));
            String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(36);
            String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(35);
            i13 = Integer.parseInt(strExtractMetadata5);
            int i110 = Integer.parseInt(strExtractMetadata6);
            if (i13 != 7) {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                }
                Matrix matrix5 = new Matrix();
                matrix5.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix5, true);
            } else {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                }
                Matrix matrix6 = new Matrix();
                matrix6.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix6, true);
            }
        } else if (Build.VERSION.SDK_INT < 33) {
            String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(36);
            String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(35);
            i13 = Integer.parseInt(strExtractMetadata7);
            int i111 = Integer.parseInt(strExtractMetadata8);
            if ((i13 != 7 || i13 == 6) && i111 == 6 && Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                }
                Matrix matrix7 = new Matrix();
                matrix7.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix7, true);
            }
        }
        if (bitmapCreateBitmap != null) {
            return bitmapCreateBitmap;
        }
        throw new d0("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
    }
}
