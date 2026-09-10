package com.mbridge.msdk.tracker.network;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f2042a = "TrackManager_Volley";
    private static final String b = "com.mbridge.msdk.tracker.network.e0";

    public static void a(Throwable th, String str, Object... objArr) {
        a(str, objArr);
    }

    public static void b(String str, Object... objArr) {
        a(str, objArr);
    }

    public static void c(String str, Object... objArr) {
        a(str, objArr);
    }

    public static void d(String str, Object... objArr) {
    }

    private static String a(String str, Object... objArr) {
        String string;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClassName().equals(b)) {
                String className = stackTrace[i].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                StringBuilder sbQ = DM.q(strSubstring.substring(strSubstring.lastIndexOf(36) + 1), ".");
                sbQ.append(stackTrace[i].getMethodName());
                string = sbQ.toString();
                Locale locale = Locale.US;
                long id = Thread.currentThread().getId();
                StringBuilder sb = new StringBuilder("[");
                sb.append(id);
                sb.append("] ");
                sb.append(string);
                return DM.m(sb, ": ", str);
            }
        }
        string = "<unknown>";
        Locale locale2 = Locale.US;
        long id2 = Thread.currentThread().getId();
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(id2);
        sb2.append("] ");
        sb2.append(string);
        return DM.m(sb2, ": ", str);
    }
}
