package blighty;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import utwa.apical;

/* JADX INFO: compiled from: LPaint.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal extends Paint {
    public attabal() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            super.setAlpha(apical.dern(i, 0, 255));
        } else {
            setColor((apical.dern(i, 0, 255) << 24) | (getColor() & 16777215));
        }
    }

    public attabal(int i) {
        super(i);
    }

    public attabal(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public attabal(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }
}
