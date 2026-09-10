package la;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.X3;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f45249a;

    public e(String str) {
        this.f45249a = l1.d.f("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(str);
    }

    public static String c(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e10) {
                Log.e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e10);
                str2 = q4.a.i(str2, " [", TextUtils.join(", ", objArr), X3.j.f27836e);
            }
        }
        return wi.d.i(str, " : ", str2);
    }

    public void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", c(this.f45249a, str, objArr));
        }
    }

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", c(this.f45249a, str, objArr));
        }
    }
}
