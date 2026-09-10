package collectively;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.X3;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.2 */
/* JADX INFO: loaded from: classes3.dex */
public final class taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f15834attabal;

    public taiyuan(String str) {
        this.f15834attabal = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    public static String marial(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(String.valueOf(str2));
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + X3.j.e;
            }
        }
        return str + " : " + str2;
    }

    public final int attabal(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", marial(this.f15834attabal, "Play Store app is either not installed or not the official version", objArr));
        }
        return 0;
    }

    public final int dern(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", marial(this.f15834attabal, str, objArr));
        }
        return 0;
    }

    public final int saneness(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", marial(this.f15834attabal, str, objArr), th);
        }
        return 0;
    }

    public final int wireman(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", marial(this.f15834attabal, str, objArr));
        }
        return 0;
    }
}
