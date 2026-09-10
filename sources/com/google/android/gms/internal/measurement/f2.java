package com.google.android.gms.internal.measurement;

import android.util.Log;
import android.widget.RelativeLayout;
import com.ironsource.EnumC0672y5;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f2 {
    public static int A(int i10, int i11, int i12, int i13) {
        return ((i10 + i11) - i12) % i13;
    }

    public static /* synthetic */ String B(int i10) {
        switch (i10) {
            case 1:
                return "CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN";
            case 2:
                return "CLIENT_UPLOAD_ELIGIBLE";
            case 3:
                return "MEASUREMENT_SERVICE_NOT_ENABLED";
            case 4:
                return "ANDROID_TOO_OLD";
            case 5:
                return "NON_PLAY_MODE";
            case 6:
                return "SDK_TOO_OLD";
            case 7:
                return "MISSING_JOB_SCHEDULER";
            case 8:
                return "NOT_ENABLED_IN_MANIFEST";
            case 9:
                return "CLIENT_FLAG_OFF";
            case 10:
                return "SERVICE_FLAG_OFF";
            case 11:
                return "PINNED_TO_SERVICE_UPLOAD";
            case 12:
                return "MISSING_SGTM_SERVER_URL";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String C(int i10) {
        switch (i10) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static int a(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                switch (i10) {
                    case 20:
                        return 10;
                    case 21:
                        return 11;
                    case 22:
                        return 12;
                    default:
                        return 0;
                }
        }
    }

    public static /* synthetic */ int b(int i10) {
        switch (i10) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 20;
            case 11:
                return 21;
            case 12:
                return 22;
            default:
                throw null;
        }
    }

    public static int c(float f10) {
        return com.mbridge.msdk.foundation.tools.v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), f10);
    }

    public static int d(int i10, int i11, int i12) {
        return com.google.android.gms.internal.play_billing.j1.R(i10) + i11 + i12;
    }

    public static int e(int i10, int i11, int i12, int i13) {
        return x0.p(i10) + i11 + i12 + i13;
    }

    public static s1 f(s1 s1Var) {
        int size = s1Var.size();
        return s1Var.g(size + size);
    }

    public static com.mbridge.msdk.foundation.same.image.b g() {
        return com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d());
    }

    public static com.mbridge.msdk.foundation.same.report.l h(String str) {
        return new com.mbridge.msdk.foundation.same.report.l.b(str).a();
    }

    public static com.mbridge.msdk.setting.g i(com.mbridge.msdk.setting.i iVar) {
        return iVar.f(com.mbridge.msdk.foundation.controller.c.n().b());
    }

    public static ClassCastException j(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String k(String str, String str2, StringBuilder sb2) {
        sb2.append(str.intern());
        sb2.append(str2);
        return sb2.toString();
    }

    public static String l(String str, Map map) {
        return String.valueOf(map.get(com.mbridge.msdk.config.component.common.util.c.c(str)));
    }

    public static String m(StringBuilder sb2, String str) {
        sb2.append(str.intern());
        return sb2.toString();
    }

    public static StringBuilder n(Throwable th2, com.mbridge.msdk.video.bt.component.a aVar, Object obj, String str) {
        aVar.a(obj, th2.getMessage());
        return new StringBuilder(str);
    }

    public static void o(int i10, String str, String str2) {
        Log.e(str2, str + i10);
    }

    public static void p(EnumC0672y5 enumC0672y5, Set set) {
        set.add(Integer.valueOf(enumC0672y5.b()));
    }

    public static void q(Exception exc, StringBuilder sb2, String str) {
        sb2.append(exc.getMessage());
        com.mbridge.msdk.foundation.tools.q0.b(str, sb2.toString());
    }

    public static void r(String str, int i10, RelativeLayout.LayoutParams layoutParams, int i11) {
        layoutParams.addRule(i11, str.substring(i10).hashCode());
    }

    public static void s(String str, String str2, String str3) {
        com.mbridge.msdk.foundation.tools.q0.b(str3, str + str2);
    }

    public static void t(String str, String str2, String str3, String str4) {
        Logger.i(str4, str + str2 + str3);
    }

    public static void u(String str, String str2, Throwable th2) {
        com.mbridge.msdk.foundation.tools.q0.b(str2, str + th2);
    }

    public static void v(String str, String str2, char[] cArr, int i10, int i11) {
        ByteBuffer.wrap(str.getBytes(str2)).asCharBuffer().get(cArr, i10, i11);
    }

    public static void w(StringBuilder sb2, String str, String str2, IronLog ironLog) {
        sb2.append(str);
        sb2.append(str2);
        ironLog.verbose(sb2.toString());
    }

    public static void x(Throwable th2, StringBuilder sb2, String str) {
        sb2.append(th2.getMessage());
        com.mbridge.msdk.foundation.tools.q0.a(str, sb2.toString());
    }

    public static int y(int i10, int i11, int i12, int i13) {
        return com.google.android.gms.internal.play_billing.j1.R(i10) + i11 + i12 + i13;
    }

    public static void z(String str, String str2, String str3) {
        com.mbridge.msdk.foundation.tools.q0.a(str3, str + str2);
    }
}
