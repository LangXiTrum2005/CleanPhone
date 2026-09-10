package sg.bigo.ads.common.m;

import android.content.Context;
import android.content.SharedPreferences;
import com.vungle.ads.internal.model.Cookie;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f47320a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f47321b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f47322c = "";
    private static String d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f47323e = true;
    private static SharedPreferences.OnSharedPreferenceChangeListener f = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: sg.bigo.ads.common.m.b.1
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (q.a((CharSequence) str)) {
                return;
            }
            sg.bigo.ads.common.t.a.a(0, 3, "GdprManager", "Listener SharedPreferenceChanged, key: ".concat(String.valueOf(str)));
            str.getClass();
            switch (str) {
                case "IABTCF_PurposeConsents":
                    b.a(sharedPreferences);
                    break;
                case "IABTCF_PurposeLegitimateInterests":
                    b.c(sharedPreferences);
                    break;
                case "IABTCF_gdprApplies":
                    b.b(sharedPreferences);
                    break;
                case "IABTCF_TCString":
                    b.d(sharedPreferences);
                    break;
                default:
                    return;
            }
            b.h();
        }
    };
    private static Context g;

    public static void a(Context context) {
        g = context;
        sg.bigo.ads.common.x.a.a(context.getPackageName(), f);
    }

    public static String b() {
        if (q.a((CharSequence) f47320a) && a()) {
            f47320a = sg.bigo.ads.common.x.a.e(g.getPackageName());
        }
        return f47320a;
    }

    public static int c() {
        if (g == null || !sg.bigo.ads.common.x.b.a()) {
            return f47321b;
        }
        f47321b = e(g) ? sg.bigo.ads.common.x.a.g(g.getPackageName()) : -1;
        return f47321b;
    }

    public static String d() {
        if (q.a((CharSequence) f47322c) && a()) {
            f47322c = sg.bigo.ads.common.x.a.h(g.getPackageName());
        }
        return f47322c;
    }

    public static String e() {
        if (q.a((CharSequence) d) && a()) {
            d = sg.bigo.ads.common.x.a.f(g.getPackageName());
        }
        return d;
    }

    public static boolean f() {
        return f47323e;
    }

    public static void g() {
        f47323e = false;
    }

    public static /* synthetic */ boolean h() {
        f47323e = true;
        return true;
    }

    public static void a(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            f47320a = sharedPreferences.getString("IABTCF_PurposeConsents", "");
        } catch (Exception unused) {
            f47320a = "";
        }
    }

    public static String b(Context context) {
        return (context == null || !sg.bigo.ads.common.x.b.a()) ? f47320a : sg.bigo.ads.common.x.a.e(context.getPackageName());
    }

    public static int c(Context context) {
        return (context == null || !sg.bigo.ads.common.x.b.a()) ? f47321b : sg.bigo.ads.common.x.a.g(context.getPackageName());
    }

    public static String d(Context context) {
        return (context == null || !sg.bigo.ads.common.x.b.a()) ? f47322c : sg.bigo.ads.common.x.a.h(context.getPackageName());
    }

    public static boolean e(Context context) {
        if (context == null || !sg.bigo.ads.common.x.b.a()) {
            return false;
        }
        return sg.bigo.ads.common.x.a.a(context.getPackageName() + "_preferences", Cookie.IABTCF_GDPR_APPLIES);
    }

    public static boolean a() {
        return g != null;
    }

    public static void b(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null || sharedPreferences.getAll() == null) {
            return;
        }
        Object obj = sharedPreferences.getAll().get(Cookie.IABTCF_GDPR_APPLIES);
        if (obj instanceof Integer) {
            f47321b = ((Integer) obj).intValue();
        } else if (obj instanceof String) {
            try {
                f47321b = Integer.parseInt((String) obj);
            } catch (Exception unused) {
                f47321b = 0;
            }
        }
    }

    public static void c(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            f47322c = sharedPreferences.getString("IABTCF_PurposeLegitimateInterests", "");
        } catch (Exception unused) {
            f47322c = "";
        }
    }

    public static void d(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            d = sharedPreferences.getString("IABTCF_TCString", "");
        } catch (Exception unused) {
            d = "";
        }
    }
}
