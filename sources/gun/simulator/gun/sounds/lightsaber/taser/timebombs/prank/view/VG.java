package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public final class VG extends Paint {
    public VG(PorterDuff.Mode mode) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            PointF pointF = AbstractC5187zP.f5324a;
            super.setAlpha(Math.max(0, Math.min(255, i)));
        } else {
            int color = getColor();
            PointF pointF2 = AbstractC5187zP.f5324a;
            setColor((Math.max(0, Math.min(255, i)) << 24) | (color & ViewCompat.MEASURED_SIZE_MASK));
        }
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }
}
