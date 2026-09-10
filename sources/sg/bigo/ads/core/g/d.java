package sg.bigo.ads.core.g;

import android.text.TextUtils;
import java.net.URL;

/* JADX INFO: loaded from: classes7.dex */
public final class d {
    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static float b(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str);
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean d(String str) {
        try {
            new URL(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
