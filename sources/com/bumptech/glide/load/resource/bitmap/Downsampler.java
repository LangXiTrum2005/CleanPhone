package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import com.p004ironsource.d9;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class Downsampler {
    public static final Option f = Option.a(DecodeFormat.Z, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
    public static final Option g = new Option("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, Option.f12365e);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Option f12655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Option f12656i;
    public static final DecodeCallbacks j;
    public static final ArrayDeque k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitmapPool f12657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f12658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LruArrayPool f12659c;
    public final ArrayList d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HardwareConfigState f12660e = HardwareConfigState.a();

    public interface DecodeCallbacks {
        void a(Bitmap bitmap, BitmapPool bitmapPool);

        void b();
    }

    static {
        DownsampleStrategy downsampleStrategy = DownsampleStrategy.f12650a;
        Boolean bool = Boolean.FALSE;
        f12655h = Option.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f12656i = Option.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        j = new AnonymousClass1();
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = Util.f12851a;
        k = new ArrayDeque(0);
    }

    public Downsampler(ArrayList arrayList, DisplayMetrics displayMetrics, BitmapPool bitmapPool, LruArrayPool lruArrayPool) {
        this.d = arrayList;
        Preconditions.c(displayMetrics, "Argument must not be null");
        this.f12658b = displayMetrics;
        Preconditions.c(bitmapPool, "Argument must not be null");
        this.f12657a = bitmapPool;
        Preconditions.c(lruArrayPool, "Argument must not be null");
        this.f12659c = lruArrayPool;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(com.bumptech.glide.load.resource.bitmap.ImageReader r9, android.graphics.BitmapFactory.Options r10, com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks r11, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r12) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r10.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r11.b()
            r9.b()
        Lc:
            int r1 = r10.outWidth
            int r2 = r10.outHeight
            java.lang.String r3 = r10.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.d
            r4.lock()
            android.graphics.Bitmap r9 = r9.a(r10)     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.Throwable -> L66
            r4.unlock()
            return r9
        L1f:
            r4 = move-exception
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L66
            java.lang.String r6 = "Exception decoding bitmap, outWidth: "
            java.lang.String r7 = ", outHeight: "
            java.lang.String r8 = ", outMimeType: "
            java.lang.StringBuilder r1 = androidx.datastore.preferences.protobuf.a.p(r1, r2, r6, r7, r8)     // Catch: java.lang.Throwable -> L66
            r1.append(r3)     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = ", inBitmap: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L66
            android.graphics.Bitmap r2 = r10.inBitmap     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = d(r2)     // Catch: java.lang.Throwable -> L66
            r1.append(r2)     // Catch: java.lang.Throwable -> L66
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L66
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L66
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L50
            java.lang.String r1 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r1, r5)     // Catch: java.lang.Throwable -> L66
        L50:
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L65
            r12.b(r0)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L66
            r0 = 0
            r10.inBitmap = r0     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L66
            android.graphics.Bitmap r9 = c(r9, r10, r11, r12)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L66
            java.util.concurrent.locks.Lock r10 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.d
            r10.unlock()
            return r9
        L64:
            throw r5     // Catch: java.lang.Throwable -> L66
        L65:
            throw r5     // Catch: java.lang.Throwable -> L66
        L66:
            r9 = move-exception
            java.util.concurrent.locks.Lock r10 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.d
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.Downsampler.c(com.bumptech.glide.load.resource.bitmap.ImageReader, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.Downsampler$DecodeCallbacks, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return d9.i.d + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final BitmapResource a(ImageReader imageReader, int i2, int i3, Options options, DecodeCallbacks decodeCallbacks) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.f12659c.d(65536, byte[].class);
        synchronized (Downsampler.class) {
            arrayDeque = k;
            synchronized (arrayDeque) {
                options2 = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options2 == null) {
                options2 = new BitmapFactory.Options();
                e(options2);
            }
        }
        options2.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) options.c(f);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) options.c(g);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) options.c(DownsampleStrategy.f);
        boolean zBooleanValue = ((Boolean) options.c(f12655h)).booleanValue();
        Option option = f12656i;
        try {
            BitmapResource bitmapResourceB = BitmapResource.b(b(imageReader, options2, downsampleStrategy, decodeFormat, preferredColorSpace, options.c(option) != null && ((Boolean) options.c(option)).booleanValue(), i2, i3, zBooleanValue, decodeCallbacks), this.f12657a);
            e(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            return bitmapResourceB;
        } finally {
            e(options2);
            ArrayDeque arrayDeque2 = k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.f12659c.i(bArr);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:162:0x039f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.graphics.Bitmap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool] */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r51v0, types: [com.bumptech.glide.load.resource.bitmap.Downsampler$DecodeCallbacks] */
    public final Bitmap b(ImageReader imageReader, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z2, int i2, int i3, boolean z3, DecodeCallbacks decodeCallbacks) {
        int i4;
        boolean z4;
        int i5;
        int i6;
        int i7;
        String str;
        String str2;
        BitmapPool bitmapPool;
        int i8;
        int i9;
        int i10;
        boolean z5;
        boolean zHasAlpha;
        boolean z6;
        int iRound;
        int i11;
        ?? r15;
        Bitmap.Config config;
        int i12;
        int i13;
        int iFloor;
        int iFloor2;
        int i14 = LogTime.f12842b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        BitmapPool bitmapPool2 = this.f12657a;
        c(imageReader, options, decodeCallbacks, bitmapPool2);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i15 = iArr[0];
        int i16 = iArr[1];
        String str3 = options.outMimeType;
        boolean z7 = (i15 == -1 || i16 == -1) ? false : z2;
        int iC = imageReader.c();
        switch (iC) {
            case 3:
            case 4:
                i4 = 180;
                break;
            case 5:
            case 6:
                i4 = 90;
                break;
            case 7:
            case 8:
                i4 = 270;
                break;
            default:
                i4 = 0;
                break;
        }
        switch (iC) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z4 = true;
                break;
            default:
                z4 = false;
                break;
        }
        if (i2 == Integer.MIN_VALUE) {
            if (i4 != 90) {
                i5 = 270;
                if (i4 != 270) {
                    i6 = i15;
                }
            } else {
                i5 = 270;
            }
            i6 = i16;
        } else {
            i5 = 270;
            i6 = i2;
        }
        if (i3 == Integer.MIN_VALUE) {
            i7 = (i4 == 90 || i4 == i5) ? i15 : i16;
        } else {
            i7 = i3;
        }
        ImageHeaderParser.ImageType imageTypeD = imageReader.d();
        boolean z8 = z7;
        if (i15 <= 0 || i16 <= 0) {
            str = ", density: ";
            str2 = ", target density: ";
            bitmapPool = bitmapPool2;
            i8 = i16;
            i9 = i15;
            i10 = i6;
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + imageTypeD + " with target [" + i10 + "x" + i7 + d9.i.f24752e);
            }
        } else {
            if (i4 == 90 || i4 == 270) {
                i12 = i16;
                i13 = i15;
            } else {
                i13 = i16;
                i12 = i15;
            }
            i10 = i6;
            float fB = downsampleStrategy.b(i12, i13, i10, i7);
            if (fB <= 0.0f) {
                StringBuilder sb = new StringBuilder("Cannot scale with factor: ");
                sb.append(fB);
                sb.append(" from: ");
                sb.append(downsampleStrategy);
                sb.append(", source: [");
                androidx.datastore.preferences.protobuf.a.y(sb, i15, "x", i16, "], target: [");
                sb.append(i10);
                sb.append("x");
                sb.append(i7);
                sb.append(d9.i.f24752e);
                throw new IllegalArgumentException(sb.toString());
            }
            DownsampleStrategy.SampleSizeRounding sampleSizeRoundingA = downsampleStrategy.a(i12, i13, i10, i7);
            if (sampleSizeRoundingA == null) {
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            int i17 = i4;
            float f2 = i12;
            int i18 = i12;
            float f3 = i13;
            int i19 = i18 / ((int) (((double) (fB * f2)) + 0.5d));
            int i20 = i13 / ((int) (((double) (fB * f3)) + 0.5d));
            DownsampleStrategy.SampleSizeRounding sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.X;
            int iMax = Math.max(1, Integer.highestOneBit(sampleSizeRoundingA == sampleSizeRounding ? Math.max(i19, i20) : Math.min(i19, i20)));
            if (sampleSizeRoundingA == sampleSizeRounding && iMax < 1.0f / fB) {
                iMax <<= 1;
            }
            options.inSampleSize = iMax;
            if (imageTypeD == ImageHeaderParser.ImageType.JPEG) {
                float fMin = Math.min(iMax, 8);
                iFloor = (int) Math.ceil(f2 / fMin);
                iFloor2 = (int) Math.ceil(f3 / fMin);
                int i21 = iMax / 8;
                if (i21 > 0) {
                    iFloor /= i21;
                    iFloor2 /= i21;
                }
            } else if (imageTypeD == ImageHeaderParser.ImageType.PNG || imageTypeD == ImageHeaderParser.ImageType.PNG_A) {
                float f4 = iMax;
                iFloor = (int) Math.floor(f2 / f4);
                iFloor2 = (int) Math.floor(f3 / f4);
            } else if (imageTypeD.isWebp()) {
                float f5 = iMax;
                iFloor = Math.round(f2 / f5);
                iFloor2 = Math.round(f3 / f5);
            } else if (i18 % iMax == 0 && i13 % iMax == 0) {
                iFloor = i18 / iMax;
                iFloor2 = i13 / iMax;
            } else {
                options.inJustDecodeBounds = true;
                c(imageReader, options, decodeCallbacks, bitmapPool2);
                options.inJustDecodeBounds = false;
                int[] iArr2 = {options.outWidth, options.outHeight};
                iFloor = iArr2[0];
                iFloor2 = iArr2[1];
            }
            double dB = downsampleStrategy.b(iFloor, iFloor2, i10, i7);
            int iRound2 = (int) Math.round((dB <= 1.0d ? dB : 1.0d / dB) * 2.147483647E9d);
            int i22 = (int) ((((double) iRound2) * dB) + 0.5d);
            bitmapPool = bitmapPool2;
            options.inTargetDensity = (int) (((dB / ((double) (i22 / iRound2))) * ((double) i22)) + 0.5d);
            int iRound3 = (int) Math.round((dB <= 1.0d ? dB : 1.0d / dB) * 2.147483647E9d);
            options.inDensity = iRound3;
            int i23 = options.inTargetDensity;
            if (i23 <= 0 || iRound3 <= 0 || i23 == iRound3) {
                options.inTargetDensity = 0;
                options.inDensity = 0;
            } else {
                options.inScaled = true;
            }
            if (Log.isLoggable("Downsampler", 2)) {
                i9 = i15;
                i8 = i16;
                StringBuilder sbP = androidx.datastore.preferences.protobuf.a.p(i9, i8, "Calculate scaling, source: [", "x", "], degreesToRotate: ");
                androidx.datastore.preferences.protobuf.a.y(sbP, i17, ", target: [", i10, "x");
                androidx.datastore.preferences.protobuf.a.y(sbP, i7, "], power of two scaled: [", iFloor, "x");
                sbP.append(iFloor2);
                sbP.append("], exact scale factor: ");
                sbP.append(fB);
                sbP.append(", power of 2 sample size: ");
                sbP.append(iMax);
                sbP.append(", adjusted scale factor: ");
                sbP.append(dB);
                str2 = ", target density: ";
                sbP.append(str2);
                sbP.append(options.inTargetDensity);
                str = ", density: ";
                sbP.append(str);
                sbP.append(options.inDensity);
                Log.v("Downsampler", sbP.toString());
            } else {
                str = r6;
                str2 = ", target density: ";
                i9 = i15;
                i8 = i16;
            }
        }
        boolean zB = this.f12660e.b(i10, i7, z8, z4);
        if (zB) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            z5 = false;
            options.inMutable = false;
        } else {
            z5 = false;
        }
        if (zB) {
            z6 = true;
        } else if (decodeFormat != DecodeFormat.X) {
            try {
                zHasAlpha = imageReader.d().hasAlpha();
            } catch (IOException e2) {
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + decodeFormat, e2);
                }
                zHasAlpha = z5;
            }
            Bitmap.Config config2 = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            options.inPreferredConfig = config2;
            if (config2 == Bitmap.Config.RGB_565) {
                z6 = true;
                options.inDither = true;
            } else {
                z6 = true;
            }
        } else {
            z6 = true;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        }
        int i24 = Build.VERSION.SDK_INT;
        if (i9 < 0 || i8 < 0 || !z3) {
            int i25 = options.inTargetDensity;
            float f6 = (i25 <= 0 || (i11 = options.inDensity) <= 0 || i25 == i11) ? z5 : z6 ? i25 / options.inDensity : 1.0f;
            int i26 = options.inSampleSize;
            float f7 = i26;
            int iCeil = (int) Math.ceil(i9 / f7);
            int iCeil2 = (int) Math.ceil(i8 / f7);
            iRound = Math.round(iCeil * f6);
            int iRound4 = Math.round(iCeil2 * f6);
            if (Log.isLoggable("Downsampler", 2)) {
                StringBuilder sbP2 = androidx.datastore.preferences.protobuf.a.p(iRound, iRound4, "Calculated target [", "x", "] for source [");
                androidx.datastore.preferences.protobuf.a.y(sbP2, i9, "x", i8, "], sampleSize: ");
                sbP2.append(i26);
                sbP2.append(", targetDensity: ");
                sbP2.append(options.inTargetDensity);
                sbP2.append(str);
                sbP2.append(options.inDensity);
                sbP2.append(", density multiplier: ");
                sbP2.append(f6);
                Log.v("Downsampler", sbP2.toString());
            }
            i7 = iRound4;
        } else {
            iRound = i10;
        }
        ?? r1 = 0;
        if (iRound <= 0 || i7 <= 0) {
            r15 = bitmapPool;
        } else {
            if (i24 < 26) {
                config = null;
            } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
                r15 = bitmapPool;
            } else {
                config = options.outConfig;
            }
            if (config == null) {
                config = options.inPreferredConfig;
            }
            BitmapPool bitmapPool3 = bitmapPool;
            options.inBitmap = bitmapPool3.a(iRound, i7, config);
            r15 = bitmapPool3;
        }
        if (preferredColorSpace != null) {
            if (i24 >= 28) {
                options.inPreferredColorSpace = ColorSpace.get(preferredColorSpace == PreferredColorSpace.X && options.outColorSpace != null && options.outColorSpace.isWideGamut() ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else if (i24 >= 26) {
                ColorSpace.Named unused = ColorSpace.Named.SRGB;
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        ?? C = c(imageReader, options, decodeCallbacks, r15);
        decodeCallbacks.a(C, r15);
        if (Log.isLoggable("Downsampler", 2)) {
            Log.v("Downsampler", "Decoded " + d(C) + " from [" + i9 + "x" + i8 + "] " + str3 + " with inBitmap " + d(options.inBitmap) + " for [" + i2 + "x" + i3 + "], sample size: " + options.inSampleSize + str + options.inDensity + str2 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + LogTime.a(jElapsedRealtimeNanos));
        }
        if (C != 0) {
            C.setDensity(this.f12658b.densityDpi);
            switch (iC) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    Matrix matrix = new Matrix();
                    switch (iC) {
                        case 2:
                            matrix.setScale(-1.0f, 1.0f);
                            break;
                        case 3:
                            matrix.setRotate(180.0f);
                            break;
                        case 4:
                            matrix.setRotate(180.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 5:
                            matrix.setRotate(90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 6:
                            matrix.setRotate(90.0f);
                            break;
                        case 7:
                            matrix.setRotate(-90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 8:
                            matrix.setRotate(-90.0f);
                            break;
                    }
                    RectF rectF = new RectF(0.0f, 0.0f, C.getWidth(), C.getHeight());
                    matrix.mapRect(rectF);
                    Bitmap bitmapE = r15.e(Math.round(rectF.width()), Math.round(rectF.height()), C.getConfig() != null ? C.getConfig() : Bitmap.Config.ARGB_8888);
                    matrix.postTranslate(-rectF.left, -rectF.top);
                    bitmapE.setHasAlpha(C.hasAlpha());
                    TransformationUtils.a(C, bitmapE, matrix);
                    r1 = bitmapE;
                    break;
                default:
                    r1 = C;
                    break;
            }
            if (!C.equals(r1)) {
                r15.b(C);
            }
        }
        return r1;
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.Downsampler$1, reason: invalid class name */
    public class AnonymousClass1 implements DecodeCallbacks {
        @Override // com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks
        public final void b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks
        public final void a(Bitmap bitmap, BitmapPool bitmapPool) {
        }
    }
}
