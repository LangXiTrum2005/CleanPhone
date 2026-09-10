package com.bytedance.adsdk.ud.qdl;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import com.bytedance.adsdk.ud.mo.mzz;

/* JADX INFO: loaded from: classes.dex */
public class qdl extends Paint {
    public qdl() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            super.setAlpha(mzz.qdl(i2, 0, 255));
        } else {
            setColor((mzz.qdl(i2, 0, 255) << 24) | (getColor() & 16777215));
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public qdl(int i2) {
        super(i2);
    }

    public qdl(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public qdl(int i2, PorterDuff.Mode mode) {
        super(i2);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
