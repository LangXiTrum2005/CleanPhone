package com.thinkup.core.common.inner.ui.oo;

import android.content.Context;
import com.smartdigimkt.v0.k;
import com.thinkup.core.common.on.ooo;
import com.thinkup.core.common.ooo.o00;

/* JADX INFO: loaded from: classes6.dex */
public final class n {
    public static final int m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f41856n = 3;
    public static final int o = 1;
    public static final int o0 = 4;
    public static final int om = 7;
    public static final int oo = 6;

    public static int o(Context context, ooo oooVar) {
        int iOom = oooVar.oom();
        return (iOom == 1 || iOom == 4) ? o00.o(context, "myoffer_cta_install_now", k.f38992h) : o00.o(context, "myoffer_cta_learn_more", k.f38992h);
    }

    public static int o(Context context, int i2) {
        return (i2 == 1 || i2 == 4) ? o00.o(context, "myoffer_shake_full_title_download_type", k.f38992h) : o00.o(context, "myoffer_shake_full_title", k.f38992h);
    }
}
