package com.thinkup.core.basead;

import android.content.Context;
import com.thinkup.core.common.n.oo0;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.ooo.onm;

/* JADX INFO: loaded from: classes6.dex */
public class m {
    private static volatile m o;

    private m() {
    }

    private static String m(Context context, String str) {
        return onm.n(context, oo0.m.om, str, "");
    }

    public static m o() {
        if (o == null) {
            synchronized (m.class) {
                try {
                    if (o == null) {
                        o = new m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o;
    }

    private static void o(Context context, String str, String str2) {
        onm.m(context, oo0.m.om, str, str2);
    }

    public static void o(Context context, String str) {
        onm.o(context, oo0.m.om, str);
    }

    private static String o(oom oomVar) {
        if (oomVar == null) {
            return "";
        }
        return o(oomVar.o, oomVar.oo, oomVar.mm);
    }

    public static String o(String str, String str2, int i2) {
        return str + "_" + str2 + "_" + i2;
    }
}
