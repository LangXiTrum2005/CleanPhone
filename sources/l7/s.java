package l7;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.util.Log;
import com.facebook.FacebookActivity;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.iap.InAppPurchaseLoggerManager;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.internal.AppLinkManager;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f45212a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f45213b = xj.g0.t0(g0.f45137e);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Executor f45214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile String f45215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile String f45216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile String f45217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile Boolean f45218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile boolean f45219h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Context f45220i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f45221j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ReentrantLock f45222k;
    public static String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f45223m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f45224n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static boolean f45225o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AtomicBoolean f45226p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile String f45227q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static volatile String f45228r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final i0.a f45229s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static boolean f45230t;

    static {
        new AtomicLong(65536L);
        f45221j = 64206;
        f45222k = new ReentrantLock();
        l = "v16.0";
        f45226p = new AtomicBoolean(false);
        f45227q = "instagram.com";
        f45228r = "facebook.com";
        f45229s = new i0.a(11);
    }

    public static final void a(g0 g0Var) {
        HashSet hashSet = f45213b;
        synchronized (hashSet) {
            hashSet.add(g0Var);
            if (hashSet.contains(g0.f45139g)) {
                g0 g0Var2 = g0.f45138f;
                if (!hashSet.contains(g0Var2)) {
                    hashSet.add(g0Var2);
                }
            }
        }
    }

    public static final Context b() {
        q7.f.o();
        Context context = f45220i;
        if (context != null) {
            return context;
        }
        kotlin.jvm.internal.n.l("applicationContext");
        throw null;
    }

    public static final String c() {
        q7.f.o();
        String str = f45215d;
        if (str != null) {
            return str;
        }
        throw new n("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final Executor d() {
        ReentrantLock reentrantLock = f45222k;
        reentrantLock.lock();
        try {
            if (f45214c == null) {
                f45214c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            reentrantLock.unlock();
            Executor executor = f45214c;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String e() {
        q7.e0.B("l7.s", String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{l}, 1)));
        return l;
    }

    public static final String f() {
        Date date = a.l;
        a aVarD = go.k.D();
        String str = aVarD != null ? aVarD.f45081k : null;
        String str2 = f45228r;
        if (str != null) {
            if (str.equals("gaming")) {
                return an.p.n0(str2, "facebook.com", "fb.gg");
            }
            if (str.equals("instagram")) {
                return an.p.n0(str2, "facebook.com", "instagram.com");
            }
        }
        return str2;
    }

    public static final boolean g(Context context) {
        q7.f.o();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static final synchronized boolean h() {
        return f45230t;
    }

    public static final boolean i(g0 g0Var) {
        boolean z10;
        HashSet hashSet = f45213b;
        synchronized (hashSet) {
            z10 = f45219h && hashSet.contains(g0Var);
        }
        return z10;
    }

    public static final void j(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            kotlin.jvm.internal.n.e(applicationInfo, "try {\n                co…     return\n            }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (f45215d == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale ROOT = Locale.ROOT;
                    kotlin.jvm.internal.n.e(ROOT, "ROOT");
                    String lowerCase = str.toLowerCase(ROOT);
                    kotlin.jvm.internal.n.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    if (an.p.p0(lowerCase, "fb", false)) {
                        String strSubstring = str.substring(2);
                        kotlin.jvm.internal.n.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                        f45215d = strSubstring;
                    } else {
                        f45215d = str;
                    }
                } else if (obj instanceof Number) {
                    throw new n("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            applicationInfo.metaData.getString("com.facebook.sdk.RedirectURI");
            applicationInfo.metaData.getString("com.facebook.sdk.IntentUriPackageTarget");
            if (f45216e == null) {
                f45216e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f45217f == null) {
                f45217f = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (f45221j == 64206) {
                f45221j = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f45218g == null) {
                f45218g = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static final synchronized void k(Context context) {
        boolean zA;
        if (f45226p.get()) {
            return;
        }
        try {
            int i10 = FacebookActivity.f10568i;
            q7.f.j(context);
        } catch (ClassNotFoundException unused) {
        }
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            Log.w("q7.f", "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.n.e(applicationContext, "applicationContext.applicationContext");
        f45220i = applicationContext;
        AppEventsLogger.INSTANCE.getAnonymousAppDeviceGUID(context);
        Context context2 = f45220i;
        if (context2 == null) {
            kotlin.jvm.internal.n.l("applicationContext");
            throw null;
        }
        j(context2);
        String str = f45215d;
        if (str == null || str.length() == 0) {
            throw new n("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        }
        String str2 = f45217f;
        if (str2 == null || str2.length() == 0) {
            throw new n("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
        }
        int i11 = 1;
        f45226p.set(true);
        m0 m0Var = m0.f45190a;
        int i12 = 0;
        byte b10 = 0;
        if (v7.a.b(m0.class)) {
            zA = false;
        } else {
            try {
                m0.f45190a.e();
                zA = m0.f45193d.a();
            } catch (Throwable th2) {
                v7.a.a(m0.class, th2);
                zA = false;
            }
        }
        if (zA) {
            f45230t = true;
        }
        Context context3 = f45220i;
        if (context3 == null) {
            kotlin.jvm.internal.n.l("applicationContext");
            throw null;
        }
        if ((context3 instanceof Application) && m0.c()) {
            Context context4 = f45220i;
            if (context4 == null) {
                kotlin.jvm.internal.n.l("applicationContext");
                throw null;
            }
            ActivityLifecycleTracker.startTracking((Application) context4, f45215d);
        } else {
            InAppPurchaseLoggerManager.updateLatestPossiblePurchaseTime();
        }
        AppLinkManager companion = AppLinkManager.INSTANCE.getInstance();
        if (companion != null) {
            Context context5 = f45220i;
            if (context5 == null) {
                kotlin.jvm.internal.n.l("applicationContext");
                throw null;
            }
            companion.setupLifecycleListener((Application) context5);
        }
        q7.u.d();
        q7.z.m();
        q7.c cVar = q7.c.f48670c;
        Context context6 = f45220i;
        if (context6 == null) {
            kotlin.jvm.internal.n.l("applicationContext");
            throw null;
        }
        q7.f.g(context6);
        r rVar = new r(i12);
        m5.k kVar = new m5.k(10, (boolean) (b10 == true ? 1 : 0));
        kVar.f45903c = new CountDownLatch(1);
        d().execute(new FutureTask(new com.unity3d.ads.core.data.repository.a(i11, kVar, rVar)));
        q7.p.a(new i0.a(12), q7.n.Instrument);
        q7.p.a(new i0.a(13), q7.n.AppEvents);
        q7.p.a(new i0.a(14), q7.n.ChromeCustomTabsPrefetching);
        q7.p.a(new i0.a(15), q7.n.IgnoreAppSwitchToLoggedOut);
        q7.p.a(new i0.a(16), q7.n.BypassAppSwitch);
        d().execute(new FutureTask(new r(i11)));
    }

    public static final void l(String str) {
        Log.w("l7.s", "WARNING: Calling setGraphApiVersion from non-DEBUG code.");
        if (q7.e0.w(str) || kotlin.jvm.internal.n.a(l, str)) {
            return;
        }
        l = str;
    }
}
