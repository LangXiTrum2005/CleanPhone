package ads_mobile_sdk;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.X3;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class hc1 {
    public final String a;

    public hc1(String str) {
        this.a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ") + str;
    }

    public static String a(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + X3.j.e;
            }
        }
        return str + " : " + str2;
    }

    public final void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            a(this.a, str, objArr);
        }
    }

    public final void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            a(this.a, str, objArr);
        }
    }
}
