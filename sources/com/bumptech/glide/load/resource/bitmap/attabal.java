package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.util.apical;
import com.bumptech.glide.util.competently;
import com.bumptech.glide.util.formularize;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import endosteum.cutely;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import patty.cord;
import patty.graveside;
import trawler.wireman;

/* JADX INFO: compiled from: Downsampler.java */
/* JADX INFO: loaded from: classes2.dex */
public final class attabal {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final Set<String> f17830apical;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final maggot.dern<Boolean> f17833cutely;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final saneness f17834formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static final Set<ImageHeaderParser.ImageType> f17835impassible;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final maggot.dern<Boolean> f17837taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public static final Queue<BitmapFactory.Options> f17838triweekly;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final wireman f17839attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final trawler.saneness f17840dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final graveside f17841marial = graveside.saneness();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final DisplayMetrics f17842saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final List<ImageHeaderParser> f17843wireman;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final maggot.dern<DecodeFormat> f17831beachfront = maggot.dern.beachfront("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.DEFAULT);

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final maggot.dern<PreferredColorSpace> f17832competently = maggot.dern.marial("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    @Deprecated
    public static final maggot.dern<DownsampleStrategy> f17836impromptu = DownsampleStrategy.f17807impromptu;

    /* JADX INFO: compiled from: Downsampler.java */
    public interface saneness {
        void attabal(wireman wiremanVar, Bitmap bitmap) throws IOException;

        void saneness();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f17837taiyuan = maggot.dern.beachfront("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f17833cutely = maggot.dern.beachfront("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f17830apical = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f17834formularize = new C0178attabal();
        f17835impassible = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f17838triweekly = formularize.competently(0);
    }

    public attabal(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, wireman wiremanVar, trawler.saneness sanenessVar) {
        this.f17843wireman = list;
        this.f17842saneness = (DisplayMetrics) apical.wireman(displayMetrics);
        this.f17839attabal = (wireman) apical.wireman(wiremanVar);
        this.f17840dern = (trawler.saneness) apical.wireman(sanenessVar);
    }

    public static IOException adultoid(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + triweekly(options), illegalArgumentException);
    }

    public static synchronized BitmapFactory.Options apical() {
        BitmapFactory.Options optionsPoll;
        Queue<BitmapFactory.Options> queue = f17838triweekly;
        synchronized (queue) {
            optionsPoll = queue.poll();
        }
        if (optionsPoll == null) {
            optionsPoll = new BitmapFactory.Options();
            gintrap(optionsPoll);
        }
        return optionsPoll;
    }

    public static int attabal(double d) {
        int iFormularize = formularize(d);
        int iRotuma = rotuma(((double) iFormularize) * d);
        return rotuma((d / ((double) (iRotuma / iFormularize))) * ((double) iRotuma));
    }

    public static String cutely(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return X3.j.d + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void dern(ImageHeaderParser.ImageType imageType, com.bumptech.glide.load.resource.bitmap.saneness sanenessVar, saneness sanenessVar2, wireman wiremanVar, DownsampleStrategy downsampleStrategy, int i, int i2, int i3, int i4, int i5, BitmapFactory.Options options) throws IOException {
        int i6;
        int i7;
        int iFloor;
        int iFloor2;
        if (i2 <= 0 || i3 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Objects.toString(imageType);
                return;
            }
            return;
        }
        if (polloi(i)) {
            i7 = i2;
            i6 = i3;
        } else {
            i6 = i2;
            i7 = i3;
        }
        float fSaneness = downsampleStrategy.saneness(i6, i7, i4, i5);
        if (fSaneness <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException("Cannot scale with factor: " + fSaneness + " from: " + downsampleStrategy + ", source: [" + i2 + "x" + i3 + "], target: [" + i4 + "x" + i5 + X3.j.e);
        }
        DownsampleStrategy.SampleSizeRounding sampleSizeRoundingAttabal = downsampleStrategy.attabal(i6, i7, i4, i5);
        if (sampleSizeRoundingAttabal == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f = i6;
        float f2 = i7;
        int iRotuma = i6 / rotuma(fSaneness * f);
        int iRotuma2 = i7 / rotuma(fSaneness * f2);
        DownsampleStrategy.SampleSizeRounding sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.MEMORY;
        int iMax = Math.max(1, Integer.highestOneBit(sampleSizeRoundingAttabal == sampleSizeRounding ? Math.max(iRotuma, iRotuma2) : Math.min(iRotuma, iRotuma2)));
        if (sampleSizeRoundingAttabal == sampleSizeRounding && iMax < 1.0f / fSaneness) {
            iMax <<= 1;
        }
        options.inSampleSize = iMax;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(iMax, 8);
            iFloor = (int) Math.ceil(f / fMin);
            iFloor2 = (int) Math.ceil(f2 / fMin);
            int i8 = iMax / 8;
            if (i8 > 0) {
                iFloor /= i8;
                iFloor2 /= i8;
            }
        } else if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
            float f3 = iMax;
            iFloor = (int) Math.floor(f / f3);
            iFloor2 = (int) Math.floor(f2 / f3);
        } else if (imageType.isWebp()) {
            float f4 = iMax;
            iFloor = Math.round(f / f4);
            iFloor2 = Math.round(f2 / f4);
        } else if (i6 % iMax == 0 && i7 % iMax == 0) {
            iFloor = i6 / iMax;
            iFloor2 = i7 / iMax;
        } else {
            int[] iArrImpassible = impassible(sanenessVar, options, sanenessVar2, wiremanVar);
            iFloor = iArrImpassible[0];
            iFloor2 = iArrImpassible[1];
        }
        double dSaneness = downsampleStrategy.saneness(iFloor, iFloor2, i4, i5);
        options.inTargetDensity = attabal(dSaneness);
        options.inDensity = formularize(dSaneness);
        if (molybdenite(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        Log.isLoggable("Downsampler", 2);
    }

    public static void dovishness(BitmapFactory.Options options) {
        gintrap(options);
        Queue<BitmapFactory.Options> queue = f17838triweekly;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    public static int formularize(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    public static void gintrap(BitmapFactory.Options options) {
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

    public static void graveside(int i, int i2, String str, BitmapFactory.Options options, Bitmap bitmap, int i3, int i4, long j) {
        cutely(bitmap);
        triweekly(options);
        int i5 = options.inSampleSize;
        Thread.currentThread().getName();
        competently.attabal(j);
    }

    public static int[] impassible(com.bumptech.glide.load.resource.bitmap.saneness sanenessVar, BitmapFactory.Options options, saneness sanenessVar2, wireman wiremanVar) throws IOException {
        options.inJustDecodeBounds = true;
        taiyuan(sanenessVar, options, sanenessVar2, wiremanVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public static boolean molybdenite(BitmapFactory.Options options) {
        int i;
        int i2 = options.inTargetDensity;
        return i2 > 0 && (i = options.inDensity) > 0 && i2 != i;
    }

    public static boolean polloi(int i) {
        return i == 90 || i == 270;
    }

    public static void preprohormone(BitmapFactory.Options options, wireman wiremanVar, int i, int i2) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return;
        } else {
            config = options.outConfig;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = wiremanVar.marial(i, i2, config);
    }

    public static int rotuma(double d) {
        return (int) (d + 0.5d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap taiyuan(com.bumptech.glide.load.resource.bitmap.saneness r4, android.graphics.BitmapFactory.Options r5, com.bumptech.glide.load.resource.bitmap.attabal.saneness r6, trawler.wireman r7) throws java.io.IOException {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto La
            r6.saneness()
            r4.saneness()
        La:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = patty.cord.marial()
            r3.lock()
            android.graphics.Bitmap r4 = r4.attabal(r5)     // Catch: java.lang.IllegalArgumentException -> L23 java.lang.Throwable -> L3f
        L1b:
            java.util.concurrent.locks.Lock r5 = patty.cord.marial()
            r5.unlock()
            return r4
        L23:
            r3 = move-exception
            java.io.IOException r0 = adultoid(r3, r0, r1, r2, r5)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "Downsampler"
            r2 = 3
            android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L3f
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L3e
            r7.dern(r1)     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L3f
            r1 = 0
            r5.inBitmap = r1     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L3f
            android.graphics.Bitmap r4 = taiyuan(r4, r5, r6, r7)     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L3f
            goto L1b
        L3d:
            throw r0     // Catch: java.lang.Throwable -> L3f
        L3e:
            throw r0     // Catch: java.lang.Throwable -> L3f
        L3f:
            r4 = move-exception
            java.util.concurrent.locks.Lock r5 = patty.cord.marial()
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.attabal.taiyuan(com.bumptech.glide.load.resource.bitmap.saneness, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.attabal$saneness, trawler.wireman):android.graphics.Bitmap");
    }

    public static String triweekly(BitmapFactory.Options options) {
        return cutely(options.inBitmap);
    }

    public boolean arytenoidectomy(InputStream inputStream) {
        return true;
    }

    public cutely<Bitmap> beachfront(InputStream inputStream, int i, int i2, maggot.wireman wiremanVar, saneness sanenessVar) throws IOException {
        return marial(new com.bumptech.glide.load.resource.bitmap.saneness.C0179saneness(inputStream, this.f17843wireman, this.f17840dern), i, i2, wiremanVar, sanenessVar);
    }

    public cutely<Bitmap> competently(ByteBuffer byteBuffer, int i, int i2, maggot.wireman wiremanVar) throws IOException {
        return marial(new com.bumptech.glide.load.resource.bitmap.saneness.attabal(byteBuffer, this.f17843wireman, this.f17840dern), i, i2, wiremanVar, f17834formularize);
    }

    public final boolean cord(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    public final Bitmap impromptu(com.bumptech.glide.load.resource.bitmap.saneness sanenessVar, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z, int i, int i2, boolean z2, saneness sanenessVar2) throws IOException {
        String str;
        int iRound;
        long jSaneness = competently.saneness();
        int[] iArrImpassible = impassible(sanenessVar, options, sanenessVar2, this.f17839attabal);
        int i3 = iArrImpassible[0];
        int i4 = iArrImpassible[1];
        String str2 = options.outMimeType;
        boolean z3 = (i3 == -1 || i4 == -1) ? false : z;
        int iDern = sanenessVar.dern();
        int iBeachfront = cord.beachfront(iDern);
        boolean zTaiyuan = cord.taiyuan(iDern);
        int i5 = i;
        if (i5 == Integer.MIN_VALUE) {
            i5 = polloi(iBeachfront) ? i4 : i3;
        }
        if (i2 == -2147483648) {
            i2 = polloi(iBeachfront) ? i3 : i4;
        }
        ImageHeaderParser.ImageType imageTypeWireman = sanenessVar.wireman();
        dern(imageTypeWireman, sanenessVar, sanenessVar2, this.f17839attabal, downsampleStrategy, iBeachfront, i3, i4, i5, i2, options);
        int i6 = i5;
        int i7 = i2;
        saneness(sanenessVar, decodeFormat, z3, zTaiyuan, options, i6, i7);
        int i8 = Build.VERSION.SDK_INT;
        if (cord(imageTypeWireman)) {
            if (i3 < 0 || i4 < 0 || !z2) {
                float f = molybdenite(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                float f2 = options.inSampleSize;
                int iCeil = (int) Math.ceil(i3 / f2);
                int iCeil2 = (int) Math.ceil(i4 / f2);
                iRound = Math.round(iCeil * f);
                int iRound2 = Math.round(iCeil2 * f);
                str = "Downsampler";
                Log.isLoggable(str, 2);
                i7 = iRound2;
            } else {
                iRound = i6;
                str = "Downsampler";
            }
            if (iRound > 0 && i7 > 0) {
                preprohormone(options, this.f17839attabal, iRound, i7);
            }
        } else {
            str = "Downsampler";
        }
        if (preferredColorSpace != null) {
            if (i8 >= 28) {
                options.inPreferredColorSpace = ColorSpace.get((preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && options.outColorSpace != null && options.outColorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else if (i8 >= 26) {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap bitmapTaiyuan = taiyuan(sanenessVar, options, sanenessVar2, this.f17839attabal);
        sanenessVar2.attabal(this.f17839attabal, bitmapTaiyuan);
        if (Log.isLoggable(str, 2)) {
            graveside(i3, i4, str2, options, bitmapTaiyuan, i, i2, jSaneness);
        }
        if (bitmapTaiyuan == null) {
            return null;
        }
        bitmapTaiyuan.setDensity(this.f17842saneness.densityDpi);
        Bitmap bitmapCutely = cord.cutely(this.f17839attabal, bitmapTaiyuan, iDern);
        if (!bitmapTaiyuan.equals(bitmapCutely)) {
            this.f17839attabal.dern(bitmapTaiyuan);
        }
        return bitmapCutely;
    }

    public boolean kowloon(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.dern();
    }

    public final cutely<Bitmap> marial(com.bumptech.glide.load.resource.bitmap.saneness sanenessVar, int i, int i2, maggot.wireman wiremanVar, saneness sanenessVar2) throws IOException {
        byte[] bArr = (byte[]) this.f17840dern.dern(65536, byte[].class);
        BitmapFactory.Options optionsApical = apical();
        optionsApical.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) wiremanVar.dern(f17831beachfront);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) wiremanVar.dern(f17832competently);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) wiremanVar.dern(DownsampleStrategy.f17807impromptu);
        boolean zBooleanValue = ((Boolean) wiremanVar.dern(f17837taiyuan)).booleanValue();
        maggot.dern<Boolean> dernVar = f17833cutely;
        try {
            return patty.competently.wireman(impromptu(sanenessVar, optionsApical, downsampleStrategy, decodeFormat, preferredColorSpace, wiremanVar.dern(dernVar) != null && ((Boolean) wiremanVar.dern(dernVar)).booleanValue(), i, i2, zBooleanValue, sanenessVar2), this.f17839attabal);
        } finally {
            dovishness(optionsApical);
            this.f17840dern.put(bArr);
        }
    }

    public boolean monoploid(ByteBuffer byteBuffer) {
        return true;
    }

    public final void saneness(com.bumptech.glide.load.resource.bitmap.saneness sanenessVar, DecodeFormat decodeFormat, boolean z, boolean z2, BitmapFactory.Options options, int i, int i2) {
        boolean zHasAlpha;
        if (this.f17841marial.competently(i, i2, options, z, z2)) {
            return;
        }
        if (decodeFormat == DecodeFormat.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            zHasAlpha = sanenessVar.wireman().hasAlpha();
        } catch (IOException unused) {
            if (Log.isLoggable("Downsampler", 3)) {
                Objects.toString(decodeFormat);
            }
            zHasAlpha = false;
        }
        Bitmap.Config config = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    public cutely<Bitmap> wireman(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, maggot.wireman wiremanVar) throws IOException {
        return marial(new com.bumptech.glide.load.resource.bitmap.saneness.dern(parcelFileDescriptor, this.f17843wireman, this.f17840dern), i, i2, wiremanVar, f17834formularize);
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Downsampler.java */
    public class C0178attabal implements saneness {
        @Override // com.bumptech.glide.load.resource.bitmap.attabal.saneness
        public void saneness() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.attabal.saneness
        public void attabal(wireman wiremanVar, Bitmap bitmap) {
        }
    }
}
