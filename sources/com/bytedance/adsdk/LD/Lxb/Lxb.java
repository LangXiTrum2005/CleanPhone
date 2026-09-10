package com.bytedance.adsdk.LD.Lxb;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.LD.lc.JXs;

/* JADX INFO: loaded from: classes.dex */
public class Lxb extends Paint {
    public Lxb() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            super.setAlpha(JXs.Lxb(i, 0, 255));
        } else {
            setColor((JXs.Lxb(i, 0, 255) << 24) | (getColor() & ViewCompat.MEASURED_SIZE_MASK));
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public Lxb(int i) {
        super(i);
    }

    public Lxb(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public Lxb(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
