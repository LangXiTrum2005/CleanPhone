package sg.bigo.ads.common.utils;

import android.content.Context;
import android.widget.Toast;

/* JADX INFO: loaded from: classes7.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f47541a = false;

    public static void a(Context context, String str) {
        try {
            if (f47541a) {
                Toast.makeText(context, str, 1).show();
                sg.bigo.ads.common.t.a.a(0, 3, "toastDebug", str);
            }
        } catch (Exception unused) {
        }
    }

    public static boolean b() {
        return f47541a;
    }

    public static void a(String str) {
        if (f47541a) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void a(boolean z2) {
        f47541a = z2;
    }

    public static boolean a() {
        return false;
    }
}
