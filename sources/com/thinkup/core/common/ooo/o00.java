package com.thinkup.core.common.ooo;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.support.v4.media.a;
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
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class o00 {
    public static final String o = "CommonUtils";
    private static boolean o0;
    private static final AtomicBoolean m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Object f42343n = new Object();
    private static char[] oo = {'a', 'n', 'd', 'r', 'o', 'i', 'd', 'c', 'o', 'n', 't', 'e', 'n', 't', 'p', 'm', 'g', 'e', 't', 'C', 'o', 'n', 't', 'e', 'x', 't'};
    private static char[] om = {'A', 'p', 'p', 'l', 'i', 'c', 'a', 't', 'i', 'o', 'n', 'I', 'n', 'f', 'o'};
    private static char[] on = {'.', 'X'};
    private static int m0 = 0;
    private static int mo = 1;
    private static int mm = 2;
    private static int mn = 3;
    private static int n0 = 0;
    private static int no = 7;
    private static int nm = 14;
    private static int nn = 19;
    private static int o00 = 16;
    private static int o0o = 26;
    private static int o0m = 8;
    private static int o0n = 24;
    private static int oo0 = 38;
    private static int ooo = 54;
    private static char[] oom = {'P', 'a', 'c', 'k', 'a', 'g', 'e', 'M', 'a', 'n', 'a', 'g', 'e', 'r'};
    private static char[] oon = {'C', 'l', 'i', 'p', 'D', 'a', 't', 'a', 'C', 'l', 'i', 'p', 'b', 'o', 'a', 'r', 'd', 'M', 'a', 'n', 'a', 'g', 'e', 'r', 's', 'e', 't', 'P', 'r', 'i', 'm', 'a', 'r', 'y', 'C', 'l', 'i', 'p', 'g', 'e', 't', 'S', 'y', 's', 't', 'e', 'm', 'S', 'e', 'r', 'v', 'i', 'c', 'e'};
    private static char[] om0 = {'c', 'l', 'i', 'p', 'b', 'o', 'a', 'r', 'd'};
    private static char[] omo = {'n', 'e', 'w', 'P', 'l', 'a', 'i', 'n', 'T', 'e', 'x', 't'};
    private static final Pattern omm = Pattern.compile("(?i)((?:http|https|ftp|file)://|(?:inline|data|about|javascript):|(?:.*:.*@))(.*)");
    private static Boolean omn = null;

    /* JADX INFO: renamed from: com.thinkup.core.common.ooo.o00$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnSystemUiVisibilityChangeListener {
        final /* synthetic */ View o;

        public AnonymousClass1(View view) {
            this.o = view;
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public final void onSystemUiVisibilityChange(int i2) {
            if ((i2 & 2) == 0) {
                o00.o(this.o);
            }
        }
    }

    public static <T extends String> boolean m(T t) {
        return t != null && t.length() > 0;
    }

    private static boolean m0(Map<String, Object> map, String str) {
        return ((Boolean) o(map, str, Boolean.FALSE)).booleanValue();
    }

    private static float mo(Context context) {
        if (context != null) {
            try {
                float f = context.getResources().getDisplayMetrics().density;
                if (f == 0.0f) {
                    return 2.5f;
                }
                return f;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return 2.5f;
    }

    private static int[] n(Context context, String str) {
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

    public static <T extends String> boolean o(T t) {
        return t == null || t.length() == 0;
    }

    private static boolean o0(Context context) {
        return context != null && context.getResources().getConfiguration().orientation == 2;
    }

    private static double om(Map<String, Object> map, String str) {
        return ((Double) o(map, str, Double.valueOf(0.0d))).doubleValue();
    }

    private static int on(Context context) {
        if (com.thinkup.core.common.n.o0n.m().n("screen")) {
            return 0;
        }
        try {
            if (!com.thinkup.core.common.n.oom.o(com.thinkup.core.common.n.o0n.m().on()).m() || context == null) {
                return 0;
            }
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                HashMap mapM0 = m0(context);
                return mapM0.get("height") == null ? displayMetrics.heightPixels : ((Integer) mapM0.get("height")).intValue();
            } catch (Exception e2) {
                e2.printStackTrace();
                return 0;
            }
        } catch (Exception unused) {
        }
    }

    private static boolean oo(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 1) ? false : true;
        } catch (Throwable unused) {
        }
    }

    public static int m(Context context, float f) {
        float f2 = context.getResources().getDisplayMetrics().density;
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }

    private static HashMap m0(Context context) {
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

    public static boolean o(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isAvailable();
        } catch (Exception unused) {
        }
    }

    public static boolean o0(String str) {
        return omm.matcher(str.toLowerCase()).matches();
    }

    private static String om(String str) {
        return TextUtils.isEmpty(str) ? str : str.replaceAll("&lt;", "<").replaceAll("&gt;", ">").replaceAll("&amp;", d9.i.f24749c).replaceAll("&quot;", "\"");
    }

    private static int m(Context context, String str, String str2) {
        String str3 = context.getPackageName() + ".R";
        String strD = a.D(str, "_", str2);
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

    public static String oo(String str) {
        try {
            if (!TextUtils.isEmpty(str) && URLUtil.isValidUrl(str)) {
                return new URL(str).getHost();
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    private static long o0(Map<String, Object> map, String str) {
        return m(map, str);
    }

    public static Map<String, Object> n(String str) {
        HashMap map = new HashMap();
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.opt(next));
                }
            }
        } catch (Exception unused) {
        }
        return map;
    }

    public static int o(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private static int om(Context context) {
        if (com.thinkup.core.common.n.o0n.m().n("screen")) {
            return 0;
        }
        try {
            if (!com.thinkup.core.common.n.oom.o(com.thinkup.core.common.n.o0n.m().on()).m() || context == null) {
                return 0;
            }
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                HashMap mapM0 = m0(context);
                return mapM0.get("width") == null ? displayMetrics.widthPixels : ((Integer) mapM0.get("width")).intValue();
            } catch (Exception e2) {
                e2.printStackTrace();
                return 0;
            }
        } catch (Exception unused) {
        }
    }

    public static boolean o(String str, Context context) {
        try {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        } catch (Exception unused) {
        }
    }

    private static boolean on(Map<String, Object> map, String str) {
        return ((Boolean) o(map, str, Boolean.FALSE)).booleanValue();
    }

    private static double oo(Map<String, Object> map, String str) {
        return ((Double) o(map, str, Double.valueOf(0.0d))).doubleValue();
    }

    public static int o(Context context, String str, String str2) {
        if (context == null) {
            context = com.thinkup.core.common.n.o0n.m().on();
        }
        if (context == null) {
            return -1;
        }
        String strConcat = "thinkup_".concat(String.valueOf(str));
        String strN00 = com.thinkup.core.common.n.o0n.m().n00();
        int identifier = TextUtils.isEmpty(strN00) ? -1 : context.getResources().getIdentifier(strConcat, str2, strN00);
        return identifier > 0 ? identifier : context.getResources().getIdentifier(strConcat, str2, context.getPackageName());
    }

    private static int n(Map<String, Object> map, String str) {
        return o(map, str, 0);
    }

    public static float n(Context context) {
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

    public static String[] o(JSONArray jSONArray) {
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

    private static void o(Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(4870);
            decorView.setOnSystemUiVisibilityChangeListener(new AnonymousClass1(decorView));
        }
    }

    public static List<String> m(JSONArray jSONArray) {
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

    public static void o(View view) {
        view.setSystemUiVisibility(4870);
    }

    public static boolean o() {
        boolean zIsCleartextTrafficPermitted;
        if (m.get()) {
            return o0;
        }
        synchronized (f42343n) {
            try {
                zIsCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            } catch (Throwable unused) {
                zIsCleartextTrafficPermitted = false;
            }
            o0 = zIsCleartextTrafficPermitted;
            m.set(true);
        }
        return zIsCleartextTrafficPermitted;
    }

    private static View.OnSystemUiVisibilityChangeListener m(View view) {
        return new AnonymousClass1(view);
    }

    public static int m(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
        return dimensionPixelSize == 0 ? o(context, 32.0f) : dimensionPixelSize;
    }

    private static Object m(String str, Context context) {
        try {
            return Class.forName(String.valueOf(o(m0))).getMethod(String.valueOf(o(mm)), String.class, Integer.TYPE).invoke(Class.forName(String.valueOf(o(mo))).getMethod(String.valueOf(o(mn)), new Class[0]).invoke(context, new Object[0]), str, Integer.valueOf(Segment.SIZE));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String o(Object[] objArr) {
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

    public static boolean m(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 256) != null;
        } catch (Throwable unused) {
        }
    }

    public static synchronized boolean o(Context context, String str) {
        boolean z2;
        z2 = false;
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    if (m(str, context) != null) {
                        z2 = true;
                    }
                } catch (Exception unused) {
                }
            }
        }
        return z2;
    }

    public static long m(Map<String, Object> map, String str) {
        return ((Long) o(map, str, 0L)).longValue();
    }

    private static boolean m() {
        try {
            Boolean bool = omn;
            if (bool != null) {
                return bool.booleanValue();
            }
            boolean zEquals = Locale.getDefault().getLanguage().equals(new Locale(com.smartdigimkt.d2.a.S).getLanguage());
            omn = Boolean.valueOf(zEquals);
            return zEquals;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static final char[] o(int i2) {
        StringBuilder sb;
        switch (i2) {
            case 0:
                sb = new StringBuilder();
                sb.append(String.valueOf(Arrays.copyOf(oo, no)));
                sb.append(on[n0]);
                com.google.firebase.crashlytics.internal.model.a.B(oo, no, nm, sb);
                sb.append(on[n0]);
                com.google.firebase.crashlytics.internal.model.a.B(oo, nm, o00, sb);
                sb.append(on[n0]);
                sb.append(String.valueOf(oom));
                break;
            case 1:
                sb = new StringBuilder();
                sb.append(String.valueOf(Arrays.copyOf(oo, no)));
                sb.append(on[n0]);
                com.google.firebase.crashlytics.internal.model.a.B(oo, no, nm, sb);
                sb.append(on[n0]);
                com.google.firebase.crashlytics.internal.model.a.B(oo, nn, o0o, sb);
                break;
            case 2:
                sb = new StringBuilder();
                com.google.firebase.crashlytics.internal.model.a.B(oo, o00, nn, sb);
                sb.append(String.valueOf(om));
                break;
            case 3:
                sb = new StringBuilder();
                com.google.firebase.crashlytics.internal.model.a.B(oo, o00, nn, sb);
                sb.append(String.valueOf(oom));
                break;
            case 4:
                sb = new StringBuilder();
                sb.append(String.valueOf(Arrays.copyOf(oo, no)));
                sb.append(on[n0]);
                com.google.firebase.crashlytics.internal.model.a.B(oo, no, nm, sb);
                sb.append(on[n0]);
                sb.append(String.valueOf(Arrays.copyOf(oon, o0m)));
                break;
            case 5:
                sb = new StringBuilder();
                sb.append(String.valueOf(Arrays.copyOf(oo, no)));
                sb.append(on[n0]);
                com.google.firebase.crashlytics.internal.model.a.B(oo, no, nm, sb);
                sb.append(on[n0]);
                com.google.firebase.crashlytics.internal.model.a.B(oon, o0m, o0n, sb);
                break;
            case 6:
                sb = new StringBuilder();
                com.google.firebase.crashlytics.internal.model.a.B(oon, o0n, oo0, sb);
                break;
            case 7:
                sb = new StringBuilder();
                sb.append(String.valueOf(omo));
                break;
            case 8:
                sb = new StringBuilder();
                sb.append(String.valueOf(om0));
                break;
            case 9:
                sb = new StringBuilder();
                com.google.firebase.crashlytics.internal.model.a.B(oon, oo0, ooo, sb);
                break;
            default:
                sb = null;
                break;
        }
        return sb.toString().toCharArray();
    }

    public static String o(Map<String, Object> map, String str) {
        return o(map, str, "");
    }

    public static String o(Map<String, Object> map, String str, String str2) {
        return (String) o(map, str, str2);
    }

    public static int o(Map<String, Object> map, String str, int i2) {
        return ((Integer) o(map, str, Integer.valueOf(i2))).intValue();
    }

    public static <T> T o(Map<String, Object> map, String str, T t) {
        T t2;
        try {
            if (!TextUtils.isEmpty(str) && map != null && map.size() != 0 && (t2 = (T) map.get(str)) != null) {
                String string = t2.toString();
                if (t instanceof String) {
                    t2 = (T) string;
                } else if (t instanceof Integer) {
                    t2 = (T) Integer.valueOf(Integer.parseInt(string));
                } else if (t instanceof Long) {
                    t2 = (T) Long.valueOf(Long.parseLong(string));
                } else if (t instanceof Double) {
                    t2 = (T) Double.valueOf(Double.parseDouble(string));
                } else if (t instanceof Float) {
                    t2 = (T) Float.valueOf(Float.parseFloat(string));
                } else if (t instanceof Boolean) {
                    t2 = (T) Boolean.valueOf(Boolean.parseBoolean(string));
                }
                Objects.toString(t2);
                Objects.toString(t);
                return t2;
            }
            return t;
        } catch (Throwable th) {
            th.getMessage();
            return t;
        }
    }

    public static void o(Activity activity, int i2) {
        try {
            Activity.class.getMethod(mm.m("c2V0UmVxdWVzdGVkT3JpZW50YXRpb24="), Integer.TYPE).invoke(activity, Integer.valueOf(i2));
        } catch (Throwable unused) {
        }
    }

    public static String o(String str, String str2) {
        try {
            String strOo = oo(str);
            return !TextUtils.isEmpty(strOo) ? str.replace(strOo, str2) : str;
        } catch (Throwable unused) {
            return str;
        }
    }
}
