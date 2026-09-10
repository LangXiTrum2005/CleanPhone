package com.smartdigimkt.v0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import com.applovin.shadow.okio.Segment;
import com.p004ironsource.d9;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class v extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f39042b = "SameTools";
    static List<String> o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f39043c = {'A', 'p', 'p', 'l', 'i', 'c', 'a', 't', 'i', 'o', 'n', 'I', 'n', 'f', 'o'};
    private static char[] d = {'.', 'X'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f39044e = 0;
    private static int f = 1;
    private static int g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f39045h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f39046i = 0;
    private static int j = 7;
    private static int k = 14;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f39047l = 19;
    private static int m = 16;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f39048n = 26;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f39049p = 1;

    public class a implements View.OnClickListener {
        final /* synthetic */ Context X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f39050Y;

        public a(Context context, String str) {
            this.X = context;
            this.f39050Y = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                com.smartdigimkt.o8.c.a(this.X, this.f39050Y);
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
    }

    public static int a(int i2) {
        if ((i2 > 100 && i2 < 199) || i2 == 2) {
            return 1;
        }
        if ((i2 <= 200 || i2 >= 299) && i2 != 4) {
            return (i2 <= 500 || i2 >= 599) ? -1 : 5;
        }
        return 2;
    }

    public static boolean b(List list) {
        return list == null || list.isEmpty();
    }

    public static int c(Context context) {
        if (context != null) {
            return 0;
        }
        try {
            if (context.getResources().getIdentifier("config_showNavigationBar", "bool", "android") != 0) {
                return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("navigation_bar_height", "dimen", "android"));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return 0;
    }

    public static float d(Context context) {
        if (context != null) {
            try {
                float f2 = context.getResources().getDisplayMetrics().density;
                if (f2 == 0.0f) {
                    return 2.5f;
                }
                return f2;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return 2.5f;
    }

    public static DisplayMetrics e(Context context) {
        if (context == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
            return displayMetrics;
        } catch (Throwable th) {
            th.printStackTrace();
            return context.getResources().getDisplayMetrics();
        }
    }

    public static <T extends String> boolean f(T t) {
        return t != null && t.length() > 0;
    }

    public static <T extends String> boolean g(T t) {
        return t == null || t.length() == 0;
    }

    public static int h(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().heightPixels;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static int i(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().widthPixels;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static int j(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static boolean k(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() != null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean l(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (Exception unused) {
            boolean z2 = com.smartdigimkt.b.b.f33800a;
            return false;
        }
    }

    public static boolean a(List list) {
        return !b(list);
    }

    public static <T> boolean b(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    public static int f(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return e(context).heightPixels;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static int g(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return e(context).widthPixels;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static <T> boolean a(T[] tArr) {
        return !b(tArr);
    }

    public static int b(Context context, float f2) {
        float f3 = 2.5f;
        if (context != null) {
            try {
                float f4 = context.getResources().getDisplayMetrics().density;
                if (f4 != 0.0f) {
                    f3 = f4;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return (int) ((f2 / f3) + 0.5f);
    }

    public static boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri != null) {
                String queryParameter = uri.getQueryParameter("nativecananim");
                if (!TextUtils.isEmpty(queryParameter)) {
                    return queryParameter.equals("1");
                }
            }
            return false;
        } catch (Exception e2) {
            e2.getMessage();
            return false;
        }
    }

    public static int a(Context context, float f2) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return 0;
        }
        return (int) ((f2 * resources.getDisplayMetrics().density) + 0.5f);
    }

    public static boolean h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri != null) {
                String queryParameter = uri.getQueryParameter("isplayableec");
                if (!TextUtils.isEmpty(queryParameter)) {
                    return queryParameter.equals("0");
                }
            }
            return false;
        } catch (Exception e2) {
            e2.getMessage();
            return false;
        }
    }

    public static boolean i(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri != null) {
                String queryParameter = uri.getQueryParameter("wx_miniprogram");
                if (!TextUtils.isEmpty(queryParameter) && queryParameter.equals("1")) {
                    return true;
                }
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
        return false;
    }

    public static boolean b(String str, Context context) {
        try {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        } catch (Exception unused) {
        }
    }

    public static int c(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri != null) {
                String queryParameter = uri.getQueryParameter("reqwxurl");
                if (TextUtils.isEmpty(queryParameter)) {
                    return 0;
                }
                return Integer.parseInt(queryParameter);
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
        return 0;
    }

    public static int a() {
        int i2 = f39049p;
        f39049p = i2 + 1;
        return i2;
    }

    public static int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        try {
            if (obj instanceof String) {
                return Integer.parseInt((String) obj);
            }
            return 0;
        } catch (Throwable th) {
            th.getMessage();
            return 0;
        }
    }

    public static boolean b(com.smartdigimkt.x.d dVar) {
        if (dVar != null) {
            try {
                return dVar.P1() == 1;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    public static boolean e(String str) {
        int i2;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        try {
            if (zIsEmpty) {
                return false;
            }
            try {
                try {
                    Uri uri = Uri.parse(str);
                    if (uri == null) {
                        return false;
                    }
                    String queryParameter = uri.getQueryParameter("dyview");
                    if (TextUtils.isEmpty(queryParameter)) {
                        queryParameter = uri.getQueryParameter("view");
                    }
                    if (TextUtils.isEmpty(queryParameter)) {
                        zIsEmpty = false;
                    } else {
                        try {
                            i2 = Integer.parseInt(queryParameter);
                        } catch (Exception unused) {
                            i2 = -1;
                        }
                        if (i2 % 2 == 0) {
                            zIsEmpty = true;
                        } else {
                            zIsEmpty = false;
                        }
                    }
                    try {
                        if (TextUtils.isEmpty(uri.getQueryParameter("natmp"))) {
                            return zIsEmpty;
                        }
                        return true;
                    } catch (Exception e2) {
                        e = e2;
                        e.getMessage();
                        return false;
                    }
                } catch (Exception e3) {
                    e = e3;
                    zIsEmpty = false;
                }
            } catch (Throwable unused2) {
                return false;
            }
        } catch (Throwable unused3) {
            return zIsEmpty;
        }
    }

    public static double j(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return 0.0d;
            }
            return Double.parseDouble(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0.0d;
        }
    }

    public static boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static double a(Double d2) {
        try {
            String str = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.US)).format(d2);
            if (y.b(str)) {
                return Double.parseDouble(str);
            }
            return 0.0d;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0.0d;
        }
    }

    public static int b(Context context) {
        PackageInfo packageInfo;
        if (context == null) {
            return 0;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                packageInfo = WebView.getCurrentWebViewPackage();
            } else {
                packageInfo = context.getPackageManager().getPackageInfo("com.google.android.webview", 1);
            }
            com.smartdigimkt.n1.a aVarC = com.smartdigimkt.n1.b.b().c(com.smartdigimkt.u.a.f().a());
            if (aVarC == null) {
                aVarC = com.smartdigimkt.n1.b.b().a();
            }
            if (packageInfo == null || TextUtils.isEmpty(packageInfo.versionName) || !packageInfo.versionName.equals("77.0.3865.92")) {
                return aVarC.m1();
            }
            return 5;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static void a(View view) {
        if (view == null) {
            return;
        }
        try {
            view.setSystemUiVisibility(4102);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static List<String> a(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        String strOptString = jSONArray.optString(i2);
                        if (y.b(strOptString)) {
                            arrayList.add(strOptString);
                        }
                    }
                    return arrayList;
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0019 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x001b  */
    /* JADX WARN: Code duplicated, block: B:16:0x001d A[Catch: all -> 0x0015, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x000b, B:16:0x001d), top: B:24:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0023  */
    /* JADX WARN: Code duplicated, block: B:19:0x0025  */
    public static synchronized int b(Context context, String str) {
        int i2;
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    i2 = a(str, context) != null ? 1 : 0;
                } catch (Exception unused) {
                    i2 = 3;
                }
            } else if (context == null) {
                i2 = 5;
            } else if (TextUtils.isEmpty(str)) {
                i2 = 2;
            } else {
                i2 = 4;
            }
        } else if (context == null) {
            i2 = 5;
        } else if (TextUtils.isEmpty(str)) {
            i2 = 2;
        } else {
            i2 = 4;
        }
        throw th;
        return i2;
    }

    private static final char[] b(int i2) {
        StringBuilder sb;
        if (i2 == 0) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOf(u.d, j)));
            sb.append(d[f39046i]);
            com.google.firebase.crashlytics.internal.model.a.B(u.d, j, k, sb);
            sb.append(d[f39046i]);
            com.google.firebase.crashlytics.internal.model.a.B(u.d, k, m, sb);
            sb.append(d[f39046i]);
            sb.append(String.valueOf(t.j));
        } else if (i2 == 1) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOf(u.d, j)));
            sb.append(d[f39046i]);
            com.google.firebase.crashlytics.internal.model.a.B(u.d, j, k, sb);
            sb.append(d[f39046i]);
            com.google.firebase.crashlytics.internal.model.a.B(u.d, f39047l, f39048n, sb);
        } else if (i2 == 2) {
            sb = new StringBuilder();
            com.google.firebase.crashlytics.internal.model.a.B(u.d, m, f39047l, sb);
            sb.append(String.valueOf(f39043c));
        } else if (i2 != 3) {
            sb = null;
        } else {
            sb = new StringBuilder();
            com.google.firebase.crashlytics.internal.model.a.B(u.d, m, f39047l, sb);
            sb.append(String.valueOf(t.j));
        }
        return sb.toString().toCharArray();
    }

    public static String a(String str) {
        try {
            if (y.b(str)) {
                return URLEncoder.encode(str, "utf-8");
            }
            return "";
        } catch (Throwable th) {
            th.getMessage();
            return "";
        }
    }

    public static synchronized boolean a(Context context, String str) {
        boolean z2;
        z2 = false;
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    if (a(str, context) != null) {
                        z2 = true;
                    }
                } catch (Exception unused) {
                }
            }
        }
        return z2;
    }

    public static final Object a(String str, Context context) {
        try {
            return Class.forName(String.valueOf(b(f39044e))).getMethod(String.valueOf(b(g)), String.class, Integer.TYPE).invoke(Class.forName(String.valueOf(b(f))).getMethod(String.valueOf(b(f39045h)), null).invoke(context, null), str, Integer.valueOf(Segment.SIZE));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:13:0x0025
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    private static synchronized java.lang.String a(java.lang.String r2, android.content.Context r3, java.lang.String r4) {
        /*
            java.lang.Class<com.smartdigimkt.v0.v> r0 = com.smartdigimkt.v0.v.class
            monitor-enter(r0)
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            java.util.Set r2 = r2.getQueryParameterNames()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            if (r2 == 0) goto L1d
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            if (r2 <= 0) goto L1d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            java.lang.String r1 = "&rtins_type="
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            goto L2c
        L1b:
            r2 = move-exception
            goto L46
        L1d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            java.lang.String r1 = "?rtins_type="
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            goto L2c
        L25:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "&rtins_type="
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1b
        L2c:
            java.lang.Object r3 = a(r4, r3)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L3c
            if (r3 == 0) goto L37
            r3 = 1
            r2.append(r3)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L3c
            goto L40
        L37:
            r3 = 2
            r2.append(r3)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L3c
            goto L40
        L3c:
            r3 = 0
            r2.append(r3)     // Catch: java.lang.Throwable -> L1b
        L40:
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)
            return r2
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smartdigimkt.v0.v.a(java.lang.String, android.content.Context, java.lang.String):java.lang.String");
    }

    public static synchronized String a(Context context, String str, String str2) {
        StringBuilder sb;
        sb = new StringBuilder(str2);
        try {
            sb.append(a(str2, context, str));
        } catch (Exception unused) {
        }
        return sb.toString();
    }

    public static boolean a(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            try {
                try {
                    Uri uri = Uri.parse(str2);
                    if (uri != null && !TextUtils.isEmpty(uri.getQueryParameter(str))) {
                        return true;
                    }
                } catch (Exception e2) {
                    e2.getMessage();
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri != null) {
                String queryParameter = uri.getQueryParameter("dyview");
                if (TextUtils.isEmpty(queryParameter)) {
                    queryParameter = uri.getQueryParameter("view");
                }
                if (!TextUtils.isEmpty(queryParameter)) {
                    try {
                        return Integer.parseInt(queryParameter);
                    } catch (Exception unused) {
                    }
                }
            }
            return -1;
        } catch (Exception e2) {
            e2.getMessage();
            return -1;
        }
    }

    public static int a(String str, String str2, int i2) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Uri uri = Uri.parse(str);
                if (uri != null) {
                    String queryParameter = uri.getQueryParameter(str2);
                    if (!TextUtils.isEmpty(queryParameter)) {
                        return (int) Math.round(Double.valueOf(String.valueOf(queryParameter)).doubleValue());
                    }
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        return i2;
    }

    public static int b(String str, String str2) {
        return a(str, str2, 0);
    }

    public static String b(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = jSONObject.getJSONObject(d9.h.G);
                if (jSONObject2 != null) {
                    if (jSONObject2.has(str2)) {
                        if (str3.equals("0")) {
                            jSONObject2.remove(str2);
                        } else {
                            jSONObject2.put(str2, str3);
                        }
                    } else if (!str3.equals("0")) {
                        jSONObject2.put(str2, str3);
                    }
                    return jSONObject.toString();
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        return str;
    }

    public static String a(String str, String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                HashMap map = new HashMap();
                map.put(str2, str3);
                return a(str, map);
            }
            return str;
        } catch (Exception e2) {
            e2.getMessage();
            return str;
        }
    }

    public static String a(String str, Map<String, String> map) {
        try {
            if (!TextUtils.isEmpty(str) && map != null) {
                StringBuilder sb = new StringBuilder(str);
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry != null && !TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                        String value = entry.getValue();
                        if (str.contains(entry.getKey())) {
                            if (value.equals("0")) {
                                sb = new StringBuilder(str.replaceAll("(" + entry.getKey() + "[^&]*)", ""));
                            } else {
                                sb = new StringBuilder(str.replaceAll("(" + entry.getKey() + "[^&]*)", entry.getKey() + entry.getValue()));
                            }
                        } else if (!value.equals("0")) {
                            sb.append(entry.getKey() + entry.getValue());
                        }
                    }
                }
                return sb.toString();
            }
            return str;
        } catch (Exception e2) {
            e2.getMessage();
            return str;
        }
    }

    public static final void a(ImageView imageView, com.smartdigimkt.x.d dVar, Context context, boolean z2) {
        if (imageView == null || dVar == null) {
            return;
        }
        boolean z3 = dVar.E1() == 0;
        if (!z2 && z3) {
            try {
                imageView.setVisibility(8);
                return;
            } catch (Exception e2) {
                e2.getMessage();
                return;
            }
        }
        String strA = a(dVar);
        if (TextUtils.isEmpty(strA)) {
            try {
                imageView.setVisibility(8);
                return;
            } catch (Exception e3) {
                e3.getMessage();
                return;
            }
        }
        try {
            imageView.setVisibility(0);
        } catch (Exception e4) {
            e4.getMessage();
        }
        imageView.setOnClickListener(new a(context, strA));
    }

    public static final String a(com.smartdigimkt.x.d dVar) {
        com.smartdigimkt.n1.a aVarC;
        com.smartdigimkt.x.d.a aVarW;
        String strF1 = "";
        if (dVar != null) {
            try {
                strF1 = dVar.F1();
            } catch (Exception e2) {
                e2.getMessage();
                return strF1;
            }
        }
        if (TextUtils.isEmpty(strF1) && dVar != null && (aVarW = dVar.W()) != null) {
            strF1 = aVarW.e();
        }
        return (!TextUtils.isEmpty(strF1) || (aVarC = com.smartdigimkt.n1.b.b().c(com.smartdigimkt.u.a.f().a())) == null) ? strF1 : aVarC.j();
    }
}
