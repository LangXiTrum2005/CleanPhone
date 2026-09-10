package com.thinkup.core.common.o0m;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.common.n.oo0;
import com.thinkup.core.common.o0m.m.o0;
import com.thinkup.core.common.o0m.m.oo;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class m {
    public static final int m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile m f42142n = null;
    public static final int o = 1;
    private final Map<String, o> o0 = new ConcurrentHashMap();

    private m() {
    }

    private o n(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return new com.thinkup.core.common.o0m.m.m();
        }
        if (context instanceof Activity) {
            context = context.getApplicationContext();
        }
        o oVar = this.o0.get(str);
        if (oVar != null) {
            return oVar;
        }
        o oVarO0 = o0(context, str);
        this.o0.put(str, oVarO0);
        return oVarO0;
    }

    public static m o() {
        if (f42142n == null) {
            synchronized (m.class) {
                try {
                    if (f42142n == null) {
                        f42142n = new m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f42142n;
    }

    private static o o0(Context context, String str) {
        return o0.n(new n.o().o(context).o(str).m(1).o(1).o());
    }

    public final o m(Context context, String str) {
        return n(context, str);
    }

    private static boolean m(String str) {
        return !o(str);
    }

    public static boolean o(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.endsWith("PL_SY_COLD_START") || str.endsWith("PL_SY");
    }

    private void o(Context context) {
        String[] strArr = {oo0.m.o, oo0.m.f41931n, oo0.m.o0, oo0.m.om, oo0.m.m0, oo0.m.mo, oo0.m.mm, oo0.m.mn, oo0.m.n0, oo0.m.no, oo0.m.nm, oo0.m.nn, oo0.m.o00, "thinkup_app_pl_cl_retry"};
        for (int i2 = 0; i2 < 14; i2++) {
            o oVarN = n(context, strArr[i2]);
            if (oVarN instanceof oo) {
                ((oo) oVarN).n();
            }
        }
    }

    public final o o(Context context, String str) {
        return n(context, str);
    }
}
