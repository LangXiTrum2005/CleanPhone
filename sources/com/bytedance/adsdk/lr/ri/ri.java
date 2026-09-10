package com.bytedance.adsdk.lr.ri;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import com.bytedance.adsdk.lr.di.fi;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends Paint {
    public ri() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            super.setAlpha(fi.ri(i, 0, 255));
        } else {
            setColor((fi.ri(i, 0, 255) << 24) | (getColor() & 16777215));
        }
    }

    public ri(int i) {
        super(i);
    }

    public ri(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public ri(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }
}
