package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4038mJ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f4690a = new Object();

    public static String a(String str, Throwable th) {
        String strReplace;
        synchronized (f4690a) {
            try {
                if (th != null) {
                    Throwable cause = th;
                    while (true) {
                        if (cause == null) {
                            strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                            break;
                        }
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    }
                } else {
                    strReplace = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbQ = DM.q(str, "\n  ");
        sbQ.append(strReplace.replace("\n", "\n  "));
        sbQ.append('\n');
        return sbQ.toString();
    }

    public static void b() {
        synchronized (f4690a) {
        }
    }

    public static void c() {
        synchronized (f4690a) {
        }
    }

    public static void d(String str, Throwable th) {
        a(str, th);
        c();
    }

    public static void e() {
        synchronized (f4690a) {
        }
    }

    public static void f() {
        synchronized (f4690a) {
        }
    }

    public static void g(String str, Throwable th) {
        a(str, th);
        f();
    }
}
