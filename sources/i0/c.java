package i0;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f42485a = 0;

    static {
        SdkExtensions.getExtensionVersion(30);
        SdkExtensions.getExtensionVersion(31);
        SdkExtensions.getExtensionVersion(33);
        SdkExtensions.getExtensionVersion(1000000);
    }

    public static final boolean a(String str) {
        String buildCodename = Build.VERSION.CODENAME;
        Integer num = 0;
        n.f(buildCodename, "buildCodename");
        if (!"REL".equals(buildCodename)) {
            Locale locale = Locale.ROOT;
            String upperCase = buildCodename.toUpperCase(locale);
            n.e(upperCase, "toUpperCase(...)");
            Integer num2 = upperCase.equals("BAKLAVA") ? num : null;
            String upperCase2 = str.toUpperCase(locale);
            n.e(upperCase2, "toUpperCase(...)");
            num = upperCase2.equals("BAKLAVA") ? 0 : null;
            if (num2 == null || num == null) {
                if (num2 == null && num == null) {
                    String upperCase3 = buildCodename.toUpperCase(locale);
                    n.e(upperCase3, "toUpperCase(...)");
                    String upperCase4 = str.toUpperCase(locale);
                    n.e(upperCase4, "toUpperCase(...)");
                    if (upperCase3.compareTo(upperCase4) >= 0) {
                        return true;
                    }
                } else if (num2 != null) {
                    return true;
                }
            } else if (num2.intValue() >= num.intValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        String CODENAME = Build.VERSION.CODENAME;
        n.e(CODENAME, "CODENAME");
        return a("S");
    }
}
