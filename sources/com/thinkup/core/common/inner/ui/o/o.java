package com.thinkup.core.common.inner.ui.o;

import android.view.View;
import com.thinkup.core.common.inner.ui.o.o.n;
import com.thinkup.core.common.inner.ui.o.o.o0;
import com.thinkup.core.common.inner.ui.o.o.om;
import com.thinkup.core.common.inner.ui.o.o.oo;

/* JADX INFO: loaded from: classes6.dex */
public final class o {
    public static final int m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f41854n = 3;
    public static final int o = 1;
    public static final int o0 = 4;
    public static final int oo = 5;

    private static m o(int i2, View view) {
        if (i2 == 2) {
            return new om(view);
        }
        if (i2 == 3) {
            return new o0(view);
        }
        if (i2 != 4) {
            return i2 != 5 ? new oo(view) : new com.thinkup.core.common.inner.ui.o.o.m(view);
        }
        return new n(view);
    }
}
