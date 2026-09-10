package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebSettings;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Uc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Context f23271b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f23272c = "";
    public static String d;
    public static boolean g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f23275i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uc f23270a = new Uc();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f23273e = new AtomicBoolean();
    public static final Lazy f = LazyKt.b(Tc.f23236a);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ExecutorService f23274h = Executors.newSingleThreadExecutor(new K5("Uc"));

    public static final String b() {
        return d;
    }

    @JvmStatic
    public static /* synthetic */ void c() {
    }

    public static final Context d() {
        return f23271b;
    }

    @JvmStatic
    public static /* synthetic */ void e() {
    }

    public static final H7 f() {
        return (H7) f.getX();
    }

    @JvmStatic
    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void j() {
    }

    public static final String k() {
        Context applicationContext;
        String property;
        String str = "";
        if (f23272c.length() == 0) {
            Context context = f23271b;
            if (context != null) {
                try {
                    applicationContext = context.getApplicationContext();
                } catch (Exception e2) {
                    try {
                        throw new Ee(e2.getMessage());
                    } catch (Ee e3) {
                        S5 s5 = S5.f23167a;
                        S5.d.a(new C3011f2(e3));
                        try {
                            property = System.getProperty("http.agent");
                            if (property != null) {
                            }
                        } catch (Exception e4) {
                            S5 s6 = S5.f23167a;
                            S5.d.a(AbstractC3285w5.a(e4, "event"));
                        }
                    } catch (Exception unused) {
                    }
                }
            } else {
                applicationContext = null;
            }
            property = WebSettings.getDefaultUserAgent(applicationContext);
            Intrinsics.c(property);
            str = property;
            f23272c = str;
        }
        return f23272c;
    }

    @JvmStatic
    public static /* synthetic */ void l() {
    }

    public static final boolean m() {
        return f23273e.get();
    }

    @JvmStatic
    public static /* synthetic */ void n() {
    }

    public static final boolean o() {
        return g;
    }

    @JvmStatic
    public static /* synthetic */ void p() {
    }

    public static final boolean q() {
        return f23275i == 2;
    }

    @JvmStatic
    public static /* synthetic */ void r() {
    }

    @JvmStatic
    public static final void u() {
        f23271b = null;
        d = null;
        f23275i = 0;
    }

    public final void a(int i2) {
        f23275i = i2;
    }

    public final String h() {
        Context context = f23271b;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = C6.f22734b;
        return B6.a(context, "coppa_store").f22735a.getString("im_accid", null);
    }

    public final int i() {
        return f23275i;
    }

    public final void s() {
        d = null;
        f23271b = null;
        f23275i = 3;
    }

    public final void t() {
        f23275i = 2;
    }

    @JvmStatic
    public static final void a(Runnable runnable) {
        Intrinsics.f(runnable, "runnable");
        f23274h.submit(runnable);
    }

    public static final void b(boolean z2) {
        g = z2;
    }

    public static final void c(Context context) {
        f23271b = context;
    }

    public static final void a(boolean z2) {
        f23273e.set(z2);
        if (z2) {
            f().b(new C2978d2(101, 6, (String) null));
        } else {
            f().b(new C2978d2(102, 6, (String) null));
        }
    }

    @JvmStatic
    public static final boolean b(Context context, String accountId) {
        Intrinsics.f(context, "context");
        Intrinsics.f(accountId, "accountId");
        f23275i = 1;
        f23271b = context.getApplicationContext();
        f23273e.set(true);
        d = accountId;
        return true;
    }

    public static final void c(String str) {
        d = str;
    }

    public final void a(Context context) {
        Intrinsics.f(context, "context");
        try {
            F4.a(b(context));
        } catch (Exception unused) {
        }
    }

    public final File b(Context context) {
        return new File(context != null ? context.getFilesDir() : null, "im_cached_content");
    }

    public final void a() {
        Context context = f23271b;
        if (context != null) {
            File fileB = b(context);
            if (fileB.mkdir()) {
                return;
            }
            fileB.isDirectory();
        }
    }

    public final void b(String primaryAccountId) {
        Intrinsics.f(primaryAccountId, "primaryAccountId");
        Context context = f23271b;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = C6.f22734b;
            C6.a(B6.a(context, "coppa_store"), "im_accid", primaryAccountId, false, 4, (Object) null);
        }
    }

    public final boolean a(Context context, String str) {
        if (context != null && str != null) {
            context.getPackageManager();
            try {
                String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
                if (strArr != null) {
                    for (String str2 : strArr) {
                        if (Intrinsics.a(str2, str)) {
                            return true;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @JvmStatic
    public static final void a(Context context, Application.ActivityLifecycleCallbacks lifecycleCallbacks) {
        Intrinsics.f(lifecycleCallbacks, "lifecycleCallbacks");
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            activity.getApplication().unregisterActivityLifecycleCallbacks(lifecycleCallbacks);
            activity.getApplication().registerActivityLifecycleCallbacks(lifecycleCallbacks);
        }
    }

    public final void a(Context context, Intent intent) {
        Intrinsics.f(context, "context");
        Intrinsics.f(intent, "intent");
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    public final File a(String key) {
        Intrinsics.f(key, "key");
        a();
        File fileB = b(f23271b);
        int length = key.length() / 2;
        String strSubstring = key.substring(0, length);
        Intrinsics.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        StringBuilder sbW = android.support.v4.media.a.w(String.valueOf(strSubstring.hashCode() & Integer.MAX_VALUE));
        String strSubstring2 = key.substring(length);
        Intrinsics.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
        sbW.append(strSubstring2.hashCode() & Integer.MAX_VALUE);
        return new File(fileB, sbW.toString());
    }
}
