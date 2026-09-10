package dirl;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.X3;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class preprohormone {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f25276attabal;

    public preprohormone(String str) {
        this.f25276attabal = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    public static String marial(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + X3.j.e;
            }
        }
        return str + " : " + str2;
    }

    public final int attabal(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", marial(this.f25276attabal, str, objArr));
        }
        return 0;
    }

    public final int dern(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", marial(this.f25276attabal, str, objArr));
        }
        return 0;
    }

    public final int saneness(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", marial(this.f25276attabal, str, objArr), th);
        }
        return 0;
    }

    public final int wireman(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", marial(this.f25276attabal, str, objArr));
        }
        return 0;
    }
}
