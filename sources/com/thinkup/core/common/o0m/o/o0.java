package com.thinkup.core.common.o0m.o;

import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
final class o0 implements com.thinkup.core.common.o0m.o.o.n {
    private static final String o = "FastKV";

    @Override // com.thinkup.core.common.o0m.o.o.n
    public final void m(String str, Exception exc) {
        Log.e(o, str, exc);
    }

    @Override // com.thinkup.core.common.o0m.o.o.n
    public final void o(String str, String str2) {
        Log.i(o, str + " " + str2);
    }

    @Override // com.thinkup.core.common.o0m.o.o.n
    public final void o(String str, Exception exc) {
        Log.w(o, str, exc);
    }
}
