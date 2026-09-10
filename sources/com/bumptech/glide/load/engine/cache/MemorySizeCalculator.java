package com.bumptech.glide.load.engine.cache;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class MemorySizeCalculator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f12524c;
    public final int d;

    public static final class Builder {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f12525e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f12526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ActivityManager f12527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DisplayMetricsScreenDimensions f12528c;
        public final float d;

        static {
            f12525e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public Builder(Context context) {
            this.d = f12525e;
            this.f12526a = context;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            this.f12527b = activityManager;
            this.f12528c = new DisplayMetricsScreenDimensions(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
                return;
            }
            this.d = 0.0f;
        }
    }

    public static final class DisplayMetricsScreenDimensions implements ScreenDimensions {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DisplayMetrics f12529a;

        public DisplayMetricsScreenDimensions(DisplayMetrics displayMetrics) {
            this.f12529a = displayMetrics;
        }
    }

    public interface ScreenDimensions {
    }

    public MemorySizeCalculator(Builder builder) {
        Context context = builder.f12526a;
        this.f12524c = context;
        ActivityManager activityManager = builder.f12527b;
        int i2 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.d = i2;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = builder.f12528c.f12529a;
        float f = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f2 = builder.d;
        int iRound2 = Math.round(f * f2);
        int iRound3 = Math.round(f * 2.0f);
        int i3 = iRound - i2;
        int i4 = iRound3 + iRound2;
        if (i4 <= i3) {
            this.f12523b = iRound3;
            this.f12522a = iRound2;
        } else {
            float f3 = i3 / (f2 + 2.0f);
            this.f12523b = Math.round(2.0f * f3);
            this.f12522a = Math.round(f3 * f2);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb.append(Formatter.formatFileSize(context, this.f12523b));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(context, this.f12522a));
            sb.append(", byte array size: ");
            sb.append(Formatter.formatFileSize(context, i2));
            sb.append(", memory class limited? ");
            sb.append(i4 > iRound);
            sb.append(", max size: ");
            sb.append(Formatter.formatFileSize(context, iRound));
            sb.append(", memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }
}
