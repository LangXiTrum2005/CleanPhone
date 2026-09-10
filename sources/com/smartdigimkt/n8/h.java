package com.smartdigimkt.n8;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.URLUtil;
import android.webkit.WebView;
import com.applovin.shadow.okio.Segment;
import com.p004ironsource.d9;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f37188a = "CommonUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f37189b = {'a', 'n', 'd', 'r', 'o', 'i', 'd', 'c', 'o', 'n', 't', 'e', 'n', 't', 'p', 'm', 'g', 'e', 't', 'C', 'o', 'n', 't', 'e', 'x', 't'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f37190c = {'A', 'p', 'p', 'l', 'i', 'c', 'a', 't', 'i', 'o', 'n', 'I', 'n', 'f', 'o'};
    private static char[] d = {'.', 'X'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f37191e = 0;
    private static int f = 1;
    private static int g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f37192h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f37193i = 0;
    private static int j = 7;
    private static int k = 14;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f37194l = 19;
    private static int m = 16;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f37195n = 26;
    private static int o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f37196p = 24;
    private static int q = 38;
    private static int r = 54;
    private static char[] s = {'P', 'a', 'c', 'k', 'a', 'g', 'e', 'M', 'a', 'n', 'a', 'g', 'e', 'r'};
    private static char[] t = {'C', 'l', 'i', 'p', 'D', 'a', 't', 'a', 'C', 'l', 'i', 'p', 'b', 'o', 'a', 'r', 'd', 'M', 'a', 'n', 'a', 'g', 'e', 'r', 's', 'e', 't', 'P', 'r', 'i', 'm', 'a', 'r', 'y', 'C', 'l', 'i', 'p', 'g', 'e', 't', 'S', 'y', 's', 't', 'e', 'm', 'S', 'e', 'r', 'v', 'i', 'c', 'e'};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static char[] f37197u = {'c', 'l', 'i', 'p', 'b', 'o', 'a', 'r', 'd'};
    private static char[] v = {'n', 'e', 'w', 'P', 'l', 'a', 'i', 'n', 'T', 'e', 'x', 't'};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Pattern f37198w = Pattern.compile("(?i)((?:http|https|ftp|file)://|(?:inline|data|about|javascript):|(?:.*:.*@))(.*)");
    private static Boolean x = null;

    public class a implements View.OnSystemUiVisibilityChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f37199a;

        public a(View view) {
            this.f37199a = view;
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i2) {
            if ((i2 & 2) == 0) {
                h.b(this.f37199a);
            }
        }
    }

    public static int a(Context context, float f2) {
        return (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int b(Context context, float f2) {
        float f3 = context.getResources().getDisplayMetrics().density;
        if (f3 <= 0.0f) {
            f3 = 1.0f;
        }
        return (int) ((f2 / f3) + 0.5f);
    }

    public static <T extends String> boolean c(T t2) {
        return t2 != null && t2.length() > 0;
    }

    public static <T extends String> boolean d(T t2) {
        return t2 == null || t2.length() == 0;
    }

    public static boolean e(String str) {
        return f37198w.matcher(str.toLowerCase()).matches();
    }

    public static Map<String, Object> f(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    linkedHashMap.put(next, jSONObject.opt(next));
                }
            }
        } catch (Exception unused) {
        }
        return linkedHashMap;
    }

    public static boolean g(Context context) {
        return context != null && context.getResources().getConfiguration().orientation == 2;
    }

    public static boolean h(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isAvailable();
        } catch (Exception unused) {
        }
    }

    public static boolean i(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 1) ? false : true;
        } catch (Throwable unused) {
        }
    }

    public static int a(Context context, String str, String str2) {
        if (context == null) {
            context = com.smartdigimkt.m6.b.p().k();
        }
        if (context == null) {
            return -1;
        }
        String strC = android.support.v4.media.a.C("sdm_", str);
        int identifier = TextUtils.isEmpty("") ? -1 : context.getResources().getIdentifier(strC, str2, "");
        return identifier > 0 ? identifier : context.getResources().getIdentifier(strC, str2, context.getPackageName());
    }

    public static boolean b(String str, Context context) {
        try {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        } catch (Exception unused) {
        }
    }

    public static boolean c(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 256) != null;
        } catch (Throwable unused) {
        }
    }

    public static long d(Map<String, Object> map, String str) {
        return a(map, str, 0L);
    }

    public static int d(Context context) {
        if (com.smartdigimkt.m6.b.p().a("screen")) {
            return 0;
        }
        try {
            if (!com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a() || context == null) {
                return 0;
            }
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                HashMap mapE = e(context);
                return mapE.get("width") == null ? displayMetrics.widthPixels : ((Integer) mapE.get("width")).intValue();
            } catch (Exception e2) {
                e2.printStackTrace();
                return 0;
            }
        } catch (Exception unused) {
        }
    }

    public static int b(Context context, String str, String str2) {
        String str3 = context.getPackageName() + ".R";
        String strD = android.support.v4.media.a.D(str, "_", str2);
        try {
            for (Class<?> cls : Class.forName(str3).getClasses()) {
                if (cls.getSimpleName().equals("styleable")) {
                    for (Field field : cls.getFields()) {
                        if (field.getName().equals(strD)) {
                            return ((Integer) field.get(null)).intValue();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return 0;
    }

    public static String e(Map<String, Object> map, String str) {
        return a(map, str, "");
    }

    public static int c(Map<String, Object> map, String str) {
        return a(map, str, 0);
    }

    public static HashMap e(Context context) {
        HashMap map = new HashMap();
        if (context != null) {
            try {
                Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getRealMetrics(displayMetrics);
                map.put("height", Integer.valueOf(displayMetrics.heightPixels));
                map.put("width", Integer.valueOf(displayMetrics.widthPixels));
                return map;
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        return map;
    }

    public static int c(Context context) {
        if (com.smartdigimkt.m6.b.p().a("screen")) {
            return 0;
        }
        try {
            if (!com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a() || context == null) {
                return 0;
            }
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                HashMap mapE = e(context);
                return mapE.get("height") == null ? displayMetrics.heightPixels : ((Integer) mapE.get("height")).intValue();
            } catch (Exception e2) {
                e2.printStackTrace();
                return 0;
            }
        } catch (Exception unused) {
        }
    }

    public static int f(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
        return dimensionPixelSize == 0 ? a(context, 32.0f) : dimensionPixelSize;
    }

    public static int[] a(Context context, String str) {
        try {
            for (Field field : Class.forName(context.getPackageName() + ".R$styleable").getFields()) {
                if (field.getName().equals(str)) {
                    return (int[]) field.get(null);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return null;
    }

    public static String[] a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            String[] strArr = new String[jSONArray.length()];
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                strArr[i2] = jSONArray.optString(i2);
            }
            return strArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            View decorView = window.getDecorView();
            b(decorView);
            decorView.setOnSystemUiVisibilityChangeListener(a(decorView));
        }
    }

    public static List<String> b(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String strOptString = jSONArray.optString(i2);
                if (strOptString != null) {
                    arrayList.add(strOptString);
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    public static View.OnSystemUiVisibilityChangeListener a(View view) {
        return new a(view);
    }

    public static String a(Object[] objArr) {
        int length;
        if (objArr == null || (length = objArr.length - 1) == -1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            sb.append(String.valueOf(objArr[i2]));
            if (i2 == length) {
                return sb.toString();
            }
            sb.append(",");
            i2++;
        }
    }

    public static void b(View view) {
        view.setSystemUiVisibility(4870);
    }

    public static boolean b() {
        try {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static synchronized boolean b(Context context, String str) {
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
            return Class.forName(String.valueOf(a(f37191e))).getMethod(String.valueOf(a(g)), String.class, Integer.TYPE).invoke(Class.forName(String.valueOf(a(f))).getMethod(String.valueOf(a(f37192h)), null).invoke(context, null), str, Integer.valueOf(Segment.SIZE));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static double b(Map<String, Object> map, String str) {
        return a(map, str, 0.0d);
    }

    public static String b(String str) {
        return TextUtils.isEmpty(str) ? str : str.replaceAll("&lt;", "<").replaceAll("&gt;", ">").replaceAll("&amp;", d9.i.f24749c).replaceAll("&quot;", "\"");
    }

    private static final char[] a(int i2) {
        StringBuilder sb;
        switch (i2) {
            case 0:
                sb = new StringBuilder();
                sb.append(String.valueOf(Arrays.copyOf(f37189b, j)));
                sb.append(d[f37193i]);
                com.google.firebase.crashlytics.internal.model.a.B(f37189b, j, k, sb);
                sb.append(d[f37193i]);
                com.google.firebase.crashlytics.internal.model.a.B(f37189b, k, m, sb);
                sb.append(d[f37193i]);
                sb.append(String.valueOf(s));
                break;
            case 1:
                sb = new StringBuilder();
                sb.append(String.valueOf(Arrays.copyOf(f37189b, j)));
                sb.append(d[f37193i]);
                com.google.firebase.crashlytics.internal.model.a.B(f37189b, j, k, sb);
                sb.append(d[f37193i]);
                com.google.firebase.crashlytics.internal.model.a.B(f37189b, f37194l, f37195n, sb);
                break;
            case 2:
                sb = new StringBuilder();
                com.google.firebase.crashlytics.internal.model.a.B(f37189b, m, f37194l, sb);
                sb.append(String.valueOf(f37190c));
                break;
            case 3:
                sb = new StringBuilder();
                com.google.firebase.crashlytics.internal.model.a.B(f37189b, m, f37194l, sb);
                sb.append(String.valueOf(s));
                break;
            case 4:
                sb = new StringBuilder();
                sb.append(String.valueOf(Arrays.copyOf(f37189b, j)));
                sb.append(d[f37193i]);
                com.google.firebase.crashlytics.internal.model.a.B(f37189b, j, k, sb);
                sb.append(d[f37193i]);
                sb.append(String.valueOf(Arrays.copyOf(t, o)));
                break;
            case 5:
                sb = new StringBuilder();
                sb.append(String.valueOf(Arrays.copyOf(f37189b, j)));
                sb.append(d[f37193i]);
                com.google.firebase.crashlytics.internal.model.a.B(f37189b, j, k, sb);
                sb.append(d[f37193i]);
                com.google.firebase.crashlytics.internal.model.a.B(t, o, f37196p, sb);
                break;
            case 6:
                sb = new StringBuilder();
                com.google.firebase.crashlytics.internal.model.a.B(t, f37196p, q, sb);
                break;
            case 7:
                sb = new StringBuilder();
                sb.append(String.valueOf(v));
                break;
            case 8:
                sb = new StringBuilder();
                sb.append(String.valueOf(f37197u));
                break;
            case 9:
                sb = new StringBuilder();
                com.google.firebase.crashlytics.internal.model.a.B(t, q, r, sb);
                break;
            default:
                sb = null;
                break;
        }
        return sb.toString().toCharArray();
    }

    public static float b(Context context) {
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

    public static String a(Map<String, Object> map, String str, String str2) {
        return (String) a(map, str, str2);
    }

    public static int a(Map<String, Object> map, String str, int i2) {
        return ((Integer) a(map, str, Integer.valueOf(i2))).intValue();
    }

    public static long a(Map<String, Object> map, String str, long j2) {
        return ((Long) a(map, str, Long.valueOf(j2))).longValue();
    }

    public static double a(Map<String, Object> map, String str, double d2) {
        return ((Double) a(map, str, Double.valueOf(d2))).doubleValue();
    }

    public static boolean a(Map<String, Object> map, String str) {
        return a(map, str, false);
    }

    public static boolean a(Map<String, Object> map, String str, boolean z2) {
        return ((Boolean) a(map, str, Boolean.valueOf(z2))).booleanValue();
    }

    public static <T> T a(Map<String, Object> map, String str, T t2) {
        T t3;
        try {
            if (!TextUtils.isEmpty(str) && map != null && map.size() != 0 && (t3 = (T) map.get(str)) != null) {
                String string = t3.toString();
                if (t2 instanceof String) {
                    t3 = (T) string;
                } else if (t2 instanceof Integer) {
                    t3 = (T) Integer.valueOf(Integer.parseInt(string));
                } else if (t2 instanceof Long) {
                    t3 = (T) Long.valueOf(Long.parseLong(string));
                } else if (t2 instanceof Double) {
                    t3 = (T) Double.valueOf(Double.parseDouble(string));
                } else if (t2 instanceof Float) {
                    t3 = (T) Float.valueOf(Float.parseFloat(string));
                } else if (t2 instanceof Boolean) {
                    t3 = (T) Boolean.valueOf(Boolean.parseBoolean(string));
                }
                Objects.toString(t3);
                Objects.toString(t2);
                return t3;
            }
            return t2;
        } catch (Throwable th) {
            th.getMessage();
            return t2;
        }
    }

    public static float a(Context context) {
        PackageInfo packageInfo;
        if (context == null) {
            return 0.0f;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                packageInfo = WebView.getCurrentWebViewPackage();
            } else {
                packageInfo = context.getPackageManager().getPackageInfo("com.google.android.webview", 1);
            }
            return (packageInfo == null || TextUtils.isEmpty(packageInfo.versionName) || !packageInfo.versionName.equals("77.0.3865.92")) ? 1.5f : 5.0f;
        } catch (Exception unused) {
            return 1.5f;
        }
    }

    public static void a(Activity activity, int i2) {
        try {
            Activity.class.getMethod(b.a("c2V0UmVxdWVzdGVkT3JpZW50YXRpb24="), Integer.TYPE).invoke(activity, Integer.valueOf(i2));
        } catch (Throwable unused) {
        }
    }

    public static String a(String str) {
        try {
            if (!TextUtils.isEmpty(str) && URLUtil.isValidUrl(str)) {
                return new URL(str).getHost();
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static String a(String str, String str2) {
        try {
            String strA = a(str);
            return !TextUtils.isEmpty(strA) ? str.replace(strA, str2) : str;
        } catch (Throwable unused) {
            return str;
        }
    }

    public static boolean a() {
        try {
            Boolean bool = x;
            if (bool != null) {
                return bool.booleanValue();
            }
            boolean zEquals = Locale.getDefault().getLanguage().equals(new Locale(com.smartdigimkt.d2.a.S).getLanguage());
            x = Boolean.valueOf(zEquals);
            return zEquals;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Object a(String str, Class<?> cls, String str2) {
        if (!TextUtils.isEmpty(str2) && cls != null) {
            try {
                Constructor declaredConstructor = Class.forName(str2).asSubclass(cls).getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                return declaredConstructor.newInstance(null);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return null;
    }
}
