package com.thinkup.core.common.inner.mixad.om;

import android.content.Context;
import android.widget.FrameLayout;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.ooo.o00;

/* JADX INFO: loaded from: classes6.dex */
public final class o {
    private static FrameLayout.LayoutParams o(int i2) {
        return o(i2, 0, 0);
    }

    public static FrameLayout.LayoutParams o(int i2, int i3, int i4) {
        Context contextOn = o0n.m().on();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (i2 == 1) {
            layoutParams.gravity = 83;
            layoutParams.leftMargin = o00.o(contextOn, 2.0f);
            layoutParams.bottomMargin = o00.o(contextOn, 2.0f);
            return layoutParams;
        }
        if (i3 > 0) {
            layoutParams.width = i3;
        }
        if (i4 > 0) {
            layoutParams.height = i4;
        }
        layoutParams.gravity = 85;
        layoutParams.bottomMargin = o00.o(contextOn, 2.0f);
        layoutParams.rightMargin = o00.o(contextOn, 2.0f);
        return layoutParams;
    }
}
