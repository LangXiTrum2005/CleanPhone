package com.willy.ratingbar;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes6.dex */
class PartialView extends RelativeLayout {
    public ImageView e0;
    public ImageView f0;
    public int g0;
    public int h0;

    public final void a() {
        this.e0.setImageLevel(0);
        this.f0.setImageLevel(10000);
    }

    public final void b(float f) {
        int i2 = (int) ((f % 1.0f) * 10000.0f);
        if (i2 == 0) {
            i2 = 10000;
        }
        this.e0.setImageLevel(i2);
        this.f0.setImageLevel(10000 - i2);
    }
}
