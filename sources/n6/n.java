package n6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.dm0;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e6.h f46594f = e6.h.a(e6.a.f39139c, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e6.h f46595g = new e6.h("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, e6.h.f39143e);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e6.h f46596h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e6.h f46597i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final jj.d f46598j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ArrayDeque f46599k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h6.a f46600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f46601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm0 f46602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f46603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f46604e = s.a();

    static {
        j jVar = l.f46590a;
        Boolean bool = Boolean.FALSE;
        f46596h = e6.h.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f46597i = e6.h.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f46598j = new jj.d(26);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = a7.p.f3444a;
        f46599k = new ArrayDeque(0);
    }

    public n(ArrayList arrayList, DisplayMetrics displayMetrics, h6.a aVar, dm0 dm0Var) {
        this.f46603d = arrayList;
        a7.h.c(displayMetrics, "Argument must not be null");
        this.f46601b = displayMetrics;
        a7.h.c(aVar, "Argument must not be null");
        this.f46600a = aVar;
        a7.h.c(dm0Var, "Argument must not be null");
        this.f46602c = dm0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(n6.t r9, android.graphics.BitmapFactory.Options r10, n6.m r11, h6.a r12) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r10.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r11.l()
            r9.j()
        Lc:
            int r1 = r10.outWidth
            int r2 = r10.outHeight
            java.lang.String r3 = r10.outMimeType
            java.util.concurrent.locks.Lock r4 = n6.x.f46619b
            r4.lock()
            android.graphics.Bitmap r9 = r9.h(r10)     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.Throwable -> L66
            r4.unlock()
            return r9
        L1f:
            r4 = move-exception
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L66
            java.lang.String r6 = "Exception decoding bitmap, outWidth: "
            java.lang.String r7 = ", outHeight: "
            java.lang.String r8 = ", outMimeType: "
            java.lang.StringBuilder r1 = l1.d.l(r6, r1, r7, r2, r8)     // Catch: java.lang.Throwable -> L66
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
            java.util.concurrent.locks.Lock r10 = n6.x.f46619b
            r10.unlock()
            return r9
        L64:
            throw r5     // Catch: java.lang.Throwable -> L66
        L65:
            throw r5     // Catch: java.lang.Throwable -> L66
        L66:
            r9 = move-exception
            java.util.concurrent.locks.Lock r10 = n6.x.f46619b
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.n.c(n6.t, android.graphics.BitmapFactory$Options, n6.m, h6.a):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return X3.j.f27834d + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
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
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final d a(t tVar, int i10, int i11, e6.i iVar, m mVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.f46602c.d(byte[].class, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        synchronized (n.class) {
            arrayDeque = f46599k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                e(options);
            }
        }
        options.inTempStorage = bArr;
        e6.a aVar = (e6.a) iVar.c(f46594f);
        e6.j jVar = (e6.j) iVar.c(f46595g);
        l lVar = (l) iVar.c(l.f46592c);
        boolean zBooleanValue = ((Boolean) iVar.c(f46596h)).booleanValue();
        e6.h hVar = f46597i;
        try {
            Bitmap bitmapB = b(tVar, options, lVar, aVar, jVar, iVar.c(hVar) != null && ((Boolean) iVar.c(hVar)).booleanValue(), i10, i11, zBooleanValue, mVar);
            d dVar = bitmapB == null ? null : new d(bitmapB, this.f46600a);
            e(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            this.f46602c.h(bArr);
            return dVar;
        } catch (Throwable th2) {
            e(options);
            ArrayDeque arrayDeque2 = f46599k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.f46602c.h(bArr);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:102:0x023a  */
    /* JADX WARN: Code duplicated, block: B:115:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:85:0x0195  */
    /* JADX WARN: Code duplicated, block: B:86:0x0198  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:97:0x01db  */
    public final Bitmap b(t tVar, BitmapFactory.Options options, l lVar, e6.a aVar, e6.j jVar, boolean z10, int i10, int i11, boolean z11, m mVar) {
        int i12;
        boolean z12;
        int i13;
        int i14;
        String str;
        String str2;
        h6.a aVar2;
        int i15;
        boolean zHasAlpha;
        boolean z13;
        int i16;
        h6.a aVar3;
        Bitmap bitmap;
        ColorSpace colorSpace;
        Bitmap.Config config;
        int i17;
        int i18;
        int iFloor;
        int iFloor2;
        int iRound;
        int iRound2;
        double dB;
        double d10;
        int i19;
        int i20;
        double d11;
        int i21;
        int i22 = a7.j.f3432b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        h6.a aVar4 = this.f46600a;
        c(tVar, options, mVar, aVar4);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i23 = iArr[0];
        int i24 = iArr[1];
        String str3 = options.outMimeType;
        boolean z14 = (i23 == -1 || i24 == -1) ? false : z10;
        int iO = tVar.o();
        switch (iO) {
            case 3:
            case 4:
                i12 = 180;
                break;
            case 5:
            case 6:
                i12 = 90;
                break;
            case 7:
            case 8:
                i12 = 270;
                break;
            default:
                i12 = 0;
                break;
        }
        switch (iO) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z12 = true;
                break;
            default:
                z12 = false;
                break;
        }
        if (i10 == Integer.MIN_VALUE) {
            if (i12 != 90) {
                i13 = 270;
                if (i12 != 270) {
                    i14 = i23;
                }
            } else {
                i13 = 270;
            }
            i14 = i24;
        } else {
            i13 = 270;
            i14 = i10;
        }
        int i25 = i11 == Integer.MIN_VALUE ? (i12 == 90 || i12 == i13) ? i23 : i24 : i11;
        ImageHeaderParser$ImageType imageHeaderParser$ImageTypeV = tVar.v();
        boolean z15 = z14;
        if (i23 <= 0 || i24 <= 0) {
            str = ", density: ";
            str2 = ", target density: ";
            aVar2 = aVar4;
            i15 = i14;
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeV + " with target [" + i15 + "x" + i25 + X3.j.f27836e);
            }
        } else {
            if (i12 == 90 || i12 == 270) {
                i17 = i24;
                i18 = i23;
            } else {
                i18 = i24;
                i17 = i23;
            }
            i15 = i14;
            float fB = lVar.b(i17, i18, i15, i25);
            if (fB <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                StringBuilder sb2 = new StringBuilder("Cannot scale with factor: ");
                sb2.append(fB);
                sb2.append(" from: ");
                sb2.append(lVar);
                sb2.append(", source: [");
                l1.d.o(sb2, i23, "x", i24, "], target: [");
                sb2.append(i15);
                sb2.append("x");
                sb2.append(i25);
                sb2.append(X3.j.f27836e);
                throw new IllegalArgumentException(sb2.toString());
            }
            int iA = lVar.a(i17, i18, i15, i25);
            if (iA == 0) {
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            int i26 = i12;
            float f10 = i17;
            int i27 = i17;
            float f11 = i18;
            int i28 = i18;
            int i29 = (int) (((double) (fB * f11)) + 0.5d);
            int i30 = i27 / ((int) (((double) (fB * f10)) + 0.5d));
            int i31 = i28 / i29;
            int iMax = Math.max(1, Integer.highestOneBit(iA == 1 ? Math.max(i30, i31) : Math.min(i30, i31)));
            if (iA == 1 && iMax < 1.0f / fB) {
                iMax <<= 1;
            }
            options.inSampleSize = iMax;
            if (imageHeaderParser$ImageTypeV == ImageHeaderParser$ImageType.JPEG) {
                float fMin = Math.min(iMax, 8);
                float f12 = f11 / fMin;
                iFloor = (int) Math.ceil(f10 / fMin);
                iFloor2 = (int) Math.ceil(f12);
                int i32 = iMax / 8;
                if (i32 > 0) {
                    iFloor /= i32;
                    iFloor2 /= i32;
                }
            } else {
                if (imageHeaderParser$ImageTypeV == ImageHeaderParser$ImageType.PNG || imageHeaderParser$ImageTypeV == ImageHeaderParser$ImageType.PNG_A) {
                    float f13 = iMax;
                    float f14 = f11 / f13;
                    iFloor = (int) Math.floor(f10 / f13);
                    iFloor2 = (int) Math.floor(f14);
                } else if (imageHeaderParser$ImageTypeV.isWebp()) {
                    float f15 = iMax;
                    iRound2 = Math.round(f10 / f15);
                    iRound = Math.round(f11 / f15);
                } else if (i27 % iMax == 0 && i28 % iMax == 0) {
                    iRound2 = i27 / iMax;
                    iRound = i28 / iMax;
                } else {
                    options.inJustDecodeBounds = true;
                    c(tVar, options, mVar, aVar4);
                    options.inJustDecodeBounds = false;
                    int[] iArr2 = {options.outWidth, options.outHeight};
                    int i33 = iArr2[0];
                    iRound = iArr2[1];
                    iRound2 = i33;
                }
                aVar2 = aVar4;
                dB = lVar.b(iRound2, iRound, i15, i25);
                if (dB <= 1.0d) {
                    d10 = dB;
                } else {
                    d10 = 1.0d / dB;
                }
                int iRound3 = (int) Math.round(d10 * 2.147483647E9d);
                int i34 = (int) ((((double) iRound3) * dB) + 0.5d);
                float f16 = i34 / iRound3;
                i19 = iMax;
                i20 = iRound;
                options.inTargetDensity = (int) (((dB / ((double) f16)) * ((double) i34)) + 0.5d);
                if (dB <= 1.0d) {
                    d11 = dB;
                } else {
                    d11 = 1.0d / dB;
                }
                int iRound4 = (int) Math.round(d11 * 2.147483647E9d);
                options.inDensity = iRound4;
                i21 = options.inTargetDensity;
                if (i21 > 0 || iRound4 <= 0 || i21 == iRound4) {
                    options.inTargetDensity = 0;
                    options.inDensity = 0;
                } else {
                    options.inScaled = true;
                }
                if (Log.isLoggable("Downsampler", 2)) {
                    StringBuilder sbL = l1.d.l("Calculate scaling, source: [", i23, "x", i24, "], degreesToRotate: ");
                    l1.d.o(sbL, i26, ", target: [", i15, "x");
                    l1.d.o(sbL, i25, "], power of two scaled: [", iRound2, "x");
                    sbL.append(i20);
                    sbL.append("], exact scale factor: ");
                    sbL.append(fB);
                    sbL.append(", power of 2 sample size: ");
                    sbL.append(i19);
                    sbL.append(", adjusted scale factor: ");
                    sbL.append(dB);
                    str2 = ", target density: ";
                    sbL.append(str2);
                    sbL.append(options.inTargetDensity);
                    str = ", density: ";
                    sbL.append(str);
                    sbL.append(options.inDensity);
                    Log.v("Downsampler", sbL.toString());
                } else {
                    str = r6;
                    str2 = ", target density: ";
                }
            }
            int i35 = iFloor2;
            iRound2 = iFloor;
            iRound = i35;
            aVar2 = aVar4;
            dB = lVar.b(iRound2, iRound, i15, i25);
            if (dB <= 1.0d) {
                d10 = dB;
            } else {
                d10 = 1.0d / dB;
            }
            int iRound5 = (int) Math.round(d10 * 2.147483647E9d);
            int i36 = (int) ((((double) iRound5) * dB) + 0.5d);
            float f17 = i36 / iRound5;
            i19 = iMax;
            i20 = iRound;
            options.inTargetDensity = (int) (((dB / ((double) f17)) * ((double) i36)) + 0.5d);
            if (dB <= 1.0d) {
                d11 = dB;
            } else {
                d11 = 1.0d / dB;
            }
            int iRound6 = (int) Math.round(d11 * 2.147483647E9d);
            options.inDensity = iRound6;
            i21 = options.inTargetDensity;
            if (i21 > 0) {
                options.inTargetDensity = 0;
                options.inDensity = 0;
            } else {
                options.inTargetDensity = 0;
                options.inDensity = 0;
            }
            if (Log.isLoggable("Downsampler", 2)) {
                StringBuilder sbL2 = l1.d.l("Calculate scaling, source: [", i23, "x", i24, "], degreesToRotate: ");
                l1.d.o(sbL2, i26, ", target: [", i15, "x");
                l1.d.o(sbL2, i25, "], power of two scaled: [", iRound2, "x");
                sbL2.append(i20);
                sbL2.append("], exact scale factor: ");
                sbL2.append(fB);
                sbL2.append(", power of 2 sample size: ");
                sbL2.append(i19);
                sbL2.append(", adjusted scale factor: ");
                sbL2.append(dB);
                str2 = ", target density: ";
                sbL2.append(str2);
                sbL2.append(options.inTargetDensity);
                str = ", density: ";
                sbL2.append(str);
                sbL2.append(options.inDensity);
                Log.v("Downsampler", sbL2.toString());
            } else {
                str = r6;
                str2 = ", target density: ";
            }
        }
        boolean zB = this.f46604e.b(i15, i25, z15, z12);
        if (zB) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        if (zB) {
            z13 = true;
        } else if (aVar != e6.a.f39137a) {
            try {
                zHasAlpha = tVar.v().hasAlpha();
            } catch (IOException e10) {
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + aVar, e10);
                }
                zHasAlpha = false;
            }
            Bitmap.Config config2 = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            options.inPreferredConfig = config2;
            if (config2 == Bitmap.Config.RGB_565) {
                z13 = true;
                options.inDither = true;
            } else {
                z13 = true;
            }
        } else {
            z13 = true;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        }
        if (i23 < 0 || i24 < 0 || !z11) {
            int i37 = options.inTargetDensity;
            float f18 = (i37 <= 0 || (i16 = options.inDensity) <= 0 || i37 == i16) ? false : z13 ? i37 / options.inDensity : 1.0f;
            int i38 = options.inSampleSize;
            float f19 = i38;
            int iCeil = (int) Math.ceil(i23 / f19);
            int iCeil2 = (int) Math.ceil(i24 / f19);
            int iRound7 = Math.round(iCeil * f18);
            int iRound8 = Math.round(iCeil2 * f18);
            if (Log.isLoggable("Downsampler", 2)) {
                StringBuilder sbL3 = l1.d.l("Calculated target [", iRound7, "x", iRound8, "] for source [");
                l1.d.o(sbL3, i23, "x", i24, "], sampleSize: ");
                sbL3.append(i38);
                sbL3.append(", targetDensity: ");
                sbL3.append(options.inTargetDensity);
                sbL3.append(str);
                sbL3.append(options.inDensity);
                sbL3.append(", density multiplier: ");
                sbL3.append(f18);
                Log.v("Downsampler", sbL3.toString());
            }
            i15 = iRound7;
            i25 = iRound8;
        }
        if (i15 <= 0 || i25 <= 0 || (config = options.inPreferredConfig) == Bitmap.Config.HARDWARE) {
            aVar3 = aVar2;
        } else {
            Bitmap.Config config3 = options.outConfig;
            if (config3 != null) {
                config = config3;
            }
            h6.a aVar5 = aVar2;
            options.inBitmap = aVar5.a(i15, i25, config);
            aVar3 = aVar5;
        }
        if (jVar != null) {
            options.inPreferredColorSpace = ColorSpace.get(jVar == e6.j.f39149a && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut() ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
        }
        Bitmap bitmapC = c(tVar, options, mVar, aVar3);
        mVar.m(bitmapC, aVar3);
        if (Log.isLoggable("Downsampler", 2)) {
            Log.v("Downsampler", "Decoded " + d(bitmapC) + " from [" + i23 + "x" + i24 + "] " + str3 + " with inBitmap " + d(options.inBitmap) + " for [" + i10 + "x" + i11 + "], sample size: " + options.inSampleSize + str + options.inDensity + str2 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + a7.j.a(jElapsedRealtimeNanos));
        }
        Bitmap bitmap2 = null;
        if (bitmapC != null) {
            bitmapC.setDensity(this.f46601b.densityDpi);
            switch (iO) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    Matrix matrix = new Matrix();
                    switch (iO) {
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
                    RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, bitmapC.getWidth(), bitmapC.getHeight());
                    matrix.mapRect(rectF);
                    Bitmap bitmapN = aVar3.n(Math.round(rectF.width()), Math.round(rectF.height()), bitmapC.getConfig() != null ? bitmapC.getConfig() : Bitmap.Config.ARGB_8888);
                    matrix.postTranslate(-rectF.left, -rectF.top);
                    bitmapN.setHasAlpha(bitmapC.hasAlpha());
                    Lock lock = x.f46619b;
                    lock.lock();
                    try {
                        Canvas canvas = new Canvas(bitmapN);
                        canvas.drawBitmap(bitmapC, matrix, x.f46618a);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapN;
                    } catch (Throwable th2) {
                        lock.unlock();
                        throw th2;
                    }
                    break;
                default:
                    bitmap = bitmapC;
                    break;
            }
            boolean zEquals = bitmapC.equals(bitmap);
            bitmap2 = bitmap;
            if (!zEquals) {
                aVar3.b(bitmapC);
                bitmap2 = bitmap;
            }
        }
        return bitmap2;
    }
}
