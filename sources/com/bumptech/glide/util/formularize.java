package com.bumptech.glide.util;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.X3;
import glutethimide.impassible;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes2.dex */
public final class formularize {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static volatile Handler f17933dern;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final char[] f17932attabal = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final char[] f17934saneness = new char[64];

    /* JADX INFO: compiled from: Util.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f17935attabal;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f17935attabal = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17935attabal[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17935attabal[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17935attabal[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17935attabal[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static boolean adultoid(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    public static <T> List<T> apical(Collection<T> collection2) {
        ArrayList arrayList = new ArrayList(collection2.size());
        for (T t : collection2) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static int arytenoidectomy(int i, int i2) {
        return (i2 * 31) + i;
    }

    public static void attabal() {
        if (!molybdenite()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static String beachfront(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i3 = i * 2;
            char[] cArr2 = f17932attabal;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static <T> Queue<T> competently(int i) {
        return new ArrayDeque(i);
    }

    public static int cutely(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = attabal.f17935attabal[config.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                return i != 4 ? 4 : 8;
            }
        }
        return i2;
    }

    public static boolean dern(awlwort.attabal<?> attabalVar, awlwort.attabal<?> attabalVar2) {
        if (attabalVar == null) {
            return attabalVar2 == null;
        }
        return attabalVar.trm(attabalVar2);
    }

    public static boolean dovishness(int i, int i2) {
        return adultoid(i) && adultoid(i2);
    }

    public static Handler formularize() {
        if (f17933dern == null) {
            synchronized (formularize.class) {
                try {
                    if (f17933dern == null) {
                        f17933dern = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17933dern;
    }

    public static void gintrap(Runnable runnable) {
        formularize().post(runnable);
    }

    public static boolean graveside() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static int impassible(float f) {
        return triweekly(f, 17);
    }

    public static int impromptu(int i, int i2, Bitmap.Config config) {
        return i * i2 * cutely(config);
    }

    public static int kowloon(int i) {
        return arytenoidectomy(i, 17);
    }

    public static boolean marial(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean molybdenite() {
        return !graveside();
    }

    public static int monoploid(Object obj, int i) {
        return arytenoidectomy(obj == null ? 0 : obj.hashCode(), i);
    }

    public static int polloi(boolean z, int i) {
        return arytenoidectomy(z ? 1 : 0, i);
    }

    public static String preprohormone(byte[] bArr) {
        String strBeachfront;
        char[] cArr = f17934saneness;
        synchronized (cArr) {
            strBeachfront = beachfront(bArr, cArr);
        }
        return strBeachfront;
    }

    public static void rotuma(Runnable runnable) {
        formularize().removeCallbacks(runnable);
    }

    public static void saneness() {
        if (!graveside()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static int taiyuan(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + X3.j.d + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int triweekly(float f, int i) {
        return arytenoidectomy(Float.floatToIntBits(f), i);
    }

    public static boolean wireman(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj instanceof impassible ? ((impassible) obj).attabal(obj2) : obj.equals(obj2);
    }
}
