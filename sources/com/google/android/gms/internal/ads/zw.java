package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.ironsource.O6;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.unity3d.services.UnityAdsConstants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zw implements ax {
    public static final Object l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static ax f22724m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static ax f22725n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static ax f22726o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Boolean f22727p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f22730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f22731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f22732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f22733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f22734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f22735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f22736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f22737j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f22738k;

    /* JADX WARN: Code duplicated, block: B:11:0x0052  */
    public zw(Context context, VersionInfoParcel versionInfoParcel) {
        PackageInfo packageInfoF;
        String country;
        this.f22730c = new Object();
        this.f22731d = new WeakHashMap();
        this.f22732e = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new lu0()));
        this.f22737j = new AtomicBoolean();
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f22728a = context;
        this.f22733f = versionInfoParcel;
        String string = null;
        if (((Boolean) zzba.zzc().a(am.f12085b9)).booleanValue()) {
            Handler handler = zzf.zza;
            if (context == null || context.getApplicationInfo() == null) {
                packageInfoF = null;
            } else {
                try {
                    packageInfoF = r9.c.a(context).f(0, context.getApplicationInfo().packageName);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfoF = null;
                }
            }
        } else {
            packageInfoF = null;
        }
        this.f22734g = packageInfoF;
        ul ulVar = am.O8;
        if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
            Handler handler2 = zzf.zza;
            country = Locale.getDefault().getCountry();
        } else {
            country = "unknown";
        }
        this.f22735h = country;
        if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
            Context context2 = this.f22728a;
            Handler handler3 = zzf.zza;
            if (context2 != null) {
                try {
                    PackageInfo packageInfoF2 = r9.c.a(context2).f(128, "com.android.vending");
                    if (packageInfoF2 != null) {
                        string = Integer.toString(packageInfoF2.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
            }
        } else {
            string = "unknown";
        }
        this.f22736i = string;
        if (((Integer) zzba.zzc().a(am.K8)).intValue() > 0) {
            this.f22738k = new HashSet();
        }
    }

    public static ax c(Context context) {
        synchronized (l) {
            try {
                if (f22724m == null) {
                    if (h(context)) {
                        f22724m = new zw(context, VersionInfoParcel.forPackage());
                    } else {
                        f22724m = new jq(10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f22724m;
    }

    public static ax d(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (l) {
            try {
                if (f22726o == null) {
                    boolean z10 = false;
                    if (((Boolean) zm.f22661c.o()).booleanValue()) {
                        if (!((Boolean) zzba.zzc().a(am.I8)).booleanValue() || ((Boolean) zm.f22659a.o()).booleanValue()) {
                            z10 = true;
                        }
                    }
                    if (h(context)) {
                        zw zwVar = new zw(context, versionInfoParcel);
                        zwVar.i();
                        Thread.setDefaultUncaughtExceptionHandler(new yw(zwVar, Thread.getDefaultUncaughtExceptionHandler(), 0));
                        f22726o = zwVar;
                    } else if (!z10 || context == null) {
                        f22726o = new jq(10);
                    } else {
                        zw zwVar2 = new zw(context, versionInfoParcel);
                        zwVar2.f22729b = true;
                        zwVar2.i();
                        Thread.setDefaultUncaughtExceptionHandler(new yw(zwVar2, Thread.getDefaultUncaughtExceptionHandler(), 0));
                        f22726o = zwVar2;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f22726o;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003b A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:11:0x002d, B:14:0x003b, B:15:0x0044), top: B:20:0x0003 }] */
    public static ax e(Context context) {
        synchronized (l) {
            try {
                if (f22725n == null) {
                    if (((Boolean) zzba.zzc().a(am.J8)).booleanValue()) {
                        if (((Boolean) zzba.zzc().a(am.I8)).booleanValue() || context == null) {
                            f22725n = new jq(10);
                        } else {
                            f22725n = new zw(context, VersionInfoParcel.forPackage());
                        }
                    } else {
                        f22725n = new jq(10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f22725n;
    }

    public static String f(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean h(Context context) {
        if (context != null) {
            synchronized (l) {
                try {
                    if (f22727p == null) {
                        f22727p = Boolean.valueOf(zzay.zzh().nextInt(100) < ((Integer) zzba.zzc().a(am.f12367te)).intValue());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (f22727p.booleanValue()) {
                if (!((Boolean) zzba.zzc().a(am.I8)).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ax
    public void a(String str, Throwable th2) {
        if (this.f22729b) {
            return;
        }
        b(th2, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.ax
    public void b(Throwable th2, String str, float f10) {
        Throwable th3;
        String strZzh;
        boolean zG;
        String packageName;
        ActivityManager.MemoryInfo memoryInfoZze;
        Context context = this.f22728a;
        if (this.f22729b) {
            return;
        }
        Handler handler = zzf.zza;
        if (((Boolean) pn.f18741e.o()).booleanValue()) {
            th3 = th2;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th3 = null;
            while (!linkedList.isEmpty()) {
                Throwable th4 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th4.getStackTrace();
                boolean z10 = ((Boolean) zzba.zzc().a(am.f12222k3)).booleanValue() && stackTrace != null && stackTrace.length == 0 && zzf.zzq(th4.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (zzf.zzq(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z10 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z10) {
                    th3 = th3 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th3);
                    th3.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th3 != null) {
            String name = th2.getClass().getName();
            String strF = f(th2);
            if (!((Boolean) zzba.zzc().a(am.f12213ja)).booleanValue() || (strZzh = zzf.zzh(f(th2))) == null) {
                strZzh = "";
            }
            double d10 = f10;
            double dRandom = Math.random();
            int i10 = f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (int) (1.0f / f10) : 1;
            if (dRandom < d10) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    zG = r9.c.a(context).g();
                } catch (Throwable th5) {
                    zzo.zzg("Error fetching instant app info", th5);
                    zG = false;
                }
                try {
                    packageName = context.getPackageName();
                } catch (Throwable unused) {
                    zzo.zzi("Cannot obtain package name, proceeding.");
                    packageName = "unknown";
                }
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zG)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter(O6.F, Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
                String str2 = Build.MANUFACTURER;
                String strJ = Build.MODEL;
                if (!strJ.startsWith(str2)) {
                    strJ = q4.a.j(new StringBuilder(String.valueOf(str2).length() + 1 + strJ.length()), str2, " ", strJ);
                }
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter(X3.i.G, strJ);
                VersionInfoParcel versionInfoParcel = (VersionInfoParcel) this.f22733f;
                Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("js", versionInfoParcel.afmaVersion).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strF).appendQueryParameter("eids", TextUtils.join(",", zzba.zzb().a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "910357297").appendQueryParameter(DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT, "dev").appendQueryParameter("sampling_rate", Integer.toString(i10)).appendQueryParameter("pb_tm", String.valueOf(pn.f18739c.o()));
                i9.e.f42929b.getClass();
                Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("gmscv", String.valueOf(i9.e.a(context))).appendQueryParameter("lite", true != versionInfoParcel.isLiteSdk ? "0" : "1");
                if (!TextUtils.isEmpty(strZzh)) {
                    builderAppendQueryParameter4.appendQueryParameter("hash", strZzh);
                }
                if (((Boolean) zzba.zzc().a(am.P8)).booleanValue() && (memoryInfoZze = zzf.zze(context)) != null) {
                    builderAppendQueryParameter4.appendQueryParameter("available_memory", Long.toString(memoryInfoZze.availMem));
                    builderAppendQueryParameter4.appendQueryParameter("total_memory", Long.toString(memoryInfoZze.totalMem));
                    builderAppendQueryParameter4.appendQueryParameter("is_low_memory", true != memoryInfoZze.lowMemory ? "0" : "1");
                }
                if (((Boolean) zzba.zzc().a(am.O8)).booleanValue()) {
                    String str3 = (String) this.f22735h;
                    if (!TextUtils.isEmpty(str3)) {
                        builderAppendQueryParameter4.appendQueryParameter("countrycode", str3);
                    }
                    String str4 = (String) this.f22736i;
                    if (!TextUtils.isEmpty(str4)) {
                        builderAppendQueryParameter4.appendQueryParameter("psv", str4);
                    }
                    PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                    if (currentWebViewPackage != null) {
                        builderAppendQueryParameter4.appendQueryParameter("wvvc", Integer.toString(currentWebViewPackage.versionCode));
                        builderAppendQueryParameter4.appendQueryParameter("wvvn", currentWebViewPackage.versionName);
                        builderAppendQueryParameter4.appendQueryParameter("wvpn", currentWebViewPackage.packageName);
                    }
                }
                PackageInfo packageInfo = (PackageInfo) this.f22734g;
                if (packageInfo != null) {
                    builderAppendQueryParameter4.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    builderAppendQueryParameter4.appendQueryParameter("appvn", packageInfo.versionName);
                }
                if (((Boolean) zzba.zzc().a(am.f12155fd)).booleanValue()) {
                    String strZzf = zzf.zzf(context);
                    builderAppendQueryParameter4.appendQueryParameter("uev", strZzf != null ? strZzf : "");
                }
                arrayList2.add(builderAppendQueryParameter4.toString());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((ExecutorService) this.f22732e).execute(new zd1(10, new zzu(context, null), (String) it.next()));
                }
            }
        }
    }

    public void g(Throwable th2) {
        Context context;
        SharedPreferences sharedPreferences;
        HashSet hashSet = (HashSet) this.f22738k;
        if (th2 != null) {
            boolean zZzq = false;
            boolean zEquals = false;
            for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zZzq |= zzf.zzq(stackTraceElement.getClassName());
                    zEquals |= zw.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            int iIntValue = ((Integer) zzba.zzc().a(am.K8)).intValue();
            if (iIntValue > 0) {
                if (hashSet.size() >= iIntValue) {
                    return;
                }
                String strZzh = zzf.zzh(f(th2));
                if (strZzh == null) {
                    strZzh = "";
                }
                if (hashSet.contains(strZzh)) {
                    return;
                } else {
                    hashSet.add(strZzh);
                }
            }
            if (!zZzq || zEquals) {
                return;
            }
            if (!this.f22729b) {
                a("", th2);
            }
            if (((AtomicBoolean) this.f22737j).getAndSet(true) || !((Boolean) zm.f22661c.o()).booleanValue() || (sharedPreferences = (context = this.f22728a).getSharedPreferences(AppLovinMediationProvider.ADMOB, 0)) == null) {
                return;
            }
            sharedPreferences.edit().putInt("crash_without_write", x10.B(context, "crash_without_write") + 1).commit();
        }
    }

    public void i() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.f22730c) {
            ((WeakHashMap) this.f22731d).put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new yw(this, thread.getUncaughtExceptionHandler(), 1));
    }

    public List j() {
        j0 j0Var;
        if (Build.VERSION.SDK_INT >= 32 && (j0Var = (j0) this.f22735h) != null) {
            return j0Var.d();
        }
        aa1 aa1Var = ca1.f13122b;
        return ya1.f22208e;
    }

    public void k(l02 l02Var) {
        if (!this.f22729b || l02Var.equals((l02) this.f22736i)) {
            return;
        }
        this.f22736i = l02Var;
        k12 k12Var = (k12) ((at0) this.f22730c).f12510b;
        k12Var.e();
        l02 l02Var2 = k12Var.f16271e;
        if (l02Var2 == null || l02Var.equals(l02Var2)) {
            return;
        }
        k12Var.f16271e = l02Var;
        mk0 mk0Var = k12Var.f16269c;
        if (mk0Var != null) {
            mk0Var.i(-1, b02.f12590g);
            mk0Var.j();
        }
    }

    public void l() {
        List listJ = j();
        z80 z80Var = (z80) this.f22738k;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.f22737j;
        ya1 ya1Var = l02.f16619e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.f22728a;
        k(l02.a(context, context.registerReceiver(null, intentFilter), z80Var, audioDeviceInfo, listJ));
    }

    public zw(Context context, at0 at0Var, z80 z80Var, AudioDeviceInfo audioDeviceInfo) {
        zw zwVar;
        Context applicationContext = context.getApplicationContext();
        this.f22728a = applicationContext;
        this.f22730c = at0Var;
        this.f22738k = z80Var;
        this.f22737j = audioDeviceInfo;
        String str = uu0.f20901a;
        Looper looperMyLooper = Looper.myLooper();
        n02 n02Var = null;
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f22731d = handler;
        this.f22732e = new m02(this, 0);
        this.f22733f = new q7.c(this, 6);
        ya1 ya1Var = l02.f16619e;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        if (uriFor != null) {
            zwVar = this;
            n02Var = new n02(zwVar, handler, applicationContext.getContentResolver(), uriFor, 0);
        } else {
            zwVar = this;
        }
        zwVar.f22734g = n02Var;
    }
}
