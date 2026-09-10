package com.bytedance.sdk.component.jbs;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ik implements View.OnTouchListener {
    private int lr = -1;
    private ViewConfiguration ri;

    public abstract void ri(View.OnTouchListener onTouchListener);

    public boolean ri(float f, float f2, float f3, float f4, Context context) {
        if (this.ri == null) {
            this.ri = ViewConfiguration.get(context);
        }
        if (this.lr == -1) {
            this.lr = this.ri.getScaledTouchSlop();
        }
        return Math.abs(f - f3) <= ((float) this.lr) && Math.abs(f2 - f4) <= ((float) this.lr);
    }
}
