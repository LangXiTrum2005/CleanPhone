package com.google.android.gms.ads.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.app.LocaleManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.widget.AbsListView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.ca;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.b30;
import com.google.android.gms.internal.ads.c40;
import com.google.android.gms.internal.ads.du0;
import com.google.android.gms.internal.ads.fu0;
import com.google.android.gms.internal.ads.gh0;
import com.google.android.gms.internal.ads.lj1;
import com.google.android.gms.internal.ads.o81;
import com.google.android.gms.internal.ads.p81;
import com.google.android.gms.internal.ads.pn;
import com.google.android.gms.internal.ads.tx;
import com.google.android.gms.internal.ads.ul;
import com.google.android.gms.internal.ads.y01;
import com.google.android.gms.internal.ads.yh0;
import com.google.android.gms.internal.ads.z71;
import com.google.android.gms.internal.ads.zw1;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadService;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayInputStream;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import m0.c0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q4.a;
import r9.c;
import t6.l;
import u.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzs {
    public static final y01 zza = new zzf(Looper.getMainLooper());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f11174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile String f11175h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f11168a = new AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f11169b = new AtomicReference(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f11170c = new AtomicReference(new Bundle());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f11171d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11172e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f11173f = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f11176i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f11177j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ExecutorService f11178k = Executors.newSingleThreadExecutor();

    public static boolean a(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = (Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static String b(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        return (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    public static Bundle c(Context context) {
        try {
            return c.a(context).d(128, context.getPackageName()).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            zze.zzb("Error getting metadata", e10);
            return null;
        }
    }

    public static final void d(h hVar, Bundle bundle) {
        Intent intent = hVar.f51632a;
        if (bundle.isEmpty()) {
            return;
        }
        int i10 = bundle.getInt("h", -1);
        if (i10 >= 0) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            intent.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i10);
            intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", 0);
        }
        int i11 = bundle.getInt("cbp", -1);
        if (i11 < 0 || i11 > 2) {
            return;
        }
        if (i11 < 0 || i11 > 2) {
            throw new IllegalArgumentException("Invalid value for the position argument");
        }
        intent.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i11);
    }

    public static final String e(final Context context, String str) {
        final Context contextCreatePackageContext;
        if (str == null) {
            com.google.android.gms.ads.internal.zzt.zzh().d("AdUtil.getUserAgent", new Exception("null afmaVersion"));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12173h)).booleanValue()) {
                return f();
            }
            str = VersionInfoParcel.forPackage().afmaVersion;
        }
        String strF = null;
        try {
            zzce zzceVarZza = zzce.zza();
            if (TextUtils.isEmpty(zzceVarZza.f11109a)) {
                int i10 = i9.h.f42935e;
                try {
                    contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    contextCreatePackageContext = null;
                }
                zzceVarZza.f11109a = (String) zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcd
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        SharedPreferences sharedPreferences;
                        boolean z10 = false;
                        Context context2 = contextCreatePackageContext;
                        Context context3 = context;
                        if (context2 != null) {
                            zze.zza("Attempting to read user agent from Google Play Services.");
                            sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                        } else {
                            zze.zza("Attempting to read user agent from local cache.");
                            sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                            z10 = true;
                        }
                        String string = sharedPreferences.getString("user_agent", "");
                        if (!TextUtils.isEmpty(string)) {
                            return string;
                        }
                        zze.zza("Reading user agent from WebSettings");
                        String defaultUserAgent = WebSettings.getDefaultUserAgent(context3);
                        if (z10) {
                            sharedPreferences.edit().putString("user_agent", defaultUserAgent).apply();
                            zze.zza("Persisting user agent.");
                        }
                        return defaultUserAgent;
                    }
                });
            }
            strF = zzceVarZza.f11109a;
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(strF)) {
            strF = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(strF)) {
            strF = f();
        }
        String strJ = a.j(new StringBuilder(String.valueOf(strF).length() + 10 + String.valueOf(str).length()), strF, " (Mobile; ", str);
        try {
            if (c.a(context).g()) {
                StringBuilder sb2 = new StringBuilder(strJ.length() + 4);
                sb2.append(strJ);
                sb2.append(";aia");
                strJ = sb2.toString();
            }
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzt.zzh().d("AdUtil.getUserAgent", e10);
        }
        return strJ.concat(")");
    }

    public static final String f() {
        StringBuilder sb2 = new StringBuilder(NotificationCompat.FLAG_LOCAL_ONLY);
        sb2.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb2.append(" ");
            sb2.append(str);
        }
        sb2.append("; ");
        sb2.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb2.append("; ");
            sb2.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb2.append(" Build/");
                sb2.append(str3);
            }
        }
        sb2.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb2.toString();
    }

    public static final int zzA(@Nullable View view) {
        ViewParent parent = view.getParent();
        while (true) {
            if (parent == null) {
                return 0;
            }
            if (parent instanceof ScrollView) {
                return 1;
            }
            if (parent instanceof AbsListView) {
                return 2;
            }
            if (parent instanceof HorizontalScrollView) {
                return 3;
            }
            if (parent instanceof c0) {
                return 4;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12285o9)).booleanValue()) {
                String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12302p9);
                if (TextUtils.isEmpty(str)) {
                    continue;
                } else {
                    for (String str2 : str.split(",")) {
                        if (parent.getClass().getName().toLowerCase(Locale.ROOT).contains(str2)) {
                            return 5;
                        }
                    }
                }
            }
            parent = parent.getParent();
        }
    }

    public static final String zzB() {
        Resources resourcesC = com.google.android.gms.ads.internal.zzt.zzh().c();
        return resourcesC != null ? resourcesC.getString(R.string.f10716s7) : "Test Ad";
    }

    @Nullable
    public static final zzbo zzC(Context context) {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
                return iInterfaceQueryLocalInterface instanceof zzbo ? (zzbo) iInterfaceQueryLocalInterface : new zzbm(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            }
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Instantiated WorkManagerUtil not instance of IBinder.");
            return null;
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzt.zzh().d("Failed to instantiate WorkManagerUtil", e10);
            return null;
        }
    }

    public static final boolean zzD(Context context, String str) {
        int i10 = tx.f20518a;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return c.a(context).f40681b.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static final boolean zzE(Context context) {
        try {
            if (p9.c.f48286h == null) {
                p9.c.f48286h = Boolean.valueOf(context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE"));
            }
            return p9.c.f48286h.booleanValue();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0066 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0068 A[LOOP:1: B:20:0x005c->B:25:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x0056, please report this as an issue */
    public static final boolean zzF(String str) {
        String str2;
        int i10;
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12254m6)).booleanValue()) {
                String str3 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.o6);
                if (str3.isEmpty()) {
                    str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12268n6);
                    if (str2.isEmpty()) {
                        return true;
                    }
                    for (String str4 : str2.split(";")) {
                        if (str4.equals(str)) {
                            return true;
                        }
                    }
                } else {
                    for (String str5 : str3.split(";")) {
                        if (!str5.equals(str)) {
                        }
                    }
                    str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12268n6);
                    if (str2.isEmpty()) {
                        return true;
                    }
                    while (i10 < r2) {
                        if (str4.equals(str)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean zzG(Context context) {
        if (context == null) {
            return false;
        }
        Object systemService = context.getSystemService("keyguard");
        KeyguardManager keyguardManager = (systemService == null || !(systemService instanceof KeyguardManager)) ? null : (KeyguardManager) systemService;
        return keyguardManager != null && keyguardManager.isKeyguardLocked();
    }

    public static final boolean zzH(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th2) {
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error loading class.", th2);
            com.google.android.gms.ads.internal.zzt.zzh().d("AdUtil.isLiteSdk", th2);
            return false;
        }
    }

    public static final boolean zzI() {
        int iMyUid = Process.myUid();
        return iMyUid == 0 || iMyUid == 1000;
    }

    public static final boolean zzJ(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    return runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode() || (powerManager = (PowerManager) context.getSystemService("power")) == null || !powerManager.isScreenOn();
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzK(Context context) {
        try {
            Bundle bundleC = c(context);
            return TextUtils.isEmpty(b(bundleC)) && !TextUtils.isEmpty(bundleC.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
        } catch (RemoteException unused) {
        }
    }

    public static final boolean zzL(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void zzM(View view, int i10, MotionEvent motionEvent) {
        String str;
        int i11;
        int iHeight;
        int iWidth;
        String str2;
        String strA;
        du0 du0VarZzC;
        fu0 fu0VarR;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = childAt.getContext().getPackageName();
            if (childAt instanceof gh0) {
                childAt = ((gh0) childAt).getChildAt(0);
            }
            if ((childAt instanceof com.google.android.gms.ads.formats.zzh) || (childAt instanceof NativeAdView)) {
                str = "NATIVE";
                i11 = 1;
            } else {
                str = "UNKNOWN";
                i11 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            long jZzy = zzy(childAt);
            childAt.getLocationOnScreen(iArr);
            int i12 = iArr[0];
            int i13 = iArr[1];
            String str3 = "none";
            if (!(childAt instanceof b30) || (fu0VarR = ((b30) childAt).r()) == null) {
                str2 = "none";
            } else {
                str2 = fu0VarR.f14546b;
                int iHashCode = childAt.hashCode();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(iHashCode).length());
                sb2.append(str2);
                sb2.append(":");
                sb2.append(iHashCode);
                childAt.setContentDescription(sb2.toString());
            }
            if (!(childAt instanceof b30) || (du0VarZzC = ((b30) childAt).zzC()) == null) {
                strA = str;
            } else {
                strA = du0.a(du0VarZzC.f13677b);
                i11 = du0VarZzC.f13683e;
                str3 = du0VarZzC.E;
            }
            Locale locale = Locale.US;
            String str4 = "<Ad hashCode=" + childAt.hashCode() + ", package=" + packageName + ", adNetCls=" + str3 + ", gwsQueryId=" + str2 + ", format=" + strA + ", impType=" + i11 + ", class=" + childAt.getClass().getName() + ", x=" + i12 + ", y=" + i13 + ", width=" + childAt.getWidth() + ", height=" + childAt.getHeight() + ", vWidth=" + iWidth + ", vHeight=" + iHeight + ", alpha=" + jZzy + ", state=" + Integer.toString(i10, 2) + ">";
            int i14 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh(str4);
        } catch (Exception e10) {
            int i15 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failure getting view location.", e10);
        }
    }

    public static final AlertDialog.Builder zzN(Context context) {
        com.google.android.gms.ads.internal.zzt.zzf();
        return new AlertDialog.Builder(context, android.R.style.Theme.Material.Dialog.Alert);
    }

    public static final void zzO(Context context, String str, String str2) {
        new zzbt(context, str, str2, null, null).zzb();
    }

    public static final void zzP(Context context, Throwable th2) {
        if (context == null) {
            return;
        }
        try {
            if (((Boolean) pn.f18738b.o()).booleanValue()) {
                p9.c.a(context, th2);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public static final void zzQ(Context context, du0 du0Var, yh0 yh0Var) {
        lj1 lj1VarA = yh0Var.a();
        lj1VarA.l("action", "can_show");
        com.google.android.gms.ads.internal.zzt.zzc();
        lj1VarA.l(DownloadService.KEY_FOREGROUND, true != zzJ(context) ? "1" : "0");
        lj1VarA.l("fg_al", true == com.google.android.gms.ads.internal.zzt.zzg().e() ? "1" : "0");
        if (du0Var != null) {
            List list = du0Var.f13710t;
            if (!list.isEmpty()) {
                lj1VarA.l("ancn", (String) list.get(0));
            }
            lj1VarA.l("ad_format", du0.a(du0Var.f13677b));
        }
        lj1VarA.m();
    }

    public static final boolean zzR(@Nullable du0 du0Var) {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.kf)).booleanValue() && du0Var != null && du0Var.f13683e == 4;
    }

    public static final int zzS(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            String strConcat = "Could not parse value:".concat(e10.toString());
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
            return 0;
        }
    }

    @Nullable
    public static final Map zzT(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12413x)).booleanValue()) {
            HashMap map = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    map.put(str, uri.getQueryParameter(str));
                }
            }
            return map;
        }
        HashMap map2 = new HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i10 = 0;
            while (true) {
                int iIndexOf = encodedQuery.indexOf(38, i10);
                int length = encodedQuery.length();
                if (iIndexOf != -1) {
                    length = iIndexOf;
                }
                int iIndexOf2 = encodedQuery.indexOf(61, i10);
                if (iIndexOf2 > length || iIndexOf2 == -1) {
                    iIndexOf2 = length;
                }
                map2.put(Uri.decode(encodedQuery.substring(i10, iIndexOf2)), iIndexOf2 == length ? "" : Uri.decode(encodedQuery.substring(iIndexOf2 + 1, length)));
                if (iIndexOf == -1) {
                    break;
                }
                i10 = iIndexOf + 1;
            }
        }
        return map2;
    }

    public static final int[] zzV(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(android.R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    public static final int[] zzW(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArr = (window == null || (viewFindViewById = window.findViewById(android.R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        return new int[]{com.google.android.gms.ads.internal.client.zzay.zza().zza(activity, iArr[0]), com.google.android.gms.ads.internal.client.zzay.zza().zza(activity, iArr[1])};
    }

    public static final boolean zzX(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z10 = com.google.android.gms.ads.internal.zzt.zzc().f11172e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzo(view);
        long jZzy = zzy(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z10)) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12095c2)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12215jc)).booleanValue()) {
                    if (jZzy < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.lc)).intValue()) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static final void zzY(Context context, Intent intent) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.Gc)).booleanValue()) {
            try {
                context.startActivity(intent);
                return;
            } catch (Throwable unused) {
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            }
        }
        try {
            try {
                context.startActivity(intent);
            } catch (SecurityException e10) {
                int i10 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("", e10);
                com.google.android.gms.ads.internal.zzt.zzh().d("AdUtil.startActivityWithUnknownContext", e10);
            }
        } catch (Throwable unused2) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static final void zzZ(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzq(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String string = uri.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 26);
            sb2.append("Opening ");
            sb2.append(string);
            sb2.append(" in a new browser.");
            String string2 = sb2.toString();
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(string2);
        } catch (ActivityNotFoundException e10) {
            int i11 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("No browser is found.", e10);
        }
    }

    public static int zza(int i10) {
        if (i10 >= 5000) {
            return i10;
        }
        if (i10 <= 0) {
            return 60000;
        }
        String strM = ca.m(new StringBuilder(String.valueOf(i10).length() + 86), "HTTP timeout too low: ", i10, " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        int i11 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strM);
        return 60000;
    }

    public static final int[] zzaa(Activity activity) {
        int[] iArrZzV = zzV(activity);
        return new int[]{com.google.android.gms.ads.internal.client.zzay.zza().zza(activity, iArrZzV[0]), com.google.android.gms.ads.internal.client.zzay.zza().zza(activity, iArrZzV[1])};
    }

    public static final boolean zzab(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        KeyguardManager keyguardManager = null;
        PowerManager powerManager = applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null;
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return zzX(view, powerManager, keyguardManager);
    }

    public static final void zzac(Context context, Intent intent, @Nullable yh0 yh0Var, String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.Oe)).booleanValue() || !(context instanceof c40)) {
            zzY(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data != null && data.toString() != null) {
                if (data.toString().matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.Qe))) {
                    ((c40) context).a(intent);
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.Pe)).booleanValue() || yh0Var == null) {
                        return;
                    }
                    lj1 lj1VarA = yh0Var.a();
                    lj1VarA.l("action", "hila");
                    if (str == null) {
                        str = "";
                    }
                    lj1VarA.l("gqi", str);
                    lj1VarA.r();
                    return;
                }
            }
            zzY(context, intent);
        } catch (ActivityNotFoundException | SecurityException e10) {
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while starting activity for result", e10);
            com.google.android.gms.ads.internal.zzt.zzh().d("AdUtil.startActivityForResult", e10);
            zzY(context, intent);
        } catch (Exception e11) {
            int i11 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while starting activity for result", e11);
            com.google.android.gms.ads.internal.zzt.zzh().d("AdUtil.startActivityForResult", e11);
            zzY(context, intent);
        }
    }

    public static List zzj() {
        ul ulVar = am.f12058a;
        ArrayList<String> arrayListB = com.google.android.gms.ads.internal.client.zzba.zzb().b();
        ArrayList arrayList = new ArrayList();
        for (String str : arrayListB) {
            l lVarH = l.h(new z71(','));
            str.getClass();
            Iterator itE = ((p81) lVarH.f50551d).e(lVarH, str);
            while (true) {
                o81 o81Var = (o81) itE;
                if (o81Var.hasNext()) {
                    try {
                        arrayList.add(Long.valueOf((String) o81Var.next()));
                    } catch (NumberFormatException unused) {
                        zze.zza("Experiment ID is not a number");
                    }
                }
            }
        }
        return arrayList;
    }

    public static zzq zzk(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            Locale locale = context.getResources().getConfiguration().getLocales().get(0);
            return new zzq(locale.getLanguage(), locale.getCountry());
        }
        zzq zzqVar = new zzq(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
        try {
            LocaleManager localeManagerB = i0.a.b(context.getSystemService(i0.a.f()));
            if (localeManagerB == null || localeManagerB.getSystemLocales().isEmpty()) {
                return zzqVar;
            }
            Locale locale2 = localeManagerB.getSystemLocales().get(0);
            return new zzq(locale2.getLanguage(), locale2.getCountry());
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzt.zzh().d("AdUtil.getSystemDefaultLocale", th2);
            return zzqVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public static final boolean zzo(View view) {
        Activity activity;
        View rootView = view.getRootView();
        if (rootView == null) {
            activity = null;
        } else {
            Context context = rootView.getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                activity = null;
            }
        }
        if (activity == null) {
            return false;
        }
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        return (attributes == null || (attributes.flags & 524288) == 0) ? false : true;
    }

    public static final boolean zzp(final Context context, final WebSettings webSettings) {
        zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzn
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                y01 y01Var = zzs.zza;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings2 = webSettings;
                webSettings2.setDatabasePath(absolutePath);
                webSettings2.setDatabaseEnabled(true);
                webSettings2.setDomStorageEnabled(true);
                webSettings2.setDisplayZoomControls(false);
                webSettings2.setBuiltInZoomControls(true);
                webSettings2.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.B1)).booleanValue()) {
                    webSettings2.setTextZoom(100);
                }
                webSettings2.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    public static final void zzq(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String zzr(Context context) throws RemoteException {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return b(c(context));
    }

    public static final String zzt() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : a.j(new StringBuilder(String.valueOf(str).length() + 1 + str2.length()), str, " ", str2);
    }

    @Nullable
    public static final Integer zzu(Context context) {
        Object systemService = context.getSystemService(X3.i.f27786d);
        if (systemService instanceof DisplayManager) {
            return Integer.valueOf(((DisplayManager) systemService).getDisplays().length);
        }
        return null;
    }

    public static final DisplayMetrics zzv(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final Map zzx(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                HashSet hashSet = new HashSet();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                if (jSONArrayOptJSONArray != null) {
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i10);
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                        }
                    }
                    map.put(next, hashSet);
                }
            }
            return map;
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().d("AdUtil.getMapOfFileNamesToKeysFromJsonString", e10);
            return map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long zzy(View view) {
        float f10;
        float fMin = Float.MAX_VALUE;
        do {
            boolean z10 = view instanceof View;
            f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (!z10) {
                break;
            }
            View view2 = (View) view;
            fMin = Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (fMin >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f10 = fMin;
        }
        return Math.round(f10 * 100.0f);
    }

    @Nullable
    public static final WebResourceResponse zzz(Context context, String str, String str2) {
        try {
            HashMap map = new HashMap();
            map.put(Command.HTTP_HEADER_USER_AGENT, com.google.android.gms.ads.internal.zzt.zzc().zze(context, str));
            map.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzbl(context).zzb(0, str2, map, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes(StandardCharsets.UTF_8)));
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not fetch MRAID JS.", e10);
        }
        return null;
    }

    public final void zzb(Context context, String str, boolean z10, HttpURLConnection httpURLConnection, boolean z11, int i10) {
        int iZza = zza(i10);
        String strM = ca.m(new StringBuilder(String.valueOf(iZza).length() + 28), "HTTP timeout: ", iZza, " milliseconds.");
        int i11 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(strM);
        httpURLConnection.setConnectTimeout(iZza);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iZza);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty(Command.HTTP_HEADER_USER_AGENT))) {
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, zze(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzc(Context context) {
        if (this.f11176i) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        am.a(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.Fc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzr(this), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzr(this), intentFilter, 4);
        }
        this.f11176i = true;
        return true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzd(Context context) {
        if (this.f11177j) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        am.a(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.Fc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzp(), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzp(), intentFilter, 4);
        }
        this.f11177j = true;
        return true;
    }

    public final String zze(Context context, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.Sc)).booleanValue()) {
            if (this.f11175h != null) {
                return this.f11175h;
            }
            String strE = e(context, str);
            if (str != null) {
                this.f11175h = strE;
            }
            return strE;
        }
        synchronized (this.f11173f) {
            try {
                String str2 = this.f11174g;
                if (str2 != null) {
                    return str2;
                }
                String strE2 = e(context, str);
                if (str != null) {
                    this.f11174g = strE2;
                }
                return strE2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final ListenableFuture zzf(final Uri uri) {
        return zw1.o(this.f11178k, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzo
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                y01 y01Var = zzs.zza;
                com.google.android.gms.ads.internal.zzt.zzc();
                return zzs.zzT(uri);
            }
        });
    }

    public final void zzg(final Context context, @Nullable final String str, String str2, Bundle bundle, boolean z10) {
        com.google.android.gms.ads.internal.zzt.zzc();
        bundle.putString(X3.i.G, zzt());
        ul ulVar = am.f12058a;
        bundle.putString("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzba.zzb().a()));
        if (bundle.isEmpty()) {
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Empty or null bundle.");
        } else {
            final String str3 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12183hc);
            boolean andSet = this.f11171d.getAndSet(true);
            AtomicReference atomicReference = this.f11170c;
            if (!andSet) {
                atomicReference.set(zzac.zzc(context, str3, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.ads.internal.util.zzm
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str4) {
                        this.f11159a.f11170c.set(zzac.zzb(context, str3));
                    }
                }));
            }
            bundle.putAll((Bundle) atomicReference.get());
        }
        com.google.android.gms.ads.internal.client.zzay.zza();
        com.google.android.gms.ads.internal.util.client.zzf.zzD(context, str, "gmob-apps", bundle, true, new com.google.android.gms.ads.internal.util.client.zze() { // from class: com.google.android.gms.ads.internal.util.zzl
            @Override // com.google.android.gms.ads.internal.util.client.zze
            public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zza(String str4) {
                y01 y01Var = zzs.zza;
                com.google.android.gms.ads.internal.zzt.zzc();
                zzs.zzO(context, str, str4);
                return com.google.android.gms.ads.internal.util.client.zzt.zza;
            }
        });
    }

    public final boolean zzh(String str) {
        return a(str, this.f11168a, (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.V0));
    }

    public final boolean zzi(String str) {
        return a(str, this.f11169b, (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.W0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        if (com.google.android.gms.ads.internal.util.client.zzf.zzy() != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzn(android.content.Context r11, android.net.Uri r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzs.zzn(android.content.Context, android.net.Uri, android.os.Bundle):int");
    }
}
