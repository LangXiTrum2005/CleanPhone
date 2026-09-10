package sg.bigo.ads.common.t;

import android.util.Log;
import com.p004ironsource.d9;
import sg.bigo.ads.common.utils.t;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static void a(int i2, int i3, String str, String str2) {
        if (a(i2)) {
            if (i2 == 0) {
                str2 = android.support.v4.media.a.o(d9.i.d, str, "] ", str2);
            }
            Log.println(i3, "BigoAds", str2);
        }
    }

    public static void b(String str, String str2) {
        a(0, 5, str, str2);
    }

    public static void a(int i2, String str, String str2) {
        a(i2, 6, str, str2);
    }

    public static void a(String str, String str2) {
        a(0, 4, str, str2);
    }

    private static boolean a(int i2) {
        t.a();
        if (t.b()) {
            return i2 == 2 || i2 == 1;
        }
        return i2 == 2;
    }
}
