package com.chartboost.sdk.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public interface dj {

    public static final class a {
        public static /* synthetic */ void a(dj djVar, String str, int i2, boolean z2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startDownloadIfPossible");
            }
            if ((i3 & 1) != 0) {
                str = null;
            }
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            if ((i3 & 4) != 0) {
                z2 = false;
            }
            djVar.a(str, i2, z2);
        }
    }

    int a(oi oiVar);

    void a(Context context);

    void a(String str, int i2, boolean z2);

    void a(String str, String str2, boolean z2, p0 p0Var);

    boolean a(String str);

    oi b(String str);
}
