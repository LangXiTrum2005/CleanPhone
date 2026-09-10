package com.thinkup.core.common.oom.m;

import android.content.Context;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.oo.n0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class om {
    private static void m(Context context, String str, n0 n0Var, m mVar) {
        m0 m0Var = new m0(context, str, n0Var, mVar);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new oo());
        new on(arrayList, m0Var, 0).o(m0Var);
    }

    private static void o(Context context, String str, n0 n0Var, m mVar) {
        if (context == null || TUSDK.isCnSDK() || !o00.o(context)) {
            if (mVar != null) {
                mVar.o();
            }
        } else {
            m0 m0Var = new m0(context, str, n0Var, mVar);
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new o0());
            new on(arrayList, m0Var, 0).o(m0Var);
        }
    }
}
