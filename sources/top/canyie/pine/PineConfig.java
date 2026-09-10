package top.canyie.pine;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class PineConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f48864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f48865b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pine.LibLoader f48866c = null;

    /* JADX INFO: renamed from: top.canyie.pine.PineConfig$1, reason: invalid class name */
    public class AnonymousClass1 implements Pine.LibLoader {
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        f48864a = i2;
        if (i2 == 34) {
            String str = Build.VERSION.CODENAME;
            Locale locale = Locale.ROOT;
            String upperCase = str.toUpperCase(locale);
            if (!"REL".equals(upperCase) && upperCase.compareTo("VanillaIceCream".toUpperCase(locale)) >= 0) {
                f48864a = 35;
            }
        }
    }
}
