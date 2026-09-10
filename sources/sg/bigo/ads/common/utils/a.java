package sg.bigo.ads.common.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.play.core.splitcompat.SplitCompat;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f47494a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f47495b = true;

    public static Drawable a(Context context, int i2) {
        if (context != null) {
            try {
                return d(context, i2);
            } catch (Exception unused) {
                a(androidx.datastore.preferences.protobuf.a.h(i2, new StringBuilder("Activity context getDrawable failed. the resId is ")));
                try {
                    return d(b(context), i2);
                } catch (Exception unused2) {
                    a(androidx.datastore.preferences.protobuf.a.h(i2, new StringBuilder("Application context getDrawable failed. the resId is ")));
                }
            }
        }
        return null;
    }

    public static int b(Context context, int i2) {
        try {
            return e(context, i2);
        } catch (Exception unused) {
            a(androidx.datastore.preferences.protobuf.a.h(i2, new StringBuilder("Activity context getDimensionPixelSize failed. the resId is ")));
            try {
                return e(b(context), i2);
            } catch (Exception unused2) {
                a(androidx.datastore.preferences.protobuf.a.h(i2, new StringBuilder("Application context getDimensionPixelSize failed. the resId is ")));
                return 0;
            }
        }
    }

    public static int c(Context context, int i2) {
        try {
            return f(context, i2);
        } catch (Exception unused) {
            a(androidx.datastore.preferences.protobuf.a.h(i2, new StringBuilder("Activity context getColor failed. the resId is ")));
            try {
                return f(b(context), i2);
            } catch (Exception unused2) {
                a(androidx.datastore.preferences.protobuf.a.h(i2, new StringBuilder("Application context getColor failed. the resId is ")));
                return 0;
            }
        }
    }

    private static Drawable d(Context context, int i2) {
        try {
            return context.getResources().getDrawable(i2);
        } catch (Exception unused) {
            c(context);
            return context.getResources().getDrawable(i2);
        }
    }

    private static int e(Context context, int i2) {
        try {
            return context.getResources().getDimensionPixelSize(i2);
        } catch (Exception unused) {
            c(context);
            return context.getResources().getDimensionPixelSize(i2);
        }
    }

    private static int f(Context context, int i2) {
        try {
            return context.getResources().getColor(i2);
        } catch (Exception unused) {
            c(context);
            return context.getResources().getColor(i2);
        }
    }

    public static View a(Context context, int i2, ViewGroup viewGroup, boolean z2) {
        View viewB;
        if (context != null) {
            try {
                viewB = b(context, i2, viewGroup, z2);
            } catch (Exception unused) {
                a(androidx.datastore.preferences.protobuf.a.h(i2, new StringBuilder("Self context inflateView failed. the resId is ")));
                viewB = null;
            }
        } else {
            viewB = null;
        }
        if (viewB != null) {
            return viewB;
        }
        try {
            return b(b(context), i2, viewGroup, z2);
        } catch (Exception unused2) {
            a(androidx.datastore.preferences.protobuf.a.h(i2, new StringBuilder("Application context inflateView failed. the resId is ")));
            return viewB;
        }
    }

    private static Context b(Context context) {
        a(context);
        Context context2 = f47494a;
        return context2 != null ? context2 : context.getApplicationContext();
    }

    private static void c(Context context) {
        try {
            SplitCompat.install(context);
        } catch (Throwable unused) {
            a("SplitCompact not found.");
        }
    }

    private static View b(Context context, int i2, ViewGroup viewGroup, boolean z2) {
        try {
            return LayoutInflater.from(context).inflate(i2, viewGroup, z2);
        } catch (Exception unused) {
            c(context);
            return LayoutInflater.from(context).inflate(i2, viewGroup, z2);
        }
    }

    public static CharSequence b(Context context, int i2, Locale locale) {
        Resources resources = context != null ? context.getResources() : null;
        if (resources == null) {
            return null;
        }
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.setLocale(locale);
        return context.createConfigurationContext(configuration).getResources().getText(i2);
    }

    private static String b(Context context, int i2, Object... objArr) {
        if (objArr != null) {
            try {
                if (objArr.length > 0) {
                    return context.getString(i2, objArr);
                }
            } catch (Exception unused) {
                c(context);
                return (objArr == null || objArr.length <= 0) ? context.getString(i2) : context.getString(i2, objArr);
            }
        }
        return context.getString(i2);
    }

    public static String a(Context context, int i2, Locale locale) {
        CharSequence charSequenceB = b(context, i2, locale);
        if (charSequenceB != null) {
            return charSequenceB.toString();
        }
        return null;
    }

    public static String a(Context context, int i2, Object... objArr) {
        try {
            return b(context, i2, objArr);
        } catch (Exception unused) {
            a(androidx.datastore.preferences.protobuf.a.h(i2, new StringBuilder("Activity context getString failed. the resId is ")));
            try {
                return b(b(context), i2, objArr);
            } catch (Exception unused2) {
                a(androidx.datastore.preferences.protobuf.a.h(i2, new StringBuilder("Application context getString failed. the resId is ")));
                return "";
            }
        }
    }

    private static void a(Context context) {
        if (f47495b) {
            f47495b = false;
            try {
                Context applicationContext = context.getApplicationContext();
                f47494a = applicationContext.createPackageContext(applicationContext.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    private static void a(String str) {
        sg.bigo.ads.common.t.a.a(0, "BigoAAB", String.valueOf(str));
    }
}
