package com.bytedance.sdk.component.tvp;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class lnr implements View.OnTouchListener {
    private ViewConfiguration qdl;
    private int ud = -1;

    public abstract void qdl(View.OnTouchListener onTouchListener);

    public boolean qdl(float f, float f2, float f3, float f4, Context context) {
        if (this.qdl == null) {
            this.qdl = ViewConfiguration.get(context);
        }
        if (this.ud == -1) {
            this.ud = this.qdl.getScaledTouchSlop();
        }
        return Math.abs(f - f3) <= ((float) this.ud) && Math.abs(f2 - f4) <= ((float) this.ud);
    }
}
