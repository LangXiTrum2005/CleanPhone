package com.startapp.sdk.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.provider.Settings;
import android.webkit.WebView;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.list3d.List3DView;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f41381a = 0;

    static {
        "startapp.".concat("q0");
    }

    public static void a(List3DView list3DView) {
        list3DView.animate().alpha(1.0f).setDuration(1500L).setListener(null);
    }

    public static boolean b(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) != 0;
        } catch (Throwable unused) {
        }
    }

    public static boolean c(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "auto_time", 0) > 0;
    }

    public static void a(WebView webView) {
        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
    }

    public static int a(Activity activity, int i2, boolean z2) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int i3 = 1;
        if (i2 != 1) {
            if (i2 == 2) {
                i3 = (z2 || rotation == 0 || rotation == 1) ? 0 : 8;
            }
        } else if (!z2 && (rotation == 1 || rotation == 2)) {
            i3 = 9;
        }
        try {
            activity.setRequestedOrientation(i3);
        } catch (Throwable unused) {
        }
        return i3;
    }

    public static Long a(ActivityManager.MemoryInfo memoryInfo) {
        return Long.valueOf(memoryInfo.totalMem);
    }

    public static boolean a(BannerBase bannerBase, boolean z2) {
        if (1 != bannerBase.getLayerType() && z2) {
            return bannerBase.isHardwareAccelerated();
        }
        return false;
    }

    public static long a(File file) {
        if (file == null) {
            return -1L;
        }
        try {
            if (file.isDirectory()) {
                return file.getFreeSpace();
            }
            return -1L;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    public static boolean a(Context context, String str) {
        try {
            return context.checkSelfPermission(str) == 0;
        } catch (Throwable unused) {
        }
    }

    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static boolean a(int i2, Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 128).versionCode >= i2;
        } catch (Exception unused) {
        }
    }
}
