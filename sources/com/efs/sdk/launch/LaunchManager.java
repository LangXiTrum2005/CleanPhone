package com.efs.sdk.launch;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.efs.sdk.base.EfsReporter;

/* JADX INFO: loaded from: classes2.dex */
public class LaunchManager {
    public static final String APP_ATTACH_BASE_CONTEXT = "app_attachBaseContext";
    public static final String APP_CONSTRUCT = "app_<init>";
    public static final String APP_ON_CREATE = "app_onCreate";
    public static final String PAGE_ON_CREATE = "page_onCreate";
    public static final String PAGE_ON_RESUME = "page_onResume";
    public static final String PAGE_ON_RE_START = "page_onReStart";
    public static final String PAGE_ON_START = "page_onStart";
    public static final String PAGE_ON_STOP = "page_onStop";
    public static final String PAGE_ON_WINDOW = "page_on_window";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static LaunchConfigManager f436a = null;
    private static Context b = null;
    private static EfsReporter c = null;
    private static boolean d = false;
    public static boolean isDebug = true;

    public static LaunchConfigManager getLaunchConfigManager() {
        return f436a;
    }

    public static EfsReporter getReporter() {
        return c;
    }

    public static void init(Context context, final EfsReporter efsReporter) {
        if (context == null || efsReporter == null) {
            try {
                if (isDebug) {
                    return;
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        final Context applicationContext = context.getApplicationContext();
        if (c.e(applicationContext) && !isInit()) {
            b = context.getApplicationContext();
            c = efsReporter;
            a.a(new Runnable() { // from class: com.efs.sdk.launch.LaunchManager.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        LaunchConfigManager unused = LaunchManager.f436a = new LaunchConfigManager(applicationContext, efsReporter);
                        LaunchManager.a();
                        if (LaunchManager.getLaunchConfigManager() == null || !LaunchManager.getLaunchConfigManager().enableTracer()) {
                            return;
                        }
                        b.a(applicationContext, (String) null);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            });
        }
    }

    public static boolean isInit() {
        return d;
    }

    public static void onTraceApp(Application application, String str, boolean z) {
        if (application != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (str.equals(APP_ATTACH_BASE_CONTEXT) || Looper.getMainLooper() == Looper.myLooper()) {
                    b.a(str, z);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void onTraceBegin(Context context, String str, long j) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                context.getApplicationContext();
                if (Looper.getMainLooper() == Looper.myLooper() && str.length() <= 10) {
                    b.a(str, j);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void onTraceEnd(Context context, String str, long j) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                context.getApplicationContext();
                if (Looper.getMainLooper() == Looper.myLooper() && str.length() <= 10) {
                    b.b(str, j);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void onTracePage(Activity activity, String str, boolean z) {
        if (activity != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                activity.getApplicationContext();
                if (Looper.getMainLooper() != Looper.myLooper()) {
                    return;
                }
                b.a(activity, str, z);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void sendLaunchCache(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            b.a(context, str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static /* synthetic */ boolean a() {
        d = true;
        return true;
    }
}
