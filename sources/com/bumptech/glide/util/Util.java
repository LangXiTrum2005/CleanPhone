package com.bumptech.glide.util;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.p004ironsource.d9;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class Util {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f12851a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f12852b = new char[64];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Handler f12853c;

    /* JADX INFO: renamed from: com.bumptech.glide.util.Util$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12854a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f12854a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12854a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12854a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12854a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12854a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int c(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + d9.i.d + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int d(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i2 = AnonymousClass1.f12854a[config.ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2 && i2 != 3) {
                return i2 != 4 ? 4 : 8;
            }
        }
        return i3;
    }

    public static ArrayList e(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Handler f() {
        if (f12853c == null) {
            synchronized (Util.class) {
                try {
                    if (f12853c == null) {
                        f12853c = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12853c;
    }

    public static int g(float f, int i2) {
        return h(Float.floatToIntBits(f), i2);
    }

    public static int h(int i2, int i3) {
        return (i3 * 31) + i2;
    }

    public static int i(int i2, Object obj) {
        return h(obj == null ? 0 : obj.hashCode(), i2);
    }

    public static boolean j(int i2, int i3) {
        if (i2 > 0 || i2 == Integer.MIN_VALUE) {
            return i3 > 0 || i3 == Integer.MIN_VALUE;
        }
        return false;
    }
}
